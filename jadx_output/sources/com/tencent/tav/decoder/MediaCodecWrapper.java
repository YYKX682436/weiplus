package com.tencent.tav.decoder;

/* loaded from: classes16.dex */
class MediaCodecWrapper {
    private static final int MAX_RETRY_COUNT = 10;
    private static final java.lang.String SCENE = "tav-video-decoder";
    private static final long WAIT_TRANSIENT_MS = 20;
    private final java.lang.String TAG = "MediaCodecWrapper@" + java.lang.Integer.toHexString(hashCode());
    private com.tencent.tav.codec.MediaCodecAnalyse mediaCodec;
    private final com.tencent.tav.decoder.VideoDecoder videoDecoder;

    public MediaCodecWrapper(com.tencent.tav.decoder.VideoDecoder videoDecoder) {
        this.videoDecoder = videoDecoder;
    }

    private boolean isLollipop() {
        return true;
    }

    private void resetMediaCodec(android.media.MediaFormat mediaFormat) {
        if (isLollipop()) {
            this.mediaCodec.reset();
            return;
        }
        try {
            this.mediaCodec.stop();
        } catch (java.lang.Exception unused) {
        }
        this.mediaCodec.release();
        this.mediaCodec = com.tencent.tav.codec.MediaCodecAnalyse.createDecoderByType(mediaFormat.getString("mime"), SCENE);
    }

    private void tryLogMediaCodecError(android.media.MediaCodec.CodecException codecException) {
        com.tencent.tav.decoder.logger.Logger.e(this.TAG, "CodecException - isTransient = " + codecException.isTransient() + " , isRecoverable = " + codecException.isRecoverable() + " , errorCode = " + codecException.getErrorCode());
    }

    public synchronized boolean decoderConfigure(android.media.MediaFormat mediaFormat, android.view.Surface surface) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.mediaCodec = com.tencent.tav.codec.MediaCodecAnalyse.createDecoderByType(mediaFormat.getString("mime"), SCENE);
        int i17 = 0;
        while (true) {
            i17++;
            try {
                com.tencent.tav.decoder.logger.Logger.d(this.TAG, "createdDecoder---time---" + i17);
                if (i17 > 10) {
                    return false;
                }
                this.mediaCodec.configure(mediaFormat, surface, null, 0);
                com.tencent.tav.decoder.logger.Logger.d(this.TAG, "decoderConfigure cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                return true;
            } catch (java.lang.Exception e17) {
                com.tencent.tav.decoder.logger.Logger.e(this.TAG, "decoderConfigure", e17);
                if (!(e17 instanceof android.media.MediaCodec.CodecException) || (!((android.media.MediaCodec.CodecException) e17).isTransient() && !((android.media.MediaCodec.CodecException) e17).isRecoverable())) {
                    this.mediaCodec.release();
                    throw e17;
                }
            }
        }
    }

    public synchronized int dequeueInputBuffer() {
        try {
            return this.mediaCodec.dequeueInputBuffer(1000L);
        } catch (java.lang.Error | java.lang.Exception e17) {
            com.tencent.tav.decoder.logger.Logger.e(this.TAG, "dequeueInputBuffer", e17);
            if (isLollipop() && (e17 instanceof android.media.MediaCodec.CodecException)) {
                tryLogMediaCodecError((android.media.MediaCodec.CodecException) e17);
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    waitTime(20L);
                    return dequeueInputBuffer();
                }
            }
            throw e17;
        }
    }

    public synchronized int dequeueOutputBuffer(android.media.MediaCodec.BufferInfo bufferInfo) {
        try {
        } catch (java.lang.Exception e17) {
            com.tencent.tav.decoder.logger.Logger.e(this.TAG, "dequeueOutputBuffer", e17);
            if (isLollipop() && (e17 instanceof android.media.MediaCodec.CodecException)) {
                tryLogMediaCodecError((android.media.MediaCodec.CodecException) e17);
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    waitTime(20L);
                    return dequeueOutputBuffer(bufferInfo);
                }
            }
            throw e17;
        }
        return this.mediaCodec.dequeueOutputBuffer(bufferInfo, 1000L);
    }

    public void flushDecoder() {
        this.mediaCodec.flush();
    }

    public synchronized java.nio.ByteBuffer getInputBuffer(int i17) {
        try {
            return com.tencent.tav.decoder.DecoderUtils.getInputBuffer(this.mediaCodec, i17);
        } catch (java.lang.Error | java.lang.Exception e17) {
            com.tencent.tav.decoder.logger.Logger.e(this.TAG, "getInputBuffer", e17);
            if (isLollipop() && (e17 instanceof android.media.MediaCodec.CodecException)) {
                tryLogMediaCodecError((android.media.MediaCodec.CodecException) e17);
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    waitTime(20L);
                    return getInputBuffer(i17);
                }
            }
            throw e17;
        }
    }

    public synchronized java.nio.ByteBuffer getOnputBuffer(int i17) {
        try {
            return com.tencent.tav.decoder.DecoderUtils.getOutputBuffer(this.mediaCodec, i17);
        } catch (java.lang.Error | java.lang.Exception e17) {
            com.tencent.tav.decoder.logger.Logger.e(this.TAG, "getOutputBuffer", e17);
            if (isLollipop() && (e17 instanceof android.media.MediaCodec.CodecException)) {
                tryLogMediaCodecError((android.media.MediaCodec.CodecException) e17);
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    waitTime(20L);
                    return getOnputBuffer(i17);
                }
            }
            throw e17;
        }
    }

    public synchronized android.media.MediaFormat getOutputFormat() {
        try {
        } catch (java.lang.Exception e17) {
            e17.toString();
            return null;
        }
        return this.mediaCodec.getOutputFormat();
    }

    public synchronized void queueInputBuffer(int i17, int i18, int i19, long j17, int i27) {
        try {
            this.mediaCodec.queueInputBuffer(i17, i18, i19, j17, i27);
        } catch (java.lang.Error | java.lang.Exception e17) {
            com.tencent.tav.decoder.logger.Logger.e(this.TAG, "queueInputBuffer", e17);
            if (isLollipop() && (e17 instanceof android.media.MediaCodec.CodecException)) {
                tryLogMediaCodecError((android.media.MediaCodec.CodecException) e17);
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    waitTime(20L);
                    queueInputBuffer(i17, i18, i19, j17, i27);
                }
            }
            throw e17;
        }
    }

    public void release() {
        if (this.mediaCodec != null) {
            new java.lang.Thread() { // from class: com.tencent.tav.decoder.MediaCodecWrapper.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    try {
                        com.tencent.tav.decoder.MediaCodecWrapper.this.videoDecoder.releaseOutputBuffer();
                        com.tencent.tav.decoder.MediaCodecWrapper.this.mediaCodec.stop();
                    } catch (java.lang.Exception e17) {
                        com.tencent.tav.decoder.logger.Logger.e(com.tencent.tav.decoder.MediaCodecWrapper.this.TAG, "mediaCodec.stop", e17);
                    }
                    try {
                        try {
                            com.tencent.tav.decoder.MediaCodecWrapper.this.mediaCodec.release();
                        } catch (java.lang.Exception e18) {
                            com.tencent.tav.decoder.logger.Logger.e(com.tencent.tav.decoder.MediaCodecWrapper.this.TAG, "mediaCodec.release", e18);
                        }
                        com.tencent.tav.decoder.MediaCodecWrapper.this.mediaCodec = null;
                    } finally {
                        com.tencent.tav.decoder.MediaCodecWrapper.this.mediaCodec = null;
                    }
                }
            }.start();
        }
    }

    public synchronized void releaseOutputBuffer(int i17, boolean z17) {
        try {
            this.mediaCodec.releaseOutputBuffer(i17, z17);
            if (z17) {
                this.videoDecoder.lastFrameValid = true;
            }
        } catch (java.lang.Error | java.lang.Exception e17) {
            com.tencent.tav.decoder.logger.Logger.e(this.TAG, "releaseOutputBuffer", e17);
            if (isLollipop() && (e17 instanceof android.media.MediaCodec.CodecException)) {
                tryLogMediaCodecError((android.media.MediaCodec.CodecException) e17);
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    waitTime(20L);
                    releaseOutputBuffer(i17, z17);
                }
            }
            throw e17;
        }
    }

    public synchronized void reset(android.view.Surface surface, android.media.MediaFormat mediaFormat) {
        if (this.videoDecoder.isReleased) {
            return;
        }
        com.tencent.tav.decoder.logger.Logger.d(this.TAG, "reset");
        try {
            resetMediaCodec(mediaFormat);
            decoderConfigure(mediaFormat, surface);
            startDecoder(surface, mediaFormat);
        } catch (java.lang.Exception e17) {
            com.tencent.tav.decoder.logger.Logger.e(this.TAG, "reset", e17);
        }
    }

    public synchronized void startDecoder(android.view.Surface surface, android.media.MediaFormat mediaFormat) {
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            this.mediaCodec.start();
            com.tencent.tav.decoder.logger.Logger.i(this.TAG, "startDecoder cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (java.lang.Exception e17) {
            com.tencent.tav.decoder.logger.Logger.e(this.TAG, "startDecoder: start", e17);
            if (isLollipop() && (e17 instanceof android.media.MediaCodec.CodecException)) {
                tryLogMediaCodecError((android.media.MediaCodec.CodecException) e17);
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    waitTime(20L);
                    startDecoder(surface, mediaFormat);
                    return;
                } else if (((android.media.MediaCodec.CodecException) e17).isRecoverable()) {
                    reset(surface, mediaFormat);
                    return;
                }
            }
            this.videoDecoder.release(false);
            throw e17;
        }
    }

    public synchronized void waitTime(long j17) {
        try {
            this.videoDecoder.wait(j17);
        } catch (java.lang.InterruptedException unused) {
        }
    }
}
