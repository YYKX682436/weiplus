package com.tencent.thumbplayer.tmediacodec;

/* loaded from: classes14.dex */
public final class TMediaCodec implements com.tencent.thumbplayer.tmediacodec.IMediaCodec {
    public static final java.lang.String TAG = "TMediaCodec";
    private com.tencent.thumbplayer.tmediacodec.callback.CodecCallback codecCallback;
    public boolean codecFinalReuseEnable;
    private com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper codecWrapper;
    private com.tencent.thumbplayer.tmediacodec.TMediaCodec.CreateBy createBy;
    public boolean isReUsed;
    private boolean mConfigureCalled;
    private final java.lang.String nameOrType;
    private boolean reUseEnable = true;
    private final com.tencent.thumbplayer.tmediacodec.statistics.MediaCodecStatistics mCodecStatistics = new com.tencent.thumbplayer.tmediacodec.statistics.MediaCodecStatistics(isVideo());

    /* loaded from: classes14.dex */
    public static abstract class Callback {
        public abstract void onError(com.tencent.thumbplayer.tmediacodec.TMediaCodec tMediaCodec, android.media.MediaCodec.CodecException codecException);

        public abstract void onInputBufferAvailable(com.tencent.thumbplayer.tmediacodec.TMediaCodec tMediaCodec, int i17);

        public abstract void onOutputBufferAvailable(com.tencent.thumbplayer.tmediacodec.TMediaCodec tMediaCodec, int i17, android.media.MediaCodec.BufferInfo bufferInfo);

        public abstract void onOutputFormatChanged(com.tencent.thumbplayer.tmediacodec.TMediaCodec tMediaCodec, android.media.MediaFormat mediaFormat);
    }

    /* loaded from: classes6.dex */
    public enum CreateBy {
        CreateByName,
        CreateByType
    }

    /* loaded from: classes14.dex */
    public static final class HookCallback extends android.media.MediaCodec.Callback {
        private final com.tencent.thumbplayer.tmediacodec.TMediaCodec.Callback callback;
        private final com.tencent.thumbplayer.tmediacodec.TMediaCodec tMediaCodec;

        public HookCallback(com.tencent.thumbplayer.tmediacodec.TMediaCodec tMediaCodec, com.tencent.thumbplayer.tmediacodec.TMediaCodec.Callback callback) {
            this.tMediaCodec = tMediaCodec;
            this.callback = callback;
        }

        public final com.tencent.thumbplayer.tmediacodec.TMediaCodec.Callback getCallback() {
            return this.callback;
        }

        public final com.tencent.thumbplayer.tmediacodec.TMediaCodec getTMediaCodec() {
            return this.tMediaCodec;
        }

        @Override // android.media.MediaCodec.Callback
        public void onError(android.media.MediaCodec mediaCodec, android.media.MediaCodec.CodecException codecException) {
            com.tencent.thumbplayer.tmediacodec.TMediaCodec.Callback callback = this.callback;
            if (callback != null) {
                callback.onError(this.tMediaCodec, codecException);
            }
        }

        @Override // android.media.MediaCodec.Callback
        public void onInputBufferAvailable(android.media.MediaCodec mediaCodec, int i17) {
            com.tencent.thumbplayer.tmediacodec.TMediaCodec.Callback callback = this.callback;
            if (callback != null) {
                callback.onInputBufferAvailable(this.tMediaCodec, i17);
            }
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputBufferAvailable(android.media.MediaCodec mediaCodec, int i17, android.media.MediaCodec.BufferInfo bufferInfo) {
            com.tencent.thumbplayer.tmediacodec.TMediaCodec.Callback callback = this.callback;
            if (callback != null) {
                callback.onOutputBufferAvailable(this.tMediaCodec, i17, bufferInfo);
            }
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputFormatChanged(android.media.MediaCodec mediaCodec, android.media.MediaFormat mediaFormat) {
            com.tencent.thumbplayer.tmediacodec.TMediaCodec.Callback callback = this.callback;
            if (callback != null) {
                callback.onOutputFormatChanged(this.tMediaCodec, mediaFormat);
            }
        }
    }

    private TMediaCodec(java.lang.String str, com.tencent.thumbplayer.tmediacodec.TMediaCodec.CreateBy createBy) {
        this.nameOrType = str;
        this.createBy = createBy;
    }

    public static com.tencent.thumbplayer.tmediacodec.TMediaCodec createByCodecName(java.lang.String str) {
        return new com.tencent.thumbplayer.tmediacodec.TMediaCodec(str, com.tencent.thumbplayer.tmediacodec.TMediaCodec.CreateBy.CreateByName);
    }

    public static com.tencent.thumbplayer.tmediacodec.TMediaCodec createDecoderByType(java.lang.String str) {
        return new com.tencent.thumbplayer.tmediacodec.TMediaCodec(str, com.tencent.thumbplayer.tmediacodec.TMediaCodec.CreateBy.CreateByType);
    }

    private void onAfterConfigure() {
        this.mCodecStatistics.configCodecEnd(this.isReUsed);
        com.tencent.thumbplayer.tmediacodec.util.ThreadManager.postOnSubThread(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.tmediacodec.TMediaCodec.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.tencent.thumbplayer.tmediacodec.TMediaCodec.this.codecWrapper != null) {
                    com.tencent.thumbplayer.tmediacodec.TMediaCodec.this.codecWrapper.setCodecCallback(com.tencent.thumbplayer.tmediacodec.TMediaCodec.this.codecCallback);
                }
                if (com.tencent.thumbplayer.tmediacodec.TMediaCodec.this.codecCallback != null) {
                    com.tencent.thumbplayer.tmediacodec.TMediaCodec.this.codecCallback.onCreate(java.lang.Boolean.valueOf(com.tencent.thumbplayer.tmediacodec.TMediaCodec.this.isReUsed));
                }
            }
        });
    }

    private void onAfterStart() {
        this.mCodecStatistics.startCodecEnd();
        com.tencent.thumbplayer.tmediacodec.util.ThreadManager.postOnSubThread(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.tmediacodec.TMediaCodec.2
            @Override // java.lang.Runnable
            public void run() {
                if (com.tencent.thumbplayer.tmediacodec.TMediaCodec.this.codecCallback != null) {
                    com.tencent.thumbplayer.tmediacodec.TMediaCodec.this.codecCallback.onStarted(java.lang.Boolean.valueOf(com.tencent.thumbplayer.tmediacodec.TMediaCodec.this.isReUsed), com.tencent.thumbplayer.tmediacodec.TMediaCodec.this.mCodecStatistics.getData());
                }
            }
        });
    }

    private void onBeforeConfigure(android.view.Surface surface) {
        this.codecFinalReuseEnable = com.tencent.thumbplayer.tmediacodec.TCodecManager.getInstance().reuseEnable(this, surface);
        this.mCodecStatistics.createByCodecStart();
        this.mCodecStatistics.createByCodecEnd();
        this.mCodecStatistics.configCodecStart(this.codecFinalReuseEnable);
    }

    private void onBeforeStart() {
        this.mCodecStatistics.startCodecStart();
    }

    @Override // com.tencent.thumbplayer.tmediacodec.IMediaCodec
    public void configure(android.media.MediaFormat mediaFormat, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, int i17) {
        if (this.mConfigureCalled) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.w(TAG, "configure ignored, mediaFormat:" + mediaFormat + " surface:" + surface + " crypto:" + mediaCrypto + " flags:" + i17 + " stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
            return;
        }
        this.mConfigureCalled = true;
        onBeforeConfigure(surface);
        try {
            this.codecWrapper = com.tencent.thumbplayer.tmediacodec.TCodecManager.getInstance().configure(mediaFormat, surface, mediaCrypto, i17, this);
        } catch (java.io.IOException e17) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.e(TAG, "createCodec mediaFormat:" + mediaFormat, e17);
        }
        onAfterConfigure();
    }

    public final int dequeueInputBuffer(long j17) {
        com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper codecWrapper = this.codecWrapper;
        if (codecWrapper != null) {
            return codecWrapper.dequeueInputBuffer(j17);
        }
        return -1000;
    }

    public final int dequeueOutputBuffer(android.media.MediaCodec.BufferInfo bufferInfo, long j17) {
        com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper codecWrapper = this.codecWrapper;
        if (codecWrapper != null) {
            return codecWrapper.dequeueOutputBuffer(bufferInfo, j17);
        }
        return -1000;
    }

    public final void flush() {
        com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper codecWrapper = this.codecWrapper;
        if (codecWrapper != null) {
            codecWrapper.flush();
        }
    }

    public final com.tencent.thumbplayer.tmediacodec.callback.CodecCallback getCodecCallback() {
        return this.codecCallback;
    }

    public final com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper getCodecWrapper() {
        return this.codecWrapper;
    }

    public com.tencent.thumbplayer.tmediacodec.TMediaCodec.CreateBy getCreateBy() {
        return this.createBy;
    }

    public final java.nio.ByteBuffer getInputBuffer(int i17) {
        com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper codecWrapper = this.codecWrapper;
        if (codecWrapper != null) {
            return codecWrapper.getMediaCodec().getInputBuffer(i17);
        }
        return null;
    }

    public final java.nio.ByteBuffer[] getInputBuffers() {
        android.media.MediaCodec mediaCodec;
        com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper codecWrapper = this.codecWrapper;
        if (codecWrapper == null || (mediaCodec = codecWrapper.getMediaCodec()) == null) {
            return null;
        }
        return mediaCodec.getInputBuffers();
    }

    public final java.lang.String getNameOrType() {
        return this.nameOrType;
    }

    public final java.nio.ByteBuffer getOutputBuffer(int i17) {
        android.media.MediaCodec mediaCodec;
        com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper codecWrapper = this.codecWrapper;
        if (codecWrapper == null || (mediaCodec = codecWrapper.getMediaCodec()) == null) {
            return null;
        }
        return mediaCodec.getOutputBuffer(i17);
    }

    public final java.nio.ByteBuffer[] getOutputBuffers() {
        android.media.MediaCodec mediaCodec;
        com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper codecWrapper = this.codecWrapper;
        if (codecWrapper == null || (mediaCodec = codecWrapper.getMediaCodec()) == null) {
            return null;
        }
        return mediaCodec.getOutputBuffers();
    }

    public final android.media.MediaFormat getOutputFormat() {
        android.media.MediaCodec mediaCodec;
        com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper codecWrapper = this.codecWrapper;
        if (codecWrapper == null || (mediaCodec = codecWrapper.getMediaCodec()) == null) {
            return null;
        }
        return mediaCodec.getOutputFormat();
    }

    public final android.media.Image getOutputImage(int i17) {
        com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper codecWrapper = this.codecWrapper;
        if (codecWrapper != null) {
            return codecWrapper.getMediaCodec().getOutputImage(i17);
        }
        return null;
    }

    public final boolean isReuseEnable() {
        return this.reUseEnable;
    }

    public final boolean isVideo() {
        return com.tencent.thumbplayer.tmediacodec.util.TUtils.isVideo(this.nameOrType);
    }

    public final void queueInputBuffer(int i17, int i18, int i19, long j17, int i27) {
        com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper codecWrapper = this.codecWrapper;
        if (codecWrapper != null) {
            codecWrapper.queueInputBuffer(i17, i18, i19, j17, i27);
        }
    }

    public final void queueSecureInputBuffer(int i17, int i18, android.media.MediaCodec.CryptoInfo cryptoInfo, long j17, int i19) {
        android.media.MediaCodec mediaCodec;
        com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper codecWrapper = this.codecWrapper;
        if (codecWrapper == null || (mediaCodec = codecWrapper.getMediaCodec()) == null) {
            return;
        }
        mediaCodec.queueSecureInputBuffer(i17, i18, cryptoInfo, j17, i19);
    }

    @Override // com.tencent.thumbplayer.tmediacodec.IMediaCodec
    public void release() {
        com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper codecWrapper = this.codecWrapper;
        if (codecWrapper != null) {
            codecWrapper.release();
        }
    }

    @Override // com.tencent.thumbplayer.tmediacodec.IMediaCodec
    public void releaseOutputBuffer(int i17, boolean z17) {
        com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper codecWrapper = this.codecWrapper;
        if (codecWrapper != null) {
            codecWrapper.releaseOutputBuffer(i17, z17);
        }
    }

    @Override // com.tencent.thumbplayer.tmediacodec.IMediaCodec
    public void reset() {
        com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper codecWrapper = this.codecWrapper;
        if (codecWrapper != null) {
            codecWrapper.reset();
        }
    }

    public final void setCallback(com.tencent.thumbplayer.tmediacodec.TMediaCodec.Callback callback) {
        android.media.MediaCodec mediaCodec;
        com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper codecWrapper = this.codecWrapper;
        if (codecWrapper == null || (mediaCodec = codecWrapper.getMediaCodec()) == null) {
            return;
        }
        mediaCodec.setCallback(new com.tencent.thumbplayer.tmediacodec.TMediaCodec.HookCallback(this, callback));
    }

    public final void setCodecCallback(com.tencent.thumbplayer.tmediacodec.callback.CodecCallback codecCallback) {
        this.codecCallback = codecCallback;
    }

    public final void setOutputSurface(android.view.Surface surface) {
        com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper codecWrapper = this.codecWrapper;
        if (codecWrapper != null) {
            codecWrapper.setOutputSurface(surface);
        }
    }

    @Override // com.tencent.thumbplayer.tmediacodec.IMediaCodec
    public void setParameters(android.os.Bundle bundle) {
        android.media.MediaCodec mediaCodec;
        com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper codecWrapper = this.codecWrapper;
        if (codecWrapper == null || (mediaCodec = codecWrapper.getMediaCodec()) == null) {
            return;
        }
        mediaCodec.setParameters(bundle);
    }

    public final void setReuseEnable(boolean z17) {
        this.reUseEnable = z17;
    }

    public final void setVideoScalingMode(int i17) {
        android.media.MediaCodec mediaCodec;
        com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper codecWrapper = this.codecWrapper;
        if (codecWrapper == null || (mediaCodec = codecWrapper.getMediaCodec()) == null) {
            return;
        }
        mediaCodec.setVideoScalingMode(i17);
    }

    @Override // com.tencent.thumbplayer.tmediacodec.IMediaCodec
    public void start() {
        if (com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.d(TAG, "start codecWrapper:" + this.codecWrapper);
        }
        onBeforeStart();
        com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper codecWrapper = this.codecWrapper;
        if (codecWrapper != null) {
            codecWrapper.start();
        }
        onAfterStart();
    }

    @Override // com.tencent.thumbplayer.tmediacodec.IMediaCodec
    public void stop() {
        com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper codecWrapper = this.codecWrapper;
        if (codecWrapper != null) {
            codecWrapper.stop();
        }
    }

    @Override // com.tencent.thumbplayer.tmediacodec.IMediaCodec
    public void releaseOutputBuffer(int i17, long j17) {
        com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper codecWrapper = this.codecWrapper;
        if (codecWrapper != null) {
            codecWrapper.releaseOutputBuffer(i17, j17);
        }
    }

    public final void setCallback(com.tencent.thumbplayer.tmediacodec.TMediaCodec.Callback callback, android.os.Handler handler) {
        android.media.MediaCodec mediaCodec;
        com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper codecWrapper = this.codecWrapper;
        if (codecWrapper == null || (mediaCodec = codecWrapper.getMediaCodec()) == null) {
            return;
        }
        mediaCodec.setCallback(new com.tencent.thumbplayer.tmediacodec.TMediaCodec.HookCallback(this, callback), handler);
    }

    @Override // com.tencent.thumbplayer.tmediacodec.IMediaCodec
    public void configure(android.media.MediaFormat mediaFormat, android.view.Surface surface, int i17, android.media.MediaDescrambler mediaDescrambler) {
        if (this.mConfigureCalled) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.w(TAG, "configure ignored, mediaFormat:" + mediaFormat + " surface:" + surface + " flags:" + i17 + " descrambler:" + mediaDescrambler + " stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
            return;
        }
        this.mConfigureCalled = true;
        onBeforeConfigure(surface);
        try {
            this.codecWrapper = com.tencent.thumbplayer.tmediacodec.TCodecManager.getInstance().configure(mediaFormat, surface, i17, mediaDescrambler, this);
        } catch (java.io.IOException e17) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.e(TAG, "createCodec mediaFormat:" + mediaFormat, e17);
        }
        onAfterConfigure();
    }
}
