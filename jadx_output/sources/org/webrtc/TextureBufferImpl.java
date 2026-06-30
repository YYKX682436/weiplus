package org.webrtc;

/* loaded from: classes16.dex */
public class TextureBufferImpl implements org.webrtc.VideoFrame.TextureBuffer {
    private final int height;

    /* renamed from: id, reason: collision with root package name */
    private final int f347939id;
    private final org.webrtc.RefCountDelegate refCountDelegate;
    private final org.webrtc.TextureBufferImpl.RefCountMonitor refCountMonitor;
    private final android.os.Handler toI420Handler;
    private final android.graphics.Matrix transformMatrix;
    private final org.webrtc.VideoFrame.TextureBuffer.Type type;
    private final int unscaledHeight;
    private final int unscaledWidth;
    private final int width;
    private final org.webrtc.YuvConverter yuvConverter;

    /* loaded from: classes16.dex */
    public interface RefCountMonitor {
        void onDestroy(org.webrtc.TextureBufferImpl textureBufferImpl);

        void onRelease(org.webrtc.TextureBufferImpl textureBufferImpl);

        void onRetain(org.webrtc.TextureBufferImpl textureBufferImpl);
    }

    public TextureBufferImpl(int i17, int i18, org.webrtc.VideoFrame.TextureBuffer.Type type, int i19, android.graphics.Matrix matrix, android.os.Handler handler, org.webrtc.YuvConverter yuvConverter, final java.lang.Runnable runnable) {
        this(i17, i18, i17, i18, type, i19, matrix, handler, yuvConverter, new org.webrtc.TextureBufferImpl.RefCountMonitor() { // from class: org.webrtc.TextureBufferImpl.1
            @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onDestroy(org.webrtc.TextureBufferImpl textureBufferImpl) {
                java.lang.Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }

            @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onRelease(org.webrtc.TextureBufferImpl textureBufferImpl) {
            }

            @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onRetain(org.webrtc.TextureBufferImpl textureBufferImpl) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(org.webrtc.TextureBufferImpl.RefCountMonitor refCountMonitor) {
        refCountMonitor.onDestroy(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ org.webrtc.VideoFrame.I420Buffer lambda$toI420$1() {
        return this.yuvConverter.convert(this);
    }

    public org.webrtc.TextureBufferImpl applyTransformMatrix(android.graphics.Matrix matrix, int i17, int i18) {
        return applyTransformMatrix(matrix, i17, i18, i17, i18);
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public org.webrtc.VideoFrame.Buffer cropAndScale(int i17, int i18, int i19, int i27, int i28, int i29) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.preTranslate(i17 / this.width, (r0 - (i18 + i27)) / this.height);
        matrix.preScale(i19 / this.width, i27 / this.height);
        return applyTransformMatrix(matrix, java.lang.Math.round((this.unscaledWidth * i19) / this.width), java.lang.Math.round((this.unscaledHeight * i27) / this.height), i28, i29);
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public int getTextureId() {
        return this.f347939id;
    }

    public android.os.Handler getToI420Handler() {
        return this.toI420Handler;
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public android.graphics.Matrix getTransformMatrix() {
        return this.transformMatrix;
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public org.webrtc.VideoFrame.TextureBuffer.Type getType() {
        return this.type;
    }

    public int getUnscaledHeight() {
        return this.unscaledHeight;
    }

    public int getUnscaledWidth() {
        return this.unscaledWidth;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    public org.webrtc.YuvConverter getYuvConverter() {
        return this.yuvConverter;
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void release() {
        this.refCountMonitor.onRelease(this);
        this.refCountDelegate.release();
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void retain() {
        this.refCountMonitor.onRetain(this);
        this.refCountDelegate.retain();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public org.webrtc.VideoFrame.I420Buffer toI420() {
        return (org.webrtc.VideoFrame.I420Buffer) org.webrtc.ThreadUtils.invokeAtFrontUninterruptibly(this.toI420Handler, new java.util.concurrent.Callable() { // from class: org.webrtc.TextureBufferImpl$$a
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                org.webrtc.VideoFrame.I420Buffer lambda$toI420$1;
                lambda$toI420$1 = org.webrtc.TextureBufferImpl.this.lambda$toI420$1();
                return lambda$toI420$1;
            }
        });
    }

    public TextureBufferImpl(int i17, int i18, org.webrtc.VideoFrame.TextureBuffer.Type type, int i19, android.graphics.Matrix matrix, android.os.Handler handler, org.webrtc.YuvConverter yuvConverter, org.webrtc.TextureBufferImpl.RefCountMonitor refCountMonitor) {
        this(i17, i18, i17, i18, type, i19, matrix, handler, yuvConverter, refCountMonitor);
    }

    private org.webrtc.TextureBufferImpl applyTransformMatrix(android.graphics.Matrix matrix, int i17, int i18, int i19, int i27) {
        android.graphics.Matrix matrix2 = new android.graphics.Matrix(this.transformMatrix);
        matrix2.preConcat(matrix);
        retain();
        return new org.webrtc.TextureBufferImpl(i17, i18, i19, i27, this.type, this.f347939id, matrix2, this.toI420Handler, this.yuvConverter, new org.webrtc.TextureBufferImpl.RefCountMonitor() { // from class: org.webrtc.TextureBufferImpl.2
            @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onDestroy(org.webrtc.TextureBufferImpl textureBufferImpl) {
                org.webrtc.TextureBufferImpl.this.release();
            }

            @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onRelease(org.webrtc.TextureBufferImpl textureBufferImpl) {
                org.webrtc.TextureBufferImpl.this.refCountMonitor.onRelease(org.webrtc.TextureBufferImpl.this);
            }

            @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onRetain(org.webrtc.TextureBufferImpl textureBufferImpl) {
                org.webrtc.TextureBufferImpl.this.refCountMonitor.onRetain(org.webrtc.TextureBufferImpl.this);
            }
        });
    }

    private TextureBufferImpl(int i17, int i18, int i19, int i27, org.webrtc.VideoFrame.TextureBuffer.Type type, int i28, android.graphics.Matrix matrix, android.os.Handler handler, org.webrtc.YuvConverter yuvConverter, final org.webrtc.TextureBufferImpl.RefCountMonitor refCountMonitor) {
        this.unscaledWidth = i17;
        this.unscaledHeight = i18;
        this.width = i19;
        this.height = i27;
        this.type = type;
        this.f347939id = i28;
        this.transformMatrix = matrix;
        this.toI420Handler = handler;
        this.yuvConverter = yuvConverter;
        this.refCountDelegate = new org.webrtc.RefCountDelegate(new java.lang.Runnable() { // from class: org.webrtc.TextureBufferImpl$$b
            @Override // java.lang.Runnable
            public final void run() {
                org.webrtc.TextureBufferImpl.this.lambda$new$0(refCountMonitor);
            }
        });
        this.refCountMonitor = refCountMonitor;
    }
}
