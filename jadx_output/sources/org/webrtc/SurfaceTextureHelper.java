package org.webrtc;

/* loaded from: classes16.dex */
public class SurfaceTextureHelper {
    private static final java.lang.String TAG = "SurfaceTextureHelper";
    private final org.webrtc.EglBase eglBase;
    private final org.webrtc.SurfaceTextureHelper.FrameRefMonitor frameRefMonitor;
    private int frameRotation;
    private final android.os.Handler handler;
    private boolean hasPendingTexture;
    private boolean isQuitting;
    private volatile boolean isTextureInUse;
    private org.webrtc.VideoSink listener;
    private final int oesTextureId;
    private org.webrtc.VideoSink pendingListener;
    final java.lang.Runnable setListenerRunnable;
    private final android.graphics.SurfaceTexture surfaceTexture;
    private int textureHeight;
    private final org.webrtc.TextureBufferImpl.RefCountMonitor textureRefCountMonitor;
    private int textureWidth;
    private final org.webrtc.TimestampAligner timestampAligner;
    private final org.webrtc.YuvConverter yuvConverter;

    /* loaded from: classes16.dex */
    public interface FrameRefMonitor {
        void onDestroyBuffer(org.webrtc.VideoFrame.TextureBuffer textureBuffer);

        void onNewBuffer(org.webrtc.VideoFrame.TextureBuffer textureBuffer);

        void onReleaseBuffer(org.webrtc.VideoFrame.TextureBuffer textureBuffer);

        void onRetainBuffer(org.webrtc.VideoFrame.TextureBuffer textureBuffer);
    }

    public static org.webrtc.SurfaceTextureHelper create(final java.lang.String str, final org.webrtc.EglBase.Context context, final boolean z17, final org.webrtc.YuvConverter yuvConverter, final org.webrtc.SurfaceTextureHelper.FrameRefMonitor frameRefMonitor) {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread(str);
        handlerThread.start();
        final android.os.Handler handler = new android.os.Handler(handlerThread.getLooper());
        return (org.webrtc.SurfaceTextureHelper) org.webrtc.ThreadUtils.invokeAtFrontUninterruptibly(handler, new java.util.concurrent.Callable<org.webrtc.SurfaceTextureHelper>() { // from class: org.webrtc.SurfaceTextureHelper.1
            @Override // java.util.concurrent.Callable
            public org.webrtc.SurfaceTextureHelper call() {
                try {
                    return new org.webrtc.SurfaceTextureHelper(org.webrtc.EglBase.Context.this, handler, z17, yuvConverter, frameRefMonitor);
                } catch (java.lang.RuntimeException e17) {
                    org.webrtc.Logging.e(org.webrtc.SurfaceTextureHelper.TAG, str + " create failure", e17);
                    return null;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dispose$6() {
        this.isQuitting = true;
        if (this.isTextureInUse) {
            return;
        }
        release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$forceFrame$3() {
        this.hasPendingTexture = true;
        tryDeliverTextureFrame();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(android.graphics.SurfaceTexture surfaceTexture) {
        if (this.hasPendingTexture) {
            org.webrtc.Logging.d(TAG, "A frame is already pending, dropping frame.");
        }
        this.hasPendingTexture = true;
        tryDeliverTextureFrame();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$returnTextureFrame$5() {
        this.isTextureInUse = false;
        if (this.isQuitting) {
            release();
        } else {
            tryDeliverTextureFrame();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setFrameRotation$4(int i17) {
        this.frameRotation = i17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTextureSize$2(int i17, int i18) {
        this.textureWidth = i17;
        this.textureHeight = i18;
        tryDeliverTextureFrame();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopListening$1() {
        this.listener = null;
        this.pendingListener = null;
    }

    private void release() {
        if (this.handler.getLooper().getThread() != java.lang.Thread.currentThread()) {
            throw new java.lang.IllegalStateException("Wrong thread.");
        }
        if (this.isTextureInUse || !this.isQuitting) {
            throw new java.lang.IllegalStateException("Unexpected release.");
        }
        this.yuvConverter.release();
        android.opengl.GLES20.glDeleteTextures(1, new int[]{this.oesTextureId}, 0);
        this.surfaceTexture.release();
        this.eglBase.release();
        this.handler.getLooper().quit();
        org.webrtc.TimestampAligner timestampAligner = this.timestampAligner;
        if (timestampAligner != null) {
            timestampAligner.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void returnTextureFrame() {
        this.handler.post(new java.lang.Runnable() { // from class: org.webrtc.SurfaceTextureHelper$$g
            @Override // java.lang.Runnable
            public final void run() {
                org.webrtc.SurfaceTextureHelper.this.lambda$returnTextureFrame$5();
            }
        });
    }

    private static void setOnFrameAvailableListener(android.graphics.SurfaceTexture surfaceTexture, android.graphics.SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener, android.os.Handler handler) {
        surfaceTexture.setOnFrameAvailableListener(onFrameAvailableListener, handler);
    }

    private void tryDeliverTextureFrame() {
        if (this.handler.getLooper().getThread() != java.lang.Thread.currentThread()) {
            throw new java.lang.IllegalStateException("Wrong thread.");
        }
        if (this.isQuitting || !this.hasPendingTexture || this.isTextureInUse || this.listener == null) {
            return;
        }
        if (this.textureWidth == 0 || this.textureHeight == 0) {
            org.webrtc.Logging.w(TAG, "Texture size has not been set.");
            return;
        }
        this.isTextureInUse = true;
        this.hasPendingTexture = false;
        updateTexImage();
        float[] fArr = new float[16];
        this.surfaceTexture.getTransformMatrix(fArr);
        long timestamp = this.surfaceTexture.getTimestamp();
        org.webrtc.TimestampAligner timestampAligner = this.timestampAligner;
        if (timestampAligner != null) {
            timestamp = timestampAligner.translateTimestamp(timestamp);
        }
        org.webrtc.TextureBufferImpl textureBufferImpl = new org.webrtc.TextureBufferImpl(this.textureWidth, this.textureHeight, org.webrtc.VideoFrame.TextureBuffer.Type.OES, this.oesTextureId, org.webrtc.RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr), this.handler, this.yuvConverter, this.textureRefCountMonitor);
        org.webrtc.SurfaceTextureHelper.FrameRefMonitor frameRefMonitor = this.frameRefMonitor;
        if (frameRefMonitor != null) {
            frameRefMonitor.onNewBuffer(textureBufferImpl);
        }
        org.webrtc.VideoFrame videoFrame = new org.webrtc.VideoFrame(textureBufferImpl, this.frameRotation, timestamp);
        this.listener.onFrame(videoFrame);
        videoFrame.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTexImage() {
        synchronized (org.webrtc.EglBase.lock) {
            this.surfaceTexture.updateTexImage();
        }
    }

    public void dispose() {
        org.webrtc.Logging.d(TAG, "dispose()");
        org.webrtc.ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new java.lang.Runnable() { // from class: org.webrtc.SurfaceTextureHelper$$b
            @Override // java.lang.Runnable
            public final void run() {
                org.webrtc.SurfaceTextureHelper.this.lambda$dispose$6();
            }
        });
    }

    public void forceFrame() {
        this.handler.post(new java.lang.Runnable() { // from class: org.webrtc.SurfaceTextureHelper$$a
            @Override // java.lang.Runnable
            public final void run() {
                org.webrtc.SurfaceTextureHelper.this.lambda$forceFrame$3();
            }
        });
    }

    public android.os.Handler getHandler() {
        return this.handler;
    }

    public android.graphics.SurfaceTexture getSurfaceTexture() {
        return this.surfaceTexture;
    }

    public boolean isTextureInUse() {
        return this.isTextureInUse;
    }

    public void setFrameRotation(final int i17) {
        this.handler.post(new java.lang.Runnable() { // from class: org.webrtc.SurfaceTextureHelper$$e
            @Override // java.lang.Runnable
            public final void run() {
                org.webrtc.SurfaceTextureHelper.this.lambda$setFrameRotation$4(i17);
            }
        });
    }

    public void setTextureSize(final int i17, final int i18) {
        if (i17 <= 0) {
            throw new java.lang.IllegalArgumentException("Texture width must be positive, but was " + i17);
        }
        if (i18 > 0) {
            this.surfaceTexture.setDefaultBufferSize(i17, i18);
            this.handler.post(new java.lang.Runnable() { // from class: org.webrtc.SurfaceTextureHelper$$c
                @Override // java.lang.Runnable
                public final void run() {
                    org.webrtc.SurfaceTextureHelper.this.lambda$setTextureSize$2(i17, i18);
                }
            });
        } else {
            throw new java.lang.IllegalArgumentException("Texture height must be positive, but was " + i18);
        }
    }

    public void startListening(org.webrtc.VideoSink videoSink) {
        if (this.listener != null || this.pendingListener != null) {
            throw new java.lang.IllegalStateException("SurfaceTextureHelper listener has already been set.");
        }
        this.pendingListener = videoSink;
        this.handler.post(this.setListenerRunnable);
    }

    public void stopListening() {
        org.webrtc.Logging.d(TAG, "stopListening()");
        this.handler.removeCallbacks(this.setListenerRunnable);
        org.webrtc.ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new java.lang.Runnable() { // from class: org.webrtc.SurfaceTextureHelper$$d
            @Override // java.lang.Runnable
            public final void run() {
                org.webrtc.SurfaceTextureHelper.this.lambda$stopListening$1();
            }
        });
    }

    @java.lang.Deprecated
    public org.webrtc.VideoFrame.I420Buffer textureToYuv(org.webrtc.VideoFrame.TextureBuffer textureBuffer) {
        return textureBuffer.toI420();
    }

    private SurfaceTextureHelper(org.webrtc.EglBase.Context context, android.os.Handler handler, boolean z17, org.webrtc.YuvConverter yuvConverter, org.webrtc.SurfaceTextureHelper.FrameRefMonitor frameRefMonitor) {
        this.textureRefCountMonitor = new org.webrtc.TextureBufferImpl.RefCountMonitor() { // from class: org.webrtc.SurfaceTextureHelper.2
            @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onDestroy(org.webrtc.TextureBufferImpl textureBufferImpl) {
                org.webrtc.SurfaceTextureHelper.this.returnTextureFrame();
                if (org.webrtc.SurfaceTextureHelper.this.frameRefMonitor != null) {
                    org.webrtc.SurfaceTextureHelper.this.frameRefMonitor.onDestroyBuffer(textureBufferImpl);
                }
            }

            @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onRelease(org.webrtc.TextureBufferImpl textureBufferImpl) {
                if (org.webrtc.SurfaceTextureHelper.this.frameRefMonitor != null) {
                    org.webrtc.SurfaceTextureHelper.this.frameRefMonitor.onReleaseBuffer(textureBufferImpl);
                }
            }

            @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onRetain(org.webrtc.TextureBufferImpl textureBufferImpl) {
                if (org.webrtc.SurfaceTextureHelper.this.frameRefMonitor != null) {
                    org.webrtc.SurfaceTextureHelper.this.frameRefMonitor.onRetainBuffer(textureBufferImpl);
                }
            }
        };
        this.setListenerRunnable = new java.lang.Runnable() { // from class: org.webrtc.SurfaceTextureHelper.3
            @Override // java.lang.Runnable
            public void run() {
                org.webrtc.Logging.d(org.webrtc.SurfaceTextureHelper.TAG, "Setting listener to " + org.webrtc.SurfaceTextureHelper.this.pendingListener);
                org.webrtc.SurfaceTextureHelper surfaceTextureHelper = org.webrtc.SurfaceTextureHelper.this;
                surfaceTextureHelper.listener = surfaceTextureHelper.pendingListener;
                org.webrtc.SurfaceTextureHelper.this.pendingListener = null;
                if (org.webrtc.SurfaceTextureHelper.this.hasPendingTexture) {
                    org.webrtc.SurfaceTextureHelper.this.updateTexImage();
                    org.webrtc.SurfaceTextureHelper.this.hasPendingTexture = false;
                }
            }
        };
        if (handler.getLooper().getThread() == java.lang.Thread.currentThread()) {
            this.handler = handler;
            this.timestampAligner = z17 ? new org.webrtc.TimestampAligner() : null;
            this.yuvConverter = yuvConverter;
            this.frameRefMonitor = frameRefMonitor;
            org.webrtc.EglBase create = org.webrtc.EglBase.EglBaseStatic.create(context, org.webrtc.EglBase.CONFIG_PIXEL_BUFFER);
            this.eglBase = create;
            try {
                create.createDummyPbufferSurface();
                create.makeCurrent();
                int generateTexture = org.webrtc.GlUtil.generateTexture(36197);
                this.oesTextureId = generateTexture;
                android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(generateTexture);
                this.surfaceTexture = surfaceTexture;
                setOnFrameAvailableListener(surfaceTexture, new android.graphics.SurfaceTexture.OnFrameAvailableListener() { // from class: org.webrtc.SurfaceTextureHelper$$f
                    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture2) {
                        org.webrtc.SurfaceTextureHelper.this.lambda$new$0(surfaceTexture2);
                    }
                }, handler);
                return;
            } catch (java.lang.RuntimeException e17) {
                this.eglBase.release();
                handler.getLooper().quit();
                throw e17;
            }
        }
        throw new java.lang.IllegalStateException("SurfaceTextureHelper must be created on the handler thread");
    }

    public static org.webrtc.SurfaceTextureHelper create(java.lang.String str, org.webrtc.EglBase.Context context) {
        return create(str, context, false, new org.webrtc.YuvConverter(), null);
    }

    public static org.webrtc.SurfaceTextureHelper create(java.lang.String str, org.webrtc.EglBase.Context context, boolean z17) {
        return create(str, context, z17, new org.webrtc.YuvConverter(), null);
    }

    public static org.webrtc.SurfaceTextureHelper create(java.lang.String str, org.webrtc.EglBase.Context context, boolean z17, org.webrtc.YuvConverter yuvConverter) {
        return create(str, context, z17, yuvConverter, null);
    }
}
