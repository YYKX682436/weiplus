package com.tencent.tav.core.audio;

/* loaded from: classes16.dex */
public class AudioExportRunner implements java.lang.Runnable {
    static final int EDGE_DURATION_MS = 200;
    private static final int MAX_INPUT_SIZE = 8192;
    private static java.lang.String MIME = "audio/mp4a-latm";
    static final int PACKET_FPS = 44;
    public static final java.lang.String TAG = "AudioEncoder";
    private static final long WAIT_TRANSIENT_MS = 20;
    com.tencent.tav.core.audio.IAudioSource<? extends com.tencent.tav.decoder.IDecoderTrack> mAudioAsset;
    com.tencent.tav.decoder.IDecoderTrack mAudioDecoder;
    private android.media.MediaCodec mAudioEncoder;
    private com.tencent.tav.core.audio.ExportCallback mCallback;
    private java.io.FileOutputStream mFos;
    private java.lang.String mSavePath;
    com.tencent.tav.coremedia.CMTimeRange mSelectedTimeRange;
    private java.lang.Thread mThread;
    private java.lang.String mMime = MIME;
    private int mRate = com.tencent.tav.decoder.EncoderWriter.OUTPUT_AUDIO_BIT_RATE;
    private int mSampleRate = 44100;
    private int mChannelCount = 1;
    private int mStatus = 0;
    private java.util.concurrent.atomic.AtomicBoolean mStop = new java.util.concurrent.atomic.AtomicBoolean(false);
    private boolean mCancel = false;
    private boolean enOfAudioInputStream = false;

    public AudioExportRunner(com.tencent.tav.core.audio.IAudioSource<? extends com.tencent.tav.decoder.IDecoderTrack> iAudioSource, com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        this.mAudioAsset = iAudioSource;
        if (cMTimeRange == null) {
            this.mSelectedTimeRange = new com.tencent.tav.coremedia.CMTimeRange(com.tencent.tav.coremedia.CMTime.CMTimeZero, iAudioSource.getDuration());
        } else {
            this.mSelectedTimeRange = cMTimeRange;
        }
    }

    private int dequeueInputBuffer(android.media.MediaCodec mediaCodec) {
        try {
            return mediaCodec.dequeueInputBuffer(1000L);
        } catch (java.lang.Error | java.lang.Exception e17) {
            com.tencent.tav.decoder.logger.Logger.e(TAG, "dequeueInputBuffer e = ", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CodecException - isTransient = ");
                android.media.MediaCodec.CodecException codecException = (android.media.MediaCodec.CodecException) e17;
                sb6.append(codecException.isTransient());
                sb6.append(" , isRecoverable = ");
                sb6.append(codecException.isRecoverable());
                sb6.append(" , errorCode = ");
                sb6.append(codecException.getErrorCode());
                com.tencent.tav.decoder.logger.Logger.e(TAG, sb6.toString());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    return dequeueInputBuffer(mediaCodec);
                }
            }
            throw e17;
        }
    }

    private java.nio.ByteBuffer getInputBuffer(int i17) {
        return this.mAudioEncoder.getInputBuffer(i17);
    }

    private java.nio.ByteBuffer getOutputBuffer(int i17) {
        return this.mAudioEncoder.getOutputBuffer(i17);
    }

    private void initAudioDecoder() {
        try {
            com.tencent.tav.decoder.IDecoderTrack sourceAudioDecoder = this.mAudioAsset.getSourceAudioDecoder(this.mSelectedTimeRange);
            this.mAudioDecoder = sourceAudioDecoder;
            sourceAudioDecoder.start();
            com.tencent.tav.coremedia.CMTime start = this.mSelectedTimeRange.getStart();
            com.tencent.tav.decoder.IDecoderTrack iDecoderTrack = this.mAudioDecoder;
            com.tencent.tav.coremedia.CMTime cMTime = com.tencent.tav.coremedia.CMTime.CMTimeZero;
            if (start.bigThan(cMTime)) {
                cMTime = start.sub(com.tencent.tav.coremedia.CMTime.fromMs(200L));
            }
            iDecoderTrack.seekTo(cMTime, false, false);
        } catch (java.lang.Throwable unused) {
        }
    }

    private void initAudioEncoder() {
        android.media.MediaFormat createAudioFormat = android.media.MediaFormat.createAudioFormat(MIME, this.mSampleRate, this.mChannelCount);
        createAudioFormat.setInteger("aac-profile", 2);
        createAudioFormat.setInteger(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, this.mRate);
        createAudioFormat.setInteger("max-input-size", 8192);
        android.media.MediaCodec createEncoderByType = android.media.MediaCodec.createEncoderByType(this.mMime);
        this.mAudioEncoder = createEncoderByType;
        createEncoderByType.configure(createAudioFormat, (android.view.Surface) null, (android.media.MediaCrypto) null, 1);
    }

    private boolean isFinish(android.media.MediaCodec.BufferInfo bufferInfo) {
        return bufferInfo.presentationTimeUs >= this.mSelectedTimeRange.getEndUs();
    }

    private boolean isValidBuffer(android.media.MediaCodec.BufferInfo bufferInfo) {
        return bufferInfo.size > 0 && bufferInfo.presentationTimeUs >= this.mSelectedTimeRange.getStartUs() && bufferInfo.presentationTimeUs <= this.mSelectedTimeRange.getEndUs() && (bufferInfo.flags & 2) == 0;
    }

    private void notifyProgressUpdate(long j17) {
        com.tencent.tav.coremedia.CMTimeRange cMTimeRange;
        if (this.mCallback == null || (cMTimeRange = this.mSelectedTimeRange) == null) {
            return;
        }
        this.mCallback.onProgress(this.mStatus, (((float) (j17 - cMTimeRange.getStartUs())) * 1.0f) / ((float) this.mSelectedTimeRange.getDurationUs()));
    }

    private void queueInputBuffer(android.media.MediaCodec mediaCodec, int i17, int i18, int i19, long j17, int i27) {
        try {
            mediaCodec.queueInputBuffer(i17, i18, i19, j17, i27);
        } catch (java.lang.Error | java.lang.Exception e17) {
            com.tencent.tav.decoder.logger.Logger.e(TAG, "queueInputBuffer", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CodecException - isTransient = ");
                android.media.MediaCodec.CodecException codecException = (android.media.MediaCodec.CodecException) e17;
                sb6.append(codecException.isTransient());
                sb6.append(" , isRecoverable = ");
                sb6.append(codecException.isRecoverable());
                sb6.append(" , errorCode = ");
                sb6.append(codecException.getErrorCode());
                com.tencent.tav.decoder.logger.Logger.e(TAG, sb6.toString());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    waitTime(20L);
                    queueInputBuffer(mediaCodec, i17, i18, i19, j17, i27);
                }
            }
            throw e17;
        }
    }

    private void readNextSample() {
        com.tencent.tav.coremedia.CMSampleBuffer readSample = this.mAudioDecoder.readSample();
        com.tencent.tav.coremedia.CMTime time = readSample.getTime();
        if (time.value > 0 && time.getTimeUs() <= this.mSelectedTimeRange.getEndUs()) {
            java.nio.ByteBuffer sampleByteBuffer = readSample.getSampleByteBuffer();
            int limit = sampleByteBuffer.limit() - sampleByteBuffer.position();
            byte[] bArr = new byte[limit];
            sampleByteBuffer.get(bArr);
            writeAudioSample(time, limit, bArr);
            return;
        }
        long stateCode = readSample.getState().getStateCode();
        if (stateCode >= -1 && !this.enOfAudioInputStream) {
            signalEndOfAudioStream();
            this.enOfAudioInputStream = true;
        }
        this.mStatus = stateCode < -1 ? 255 : this.mStatus;
    }

    private void signalEndOfAudioStream() {
        try {
            com.tencent.tav.decoder.logger.Logger.d(TAG, "signalEndOfAudioStream: ");
            int dequeueInputBuffer = dequeueInputBuffer(this.mAudioEncoder);
            if (dequeueInputBuffer >= 0) {
                queueInputBuffer(this.mAudioEncoder, dequeueInputBuffer, 0, 0, 0L, 4);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.tav.decoder.logger.Logger.e(TAG, "signalEndOfAudioStream failed", th6);
        }
    }

    private synchronized void stop() {
        if (!this.mStop.get()) {
            this.mStop.set(true);
            try {
                this.mAudioDecoder.release();
                this.mAudioEncoder.stop();
                this.mAudioEncoder.release();
                this.mFos.flush();
                this.mFos.close();
            } catch (java.lang.Exception unused) {
            }
        }
        notifyProgressUpdate(this.mSelectedTimeRange.getEndUs());
        this.mCancel = false;
    }

    private void waitTime(long j17) {
        try {
            wait(j17);
        } catch (java.lang.InterruptedException unused) {
        }
    }

    private void write(byte[] bArr) {
        if (this.mFos == null) {
            this.mFos = new java.io.FileOutputStream(this.mSavePath);
        }
        this.mFos.write(bArr);
    }

    private void writeAudioSample(com.tencent.tav.coremedia.CMTime cMTime, int i17, byte[] bArr) {
        int i18 = 0;
        while (i17 - i18 > 0) {
            int dequeueInputBuffer = this.mAudioEncoder.dequeueInputBuffer(-1L);
            if (dequeueInputBuffer >= 0) {
                java.nio.ByteBuffer inputBuffer = getInputBuffer(dequeueInputBuffer);
                inputBuffer.clear();
                int min = java.lang.Math.min(inputBuffer.capacity(), i17);
                inputBuffer.put(bArr, i18, min);
                i18 += min;
                this.mAudioEncoder.queueInputBuffer(dequeueInputBuffer, 0, min, cMTime.getTimeUs(), 1);
            }
        }
    }

    public synchronized void cancel() {
        this.mCancel = true;
    }

    public int getRate() {
        return this.mRate;
    }

    public int getSampleRate() {
        return this.mSampleRate;
    }

    public java.lang.String getSavePath() {
        return this.mSavePath;
    }

    public com.tencent.tav.coremedia.CMTimeRange getSelectedTimeRange() {
        return this.mSelectedTimeRange;
    }

    public void prepare() {
        initAudioDecoder();
        initAudioEncoder();
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.tav.decoder.logger.Logger.d(TAG, "encoder start - " + this);
        while (this.mStatus <= 1 && !this.mCancel) {
            try {
                readNextSample();
                writeAudioSample();
            } catch (java.lang.Throwable unused) {
                this.mStatus = 255;
            }
        }
        if (this.mCancel) {
            this.mStatus = 4;
        }
        com.tencent.tav.decoder.logger.Logger.d(TAG, "encoder finish - " + this + "  mStatus = " + this.mStatus);
        stop();
    }

    public void setAsset(com.tencent.tav.core.audio.IAudioSource<? extends com.tencent.tav.decoder.IDecoderTrack> iAudioSource) {
        this.mAudioAsset = iAudioSource;
    }

    public void setCallback(com.tencent.tav.core.audio.ExportCallback exportCallback) {
        this.mCallback = exportCallback;
    }

    public void setMime(java.lang.String str) {
        this.mMime = str;
    }

    public void setRate(int i17) {
        this.mRate = i17;
    }

    public void setSampleRate(int i17) {
        this.mSampleRate = i17;
    }

    public void setSavePath(java.lang.String str) {
        this.mSavePath = str;
    }

    public void setSelectedTimeRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        this.mSelectedTimeRange = cMTimeRange;
    }

    public synchronized void start() {
        if (this.mThread == null) {
            this.mAudioEncoder.start();
            java.lang.Thread thread = new java.lang.Thread(this);
            this.mThread = thread;
            thread.start();
            this.mStop.set(false);
            this.mCancel = false;
            this.enOfAudioInputStream = false;
            this.mStatus = 1;
        }
    }

    private void writeAudioSample() {
        int dequeueOutputBuffer;
        android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
        do {
            dequeueOutputBuffer = this.mAudioEncoder.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer >= 0 && isValidBuffer(bufferInfo) && this.mStatus != 2) {
                if ((bufferInfo.flags & 4) != 0) {
                    com.tencent.tav.decoder.logger.Logger.d(TAG, "writeAudioFrame: BUFFER_FLAG_END_OF_STREAM ");
                    this.mStatus = 2;
                }
                java.nio.ByteBuffer outputBuffer = getOutputBuffer(dequeueOutputBuffer);
                outputBuffer.position(bufferInfo.offset);
                int i17 = bufferInfo.size;
                byte[] bArr = new byte[i17 + 7];
                outputBuffer.get(bArr, 7, i17);
                com.tencent.tav.core.audio.EncoderUtils.addADTStoPacket(bArr, this.mChannelCount);
                com.tencent.tav.decoder.logger.Logger.v(TAG, "dequeue finish - " + bufferInfo.presentationTimeUs + "--" + bufferInfo.flags + " -- " + bufferInfo.size + "  -  " + dequeueOutputBuffer + " endUs = " + this.mSelectedTimeRange.getEndUs());
                write(bArr);
                this.mAudioEncoder.releaseOutputBuffer(dequeueOutputBuffer, false);
                if (this.mStatus != 2) {
                    notifyProgressUpdate(bufferInfo.presentationTimeUs);
                } else {
                    notifyProgressUpdate(this.mSelectedTimeRange.getEndUs());
                }
            } else if (isFinish(bufferInfo)) {
                this.mStatus = 2;
            } else if (dequeueOutputBuffer != -1 && dequeueOutputBuffer != -2) {
                if ((bufferInfo.flags & 4) != 0) {
                    com.tencent.tav.decoder.logger.Logger.d(TAG, "writeAudioFrame: BUFFER_FLAG_END_OF_STREAM " + bufferInfo.size + "/" + bufferInfo.presentationTimeUs);
                    this.mStatus = 2;
                    this.mAudioEncoder.releaseOutputBuffer(dequeueOutputBuffer, false);
                } else {
                    this.mAudioEncoder.releaseOutputBuffer(dequeueOutputBuffer, false);
                }
            }
        } while (dequeueOutputBuffer >= 0);
    }
}
