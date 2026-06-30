package com.tencent.tav.decoder;

/* loaded from: classes16.dex */
public class MediaCodecAssetWriterVideoEncoder implements com.tencent.tav.decoder.AssetWriterVideoEncoder {
    public static final java.lang.String SCENE = "tav-encoder-assetwriter";
    private static final long WAIT_TRANSIENT_MS = 20;
    private com.tencent.tav.core.ExportConfig encodeOption;
    private com.tencent.tav.coremedia.CGSize encodeSize;
    private android.view.Surface inputSurface;
    private android.media.MediaFormat mediaFormat;
    private com.tencent.tav.decoder.muxer.IMediaMuxer muxer;
    private int outHeight;
    private int outWidth;
    private com.tencent.tav.codec.MediaCodecAnalyse videoEncoder;
    private final java.lang.String TAG = "MediaCodecAssetWriterVideoEncoder@" + hashCode();
    private volatile android.media.MediaCodec.BufferInfo videoBufferInfo = new android.media.MediaCodec.BufferInfo();
    private volatile android.media.MediaFormat videoEncodeFormat = null;
    private long videoPresentationTimeUs = 0;
    private boolean isEncodeToEndOfStream = false;

    private int dequeueOutputBuffer(com.tencent.tav.codec.MediaCodecAnalyse mediaCodecAnalyse, android.media.MediaCodec.BufferInfo bufferInfo) {
        try {
            return mediaCodecAnalyse.dequeueOutputBuffer(bufferInfo, 1000L);
        } catch (java.lang.Exception e17) {
            com.tencent.tav.decoder.logger.Logger.e(this.TAG, "dequeueOutputBuffer e = ", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                java.lang.String str = this.TAG;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CodecException - isTransient = ");
                android.media.MediaCodec.CodecException codecException = (android.media.MediaCodec.CodecException) e17;
                sb6.append(codecException.isTransient());
                sb6.append(" , isRecoverable = ");
                sb6.append(codecException.isRecoverable());
                sb6.append(" , errorCode = ");
                sb6.append(codecException.getErrorCode());
                com.tencent.tav.decoder.logger.Logger.e(str, sb6.toString());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    waitTime(20L);
                    return dequeueOutputBuffer(mediaCodecAnalyse, bufferInfo);
                }
            }
            throw e17;
        }
    }

    private java.nio.ByteBuffer getOutputBuffer(com.tencent.tav.codec.MediaCodecAnalyse mediaCodecAnalyse, int i17) {
        try {
            return com.tencent.tav.decoder.DecoderUtils.getOutputBuffer(mediaCodecAnalyse, i17);
        } catch (java.lang.Error | java.lang.Exception e17) {
            com.tencent.tav.decoder.logger.Logger.e(this.TAG, "getOutputBuffer", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                java.lang.String str = this.TAG;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CodecException - isTransient = ");
                android.media.MediaCodec.CodecException codecException = (android.media.MediaCodec.CodecException) e17;
                sb6.append(codecException.isTransient());
                sb6.append(" , isRecoverable = ");
                sb6.append(codecException.isRecoverable());
                sb6.append(" , errorCode = ");
                sb6.append(codecException.getErrorCode());
                com.tencent.tav.decoder.logger.Logger.e(str, sb6.toString());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    waitTime(20L);
                    return getOutputBuffer(mediaCodecAnalyse, i17);
                }
            }
            throw e17;
        }
    }

    private void releaseOutputBuffer(com.tencent.tav.codec.MediaCodecAnalyse mediaCodecAnalyse, int i17, boolean z17) {
        try {
            mediaCodecAnalyse.releaseOutputBuffer(i17, z17);
        } catch (java.lang.Error | java.lang.Exception e17) {
            com.tencent.tav.decoder.logger.Logger.e(this.TAG, "releaseOutputBuffer", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                java.lang.String str = this.TAG;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CodecException - isTransient = ");
                android.media.MediaCodec.CodecException codecException = (android.media.MediaCodec.CodecException) e17;
                sb6.append(codecException.isTransient());
                sb6.append(" , isRecoverable = ");
                sb6.append(codecException.isRecoverable());
                sb6.append(" , errorCode = ");
                sb6.append(codecException.getErrorCode());
                com.tencent.tav.decoder.logger.Logger.e(str, sb6.toString());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    waitTime(20L);
                    releaseOutputBuffer(mediaCodecAnalyse, i17, z17);
                }
            }
            throw e17;
        }
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

    @Override // com.tencent.tav.decoder.AssetWriterVideoEncoder
    public android.view.Surface createInputSurface() {
        if (this.videoEncoder != null && this.inputSurface == null) {
            com.tencent.tav.decoder.logger.Logger.i(this.TAG, "createInputSurface");
            this.inputSurface = this.videoEncoder.createInputSurface();
        }
        return this.inputSurface;
    }

    @Override // com.tencent.tav.decoder.AssetWriterVideoEncoder
    public void flush() {
        com.tencent.tav.codec.MediaCodecAnalyse mediaCodecAnalyse = this.videoEncoder;
        if (mediaCodecAnalyse != null) {
            this.isEncodeToEndOfStream = false;
            mediaCodecAnalyse.flush();
        }
    }

    @Override // com.tencent.tav.decoder.AssetWriterVideoEncoder
    public android.media.MediaFormat getEncodeFormat() {
        return this.videoEncodeFormat;
    }

    @Override // com.tencent.tav.decoder.AssetWriterVideoEncoder
    public long getEncodePresentationTimeUs() {
        return this.videoPresentationTimeUs;
    }

    @Override // com.tencent.tav.decoder.AssetWriterVideoEncoder
    public com.tencent.tav.coremedia.CGSize getEncodeSize() {
        return this.encodeSize;
    }

    @Override // com.tencent.tav.decoder.AssetWriterVideoEncoder
    public boolean isEncodeToEndOfStream() {
        return this.isEncodeToEndOfStream;
    }

    @Override // com.tencent.tav.decoder.AssetWriterVideoEncoder
    public boolean isNeedVideoOutputTexture() {
        return false;
    }

    @Override // com.tencent.tav.decoder.AssetWriterVideoEncoder
    public boolean prepare(com.tencent.tav.core.ExportConfig exportConfig, android.media.MediaFormat mediaFormat) {
        com.tencent.tav.coremedia.CGSize outputSize = exportConfig.getOutputSize();
        this.outHeight = (int) outputSize.height;
        this.outWidth = (int) outputSize.width;
        this.encodeSize = new com.tencent.tav.coremedia.CGSize(this.outWidth, this.outHeight);
        this.encodeOption = exportConfig;
        this.mediaFormat = mediaFormat;
        try {
            com.tencent.tav.decoder.logger.Logger.i(this.TAG, "prepareVideoEncoder: format = " + mediaFormat);
            com.tencent.tav.codec.MediaCodecAnalyse createEncoderByType = com.tencent.tav.codec.MediaCodecAnalyse.createEncoderByType(mediaFormat.containsKey("mime") ? mediaFormat.getString("mime") : "video/avc", SCENE);
            this.videoEncoder = createEncoderByType;
            createEncoderByType.configure(mediaFormat, null, null, 1);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.tav.decoder.logger.Logger.e(this.TAG, "prepareVideoEncoder: 失败，准备重试。format = " + mediaFormat, e17);
            mediaFormat.setInteger(com.google.android.gms.common.Scopes.PROFILE, 0);
            mediaFormat.setInteger(ya.b.LEVEL, 0);
            try {
                com.tencent.tav.codec.MediaCodecAnalyse createEncoderByType2 = com.tencent.tav.codec.MediaCodecAnalyse.createEncoderByType("video/avc", SCENE);
                this.videoEncoder = createEncoderByType2;
                createEncoderByType2.configure(mediaFormat, null, null, 1);
                return true;
            } catch (java.lang.Exception e18) {
                com.tencent.tav.decoder.logger.Logger.e(this.TAG, "prepareVideoEncoder: retry 失败 format = " + mediaFormat, e18);
                throw new com.tencent.tav.core.ExportRuntimeException(new com.tencent.tav.core.ExportErrorStatus(-103, e18, mediaFormat.toString()));
            }
        }
    }

    @Override // com.tencent.tav.decoder.AssetWriterVideoEncoder
    public void processVideoTexture(com.tencent.tav.coremedia.TextureInfo textureInfo, com.tencent.tav.coremedia.CMTime cMTime) {
    }

    @Override // com.tencent.tav.decoder.AssetWriterVideoEncoder
    public void release() {
        com.tencent.tav.codec.MediaCodecAnalyse mediaCodecAnalyse = this.videoEncoder;
        if (mediaCodecAnalyse != null) {
            mediaCodecAnalyse.release();
        }
    }

    @Override // com.tencent.tav.decoder.AssetWriterVideoEncoder
    public void reset() {
        com.tencent.tav.codec.MediaCodecAnalyse mediaCodecAnalyse = this.videoEncoder;
        if (mediaCodecAnalyse != null) {
            this.isEncodeToEndOfStream = false;
            mediaCodecAnalyse.reset();
            this.videoEncoder.configure(this.mediaFormat, null, null, 1);
            this.inputSurface = null;
            this.videoEncoder.start();
        }
    }

    @Override // com.tencent.tav.decoder.AssetWriterVideoEncoder
    public void setMediaMuxer(com.tencent.tav.decoder.muxer.IMediaMuxer iMediaMuxer) {
        this.muxer = iMediaMuxer;
    }

    @Override // com.tencent.tav.decoder.AssetWriterVideoEncoder
    public void setVideoSampleRenderContext(com.tencent.tav.decoder.RenderContext renderContext) {
    }

    @Override // com.tencent.tav.decoder.AssetWriterVideoEncoder
    public void signalEndOfInputStream() {
        com.tencent.tav.codec.MediaCodecAnalyse mediaCodecAnalyse = this.videoEncoder;
        if (mediaCodecAnalyse != null) {
            mediaCodecAnalyse.signalEndOfInputStream();
        }
    }

    @Override // com.tencent.tav.decoder.AssetWriterVideoEncoder
    public boolean start() {
        com.tencent.tav.codec.MediaCodecAnalyse mediaCodecAnalyse = this.videoEncoder;
        if (mediaCodecAnalyse == null) {
            return false;
        }
        mediaCodecAnalyse.start();
        return true;
    }

    @Override // com.tencent.tav.decoder.AssetWriterVideoEncoder
    public void stop() {
        com.tencent.tav.codec.MediaCodecAnalyse mediaCodecAnalyse = this.videoEncoder;
        if (mediaCodecAnalyse != null) {
            mediaCodecAnalyse.stop();
        }
    }

    @Override // com.tencent.tav.decoder.AssetWriterVideoEncoder
    public boolean writeVideoSample(com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer, boolean z17) {
        com.tencent.tav.decoder.muxer.IMediaMuxer iMediaMuxer = this.muxer;
        boolean isStarted = iMediaMuxer != null ? iMediaMuxer.getIsStarted() : false;
        java.lang.System.currentTimeMillis();
        if (isStarted || this.videoEncodeFormat == null) {
            int dequeueOutputBuffer = dequeueOutputBuffer(this.videoEncoder, this.videoBufferInfo);
            if (dequeueOutputBuffer == -1) {
                if (z17) {
                    return false;
                }
            } else {
                if (dequeueOutputBuffer == -2) {
                    this.videoEncodeFormat = this.videoEncoder.getOutputFormat();
                    com.tencent.tav.decoder.logger.Logger.i(this.TAG, "encoder output format changed:" + this.videoEncodeFormat);
                    return false;
                }
                if (dequeueOutputBuffer < 0) {
                    return false;
                }
                java.nio.ByteBuffer outputBuffer = getOutputBuffer(this.videoEncoder, dequeueOutputBuffer);
                if ((this.videoBufferInfo.flags & 2) != 0 && this.muxer.ignoreHeader()) {
                    this.videoBufferInfo.size = 0;
                }
                if (isStarted && validAndCorrectBufferInfo(this.videoBufferInfo)) {
                    try {
                        android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
                        bufferInfo.set(this.videoBufferInfo.offset, this.videoBufferInfo.size, this.videoBufferInfo.presentationTimeUs, this.videoBufferInfo.flags);
                        com.tencent.tav.decoder.muxer.IMediaMuxer iMediaMuxer2 = this.muxer;
                        iMediaMuxer2.writeSampleData(iMediaMuxer2.getVideoId(), outputBuffer, bufferInfo);
                        this.videoPresentationTimeUs = this.videoBufferInfo.presentationTimeUs;
                    } catch (java.lang.Exception e17) {
                        com.tencent.tav.decoder.logger.Logger.e(this.TAG, "writeVideoFrame: ", e17);
                    }
                }
                releaseOutputBuffer(this.videoEncoder, dequeueOutputBuffer, false);
                if ((this.videoBufferInfo.flags & 4) == 0) {
                    return false;
                }
                com.tencent.tav.decoder.logger.Logger.i(this.TAG, "writeVideoFrame: BUFFER_FLAG_END_OF_STREAM");
                this.videoPresentationTimeUs = -1L;
                this.isEncodeToEndOfStream = true;
            }
        } else if (z17) {
            return false;
        }
        return true;
    }
}
