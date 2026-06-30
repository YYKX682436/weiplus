package com.tencent.tav.decoder;

/* loaded from: classes16.dex */
public class AudioDecoder implements com.tencent.tav.decoder.IDecoder {
    private static final int MAX_RETRY_COUNT = 10;
    private static final int MAX_WAIT_TIME = 1000;
    private static final java.lang.String SCENE = "tav-audio-decoder";
    private static final long WAIT_TRANSIENT_MS = 2;
    private static final java.util.ArrayList<java.lang.String> nameList = new java.util.ArrayList<>();
    private final java.lang.String TAG;
    private android.media.MediaCodec.BufferInfo bufferInfo;
    private com.tencent.tav.coremedia.CMSampleState currentSampleState;
    private com.tencent.tav.coremedia.CMTime currentStartTime;
    private com.tencent.tav.decoder.AudioInfo decodeAudioInfo;
    private java.nio.ByteBuffer decodeBuffer;
    private com.tencent.tav.codec.IMediaCodec decoder;
    private final java.lang.Object decoderCreateLock;
    private com.tencent.tav.codec.IDecoderFactory decoderFactory;
    private com.tencent.tav.coremedia.CMTime duration;
    private com.tencent.tav.extractor.AssetExtractor extractor;
    private boolean extractorDone;
    private boolean isReleased;
    private int lastOutputBufferIndex;
    private long mLastVideoQueueTime;
    private long mTimeOffset;
    private android.media.MediaFormat mediaFormat;
    private com.tencent.tav.decoder.AudioInfo outputAudioInfo;
    private java.nio.ByteBuffer outputBuffer;
    private com.tencent.tav.coremedia.CMTime pFrameTime;
    private java.util.ArrayList<com.tencent.tav.decoder.AudioDecoder.PendingFrame> pendingFrames;
    private boolean started;
    private com.tencent.tav.coremedia.CMTimeRange timeRange;
    public int trackIndex;

    /* loaded from: classes16.dex */
    public static class PendingFrame {
        public com.tencent.tav.coremedia.CMTime frameTime;
        public com.tencent.tav.coremedia.CMTime seekStartTime;
        public boolean isFirst = false;
        public long timeOffset = 0;

        public PendingFrame() {
            com.tencent.tav.coremedia.CMTime cMTime = com.tencent.tav.coremedia.CMTime.CMTimeZero;
            this.seekStartTime = cMTime;
            this.frameTime = cMTime;
        }
    }

    public AudioDecoder(java.lang.String str) {
        this(str, null);
    }

    private void clearDecoder() {
        com.tencent.tav.decoder.logger.Logger.v(this.TAG, "clearDecoder " + getSourcePath());
        releaseOutputBuffer();
        if (this.pendingFrames.size() != 0 || this.extractorDone) {
            try {
                this.decoder.flush();
            } catch (java.lang.Exception e17) {
                com.tencent.tav.decoder.logger.Logger.e(this.TAG, "clearDecoder", e17);
            }
            this.pendingFrames.clear();
        }
        this.currentSampleState = new com.tencent.tav.coremedia.CMSampleState();
    }

    private synchronized boolean decoderConfigure(android.media.MediaFormat mediaFormat) {
        int i17 = 0;
        while (true) {
            i17++;
            try {
                com.tencent.tav.decoder.logger.Logger.d(this.TAG, "createdDecoder---time---" + i17);
                if (i17 > 10) {
                    return false;
                }
                this.decoder.configure(mediaFormat, null, null, 0);
                return true;
            } catch (java.lang.Exception e17) {
                com.tencent.tav.decoder.logger.Logger.e(this.TAG, "decoderConfigure", e17);
                if (!(e17 instanceof android.media.MediaCodec.CodecException) || (!((android.media.MediaCodec.CodecException) e17).isTransient() && !((android.media.MediaCodec.CodecException) e17).isRecoverable())) {
                    this.decoder.release();
                    throw e17;
                }
            }
        }
    }

    private synchronized int dequeueInputBuffer() {
        try {
            return this.decoder.dequeueInputBuffer(1000L);
        } catch (java.lang.Error | java.lang.Exception e17) {
            com.tencent.tav.decoder.logger.Logger.e(this.TAG, "dequeueInputBuffer", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                com.tencent.tav.decoder.logger.Logger.e(this.TAG, "CodecException - isTransient = " + ((android.media.MediaCodec.CodecException) e17).isTransient() + " , isRecoverable = " + ((android.media.MediaCodec.CodecException) e17).isRecoverable() + " , errorCode = " + ((android.media.MediaCodec.CodecException) e17).getErrorCode());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    waitTime(2L);
                    return dequeueInputBuffer();
                }
            }
            throw e17;
        }
    }

    private synchronized int dequeueOutputBuffer() {
        try {
        } catch (java.lang.Exception e17) {
            com.tencent.tav.decoder.logger.Logger.e(this.TAG, "dequeueOutputBuffer", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                com.tencent.tav.decoder.logger.Logger.e(this.TAG, "CodecException - isTransient = " + ((android.media.MediaCodec.CodecException) e17).isTransient() + " , isRecoverable = " + ((android.media.MediaCodec.CodecException) e17).isRecoverable() + " , errorCode = " + ((android.media.MediaCodec.CodecException) e17).getErrorCode());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    waitTime(2L);
                    return dequeueOutputBuffer();
                }
            }
            throw e17;
        }
        return this.decoder.dequeueOutputBuffer(this.bufferInfo, 1000L);
    }

    private synchronized com.tencent.tav.coremedia.CMSampleState doReadSample(com.tencent.tav.coremedia.CMTime cMTime, boolean z17) {
        com.tencent.tav.decoder.logger.Logger.v(this.TAG, "doReadSample - " + this.extractor.getSourcePath());
        com.tencent.tav.coremedia.CMSampleState fromError = com.tencent.tav.coremedia.CMSampleState.fromError(-2L);
        boolean z18 = true;
        if (!this.started || this.trackIndex == -1) {
            java.lang.String str = this.TAG;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doReadSample:[failed] !started || trackIndex == -1 ");
            sb6.append(!this.started);
            sb6.append(" - ");
            if (this.trackIndex != -1) {
                z18 = false;
            }
            sb6.append(z18);
            com.tencent.tav.decoder.logger.Logger.e(str, sb6.toString());
            return com.tencent.tav.coremedia.CMSampleState.fromError(-100L);
        }
        try {
            releaseOutputBuffer(true);
            long j17 = -2;
            int i17 = 0;
            while (true) {
                if (this.pendingFrames.size() <= 0 && this.extractorDone) {
                    break;
                }
                try {
                    if (!this.extractorDone) {
                        readFromExtractor();
                    }
                    int dequeueOutputBuffer = dequeueOutputBuffer();
                    if (dequeueOutputBuffer == -2) {
                        android.media.MediaFormat outputFormat = this.decoder.getOutputFormat();
                        if (outputFormat.containsKey("pcm-encoding")) {
                            this.decodeAudioInfo.pcmEncoding = outputFormat.getInteger("pcm-encoding");
                        } else {
                            this.decodeAudioInfo.pcmEncoding = 2;
                        }
                        if (outputFormat.containsKey("sample-rate")) {
                            this.decodeAudioInfo.sampleRate = outputFormat.getInteger("sample-rate");
                        }
                        if (outputFormat.containsKey("channel-count")) {
                            this.decodeAudioInfo.channelCount = outputFormat.getInteger("channel-count");
                        }
                    } else if (dequeueOutputBuffer < 0 || this.pendingFrames.size() <= 0) {
                        if (dequeueOutputBuffer >= 0) {
                            if (this.bufferInfo.flags == 4) {
                                com.tencent.tav.decoder.logger.Logger.i(this.TAG, "doReadSample:[finish] bufferInfo.flags == MediaCodec.BUFFER_FLAG_END_OF_STREAM 2");
                                return com.tencent.tav.coremedia.CMSampleState.fromError(-1L);
                            }
                            releaseOutputBuffer(dequeueOutputBuffer, false);
                            fromError = com.tencent.tav.coremedia.CMSampleState.fromError(-2L);
                        }
                        i17++;
                        if (i17 > 1000) {
                            fromError = com.tencent.tav.coremedia.CMSampleState.fromError(-4L);
                            com.tencent.tav.decoder.logger.Logger.e(this.TAG, "doReadSample: [timeout] ");
                            break;
                        }
                    } else {
                        android.media.MediaCodec.BufferInfo bufferInfo = this.bufferInfo;
                        if (bufferInfo.flags == 4) {
                            if (bufferInfo.size > 0) {
                                this.pendingFrames.remove(0);
                                this.lastOutputBufferIndex = dequeueOutputBuffer;
                                java.nio.ByteBuffer outputBuffer = getOutputBuffer(dequeueOutputBuffer);
                                if (outputBuffer != null) {
                                    outputBuffer.position(this.bufferInfo.offset);
                                    android.media.MediaCodec.BufferInfo bufferInfo2 = this.bufferInfo;
                                    outputBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                                    this.decodeBuffer = outputBuffer;
                                } else {
                                    releaseOutputBuffer(dequeueOutputBuffer, false);
                                    this.decodeBuffer = null;
                                }
                            }
                            com.tencent.tav.decoder.logger.Logger.i(this.TAG, "doReadSample:[finish] bufferInfo.flags == MediaCodec.BUFFER_FLAG_END_OF_STREAM");
                            return com.tencent.tav.coremedia.CMSampleState.fromError(-1L);
                        }
                        com.tencent.tav.decoder.AudioDecoder.PendingFrame remove = this.pendingFrames.remove(0);
                        j17 = this.bufferInfo.presentationTimeUs - remove.timeOffset;
                        com.tencent.tav.coremedia.CMSampleState cMSampleState = new com.tencent.tav.coremedia.CMSampleState(new com.tencent.tav.coremedia.CMTime(j17, 1000000));
                        if (this.pendingFrames.size() == 0 && this.extractorDone && remove.seekStartTime.getTimeUs() + 1000 >= this.duration.getTimeUs()) {
                            fromError = new com.tencent.tav.coremedia.CMSampleState(this.duration);
                        } else if (remove.seekStartTime.getTimeUs() > j17) {
                            releaseOutputBuffer(dequeueOutputBuffer, false);
                            fromError = com.tencent.tav.coremedia.CMSampleState.fromError(-2L);
                        } else {
                            fromError = cMSampleState;
                        }
                        if (this.bufferInfo.size > 0) {
                            this.lastOutputBufferIndex = dequeueOutputBuffer;
                            java.nio.ByteBuffer outputBuffer2 = getOutputBuffer(dequeueOutputBuffer);
                            if (outputBuffer2 == null) {
                                releaseOutputBuffer(dequeueOutputBuffer, false);
                                com.tencent.tav.decoder.logger.Logger.e(this.TAG, "doReadSample:[error] " + this.bufferInfo.size + " byteBuffer==null");
                                return com.tencent.tav.coremedia.CMSampleState.fromError(-3L);
                            }
                            outputBuffer2.position(this.bufferInfo.offset);
                            android.media.MediaCodec.BufferInfo bufferInfo3 = this.bufferInfo;
                            outputBuffer2.limit(bufferInfo3.offset + bufferInfo3.size);
                            this.decodeBuffer = outputBuffer2;
                        } else {
                            releaseOutputBuffer(dequeueOutputBuffer, false);
                            fromError = com.tencent.tav.coremedia.CMSampleState.fromError(-2L);
                        }
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.tav.decoder.logger.Logger.e(this.TAG, "doReadSample: error", e17);
                    return ((e17 instanceof android.media.MediaCodec.CodecException) && retryOnReadSampleError((android.media.MediaCodec.CodecException) e17)) ? com.tencent.tav.coremedia.CMSampleState.fromError(-3L, "catch exception, retry", e17) : com.tencent.tav.coremedia.CMSampleState.fromError(-3L, "catch exception", e17);
                }
            }
            com.tencent.tav.decoder.logger.Logger.v(this.TAG, "doReadSample:[success] " + this.extractorDone + " " + j17 + "  " + fromError);
            if (this.extractorDone && j17 < 0) {
                fromError = com.tencent.tav.coremedia.CMSampleState.fromError(-1L);
            }
            return fromError;
        } catch (java.lang.Exception e18) {
            return com.tencent.tav.coremedia.CMSampleState.fromExportError(-3L, -212, "", e18);
        }
    }

    private synchronized java.nio.ByteBuffer getInputBuffer(int i17) {
        try {
            return this.decoder.getInputBuffer(i17);
        } catch (java.lang.Error | java.lang.Exception e17) {
            com.tencent.tav.decoder.logger.Logger.e(this.TAG, "getInputBuffer", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                com.tencent.tav.decoder.logger.Logger.e(this.TAG, "CodecException - isTransient = " + ((android.media.MediaCodec.CodecException) e17).isTransient() + " , isRecoverable = " + ((android.media.MediaCodec.CodecException) e17).isRecoverable() + " , errorCode = " + ((android.media.MediaCodec.CodecException) e17).getErrorCode());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    waitTime(2L);
                    return getInputBuffer(i17);
                }
            }
            throw e17;
        }
    }

    private synchronized java.nio.ByteBuffer getOutputBuffer(int i17) {
        try {
            return this.decoder.getOutputBuffer(i17);
        } catch (java.lang.Error | java.lang.Exception e17) {
            com.tencent.tav.decoder.logger.Logger.e(this.TAG, "getOutputBuffer", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                com.tencent.tav.decoder.logger.Logger.e(this.TAG, "CodecException - isTransient = " + ((android.media.MediaCodec.CodecException) e17).isTransient() + " , isRecoverable = " + ((android.media.MediaCodec.CodecException) e17).isRecoverable() + " , errorCode = " + ((android.media.MediaCodec.CodecException) e17).getErrorCode());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    waitTime(2L);
                    return getOutputBuffer(i17);
                }
            }
            throw e17;
        }
    }

    private synchronized void queueInputBuffer(int i17, int i18, int i19, long j17, int i27) {
        try {
            this.decoder.queueInputBuffer(i17, i18, i19, j17, i27);
        } catch (java.lang.Error | java.lang.Exception e17) {
            com.tencent.tav.decoder.logger.Logger.e(this.TAG, "queueInputBuffer", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                com.tencent.tav.decoder.logger.Logger.e(this.TAG, "CodecException - isTransient = " + ((android.media.MediaCodec.CodecException) e17).isTransient() + " , isRecoverable = " + ((android.media.MediaCodec.CodecException) e17).isRecoverable() + " , errorCode = " + ((android.media.MediaCodec.CodecException) e17).getErrorCode());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    waitTime(2L);
                    queueInputBuffer(i17, i18, i19, j17, i27);
                }
            }
            throw e17;
        }
    }

    private synchronized void readFromExtractor() {
        long sampleTime = this.extractor.getSampleTime();
        if (sampleTime < this.timeRange.getEndUs() && this.extractor.getSampleTrackIndex() != -1 && sampleTime != -1) {
            int dequeueInputBuffer = dequeueInputBuffer();
            if (dequeueInputBuffer >= 0) {
                int readSampleData = this.extractor.readSampleData(getInputBuffer(dequeueInputBuffer), 0);
                if (readSampleData >= 0) {
                    long startUs = (sampleTime - this.timeRange.getStartUs()) + this.mTimeOffset;
                    this.mLastVideoQueueTime = startUs;
                    queueInputBuffer(dequeueInputBuffer, 0, readSampleData, startUs, 0);
                    com.tencent.tav.decoder.AudioDecoder.PendingFrame pendingFrame = new com.tencent.tav.decoder.AudioDecoder.PendingFrame();
                    pendingFrame.timeOffset = this.mTimeOffset;
                    pendingFrame.frameTime = new com.tencent.tav.coremedia.CMTime((((float) sampleTime) * 1.0f) / ((float) java.util.concurrent.TimeUnit.SECONDS.toMicros(1L)));
                    pendingFrame.seekStartTime = this.currentStartTime.sub(this.timeRange.getStart());
                    if (this.pendingFrames.size() == 0) {
                        pendingFrame.isFirst = true;
                    }
                    this.pendingFrames.add(pendingFrame);
                }
                this.extractor.advance();
            }
        }
        int dequeueInputBuffer2 = dequeueInputBuffer();
        if (dequeueInputBuffer2 >= 0) {
            queueInputBuffer(dequeueInputBuffer2, 0, 0, 0L, 4);
            this.extractorDone = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void releaseOutputBuffer() {
        releaseOutputBuffer(false);
    }

    private synchronized void reset() {
        if (this.isReleased) {
            return;
        }
        com.tencent.tav.decoder.logger.Logger.d(this.TAG, "reset() called");
        try {
            this.decoder.reset();
            decoderConfigure(this.mediaFormat);
            start();
        } catch (java.lang.Exception e17) {
            com.tencent.tav.decoder.logger.Logger.e(this.TAG, "reset: ", e17);
        }
    }

    private boolean retryOnReadSampleError(android.media.MediaCodec.CodecException codecException) {
        if (codecException.isRecoverable()) {
            releaseOutputBuffer();
            reset();
            this.lastOutputBufferIndex = -1;
            this.pendingFrames.clear();
            this.extractor.seekTo(this.currentStartTime.getTimeUs() - this.timeRange.getStartUs(), 0);
            this.extractorDone = false;
        } else if (!codecException.isTransient()) {
            com.tencent.tav.decoder.logger.Logger.e(this.TAG, "doReadSample:[error] retry failed");
            return true;
        }
        return false;
    }

    private synchronized void seekExtractorTo(long j17) {
        this.extractor.seekTo(j17, 2);
        if (this.extractor.getSampleTime() > j17) {
            this.extractor.seekTo(j17, 0);
        }
        clearDecoder();
        this.mTimeOffset = this.mLastVideoQueueTime + 10000000;
    }

    private synchronized void waitTime(long j17) {
        try {
            wait(j17);
        } catch (java.lang.InterruptedException e17) {
            com.tencent.tav.decoder.logger.Logger.e(this.TAG, "waitTime", e17);
        }
    }

    public void finalize() {
        super.finalize();
        release(false);
    }

    public com.tencent.tav.decoder.AudioInfo getAudioInfo() {
        com.tencent.tav.decoder.AudioInfo audioInfo = this.outputAudioInfo;
        return audioInfo != null ? audioInfo : this.decodeAudioInfo;
    }

    @Override // com.tencent.tav.decoder.IDecoder
    public com.tencent.tav.report.AverageTimeReporter getDecodePerformance() {
        return null;
    }

    @Override // com.tencent.tav.decoder.IDecoder
    public java.lang.String getSourcePath() {
        com.tencent.tav.extractor.AssetExtractor assetExtractor = this.extractor;
        if (assetExtractor == null) {
            return null;
        }
        return assetExtractor.getSourcePath();
    }

    @Override // com.tencent.tav.decoder.IDecoder
    public synchronized boolean hasTrack() {
        return this.trackIndex != -1;
    }

    public boolean isStarted() {
        return this.started;
    }

    public com.tencent.tav.coremedia.CMTime nextFrameTime() {
        com.tencent.tav.coremedia.CMTime cMTime = this.pendingFrames.size() > 0 ? this.pendingFrames.get(0).frameTime : com.tencent.tav.coremedia.CMTime.CMTimeInvalid;
        java.util.Iterator<com.tencent.tav.decoder.AudioDecoder.PendingFrame> it = this.pendingFrames.iterator();
        while (it.hasNext()) {
            cMTime = com.tencent.tav.coremedia.CMTime.min(it.next().frameTime, cMTime);
        }
        return cMTime;
    }

    @Override // com.tencent.tav.decoder.IDecoder
    public synchronized java.nio.ByteBuffer outputBuffer() {
        java.nio.ByteBuffer byteBuffer = this.decodeBuffer;
        if (byteBuffer == null) {
            return null;
        }
        java.nio.ByteBuffer byteBuffer2 = this.outputBuffer;
        return byteBuffer2 == null ? byteBuffer : byteBuffer2;
    }

    @Override // com.tencent.tav.decoder.IDecoder
    public synchronized com.tencent.tav.coremedia.CMSampleState readSample() {
        return readSample(com.tencent.tav.coremedia.CMTime.CMTimeInvalid);
    }

    @Override // com.tencent.tav.decoder.IDecoder
    public synchronized void release() {
        release(true);
    }

    @Override // com.tencent.tav.decoder.IDecoder
    public synchronized void seekTo(com.tencent.tav.coremedia.CMTime cMTime) {
        com.tencent.tav.decoder.logger.Logger.v(this.TAG, "seekTo: " + cMTime + "  - " + this + "  " + this.currentStartTime + "  " + this.currentSampleState);
        if (this.started && this.trackIndex != -1) {
            if (cMTime.getTimeUs() < 0) {
                cMTime = com.tencent.tav.coremedia.CMTime.CMTimeZero;
            }
            com.tencent.tav.coremedia.CMTime add = this.timeRange.getStart().add(cMTime);
            this.currentStartTime = add;
            this.extractorDone = false;
            seekExtractorTo(add.getTimeUs());
            com.tencent.tav.decoder.logger.Logger.v(this.TAG, "seekTo: finish - " + this.currentStartTime + "  " + this.extractor.getSampleTime());
            return;
        }
        com.tencent.tav.decoder.logger.Logger.e(this.TAG, "seekTo:failed [started " + this.started + "] [trackIndex " + this.trackIndex + "]");
    }

    @Override // com.tencent.tav.decoder.IDecoder
    public void setLogger(com.tencent.tav.decoder.logger.WXLogger wXLogger) {
    }

    @Override // com.tencent.tav.decoder.IDecoder
    public synchronized void start(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        start(cMTimeRange, com.tencent.tav.coremedia.CMTime.CMTimeZero);
    }

    public AudioDecoder(java.lang.String str, com.tencent.tav.codec.IDecoderFactory iDecoderFactory) {
        this.TAG = "AudioDecoder@" + java.lang.Integer.toHexString(hashCode());
        com.tencent.tav.coremedia.CMTime cMTime = com.tencent.tav.coremedia.CMTime.CMTimeZero;
        this.duration = cMTime;
        this.started = false;
        this.pendingFrames = new java.util.ArrayList<>();
        this.trackIndex = -1;
        this.isReleased = false;
        this.currentSampleState = new com.tencent.tav.coremedia.CMSampleState(cMTime);
        this.decodeAudioInfo = new com.tencent.tav.decoder.AudioInfo();
        this.outputAudioInfo = null;
        this.decodeBuffer = null;
        this.outputBuffer = null;
        this.decoderCreateLock = new java.lang.Object();
        this.pFrameTime = new com.tencent.tav.coremedia.CMTime(20L, 600);
        this.lastOutputBufferIndex = -1;
        this.currentStartTime = com.tencent.tav.coremedia.CMTime.CMTimeInvalid;
        this.bufferInfo = new android.media.MediaCodec.BufferInfo();
        this.extractorDone = false;
        this.mTimeOffset = 0L;
        this.mLastVideoQueueTime = 0L;
        if (iDecoderFactory != null) {
            this.decoderFactory = iDecoderFactory;
        } else {
            this.decoderFactory = new com.tencent.tav.codec.DefaultDecoderFactory();
        }
        com.tencent.tav.extractor.AssetExtractor assetExtractor = new com.tencent.tav.extractor.AssetExtractor();
        this.extractor = assetExtractor;
        assetExtractor.setDataSource(str);
        while (this.extractor.getSampleTrackIndex() != -1) {
            com.tencent.tav.extractor.AssetExtractor assetExtractor2 = this.extractor;
            assetExtractor2.unselectTrack(assetExtractor2.getSampleTrackIndex());
        }
        int firstTrackIndex = com.tencent.tav.decoder.DecoderUtils.getFirstTrackIndex(this.extractor, "audio/");
        this.trackIndex = firstTrackIndex;
        if (firstTrackIndex == -1) {
            this.decodeBuffer = null;
            return;
        }
        this.extractor.selectTrack(firstTrackIndex);
        this.mediaFormat = this.extractor.getTrackFormat(this.trackIndex);
        this.duration = new com.tencent.tav.coremedia.CMTime((((float) this.extractor.getAudioDuration()) * 1.0f) / ((float) java.util.concurrent.TimeUnit.SECONDS.toMicros(1L)));
        if (this.mediaFormat.containsKey("frame-rate")) {
            this.pFrameTime = new com.tencent.tav.coremedia.CMTime(600 / this.mediaFormat.getInteger("frame-rate"), 600);
        }
        java.lang.String string = this.mediaFormat.getString("mime");
        synchronized (this.decoderCreateLock) {
            com.tencent.tav.codec.IMediaCodec createAudioDecoder = this.decoderFactory.createAudioDecoder(string, SCENE);
            this.decoder = createAudioDecoder;
            createAudioDecoder.setDataSource(this.extractor.getSourcePath());
            nameList.add(this.decoder.toString());
            if (decoderConfigure(this.mediaFormat)) {
                start();
            } else {
                throw new java.lang.IllegalStateException("decoderConfigure failed!");
            }
        }
        this.decodeAudioInfo.sampleRate = this.mediaFormat.getInteger("sample-rate");
        this.decodeAudioInfo.channelCount = this.mediaFormat.getInteger("channel-count");
        com.tencent.tav.decoder.AudioInfo audioInfo = new com.tencent.tav.decoder.AudioInfo();
        audioInfo.channelCount = 1;
        audioInfo.sampleRate = 44100;
        audioInfo.pcmEncoding = 2;
    }

    @Override // com.tencent.tav.decoder.IDecoder
    public synchronized com.tencent.tav.coremedia.CMSampleState readSample(com.tencent.tav.coremedia.CMTime cMTime) {
        com.tencent.tav.coremedia.CMSampleState doReadSample;
        com.tencent.tav.decoder.logger.Logger.v(this.TAG, "readSample: " + cMTime + "  -  " + this.extractor.getSampleTime());
        doReadSample = doReadSample(cMTime, false);
        this.currentSampleState = doReadSample;
        if (doReadSample.stateMatchingTo(-1, -4) || !this.currentSampleState.getTime().smallThan(this.duration)) {
            clearDecoder();
        }
        com.tencent.tav.decoder.logger.Logger.v(this.TAG, "readSample: finish " + cMTime + "  -  " + this.currentSampleState);
        return doReadSample;
    }

    private void releaseOutputBuffer(boolean z17) {
        int i17 = this.lastOutputBufferIndex;
        if (i17 != -1) {
            try {
                releaseOutputBuffer(i17, false);
            } catch (java.lang.Exception e17) {
                com.tencent.tav.decoder.logger.Logger.e(this.TAG, "releaseOutputBuffer " + z17, e17);
                if (z17) {
                    throw e17;
                }
            }
            this.lastOutputBufferIndex = -1;
        }
        this.decodeBuffer = null;
    }

    public synchronized void release(boolean z17) {
        if (this.isReleased) {
            return;
        }
        com.tencent.tav.decoder.logger.Logger.d(this.TAG, "release:start " + z17);
        if (z17) {
            this.extractor.dispose();
            this.extractor = null;
        }
        this.started = false;
        this.isReleased = true;
        synchronized (this.decoderCreateLock) {
            if (this.decoder != null) {
                new java.lang.Thread() { // from class: com.tencent.tav.decoder.AudioDecoder.1
                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        com.tencent.tav.decoder.AudioDecoder audioDecoder;
                        com.tencent.tav.decoder.AudioDecoder.this.releaseOutputBuffer();
                        synchronized (com.tencent.tav.decoder.AudioDecoder.this.decoderCreateLock) {
                            try {
                                com.tencent.tav.decoder.AudioDecoder.this.decoder.stop();
                            } catch (java.lang.Exception e17) {
                                com.tencent.tav.decoder.logger.Logger.e(com.tencent.tav.decoder.AudioDecoder.this.TAG, "decoder.stop", e17);
                            }
                            try {
                                com.tencent.tav.decoder.AudioDecoder.this.decoder.release();
                                com.tencent.tav.decoder.AudioDecoder.nameList.remove(com.tencent.tav.decoder.AudioDecoder.this.decoder.toString());
                                audioDecoder = com.tencent.tav.decoder.AudioDecoder.this;
                            } catch (java.lang.Exception unused) {
                                audioDecoder = com.tencent.tav.decoder.AudioDecoder.this;
                            } catch (java.lang.Throwable th6) {
                                com.tencent.tav.decoder.AudioDecoder.this.decoder = null;
                                throw th6;
                            }
                            audioDecoder.decoder = null;
                            com.tencent.tav.decoder.AudioDecoder.this.decoder = null;
                        }
                    }
                }.start();
            }
        }
        com.tencent.tav.decoder.logger.Logger.d(this.TAG, "release:end " + z17);
    }

    @Override // com.tencent.tav.decoder.IDecoder
    public synchronized void start(com.tencent.tav.coremedia.CMTimeRange cMTimeRange, com.tencent.tav.coremedia.CMTime cMTime) {
        com.tencent.tav.decoder.logger.Logger.d(this.TAG, "start:" + getSourcePath() + " [timeRange " + cMTimeRange + "] [start " + cMTime + "]");
        if (this.trackIndex == -1) {
            com.tencent.tav.decoder.logger.Logger.e(this.TAG, "start: trackIndex == -1");
            return;
        }
        clearDecoder();
        if (cMTimeRange == null) {
            this.timeRange = new com.tencent.tav.coremedia.CMTimeRange(com.tencent.tav.coremedia.CMTime.CMTimeZero, this.duration);
        } else {
            this.timeRange = new com.tencent.tav.coremedia.CMTimeRange(cMTimeRange.getStart(), cMTimeRange.getDuration());
        }
        this.extractorDone = false;
        this.started = true;
        if (cMTime.getTimeUs() >= 0) {
            seekTo(cMTime);
        }
    }

    private synchronized void releaseOutputBuffer(int i17, boolean z17) {
        try {
            this.decoder.releaseOutputBuffer(i17, z17);
        } catch (java.lang.Error | java.lang.Exception e17) {
            com.tencent.tav.decoder.logger.Logger.e(this.TAG, "releaseOutputBuffer", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                com.tencent.tav.decoder.logger.Logger.e(this.TAG, "CodecException - isTransient = " + ((android.media.MediaCodec.CodecException) e17).isTransient() + " , isRecoverable = " + ((android.media.MediaCodec.CodecException) e17).isRecoverable() + " , errorCode = " + ((android.media.MediaCodec.CodecException) e17).getErrorCode());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    waitTime(2L);
                    releaseOutputBuffer(i17, z17);
                }
            }
            throw e17;
        }
    }

    private synchronized void start() {
        try {
            this.decoder.start();
        } catch (java.lang.Exception e17) {
            com.tencent.tav.decoder.logger.Logger.e(this.TAG, "start", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                com.tencent.tav.decoder.logger.Logger.e(this.TAG, "CodecException - isTransient = " + ((android.media.MediaCodec.CodecException) e17).isTransient() + " , isRecoverable = " + ((android.media.MediaCodec.CodecException) e17).isRecoverable() + " , errorCode = " + ((android.media.MediaCodec.CodecException) e17).getErrorCode());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    waitTime(2L);
                    start();
                    return;
                } else if (((android.media.MediaCodec.CodecException) e17).isRecoverable()) {
                    reset();
                    return;
                }
            }
            release();
            throw e17;
        }
    }
}
