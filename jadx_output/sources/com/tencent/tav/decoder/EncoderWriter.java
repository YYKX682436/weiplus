package com.tencent.tav.decoder;

/* loaded from: classes16.dex */
public class EncoderWriter {
    public static final long HANDLE_FRAME_OPERATE_TIMEOUT = 10000;
    public static final int OUTPUT_AUDIO_AAC_PROFILE = 2;
    public static final int OUTPUT_AUDIO_BIT_RATE = 128000;
    public static final int OUTPUT_AUDIO_CHANNEL_COUNT = 1;
    public static final java.lang.String OUTPUT_AUDIO_MIME_TYPE = "audio/mp4a-latm";
    public static final int OUTPUT_AUDIO_SAMPLE_RATE_HZ = 44100;
    public static final int OUTPUT_VIDEO_BIT_RATE = 8000000;
    public static final int OUTPUT_VIDEO_COLOR_FORMAT = 2130708361;
    public static final int OUTPUT_VIDEO_FRAME_RATE = 30;
    public static final int OUTPUT_VIDEO_IFRAME_INTERVAL = 1;
    public static final java.lang.String OUTPUT_VIDEO_MIME_TYPE = "video/avc";
    private static final long WAIT_TRANSIENT_MS = 20;
    public static final long WRITER_FINISH = -1;
    private final java.lang.String SCENE;
    private final java.lang.String TAG;
    private android.view.Surface _inputSurface;
    private volatile android.media.MediaFormat audioEncodeFormat;
    private com.tencent.tav.decoder.AssetWriterAudioEncoder audioEncoder;
    private final java.util.concurrent.locks.Lock audioEncoderLock;
    private boolean audioEncoderStarted;
    private boolean enOfAudioInputStream;
    private boolean enOfVideoInputStream;
    private com.tencent.tav.core.ExportConfig encodeOption;
    private final com.tencent.tav.report.AverageTimeReporter encodeReporter;
    private boolean hasAudioTrack;
    private boolean hasVideoTrack;
    private boolean isCancel;
    private java.util.concurrent.locks.ReadWriteLock lock;
    private final com.tencent.tav.decoder.logger.WXLogger logger;
    private com.tencent.tav.decoder.muxer.IMediaMuxer muxer;
    private volatile boolean muxerStarted;
    private volatile int outputAudioTrack;
    private java.lang.String outputPath;
    private volatile int outputVideoTrack;
    private volatile boolean released;
    private volatile android.media.MediaFormat videoEncodeFormat;
    private com.tencent.tav.decoder.AssetWriterVideoEncoder videoEncoder;
    private final java.util.concurrent.locks.Lock videoEncoderLock;
    private boolean videoEncoderStarted;

    @java.lang.Deprecated
    /* loaded from: classes10.dex */
    public static final class OutputConfig {
        public int VIDEO_BIT_RATE = 8000000;
        public int VIDEO_FRAME_RATE = 30;
        public int VIDEO_IFRAME_INTERVAL = 1;
        public int VIDEO_TARGET_WIDTH = 0;
        public int VIDEO_TARGET_HEIGHT = 0;
        public boolean HIGH_PROFILE = false;
        public java.lang.String AUDIO_MIME_TYPE = "audio/mp4a-latm";
        public int AUDIO_BIT_RATE = com.tencent.tav.decoder.EncoderWriter.OUTPUT_AUDIO_BIT_RATE;
        public int AUDIO_AAC_PROFILE = 2;
        public int AUDIO_CHANNEL_COUNT = 1;
        public int AUDIO_SAMPLE_RATE_HZ = 44100;
    }

    public EncoderWriter(java.lang.String str, com.tencent.tav.decoder.IEncoderFactory iEncoderFactory) {
        this.TAG = "EncoderWriter" + hashCode();
        this.SCENE = "tav-encoder-writer";
        this.encodeReporter = new com.tencent.tav.report.AverageTimeReporter();
        this.logger = new com.tencent.tav.decoder.logger.WXLogger();
        this.hasVideoTrack = false;
        this.hasAudioTrack = false;
        this.enOfVideoInputStream = false;
        this.enOfAudioInputStream = false;
        this.videoEncoderLock = new java.util.concurrent.locks.ReentrantLock();
        this.audioEncoderLock = new java.util.concurrent.locks.ReentrantLock();
        this.lock = new java.util.concurrent.locks.ReentrantReadWriteLock();
        this._inputSurface = null;
        this.videoEncodeFormat = null;
        this.audioEncodeFormat = null;
        this.outputVideoTrack = -1;
        this.outputAudioTrack = -1;
        this.muxerStarted = false;
        this.videoEncoderStarted = false;
        this.audioEncoderStarted = false;
        this.released = false;
        this.isCancel = false;
        this.outputPath = str;
        this.muxer = com.tencent.tav.decoder.muxer.MediaMuxerFactory.createMediaMuxer(str, 0);
        iEncoderFactory = iEncoderFactory == null ? new com.tencent.tav.decoder.DefaultEncoderFactory() : iEncoderFactory;
        com.tencent.tav.decoder.AssetWriterAudioEncoder audioEncoder = iEncoderFactory.getAudioEncoder();
        this.audioEncoder = audioEncoder;
        audioEncoder.setMediaMuxer(this.muxer);
        com.tencent.tav.decoder.AssetWriterVideoEncoder videoEncoder = iEncoderFactory.getVideoEncoder();
        this.videoEncoder = videoEncoder;
        videoEncoder.setMediaMuxer(this.muxer);
    }

    private void checkStartMuxer(java.lang.String str) {
        if (!unStarted()) {
            if (this.muxerStarted) {
                return;
            }
            this.logger.frame(this.TAG, "notStartMuxer1: " + str + " status: " + getMuxStatusLog());
            return;
        }
        this.logger.frame(this.TAG, "checkStartMuxer: " + str);
        synchronized (this) {
            if (unStarted()) {
                if (this.hasVideoTrack) {
                    this.outputVideoTrack = this.muxer.addTrack(this.videoEncodeFormat);
                }
                if (this.hasAudioTrack) {
                    this.outputAudioTrack = this.muxer.addTrack(this.audioEncodeFormat);
                }
                this.muxer.start();
                this.muxerStarted = true;
                this.logger.frame(this.TAG, "checkStartMuxer finish: " + str + " ,hasAudioTrack:" + this.hasAudioTrack + " ,hasVideoTrack:" + this.hasVideoTrack);
            } else {
                this.logger.frame(this.TAG, "notStartMuxer2: " + str + " status: " + getMuxStatusLog());
            }
        }
    }

    private int dequeueInputBuffer(com.tencent.tav.codec.MediaCodecAnalyse mediaCodecAnalyse) {
        try {
            return mediaCodecAnalyse.dequeueInputBuffer(1000L);
        } catch (java.lang.Error | java.lang.Exception e17) {
            this.logger.e(this.TAG, "dequeueInputBuffer e = ", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                com.tencent.tav.decoder.logger.WXLogger wXLogger = this.logger;
                java.lang.String str = this.TAG;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CodecException - isTransient = ");
                android.media.MediaCodec.CodecException codecException = (android.media.MediaCodec.CodecException) e17;
                sb6.append(codecException.isTransient());
                sb6.append(" , isRecoverable = ");
                sb6.append(codecException.isRecoverable());
                sb6.append(" , errorCode = ");
                sb6.append(codecException.getErrorCode());
                wXLogger.e(str, sb6.toString());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    waitTime(20L);
                    return dequeueInputBuffer(mediaCodecAnalyse);
                }
            }
            throw e17;
        }
    }

    private int dequeueOutputBuffer(com.tencent.tav.codec.MediaCodecAnalyse mediaCodecAnalyse, android.media.MediaCodec.BufferInfo bufferInfo) {
        try {
            return mediaCodecAnalyse.dequeueOutputBuffer(bufferInfo, 1000L);
        } catch (java.lang.Exception e17) {
            this.logger.e(this.TAG, "dequeueOutputBuffer e = ", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                com.tencent.tav.decoder.logger.WXLogger wXLogger = this.logger;
                java.lang.String str = this.TAG;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CodecException - isTransient = ");
                android.media.MediaCodec.CodecException codecException = (android.media.MediaCodec.CodecException) e17;
                sb6.append(codecException.isTransient());
                sb6.append(" , isRecoverable = ");
                sb6.append(codecException.isRecoverable());
                sb6.append(" , errorCode = ");
                sb6.append(codecException.getErrorCode());
                wXLogger.e(str, sb6.toString());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    waitTime(20L);
                    return dequeueOutputBuffer(mediaCodecAnalyse, bufferInfo);
                }
            }
            throw e17;
        }
    }

    private void drainAudioEncoder(boolean z17, com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer) {
        boolean z18 = z17 ? this.hasAudioTrack : false;
        boolean z19 = !this.hasAudioTrack;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        while (!z19 && this.hasAudioTrack) {
            if (z18) {
                signalEndOfAudioStream();
                z18 = false;
            }
            if (!z19) {
                z19 = writeAudioFrame(z17);
                if (java.lang.System.currentTimeMillis() - currentTimeMillis > HANDLE_FRAME_OPERATE_TIMEOUT) {
                    this.hasAudioTrack = !z17;
                    this.logger.e(this.TAG, "drainEncoder: 音频写入处理时间超时，提前结束写入");
                    z19 = true;
                }
                checkStartMuxer("audio-drain");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void drainVideoEncoder(boolean r11, com.tencent.tav.coremedia.CMSampleBuffer r12) {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            if (r11 == 0) goto L23
            boolean r2 = r10.hasVideoTrack
            if (r2 == 0) goto L23
            android.view.Surface r2 = r10._inputSurface
            if (r2 != 0) goto L17
            com.tencent.tav.decoder.logger.WXLogger r2 = r10.logger
            java.lang.String r3 = r10.TAG
            java.lang.String r4 = "drainEncoder error, _inputSurface is null"
            r2.e(r3, r4)
            r2 = r0
            goto L24
        L17:
            r10.signalEndOfVideoStream()
            com.tencent.tav.decoder.logger.WXLogger r2 = r10.logger
            java.lang.String r3 = r10.TAG
            java.lang.String r4 = "drainEncoder endOfStream"
            r2.i(r3, r4)
        L23:
            r2 = r1
        L24:
            boolean r3 = r10.hasVideoTrack
            r3 = r3 ^ r0
            com.tencent.tav.decoder.logger.WXLogger r4 = r10.logger
            java.lang.String r5 = r10.TAG
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "drainEncoder videoDone: "
            r6.<init>(r7)
            r6.append(r3)
            java.lang.String r7 = " endOfStream: "
            r6.append(r7)
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            r4.frame(r5, r6)
            long r4 = java.lang.System.currentTimeMillis()
        L48:
            if (r3 != 0) goto L79
            boolean r6 = r10.hasVideoTrack
            if (r6 == 0) goto L79
            if (r2 == 0) goto L54
            r10.signalEndOfVideoStream()
            r2 = r1
        L54:
            if (r3 != 0) goto L48
            boolean r3 = r10.writeVideoFrame(r12, r11)
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r4
            r8 = 10000(0x2710, double:4.9407E-320)
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L73
            r3 = r11 ^ 1
            r10.hasVideoTrack = r3
            com.tencent.tav.decoder.logger.WXLogger r3 = r10.logger
            java.lang.String r6 = r10.TAG
            java.lang.String r7 = "drainEncoder: 视频写入处理时间超时，提前结束写入"
            r3.e(r6, r7)
            r3 = r0
        L73:
            java.lang.String r6 = "video-drain"
            r10.checkStartMuxer(r6)
            goto L48
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.EncoderWriter.drainVideoEncoder(boolean, com.tencent.tav.coremedia.CMSampleBuffer):void");
    }

    private void fixAudioFormat(android.media.MediaFormat mediaFormat) {
        fixStringKey(mediaFormat, "mime", "audio/mp4a-latm");
        fixIntegerKey(mediaFormat, "sample-rate", 44100);
        fixIntegerKey(mediaFormat, "channel-count", 1);
        fixIntegerKey(mediaFormat, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, OUTPUT_AUDIO_BIT_RATE);
        fixIntegerKey(mediaFormat, "aac-profile", 2);
        this.logger.d(this.TAG, "fixAudioFormat() called with: format = [" + mediaFormat + "]");
    }

    private void fixIntegerKey(android.media.MediaFormat mediaFormat, java.lang.String str, int i17) {
        if (!mediaFormat.containsKey(str) || mediaFormat.getInteger(str) <= 0) {
            this.logger.w(this.TAG, "fixIntegerKey: 缺少关键配置：" + str + ", 使用默认值：" + i17);
            mediaFormat.setInteger(str, i17);
        }
    }

    private void fixStringKey(android.media.MediaFormat mediaFormat, java.lang.String str, java.lang.String str2) {
        if (!mediaFormat.containsKey(str) || android.text.TextUtils.isEmpty(mediaFormat.getString(str))) {
            this.logger.w(this.TAG, "fixStringKey: 缺少关键配置：" + str + ", 使用默认值：" + str2);
            mediaFormat.setString(str, str2);
        }
    }

    private void fixVideoFormat(android.media.MediaFormat mediaFormat) {
        mediaFormat.setInteger("color-format", OUTPUT_VIDEO_COLOR_FORMAT);
        fixStringKey(mediaFormat, "mime", "video/avc");
        fixIntegerKey(mediaFormat, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, 8000000);
        fixIntegerKey(mediaFormat, "frame-rate", 30);
        fixIntegerKey(mediaFormat, "i-frame-interval", 1);
        this.logger.d(this.TAG, "fixVideoFormat() called with: format = [" + mediaFormat + "]");
    }

    private java.nio.ByteBuffer getInputBuffer(com.tencent.tav.codec.MediaCodecAnalyse mediaCodecAnalyse, int i17) {
        try {
            return com.tencent.tav.decoder.DecoderUtils.getInputBuffer(mediaCodecAnalyse, i17);
        } catch (java.lang.Error | java.lang.Exception e17) {
            this.logger.e(this.TAG, "getInputBuffer", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                com.tencent.tav.decoder.logger.WXLogger wXLogger = this.logger;
                java.lang.String str = this.TAG;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CodecException - isTransient = ");
                android.media.MediaCodec.CodecException codecException = (android.media.MediaCodec.CodecException) e17;
                sb6.append(codecException.isTransient());
                sb6.append(" , isRecoverable = ");
                sb6.append(codecException.isRecoverable());
                sb6.append(" , errorCode = ");
                sb6.append(codecException.getErrorCode());
                wXLogger.e(str, sb6.toString());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    waitTime(20L);
                    return getInputBuffer(mediaCodecAnalyse, i17);
                }
            }
            throw e17;
        }
    }

    private java.lang.String getMuxStatusLog() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("muxerStarted:");
        sb6.append(this.muxerStarted);
        sb6.append(", videoEncodeFormat:");
        sb6.append(this.videoEncodeFormat != null);
        sb6.append(", audioEncodeFormat:");
        sb6.append(this.audioEncodeFormat != null);
        sb6.append(", hasVideoTrack:");
        sb6.append(this.hasVideoTrack);
        sb6.append(", hasAudioTrack:");
        sb6.append(this.hasAudioTrack);
        return sb6.toString();
    }

    private java.nio.ByteBuffer getOutputBuffer(com.tencent.tav.codec.MediaCodecAnalyse mediaCodecAnalyse, int i17) {
        try {
            return com.tencent.tav.decoder.DecoderUtils.getOutputBuffer(mediaCodecAnalyse, i17);
        } catch (java.lang.Error | java.lang.Exception e17) {
            this.logger.e(this.TAG, "getOutputBuffer", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                com.tencent.tav.decoder.logger.WXLogger wXLogger = this.logger;
                java.lang.String str = this.TAG;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CodecException - isTransient = ");
                android.media.MediaCodec.CodecException codecException = (android.media.MediaCodec.CodecException) e17;
                sb6.append(codecException.isTransient());
                sb6.append(" , isRecoverable = ");
                sb6.append(codecException.isRecoverable());
                sb6.append(" , errorCode = ");
                sb6.append(codecException.getErrorCode());
                wXLogger.e(str, sb6.toString());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    waitTime(20L);
                    return getOutputBuffer(mediaCodecAnalyse, i17);
                }
            }
            throw e17;
        }
    }

    private void prepareAudioEncoder(com.tencent.tav.core.ExportConfig exportConfig) {
        this.logger.d(this.TAG, "AssetWriter prepareAudioEncoder " + this);
        android.media.MediaFormat audioFormat = exportConfig.getAudioFormat();
        fixAudioFormat(audioFormat);
        this.logger.i(this.TAG, "prepareAudioEncoder, input mediaFormat:" + audioFormat + ", isAudioEncodeNeedCodecSpecificData:" + exportConfig.isAudioEncodeNeedCodecSpecificData());
        if (exportConfig.isAudioEncodeNeedCodecSpecificData()) {
            int integer = audioFormat.getInteger("aac-profile");
            int integer2 = audioFormat.getInteger("sample-rate");
            int integer3 = audioFormat.getInteger("channel-count");
            this.logger.i(this.TAG, "try set adts csd-0 data, profile:" + integer + ", sampleRate:" + integer2 + ", " + integer3);
            audioFormat.setByteBuffer(com.tencent.thumbplayer.tmediacodec.util.TUtils.CSD_0, com.tencent.tav.decoder.ADTSUtils.getADTSCodecSpecificData(integer, integer2, integer3));
        }
        this.audioEncoder.prepare(exportConfig, audioFormat);
    }

    private void prepareVideoEncoder(com.tencent.tav.core.ExportConfig exportConfig) {
        android.media.MediaFormat videoFormat = exportConfig.getVideoFormat();
        fixVideoFormat(videoFormat);
        this.videoEncoder.prepare(exportConfig, videoFormat);
    }

    private void queueInputBuffer(com.tencent.tav.codec.MediaCodecAnalyse mediaCodecAnalyse, int i17, int i18, int i19, long j17, int i27) {
        try {
            mediaCodecAnalyse.queueInputBuffer(i17, i18, i19, j17, i27);
        } catch (java.lang.Error | java.lang.Exception e17) {
            this.logger.e(this.TAG, "queueInputBuffer", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                com.tencent.tav.decoder.logger.WXLogger wXLogger = this.logger;
                java.lang.String str = this.TAG;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CodecException - isTransient = ");
                android.media.MediaCodec.CodecException codecException = (android.media.MediaCodec.CodecException) e17;
                sb6.append(codecException.isTransient());
                sb6.append(" , isRecoverable = ");
                sb6.append(codecException.isRecoverable());
                sb6.append(" , errorCode = ");
                sb6.append(codecException.getErrorCode());
                wXLogger.e(str, sb6.toString());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    waitTime(20L);
                    queueInputBuffer(mediaCodecAnalyse, i17, i18, i19, j17, i27);
                }
            }
            throw e17;
        }
    }

    private boolean release() {
        this.released = true;
        this.logger.i(this.TAG, "AssetWriter release: " + this);
        try {
            this.videoEncoderLock.lock();
            this.audioEncoderLock.lock();
            this.logger.d(this.TAG, "AssetWriter release " + this);
            com.tencent.tav.decoder.AssetWriterVideoEncoder assetWriterVideoEncoder = this.videoEncoder;
            if (assetWriterVideoEncoder != null) {
                try {
                    assetWriterVideoEncoder.stop();
                } catch (java.lang.Exception e17) {
                    this.logger.e(this.TAG, "release: videoEncoder.stop()", e17);
                }
                try {
                    this.videoEncoder.release();
                } catch (java.lang.Exception e18) {
                    this.logger.e(this.TAG, "release: videoEncoder.release()", e18);
                }
                this.videoEncoder = null;
            }
            com.tencent.tav.decoder.AssetWriterAudioEncoder assetWriterAudioEncoder = this.audioEncoder;
            if (assetWriterAudioEncoder != null) {
                try {
                    assetWriterAudioEncoder.stop();
                } catch (java.lang.Exception e19) {
                    this.logger.e(this.TAG, "release: audioEncoder.stop()", e19);
                }
                try {
                    this.audioEncoder.release();
                } catch (java.lang.Exception e27) {
                    this.logger.e(this.TAG, "release: audioEncoder.release()", e27);
                }
                this.audioEncoder = null;
            }
            boolean z17 = false;
            if (this.muxer != null) {
                if (this.muxerStarted) {
                    this.muxerStarted = false;
                    try {
                        z17 = this.muxer.stop(this.isCancel);
                    } catch (java.lang.Exception e28) {
                        this.logger.e(this.TAG, "release: muxer.stop()", e28);
                    }
                }
                try {
                    this.muxer.release();
                } catch (java.lang.Exception e29) {
                    this.logger.e(this.TAG, "release: muxer.release()", e29);
                }
            }
            this.videoEncodeFormat = null;
            this.audioEncodeFormat = null;
            this.videoEncoderLock.unlock();
            this.audioEncoderLock.unlock();
            this.logger.i(this.TAG, "encode performance: " + this.encodeReporter);
            return z17;
        } catch (java.lang.Throwable th6) {
            this.videoEncoderLock.unlock();
            this.audioEncoderLock.unlock();
            throw th6;
        }
    }

    private void releaseOutputBuffer(com.tencent.tav.codec.MediaCodecAnalyse mediaCodecAnalyse, int i17, boolean z17) {
        try {
            mediaCodecAnalyse.releaseOutputBuffer(i17, z17);
        } catch (java.lang.Error | java.lang.Exception e17) {
            this.logger.e(this.TAG, "releaseOutputBuffer", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                com.tencent.tav.decoder.logger.WXLogger wXLogger = this.logger;
                java.lang.String str = this.TAG;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CodecException - isTransient = ");
                android.media.MediaCodec.CodecException codecException = (android.media.MediaCodec.CodecException) e17;
                sb6.append(codecException.isTransient());
                sb6.append(" , isRecoverable = ");
                sb6.append(codecException.isRecoverable());
                sb6.append(" , errorCode = ");
                sb6.append(codecException.getErrorCode());
                wXLogger.e(str, sb6.toString());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    waitTime(20L);
                    releaseOutputBuffer(mediaCodecAnalyse, i17, z17);
                }
            }
            throw e17;
        }
    }

    private void signalEndOfAudioStream() {
        try {
            if (this.enOfAudioInputStream) {
                return;
            }
            this.logger.d(this.TAG, "signalEndOfAudioStream: ");
            this.enOfAudioInputStream = this.audioEncoder.endWriteAudioSample();
        } catch (java.lang.Throwable th6) {
            this.logger.e(this.TAG, "signalEndOfAudioStream failed", th6);
        }
    }

    private void signalEndOfVideoStream() {
        this.logger.d(this.TAG, "signalEndOfVideoStream: ");
        if (this._inputSurface == null || this.enOfVideoInputStream) {
            return;
        }
        try {
            this.videoEncoder.signalEndOfInputStream();
            this.enOfVideoInputStream = true;
        } catch (java.lang.Throwable th6) {
            this.logger.e(this.TAG, "signalEndOfVideoStream failed", th6);
        }
    }

    private boolean unStarted() {
        if (this.muxerStarted) {
            return false;
        }
        if (this.hasVideoTrack && this.videoEncodeFormat == null) {
            return false;
        }
        return (this.hasAudioTrack && this.audioEncodeFormat == null) ? false : true;
    }

    private boolean validAndCorrectBufferInfo(android.media.MediaCodec.BufferInfo bufferInfo) {
        return bufferInfo.size > 0 && (bufferInfo.flags & 4) == 0;
    }

    private void waitTime(long j17) {
        try {
            wait(j17);
        } catch (java.lang.InterruptedException unused) {
        }
    }

    private boolean writeAudioFrame(boolean z17) {
        java.lang.System.currentTimeMillis();
        try {
            this.audioEncoderLock.lock();
            boolean writeAudioFrame = this.audioEncoder.writeAudioFrame(z17);
            android.media.MediaFormat encodeFormat = this.audioEncoder.getEncodeFormat();
            if (this.audioEncodeFormat == null && encodeFormat != null) {
                this.logger.e(this.TAG, "writeAudioFrame set audioEncodeFormat = " + encodeFormat);
            }
            this.audioEncodeFormat = encodeFormat;
            if (this.audioEncoder.isEncodeToEndOfStream()) {
                this.hasAudioTrack = false;
            }
            return writeAudioFrame;
        } finally {
            this.audioEncoderLock.unlock();
        }
    }

    private boolean writeVideoFrame(com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer, boolean z17) {
        try {
            this.videoEncoderLock.lock();
            boolean writeVideoSample = this.videoEncoder.writeVideoSample(cMSampleBuffer, z17);
            android.media.MediaFormat encodeFormat = this.videoEncoder.getEncodeFormat();
            if (this.videoEncodeFormat == null && encodeFormat != null) {
                this.logger.e(this.TAG, "writeVideoFrame set videoEncodeFormat = " + encodeFormat);
            }
            this.videoEncodeFormat = encodeFormat;
            if (this.videoEncoder.isEncodeToEndOfStream()) {
                this.hasVideoTrack = false;
            }
            return writeVideoSample;
        } finally {
        }
    }

    public boolean audioTrackWritable() {
        boolean z17 = true;
        if (this.hasAudioTrack && (this.muxerStarted || this.audioEncodeFormat == null)) {
            return true;
        }
        synchronized (this) {
            if (!this.hasAudioTrack || (!this.muxerStarted && this.audioEncodeFormat != null)) {
                z17 = false;
            }
        }
        return z17;
    }

    public synchronized android.view.Surface createInputSurface() {
        if (this._inputSurface == null && this.hasVideoTrack) {
            this._inputSurface = this.videoEncoder.createInputSurface();
        }
        this.logger.i(this.TAG, "createInputSurface _inputSurface = " + this._inputSurface + " hasVideoTrack = " + this.hasVideoTrack);
        return this._inputSurface;
    }

    public void endWriteAudioSample() {
        this.logger.d(this.TAG, "endWriteAudioSample:" + this);
        try {
            this.audioEncoderLock.lock();
            if (!this.released && !this.enOfAudioInputStream) {
                this.logger.d(this.TAG, "endWriteAudioSample: ");
                this.enOfAudioInputStream = this.audioEncoder.endWriteAudioSample();
                drainAudioEncoder(false, null);
            }
        } finally {
            this.audioEncoderLock.unlock();
        }
    }

    public void endWriteVideoSample(com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer) {
        int i17;
        this.logger.i(this.TAG, "endWriteVideoSample: ");
        if (this.released || this._inputSurface == null || this.enOfVideoInputStream) {
            return;
        }
        try {
            this.videoEncoderLock.lock();
            this.videoEncoder.signalEndOfInputStream();
            this.enOfVideoInputStream = true;
        } finally {
            try {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                i17 = 0;
                while (!this.videoEncoder.isEncodeToEndOfStream()) {
                    i17++;
                    drainVideoEncoder(false, cMSampleBuffer);
                }
                this.logger.i(this.TAG, "make sure eos received,loop:%d  cost:%d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            } finally {
            }
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        i17 = 0;
        while (!this.videoEncoder.isEncodeToEndOfStream() && java.lang.System.currentTimeMillis() - currentTimeMillis2 < 3000) {
            i17++;
            drainVideoEncoder(false, cMSampleBuffer);
        }
        this.logger.i(this.TAG, "make sure eos received,loop:%d  cost:%d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis2));
    }

    public long getAudioPresentationTimeUs() {
        return this.audioEncoder.getEncodePresentationTimeUs();
    }

    public com.tencent.tav.decoder.muxer.IMediaMuxer getMuxer() {
        return this.muxer;
    }

    public int getOutHeight() {
        return (int) this.videoEncoder.getEncodeSize().height;
    }

    public int getOutWidth() {
        return (int) this.videoEncoder.getEncodeSize().width;
    }

    public com.tencent.tav.report.AverageTimeReporter getPerformance() {
        return this.encodeReporter;
    }

    public long getVideoPresentationTimeUs() {
        com.tencent.tav.decoder.AssetWriterVideoEncoder assetWriterVideoEncoder = this.videoEncoder;
        if (assetWriterVideoEncoder == null) {
            return -1L;
        }
        return assetWriterVideoEncoder.getEncodePresentationTimeUs();
    }

    public boolean isReleased() {
        return this.released;
    }

    public boolean isVideoEncodeNeedVideoRenderOutputTexture() {
        return this.videoEncoder.isNeedVideoOutputTexture();
    }

    public void prepareParallelSegmentInfo(int i17, com.tencent.tav.coremedia.CMTimeRange cMTimeRange, com.tencent.tav.coremedia.CMTimeRange cMTimeRange2) {
        this.muxer.prepareParallelSegmentInfo(i17, cMTimeRange, cMTimeRange2);
    }

    public void processVideoTexture(com.tencent.tav.coremedia.TextureInfo textureInfo, com.tencent.tav.coremedia.CMTime cMTime) {
        this.videoEncoder.processVideoTexture(textureInfo, cMTime);
    }

    public void reset() {
        this.muxerStarted = false;
        this.hasVideoTrack = true;
        this._inputSurface = null;
        this.enOfVideoInputStream = false;
        com.tencent.tav.decoder.muxer.IMediaMuxer createMediaMuxer = com.tencent.tav.decoder.muxer.MediaMuxerFactory.createMediaMuxer(this.outputPath, 0);
        this.muxer = createMediaMuxer;
        createMediaMuxer.setExportConfig(this.encodeOption);
        this.videoEncoder.reset();
        this.videoEncoder.setMediaMuxer(this.muxer);
        this.logger.i(this.TAG, "resetEncoderWriter");
    }

    public void setEncodeOption(com.tencent.tav.core.ExportConfig exportConfig) {
        if (exportConfig.getOutputWidth() <= 0 || exportConfig.getOutputHeight() <= 0) {
            throw new java.lang.IllegalArgumentException("width and height must > 0");
        }
        this.encodeOption = exportConfig.m409clone();
        this.muxer.setExportConfig(exportConfig);
    }

    public void setLoggerConfig(com.tencent.tav.decoder.logger.WXLoggerConfig wXLoggerConfig) {
        this.logger.setConfig(wXLoggerConfig);
    }

    public void setVideoSampleRenderContext(com.tencent.tav.decoder.RenderContext renderContext) {
        this.videoEncoder.setVideoSampleRenderContext(renderContext);
    }

    public synchronized void startAudioEncoder() {
        try {
            this.audioEncoderLock.lock();
            this.logger.d(this.TAG, "AssetWriter startAudioEncoder " + this);
            prepareAudioEncoder(this.encodeOption);
            this.hasAudioTrack = true;
            this.audioEncoder.start();
            this.audioEncoderStarted = true;
        } finally {
            this.audioEncoderLock.unlock();
        }
    }

    public synchronized void startVideoEncoder() {
        try {
            this.videoEncoderLock.lock();
            this.logger.d(this.TAG, "AssetWriter startVideoEncoder " + this);
            prepareVideoEncoder(this.encodeOption);
            this.hasVideoTrack = true;
            createInputSurface();
            this.videoEncoder.start();
            this.videoEncoderStarted = true;
        } finally {
            this.videoEncoderLock.unlock();
        }
    }

    public boolean stop() {
        this.logger.i(this.TAG, "AssetWriter stop " + this);
        if (this.released) {
            return false;
        }
        if (!this.videoEncoderStarted && !this.audioEncoderStarted) {
            return false;
        }
        this.videoEncoderStarted = false;
        this.audioEncoderStarted = false;
        drainVideoEncoder(true, null);
        drainAudioEncoder(true, null);
        return release();
    }

    public boolean videoTrackWritable() {
        boolean z17 = true;
        if (this.hasVideoTrack && (this.muxerStarted || this.videoEncodeFormat == null)) {
            return true;
        }
        synchronized (this) {
            if (!this.hasVideoTrack || (!this.muxerStarted && this.videoEncodeFormat != null)) {
                z17 = false;
            }
        }
        return z17;
    }

    public void writeAudioSample(long j17, java.nio.ByteBuffer byteBuffer) {
        long j18;
        this.logger.frame(this.TAG, "writeAudioSample: " + j17 + "  " + byteBuffer.limit());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            if (this.released) {
                this.logger.e(this.TAG, "writeAudioSample error, audioWriter released");
                this.logger.frame(this.TAG, "writeAudioSample finish cost " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                return;
            }
            int limit = byteBuffer.limit();
            int position = byteBuffer.position();
            int position2 = byteBuffer.position();
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() + HANDLE_FRAME_OPERATE_TIMEOUT;
            long j19 = 0;
            while (position2 < limit) {
                try {
                    this.audioEncoderLock.lock();
                    j18 = currentTimeMillis;
                    try {
                        j19 += this.audioEncoder.writeAudioSample(j17 + j19, byteBuffer);
                        int position3 = byteBuffer.position();
                        if (position3 == position2) {
                            if (java.lang.System.currentTimeMillis() >= currentTimeMillis2) {
                                this.logger.w(this.TAG, "attach retry limit, break it");
                                throw new com.tencent.tav.core.ExportRuntimeException(-208, "Write audio sample timeout");
                            }
                            this.logger.w(this.TAG, "write audio sample not forward");
                        }
                        byteBuffer.limit(limit);
                        try {
                            this.audioEncoderLock.unlock();
                            drainAudioEncoder(false, null);
                            checkStartMuxer("audio");
                            position2 = position3;
                            currentTimeMillis = j18;
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            try {
                                if (!(th instanceof com.tencent.tav.core.ExportRuntimeException)) {
                                    throw new com.tencent.tav.core.ExportRuntimeException(-122, th);
                                }
                                throw th;
                            } catch (java.lang.Throwable th7) {
                                this.logger.frame(this.TAG, "writeAudioSample finish cost " + (java.lang.System.currentTimeMillis() - j18));
                                throw th7;
                            }
                        }
                    } catch (java.lang.Throwable th8) {
                        th = th8;
                        this.audioEncoderLock.unlock();
                        throw th;
                    }
                } catch (java.lang.Throwable th9) {
                    th = th9;
                }
            }
            long j27 = currentTimeMillis;
            byteBuffer.position(position);
            byteBuffer.limit(limit);
            this.logger.frame(this.TAG, "writeAudioSample finish cost " + (java.lang.System.currentTimeMillis() - j27));
        } catch (java.lang.Throwable th10) {
            th = th10;
            j18 = currentTimeMillis;
        }
    }

    public void writeVideoSample(com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            if (this._inputSurface == null) {
                this.logger.e(this.TAG, "writeVideoSample error, _inputSurface is null");
                return;
            }
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            drainVideoEncoder(false, cMSampleBuffer);
            checkStartMuxer("video");
            this.encodeReporter.add(java.lang.System.currentTimeMillis() - currentTimeMillis2);
            if (cMSampleBuffer.getState().isInvalid()) {
                this.logger.e(this.TAG, "sampleBuffer time isInvalid");
            } else {
                this.muxer.writeSampleDataTime(true, cMSampleBuffer.getTime());
            }
        } finally {
            this.logger.frame(this.TAG, "writeVideoSample finish cost " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public boolean stop(boolean z17) {
        this.isCancel = z17;
        this.logger.i(this.TAG, "AssetWriter stop " + this + " isCancel = " + z17);
        return stop();
    }

    public EncoderWriter(java.lang.String str) {
        this(str, null);
    }
}
