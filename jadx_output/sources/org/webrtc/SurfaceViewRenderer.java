package org.webrtc;

/* loaded from: classes16.dex */
public class SurfaceViewRenderer extends android.view.SurfaceView implements android.view.SurfaceHolder.Callback, org.webrtc.VideoSink, org.webrtc.RendererCommon.RendererEvents, org.webrtc.IRenderer {
    private static final java.lang.String TAG = "SurfaceViewRenderer";
    private final org.webrtc.SurfaceEglRenderer eglRenderer;
    private boolean enableFixedSize;
    private org.webrtc.RendererCommon.RendererEvents rendererEvents;
    private final java.lang.String resourceName;
    private int rotatedFrameHeight;
    private int rotatedFrameWidth;
    private int surfaceHeight;
    private int surfaceWidth;
    private final org.webrtc.RendererCommon.VideoLayoutMeasure videoLayoutMeasure;

    /* renamed from: org.webrtc.SurfaceViewRenderer$1, reason: invalid class name */
    /* loaded from: classes16.dex */
    public class AnonymousClass1 implements org.webrtc.EglRenderer.FrameListener {
        private final java.util.concurrent.atomic.AtomicBoolean called = new java.util.concurrent.atomic.AtomicBoolean(false);
        final /* synthetic */ org.webrtc.IRenderer.OnCaptureListener val$onCaptureListener;

        public AnonymousClass1(org.webrtc.IRenderer.OnCaptureListener onCaptureListener) {
            this.val$onCaptureListener = onCaptureListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onFrame$0(org.webrtc.IRenderer.OnCaptureListener onCaptureListener, android.graphics.Bitmap bitmap) {
            org.webrtc.SurfaceViewRenderer.this.removeFrameListener(this);
            onCaptureListener.onCapture(bitmap);
        }

        @Override // org.webrtc.EglRenderer.FrameListener
        public void onFrame(final android.graphics.Bitmap bitmap) {
            if (this.called.getAndSet(true)) {
                return;
            }
            org.webrtc.SurfaceViewRenderer surfaceViewRenderer = org.webrtc.SurfaceViewRenderer.this;
            final org.webrtc.IRenderer.OnCaptureListener onCaptureListener = this.val$onCaptureListener;
            surfaceViewRenderer.postOrRun(new java.lang.Runnable() { // from class: org.webrtc.SurfaceViewRenderer$1$$a
                @Override // java.lang.Runnable
                public final void run() {
                    org.webrtc.SurfaceViewRenderer.AnonymousClass1.this.lambda$onFrame$0(onCaptureListener, bitmap);
                }
            });
        }
    }

    public SurfaceViewRenderer(android.content.Context context) {
        super(context);
        this.videoLayoutMeasure = new org.webrtc.RendererCommon.VideoLayoutMeasure();
        java.lang.String resourceName = getResourceName();
        this.resourceName = resourceName;
        org.webrtc.SurfaceEglRenderer surfaceEglRenderer = new org.webrtc.SurfaceEglRenderer(resourceName);
        this.eglRenderer = surfaceEglRenderer;
        getHolder().addCallback(this);
        getHolder().addCallback(surfaceEglRenderer);
    }

    private java.lang.String getResourceName() {
        try {
            return getResources().getResourceEntryName(getId());
        } catch (android.content.res.Resources.NotFoundException unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onFrameResolutionChanged$0(int i17, int i18) {
        this.rotatedFrameWidth = i17;
        this.rotatedFrameHeight = i18;
        updateSurfaceSize();
        requestLayout();
    }

    private void logD(java.lang.String str) {
        org.webrtc.Logging.d(TAG, this.resourceName + ": " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOrRun(java.lang.Runnable runnable) {
        if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    private void updateSurfaceSize() {
        org.webrtc.ThreadUtils.checkIsOnMainThread();
        if (!this.enableFixedSize || this.rotatedFrameWidth == 0 || this.rotatedFrameHeight == 0 || getWidth() == 0 || getHeight() == 0) {
            this.surfaceHeight = 0;
            this.surfaceWidth = 0;
            getHolder().setSizeFromLayout();
            return;
        }
        float width = getWidth() / getHeight();
        int i17 = this.rotatedFrameWidth;
        int i18 = this.rotatedFrameHeight;
        if (i17 / i18 > width) {
            i17 = (int) (i18 * width);
        } else {
            i18 = (int) (i17 / width);
        }
        int min = java.lang.Math.min(getWidth(), i17);
        int min2 = java.lang.Math.min(getHeight(), i18);
        logD("updateSurfaceSize. Layout size: " + getWidth() + "x" + getHeight() + ", frame size: " + this.rotatedFrameWidth + "x" + this.rotatedFrameHeight + ", requested surface size: " + min + "x" + min2 + ", old surface size: " + this.surfaceWidth + "x" + this.surfaceHeight);
        if (min == this.surfaceWidth && min2 == this.surfaceHeight) {
            return;
        }
        this.surfaceWidth = min;
        this.surfaceHeight = min2;
        getHolder().setFixedSize(min, min2);
    }

    public void addFrameListener(org.webrtc.EglRenderer.FrameListener frameListener, float f17, org.webrtc.RendererCommon.GlDrawer glDrawer) {
        this.eglRenderer.addFrameListener(frameListener, f17, glDrawer);
    }

    public void clearImage() {
        this.eglRenderer.clearImage();
    }

    public void disableFpsReduction() {
        this.eglRenderer.disableFpsReduction();
    }

    @Override // org.webrtc.IRenderer
    public org.webrtc.EglRenderer.OnFrameInGLEnv getFrameWithGLCallback() {
        return this.eglRenderer.getFrameWithGLCallback();
    }

    @Override // org.webrtc.IRenderer
    public void init(org.webrtc.EglBase.Context context, org.webrtc.RendererCommon.RendererEvents rendererEvents) {
        init(context, rendererEvents, org.webrtc.EglBase.CONFIG_PLAIN, new org.webrtc.GlRectDrawer());
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public void onFirstFrameRendered() {
        org.webrtc.RendererCommon.RendererEvents rendererEvents = this.rendererEvents;
        if (rendererEvents != null) {
            rendererEvents.onFirstFrameRendered();
        }
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(org.webrtc.VideoFrame videoFrame) {
        this.eglRenderer.onFrame(videoFrame);
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public void onFrameResolutionChanged(final int i17, int i18, int i19) {
        org.webrtc.RendererCommon.RendererEvents rendererEvents = this.rendererEvents;
        if (rendererEvents != null) {
            rendererEvents.onFrameResolutionChanged(i17, i18, i19);
        }
        final int i27 = (i19 == 0 || i19 == 180) ? i17 : i18;
        if (i19 == 0 || i19 == 180) {
            i17 = i18;
        }
        postOrRun(new java.lang.Runnable() { // from class: org.webrtc.SurfaceViewRenderer$$a
            @Override // java.lang.Runnable
            public final void run() {
                org.webrtc.SurfaceViewRenderer.this.lambda$onFrameResolutionChanged$0(i27, i17);
            }
        });
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        org.webrtc.ThreadUtils.checkIsOnMainThread();
        this.eglRenderer.setLayoutAspectRatio((i19 - i17) / (i27 - i18));
        updateSurfaceSize();
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i17, int i18) {
        org.webrtc.ThreadUtils.checkIsOnMainThread();
        android.graphics.Point measure = this.videoLayoutMeasure.measure(i17, i18, this.rotatedFrameWidth, this.rotatedFrameHeight);
        setMeasuredDimension(measure.x, measure.y);
        logD("onMeasure(). New size: " + measure.x + "x" + measure.y);
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public void onRenderStats(org.webrtc.PerformanceStatistics performanceStatistics) {
        org.webrtc.RendererCommon.RendererEvents rendererEvents = this.rendererEvents;
        if (rendererEvents != null) {
            rendererEvents.onRenderStats(performanceStatistics);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(android.view.View view, int i17) {
        super.onVisibilityChanged(view, i17);
        this.eglRenderer.onViewVisibilityChange(i17);
    }

    public void pauseVideo() {
        this.eglRenderer.pauseVideo();
    }

    public void release() {
        this.eglRenderer.release();
    }

    public void removeFrameListener(org.webrtc.EglRenderer.FrameListener frameListener) {
        this.eglRenderer.removeFrameListener(frameListener);
    }

    @Override // org.webrtc.IRenderer
    public void requestCaptureOnce(org.webrtc.IRenderer.OnCaptureListener onCaptureListener) {
        addFrameListener(new org.webrtc.SurfaceViewRenderer.AnonymousClass1(onCaptureListener), 1.0f);
    }

    public void setEnableHardwareScaler(boolean z17) {
        org.webrtc.ThreadUtils.checkIsOnMainThread();
        this.enableFixedSize = z17;
        updateSurfaceSize();
    }

    public void setFpsReduction(float f17) {
        this.eglRenderer.setFpsReduction(f17);
    }

    @Override // org.webrtc.IRenderer
    public void setFrameWithGLCallback(org.webrtc.EglRenderer.OnFrameInGLEnv onFrameInGLEnv) {
        this.eglRenderer.setFrameWithGLCallback(onFrameInGLEnv);
    }

    public void setMirror(boolean z17) {
        this.eglRenderer.setMirror(z17);
    }

    public void setScalingType(org.webrtc.RendererCommon.ScalingType scalingType) {
        org.webrtc.ThreadUtils.checkIsOnMainThread();
        this.videoLayoutMeasure.setScalingType(scalingType);
        requestLayout();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        org.webrtc.ThreadUtils.checkIsOnMainThread();
        this.surfaceHeight = 0;
        this.surfaceWidth = 0;
        updateSurfaceSize();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
    }

    public void addFrameListener(org.webrtc.EglRenderer.FrameListener frameListener, float f17) {
        this.eglRenderer.addFrameListener(frameListener, f17);
    }

    @Override // org.webrtc.IRenderer
    public void init(org.webrtc.EglBase.Context context, org.webrtc.RendererCommon.RendererEvents rendererEvents, int[] iArr, org.webrtc.RendererCommon.GlDrawer glDrawer) {
        org.webrtc.ThreadUtils.checkIsOnMainThread();
        this.rendererEvents = rendererEvents;
        this.rotatedFrameWidth = 0;
        this.rotatedFrameHeight = 0;
        this.eglRenderer.init(context, this, iArr, glDrawer);
    }

    public void setScalingType(org.webrtc.RendererCommon.ScalingType scalingType, org.webrtc.RendererCommon.ScalingType scalingType2) {
        org.webrtc.ThreadUtils.checkIsOnMainThread();
        this.videoLayoutMeasure.setScalingType(scalingType, scalingType2);
        requestLayout();
    }

    public SurfaceViewRenderer(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.videoLayoutMeasure = new org.webrtc.RendererCommon.VideoLayoutMeasure();
        java.lang.String resourceName = getResourceName();
        this.resourceName = resourceName;
        org.webrtc.SurfaceEglRenderer surfaceEglRenderer = new org.webrtc.SurfaceEglRenderer(resourceName);
        this.eglRenderer = surfaceEglRenderer;
        getHolder().addCallback(this);
        getHolder().addCallback(surfaceEglRenderer);
    }
}
