package com.tencent.tav.decoder;

/* loaded from: classes16.dex */
public class VideoDecoder implements com.tencent.tav.decoder.IVideoDecoder {
    private static final int MAX_WAIT_TIME = 1000;
    public final java.lang.String TAG;
    private java.util.List<java.lang.Long> allFrameTime;
    private android.media.MediaCodec.BufferInfo bufferInfo;
    private com.tencent.tav.decoder.VideoCropInfo cropInfo;
    private com.tencent.tav.coremedia.CMSampleState currentDecoderState;
    private com.tencent.tav.coremedia.CMSampleState currentStartState;
    private final com.tencent.tav.report.AverageTimeReporter decodeReporter;
    private com.tencent.tav.codec.IDecoderFactory decoderFactory;
    private com.tencent.tav.coremedia.CMTime duration;
    private com.tencent.tav.extractor.AssetExtractor extractor;
    private boolean extractorDone;
    private long frameDurationUs;
    boolean isReleased;
    boolean lastFrameValid;
    private int lastOutputBufferIndex;
    private com.tencent.tav.decoder.logger.WXLogger logger;
    private long mLastVideoQueueTime;
    private long mTimeOffset;
    private com.tencent.tav.codec.IMediaCodec mediaCodecWrapper;
    private android.media.MediaFormat mediaFormat;
    private com.tencent.tav.extractor.AssetExtractor mirrorExtractor;
    private java.nio.ByteBuffer outputBuffer;
    private android.view.Surface outputSurface;
    private com.tencent.tav.coremedia.CMTime pFrameTime;
    private java.util.ArrayList<com.tencent.tav.decoder.VideoDecoder.PendingFrame> pendingFrames;
    private long preReadCost;
    private com.tencent.tav.coremedia.CMTime preReadTime;
    private boolean readSampleFinish;
    private boolean started;
    private com.tencent.tav.coremedia.CMTimeRange timeRange;
    private int trackIndex;
    private com.tencent.tav.decoder.VideoTexture videoTexture;

    /* loaded from: classes16.dex */
    public static class PendingFrame {
        private com.tencent.tav.coremedia.CMTime seekStartTime;
        private long timeOffset;

        private PendingFrame() {
            this.timeOffset = 0L;
            this.seekStartTime = com.tencent.tav.coremedia.CMTime.CMTimeZero;
        }
    }

    /* loaded from: classes16.dex */
    public class SampleTime {
        private com.tencent.tav.coremedia.CMSampleState sampleState;
        private long timeUs;

        private SampleTime() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fixCMTime() {
            if (this.sampleState.getTime().smallThan(com.tencent.tav.coremedia.CMTime.CMTimeZero)) {
                this.sampleState = new com.tencent.tav.coremedia.CMSampleState(com.tencent.tav.coremedia.CMTime.fromUs(com.tencent.tav.decoder.VideoDecoder.this.frameDurationUs));
            }
        }

        public java.lang.String toString() {
            return "SampleTime{sampleState=" + this.sampleState + ", timeUs=" + this.timeUs + '}';
        }
    }

    public VideoDecoder(java.lang.String str) {
        this(str, null, null, null, null);
    }

    private void clearDecoder() {
        com.tencent.tav.decoder.logger.Logger.d(this.TAG, "clearDecoder " + getSourcePath());
        releaseOutputBuffer();
        if (this.pendingFrames.size() != 0 || this.extractorDone) {
            try {
                this.mediaCodecWrapper.flush();
            } catch (java.lang.Exception e17) {
                com.tencent.tav.decoder.logger.Logger.e(this.TAG, "flushDecoder", e17);
            }
            this.pendingFrames.clear();
        }
        this.currentDecoderState = new com.tencent.tav.coremedia.CMSampleState();
    }

    private void createMirrorExtractor() {
        new java.lang.Thread() { // from class: com.tencent.tav.decoder.VideoDecoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    long currentThreadTimeMillis = android.os.SystemClock.currentThreadTimeMillis();
                    com.tencent.tav.extractor.AssetExtractor assetExtractor = new com.tencent.tav.extractor.AssetExtractor();
                    assetExtractor.setDataSource(com.tencent.tav.decoder.VideoDecoder.this.extractor.getSourcePath());
                    while (assetExtractor.getSampleTrackIndex() != -1) {
                        assetExtractor.unselectTrack(assetExtractor.getSampleTrackIndex());
                    }
                    assetExtractor.selectTrack(com.tencent.tav.decoder.DecoderUtils.getFirstTrackIndex(assetExtractor, "video/"));
                    assetExtractor.seekTo(com.tencent.tav.decoder.VideoDecoder.this.timeRange == null ? 0L : com.tencent.tav.decoder.VideoDecoder.this.timeRange.getStartUs(), 0);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (assetExtractor.getSampleTime() != -1) {
                        arrayList.add(java.lang.Long.valueOf(assetExtractor.getSampleTime()));
                        assetExtractor.advance();
                    }
                    com.tencent.tav.decoder.VideoDecoder.this.allFrameTime.addAll(arrayList);
                    com.tencent.tav.decoder.VideoDecoder.this.mirrorExtractor = assetExtractor;
                    com.tencent.tav.decoder.logger.Logger.d(com.tencent.tav.decoder.VideoDecoder.this.TAG, "Decoder: MirrorExtractor Init " + (android.os.SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis));
                } catch (java.lang.Exception e17) {
                    com.tencent.tav.decoder.logger.Logger.e(com.tencent.tav.decoder.VideoDecoder.this.TAG, "createMirrorExtractor", e17);
                }
            }
        }.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x030a, code lost:
    
        r22.lastOutputBufferIndex = r8;
        r2 = r22.mediaCodecWrapper.getOutputBuffer(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0312, code lost:
    
        if (r2 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0314, code lost:
    
        r2.position(r22.bufferInfo.offset);
        r6 = r22.bufferInfo;
        r2.limit(r6.offset + r6.size);
        r22.outputBuffer = r2;
        r23.fixCMTime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x032b, code lost:
    
        r22.mediaCodecWrapper.releaseOutputBuffer(r8, false);
        com.tencent.tav.decoder.logger.Logger.e(r22.TAG, "doReadFrames:[error] " + r22.bufferInfo.size + " byteBuffer==null");
        r23.sampleState = com.tencent.tav.coremedia.CMSampleState.fromError(-3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0356, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v4, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void doReadFrames(com.tencent.tav.decoder.VideoDecoder.SampleTime r23, com.tencent.tav.coremedia.CMTime r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 1002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.VideoDecoder.doReadFrames(com.tencent.tav.decoder.VideoDecoder$SampleTime, com.tencent.tav.coremedia.CMTime, boolean):void");
    }

    private synchronized com.tencent.tav.coremedia.CMSampleState doReadSample(com.tencent.tav.coremedia.CMTime cMTime, boolean z17) {
        if (cMTime.bigThan(this.timeRange.getDuration()) && !z17) {
            com.tencent.tav.decoder.logger.Logger.i(this.TAG, "doReadSample:[finish] targetTime.bigThan(timeRange.getDuration()) is" + cMTime.bigThan(this.timeRange.getDuration()) + "&& !justCache istrue");
            return com.tencent.tav.coremedia.CMSampleState.fromError(-1L);
        }
        if (this.extractorDone && this.pendingFrames.size() == 0 && this.timeRange.containsTime(cMTime) && !this.readSampleFinish) {
            com.tencent.tav.decoder.logger.Logger.w(this.TAG, "error state , and will go correct it ! ");
        }
        this.preReadTime = com.tencent.tav.coremedia.CMTime.CMTimeInvalid;
        if (this.started && this.trackIndex != -1) {
            releaseOutputBuffer();
            com.tencent.tav.decoder.VideoDecoder.SampleTime sampleTime = new com.tencent.tav.decoder.VideoDecoder.SampleTime();
            sampleTime.sampleState = com.tencent.tav.coremedia.CMSampleState.fromError(-2L);
            sampleTime.timeUs = -2L;
            try {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                doReadFrames(sampleTime, cMTime, z17);
                this.decodeReporter.add(java.lang.System.currentTimeMillis() - currentTimeMillis);
                com.tencent.tav.decoder.logger.Logger.v(this.TAG, "doReadSample:[success] " + this.extractorDone + " " + sampleTime.timeUs + "  " + sampleTime.sampleState);
                return sampleTime.sampleState;
            } catch (java.lang.Exception e17) {
                return onReadFramesException(e17);
            }
        }
        java.lang.String str = this.TAG;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doReadSample:[unStart]  !started || trackIndex == -1 ");
        boolean z18 = true;
        sb6.append(!this.started);
        sb6.append(" - ");
        if (this.trackIndex != -1) {
            z18 = false;
        }
        sb6.append(z18);
        com.tencent.tav.decoder.logger.Logger.e(str, sb6.toString());
        return com.tencent.tav.coremedia.CMSampleState.fromError(-100L);
    }

    private boolean hasPreReadAndFirstFrameSeek(com.tencent.tav.coremedia.CMTime cMTime) {
        return (cMTime != com.tencent.tav.coremedia.CMTime.CMTimeZero || this.preReadTime == com.tencent.tav.coremedia.CMTime.CMTimeInvalid || this.lastOutputBufferIndex == -1 || this.currentDecoderState.isInvalid()) ? false : true;
    }

    private boolean initExtractor(java.lang.String str) {
        com.tencent.tav.extractor.AssetExtractor assetExtractor = new com.tencent.tav.extractor.AssetExtractor();
        this.extractor = assetExtractor;
        assetExtractor.setDataSource(str);
        while (this.extractor.getSampleTrackIndex() != -1) {
            com.tencent.tav.extractor.AssetExtractor assetExtractor2 = this.extractor;
            assetExtractor2.unselectTrack(assetExtractor2.getSampleTrackIndex());
        }
        int firstTrackIndex = com.tencent.tav.decoder.DecoderUtils.getFirstTrackIndex(this.extractor, "video/");
        this.trackIndex = firstTrackIndex;
        if (firstTrackIndex != -1) {
            this.extractor.selectTrack(firstTrackIndex);
            return true;
        }
        this.outputSurface = null;
        this.outputBuffer = null;
        return false;
    }

    private boolean moreCloseCurrentThenSeek(com.tencent.tav.coremedia.CMTime cMTime) {
        if (this.mirrorExtractor == null) {
            return false;
        }
        long timeUs = this.currentDecoderState.getTime().getTimeUs();
        this.mirrorExtractor.seekTo(cMTime.getTimeUs(), 2);
        if (this.mirrorExtractor.getSampleTime() > cMTime.getTimeUs()) {
            this.mirrorExtractor.seekTo(cMTime.getTimeUs(), 0);
        }
        long sampleTime = this.mirrorExtractor.getSampleTime();
        return sampleTime <= timeUs && this.currentDecoderState.getTime().getTimeUs() >= sampleTime && this.currentDecoderState.getTime().getTimeUs() < cMTime.getTimeUs() + this.pFrameTime.getTimeUs() && timeUs <= cMTime.getTimeUs();
    }

    private com.tencent.tav.coremedia.CMSampleState onReadFramesException(java.lang.Exception exc) {
        com.tencent.tav.decoder.logger.Logger.e(this.TAG, "onReadFramesException: ", exc);
        if (!(exc instanceof android.media.MediaCodec.CodecException)) {
            return com.tencent.tav.coremedia.CMSampleState.fromError(-3L);
        }
        android.media.MediaCodec.CodecException codecException = (android.media.MediaCodec.CodecException) exc;
        if (!codecException.isRecoverable()) {
            if (codecException.isTransient()) {
                com.tencent.tav.decoder.logger.Logger.e(this.TAG, "doReadSample:[error] isTransient() is true");
            }
            com.tencent.tav.decoder.logger.Logger.e(this.TAG, "doReadSample:[error] retry failed");
            return com.tencent.tav.coremedia.CMSampleState.fromError(-3L);
        }
        releaseOutputBuffer();
        this.mediaCodecWrapper.reset();
        this.lastOutputBufferIndex = -1;
        this.pendingFrames.clear();
        this.extractor.seekTo(this.currentStartState.getTime().getTimeUs() - this.timeRange.getStartUs(), 0);
        this.extractorDone = false;
        return com.tencent.tav.coremedia.CMSampleState.fromError(-3L);
    }

    private synchronized void preReadSample() {
        this.lastFrameValid = false;
        com.tencent.tav.coremedia.CMSampleState doReadSample = doReadSample(com.tencent.tav.coremedia.CMTime.CMTimeInvalid, true);
        this.currentDecoderState = doReadSample;
        if (!doReadSample.getTime().smallThan(com.tencent.tav.coremedia.CMTime.CMTimeZero)) {
            this.currentDecoderState = this.currentStartState;
        }
        this.preReadTime = this.currentDecoderState.getTime();
        com.tencent.tav.decoder.logger.Logger.i(this.TAG, "preReadSample: " + getSourcePath() + " preReadTime = " + this.preReadTime + ", lastOutputBufferIndex = " + this.lastOutputBufferIndex);
    }

    private synchronized com.tencent.tav.coremedia.CMPerformance readFromExtractor() {
        long sampleTime = this.extractor.getSampleTime();
        com.tencent.tav.decoder.logger.Logger.v(this.TAG, "doReadFrames readFromExtractor sampleTime:" + sampleTime + ", timeRangeEnd:" + this.timeRange.getEndUs() + ", trackIndex: " + this.extractor.getSampleTrackIndex());
        if (sampleTime < this.timeRange.getEndUs() && this.extractor.getSampleTrackIndex() != -1 && sampleTime != -1) {
            return readSampleData();
        }
        com.tencent.tav.coremedia.CMPerformance cMPerformance = new com.tencent.tav.coremedia.CMPerformance();
        if (sampleTime >= this.timeRange.getEndUs()) {
            cMPerformance = readSampleData();
        }
        int dequeueInputBuffer = this.mediaCodecWrapper.dequeueInputBuffer(1000L);
        if (dequeueInputBuffer >= 0) {
            com.tencent.tav.decoder.logger.Logger.v(this.TAG, "doReadFrames readFromExtractor queue end of steam sampleTime:" + sampleTime);
            this.mediaCodecWrapper.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
            this.extractorDone = true;
        }
        return cMPerformance;
    }

    private com.tencent.tav.coremedia.CMPerformance readSampleData() {
        long sampleTime = this.extractor.getSampleTime();
        com.tencent.tav.coremedia.CMPerformance cMPerformance = new com.tencent.tav.coremedia.CMPerformance(com.tencent.tav.coremedia.CMPerformance.CMPerformanceStage.DECODE_WAIT);
        cMPerformance.markStart();
        int dequeueInputBuffer = this.mediaCodecWrapper.dequeueInputBuffer(1000L);
        if (dequeueInputBuffer >= 0) {
            cMPerformance.markEnd();
            com.tencent.tav.coremedia.CMPerformance cMPerformance2 = new com.tencent.tav.coremedia.CMPerformance(com.tencent.tav.coremedia.CMPerformance.CMPerformanceStage.EXTRACTOR);
            cMPerformance2.addPreNode(cMPerformance);
            cMPerformance2.markStart();
            int readSampleData = this.extractor.readSampleData(this.mediaCodecWrapper.getInputBuffer(dequeueInputBuffer), 0);
            cMPerformance2.markEnd();
            if (readSampleData >= 0) {
                this.mLastVideoQueueTime = (sampleTime - this.timeRange.getStartUs()) + this.mTimeOffset;
                com.tencent.tav.decoder.logger.Logger.v(this.TAG, "doReadFrames readSampleData queueInputBuffer sampleTime:" + sampleTime);
                this.mediaCodecWrapper.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, this.mLastVideoQueueTime, 0);
                com.tencent.tav.coremedia.CMPerformance cMPerformance3 = new com.tencent.tav.coremedia.CMPerformance(com.tencent.tav.coremedia.CMPerformance.CMPerformanceStage.DECODE);
                cMPerformance3.preNodes.add(cMPerformance2);
                cMPerformance3.markStart();
                com.tencent.tav.decoder.VideoDecoder.PendingFrame pendingFrame = new com.tencent.tav.decoder.VideoDecoder.PendingFrame();
                pendingFrame.timeOffset = this.mTimeOffset;
                pendingFrame.seekStartTime = this.currentStartState.getTime();
                this.pendingFrames.add(pendingFrame);
                cMPerformance = cMPerformance3;
            } else {
                cMPerformance = cMPerformance2;
            }
            this.extractor.advance();
        }
        return cMPerformance;
    }

    private com.tencent.tav.coremedia.CMSampleState renderCacheBuffer() {
        com.tencent.tav.decoder.logger.Logger.v(this.TAG, "renderCacheBuffer: cache hit - " + this.currentDecoderState);
        try {
            this.mediaCodecWrapper.releaseOutputBuffer(this.lastOutputBufferIndex, true);
            this.lastOutputBufferIndex = -1;
            if (this.currentDecoderState.getTime().bigThan(this.timeRange.getEnd())) {
                this.currentDecoderState = com.tencent.tav.coremedia.CMSampleState.fromError(-1L);
                this.pendingFrames.clear();
                this.extractorDone = true;
            }
            com.tencent.tav.coremedia.CMSampleState cMSampleState = this.currentDecoderState;
            cMSampleState.performance.stage = com.tencent.tav.coremedia.CMPerformance.CMPerformanceStage.DECODE_CACHE;
            return cMSampleState;
        } catch (java.lang.Exception e17) {
            com.tencent.tav.decoder.logger.Logger.e(this.TAG, "renderCacheBuffer: ", e17);
            return com.tencent.tav.coremedia.CMSampleState.fromError(-2L);
        }
    }

    private synchronized void seekExtractorTo(long j17) {
        this.extractor.seekTo(j17, 2);
        if (this.extractor.getSampleTime() > j17) {
            this.extractor.seekTo(j17, 0);
        }
        clearDecoder();
        this.mTimeOffset = this.mLastVideoQueueTime + 10000000;
    }

    public void finalize() {
        super.finalize();
        release(false);
    }

    public com.tencent.tav.decoder.VideoCropInfo getCropInfo() {
        return this.cropInfo;
    }

    @Override // com.tencent.tav.decoder.IDecoder
    public com.tencent.tav.report.AverageTimeReporter getDecodePerformance() {
        return this.decodeReporter;
    }

    @Override // com.tencent.tav.decoder.IVideoDecoder
    public long getPreReadCost() {
        return this.preReadCost;
    }

    @Override // com.tencent.tav.decoder.IDecoder
    public java.lang.String getSourcePath() {
        com.tencent.tav.extractor.AssetExtractor assetExtractor = this.extractor;
        if (assetExtractor == null) {
            return null;
        }
        return assetExtractor.getSourcePath();
    }

    @Override // com.tencent.tav.decoder.IVideoDecoder
    public com.tencent.tav.coremedia.TextureInfo getTextureInfo() {
        return null;
    }

    @Override // com.tencent.tav.decoder.IDecoder
    public synchronized boolean hasTrack() {
        return this.trackIndex != -1;
    }

    @Override // com.tencent.tav.decoder.IVideoDecoder
    public void init(java.lang.String str, com.tencent.tav.coremedia.CGSize cGSize, com.tencent.tav.decoder.IDecoderTrack.SurfaceCreator surfaceCreator) {
    }

    @Override // com.tencent.tav.decoder.IVideoDecoder
    public boolean isLastFrameValid() {
        return this.lastFrameValid;
    }

    public boolean isStarted() {
        return this.started;
    }

    @Override // com.tencent.tav.decoder.IVideoDecoder
    public com.tencent.tav.coremedia.CMTime nextFrameTime(com.tencent.tav.coremedia.CMTime cMTime) {
        long timeUs = cMTime.getTimeUs();
        java.util.Iterator<java.lang.Long> it = this.allFrameTime.iterator();
        while (it.hasNext()) {
            long longValue = it.next().longValue();
            if (timeUs < longValue) {
                return new com.tencent.tav.coremedia.CMTime((((float) longValue) / 1000.0f) / 1000.0f);
            }
        }
        return this.currentDecoderState.getTime().add(this.pFrameTime);
    }

    @Override // com.tencent.tav.decoder.IDecoder
    public synchronized java.nio.ByteBuffer outputBuffer() {
        return this.outputBuffer;
    }

    @Override // com.tencent.tav.decoder.IVideoDecoder
    public synchronized android.view.Surface outputSurface() {
        return this.outputSurface;
    }

    @Override // com.tencent.tav.decoder.IDecoder
    public synchronized com.tencent.tav.coremedia.CMSampleState readSample() {
        return readSample(com.tencent.tav.coremedia.CMTime.CMTimeInvalid);
    }

    @Override // com.tencent.tav.decoder.IVideoDecoder
    public com.tencent.tav.coremedia.CMSampleBuffer readVideoSampleBuffer(com.tencent.tav.coremedia.CMTime cMTime) {
        com.tencent.tav.coremedia.CMSampleState readSample = readSample(cMTime);
        return (readSample.getStateCode() <= -1 || !isLastFrameValid() || readSample.getExportCode() < 0) ? new com.tencent.tav.coremedia.CMSampleBuffer(readSample) : new com.tencent.tav.coremedia.CMSampleBuffer(readSample, getTextureInfo());
    }

    @Override // com.tencent.tav.decoder.IDecoder
    public void release() {
    }

    public void releaseOutputBuffer() {
        int i17 = this.lastOutputBufferIndex;
        if (i17 != -1) {
            try {
                this.mediaCodecWrapper.releaseOutputBuffer(i17, false);
            } catch (java.lang.Exception e17) {
                com.tencent.tav.decoder.logger.Logger.e(this.TAG, "releaseOutputBuffer", e17);
            }
            this.lastOutputBufferIndex = -1;
        }
        this.outputBuffer = null;
    }

    @Override // com.tencent.tav.decoder.IDecoder
    public synchronized void seekTo(com.tencent.tav.coremedia.CMTime cMTime) {
        seekTo(cMTime, true);
    }

    @Override // com.tencent.tav.decoder.IVideoDecoder, com.tencent.tav.decoder.IDecoder
    public void setLogger(com.tencent.tav.decoder.logger.WXLogger wXLogger) {
        this.logger = wXLogger;
    }

    @Override // com.tencent.tav.decoder.IDecoder
    public synchronized void start(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        start(cMTimeRange, com.tencent.tav.coremedia.CMTime.CMTimeZero);
    }

    @Override // com.tencent.tav.decoder.IVideoDecoder
    public void switchFrame() {
    }

    public VideoDecoder(java.lang.String str, android.view.Surface surface, com.tencent.tav.decoder.VideoTexture videoTexture, com.tencent.tav.codec.IDecoderFactory iDecoderFactory, com.tencent.tav.core.composition.VideoComposition videoComposition) {
        java.lang.String str2 = "VideoDecoder@" + java.lang.Integer.toHexString(hashCode());
        this.TAG = str2;
        this.frameDurationUs = 33333L;
        this.duration = com.tencent.tav.coremedia.CMTime.CMTimeZero;
        this.pFrameTime = new com.tencent.tav.coremedia.CMTime(20L, 600);
        this.trackIndex = -1;
        this.bufferInfo = new android.media.MediaCodec.BufferInfo();
        this.outputBuffer = null;
        this.currentDecoderState = new com.tencent.tav.coremedia.CMSampleState();
        this.preReadTime = com.tencent.tav.coremedia.CMTime.CMTimeInvalid;
        this.pendingFrames = new java.util.ArrayList<>();
        this.allFrameTime = new java.util.ArrayList();
        this.logger = new com.tencent.tav.decoder.logger.WXLogger();
        boolean z17 = false;
        this.isReleased = false;
        this.started = false;
        this.lastFrameValid = false;
        this.lastOutputBufferIndex = -1;
        this.preReadCost = 0L;
        this.decodeReporter = new com.tencent.tav.report.AverageTimeReporter();
        this.mTimeOffset = 10000000L;
        this.mLastVideoQueueTime = 0L;
        this.currentStartState = new com.tencent.tav.coremedia.CMSampleState();
        this.extractorDone = false;
        this.readSampleFinish = false;
        com.tencent.tav.decoder.logger.Logger.d(str2, "create VideoDecoder start");
        if (iDecoderFactory != null) {
            this.decoderFactory = iDecoderFactory;
        } else {
            this.decoderFactory = new com.tencent.tav.codec.DefaultDecoderFactory();
        }
        if (surface != null) {
            this.outputSurface = surface;
        }
        if (videoTexture != null) {
            this.videoTexture = videoTexture;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (initExtractor(str)) {
            createMirrorExtractor();
            this.mediaFormat = this.extractor.getTrackFormat(this.trackIndex);
            this.duration = new com.tencent.tav.coremedia.CMTime((((float) this.extractor.getDuration()) * 1.0f) / ((float) java.util.concurrent.TimeUnit.SECONDS.toMicros(1L)));
            if (this.mediaFormat.containsKey("frame-rate")) {
                int integer = this.mediaFormat.getInteger("frame-rate");
                this.pFrameTime = new com.tencent.tav.coremedia.CMTime(600 / integer, 600);
                this.frameDurationUs = 1000000 / integer;
            }
            if (this.mediaFormat.containsKey("rotation-degrees")) {
                int integer2 = this.mediaFormat.getInteger("rotation-degrees");
                if (videoTexture != null) {
                    videoTexture.setSurfaceTextureRotation(integer2);
                }
            }
            boolean z18 = android.os.Build.VERSION.SDK_INT >= 31;
            if (videoComposition != null && z18) {
                z18 = videoComposition.getUseSystemHdrTranscode();
                if (videoComposition.getLutBitmap() != null && z18) {
                    this.mediaFormat.setInteger("color-transfer-request", 3);
                }
            }
            com.tencent.tav.codec.IMediaCodec createVideoDecoder = this.decoderFactory.createVideoDecoder(this.mediaFormat.getString("mime"));
            this.mediaCodecWrapper = createVideoDecoder;
            this.extractor.setIsSoft(createVideoDecoder.isSoft());
            this.mediaCodecWrapper.setDataSource(str);
            this.mediaCodecWrapper.configure(this.mediaFormat, surface, null, 0);
            android.media.MediaFormat inputFormat = this.mediaCodecWrapper.getInputFormat();
            if (z18 && inputFormat != null && inputFormat.getInteger("color-transfer-request", 0) == 3) {
                z17 = true;
            }
            if (videoComposition != null && z17 && !videoComposition.getLutBitmap().isRecycled()) {
                com.tencent.tav.decoder.logger.Logger.i(str2, "system hdr transcode supported, disable lut");
                videoComposition.getLutBitmap().recycle();
            } else {
                com.tencent.tav.decoder.logger.Logger.i(str2, "system hdr transcode not supported");
            }
            this.mediaCodecWrapper.bindSurfaceTexture(this.videoTexture.surfaceTexture());
            this.mediaCodecWrapper.start();
            com.tencent.tav.decoder.logger.Logger.d(str2, "create VideoDecoder end " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        }
    }

    @Override // com.tencent.tav.decoder.IDecoder
    public synchronized com.tencent.tav.coremedia.CMSampleState readSample(com.tencent.tav.coremedia.CMTime cMTime) {
        boolean z17;
        com.tencent.tav.coremedia.CMSampleState doReadSample;
        com.tencent.tav.decoder.logger.Logger.v(this.TAG, "readSample: " + cMTime + ", currentDecoderTime = " + this.currentDecoderState + ",  extractor.getSampleTime() = " + this.extractor.getSampleTime() + ", lastOutputBufferIndex = " + this.lastOutputBufferIndex);
        this.lastFrameValid = false;
        boolean z18 = (outputSurface() == null || this.lastOutputBufferIndex == -1) ? false : true;
        if (this.currentDecoderState.getTime().smallThan(cMTime) && (!this.extractorDone || !this.pendingFrames.isEmpty())) {
            z17 = false;
            if (!z18 && z17) {
                return renderCacheBuffer();
            }
            doReadSample = doReadSample(cMTime, false);
            if (this.currentDecoderState.isInvalid() && doReadSample.getTime().bigThan(this.timeRange.getDuration())) {
                this.currentDecoderState = com.tencent.tav.coremedia.CMSampleState.fromError(-1L);
                this.pendingFrames.clear();
                this.extractorDone = true;
                com.tencent.tav.decoder.logger.Logger.v(this.TAG, "readSample: finish " + cMTime + "  -  " + this.currentDecoderState);
                this.readSampleFinish = true;
                return this.currentDecoderState;
            }
            this.currentDecoderState = doReadSample;
            if (!doReadSample.stateMatchingTo(-1, -4) || !this.currentDecoderState.getTime().smallThan(this.duration)) {
                clearDecoder();
            }
            com.tencent.tav.decoder.logger.Logger.v(this.TAG, "readSample: finish flag = " + this.lastFrameValid + " - " + this.extractorDone + ", time = " + cMTime + "  -  " + this.currentDecoderState);
            return doReadSample;
        }
        z17 = true;
        if (!z18) {
        }
        doReadSample = doReadSample(cMTime, false);
        if (this.currentDecoderState.isInvalid()) {
        }
        this.currentDecoderState = doReadSample;
        if (!doReadSample.stateMatchingTo(-1, -4)) {
        }
        clearDecoder();
        com.tencent.tav.decoder.logger.Logger.v(this.TAG, "readSample: finish flag = " + this.lastFrameValid + " - " + this.extractorDone + ", time = " + cMTime + "  -  " + this.currentDecoderState);
        return doReadSample;
    }

    @Override // com.tencent.tav.decoder.IVideoDecoder
    public synchronized void release(boolean z17) {
        if (this.isReleased) {
            return;
        }
        com.tencent.tav.decoder.logger.Logger.i(this.TAG, "release:start " + z17);
        if (z17) {
            this.extractor.dispose();
            this.extractor = null;
        }
        com.tencent.tav.extractor.AssetExtractor assetExtractor = this.mirrorExtractor;
        if (assetExtractor != null) {
            assetExtractor.dispose();
            this.mirrorExtractor = null;
        }
        this.started = false;
        this.isReleased = true;
        com.tencent.tav.codec.IMediaCodec iMediaCodec = this.mediaCodecWrapper;
        if (iMediaCodec != null) {
            iMediaCodec.release();
        }
        com.tencent.tav.decoder.logger.Logger.i(this.TAG, "release:end " + z17);
        com.tencent.tav.decoder.logger.Logger.i(this.TAG, "decode performance:" + this.decodeReporter);
    }

    @Override // com.tencent.tav.decoder.IVideoDecoder
    public synchronized void seekTo(com.tencent.tav.coremedia.CMTime cMTime, boolean z17) {
        com.tencent.tav.decoder.logger.Logger.v(this.TAG, "seekTo: " + cMTime + "  - " + this + "  " + this.currentStartState + "  " + this.currentDecoderState);
        if (this.started && this.trackIndex != -1) {
            com.tencent.tav.coremedia.CMTime cMTime2 = com.tencent.tav.coremedia.CMTime.CMTimeZero;
            if (cMTime.smallThan(cMTime2)) {
                cMTime = cMTime2;
            }
            com.tencent.tav.coremedia.CMTime add = this.timeRange.getStart().add(cMTime);
            if ((!z17 || !moreCloseCurrentThenSeek(cMTime)) && !cMTime.equalsTo(this.currentDecoderState.getTime()) && !hasPreReadAndFirstFrameSeek(cMTime)) {
                this.currentStartState = new com.tencent.tav.coremedia.CMSampleState(cMTime);
                seekExtractorTo(add.getTimeUs());
                this.extractorDone = false;
                com.tencent.tav.decoder.logger.Logger.v(this.TAG, "seekTo: finish - " + this.currentStartState + "  " + this.extractor.getSampleTime());
                return;
            }
            return;
        }
        com.tencent.tav.decoder.logger.Logger.e(this.TAG, "seekTo: [failed] !started || trackIndex == -1 ");
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
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            seekTo(cMTime, false);
            preReadSample();
            this.preReadCost = java.lang.System.currentTimeMillis() - currentTimeMillis;
        }
    }
}
