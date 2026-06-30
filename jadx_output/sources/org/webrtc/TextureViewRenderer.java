package org.webrtc;

/* loaded from: classes16.dex */
public class TextureViewRenderer extends android.view.TextureView implements android.view.TextureView.SurfaceTextureListener, org.webrtc.VideoSink, org.webrtc.RendererCommon.RendererEvents, org.webrtc.IRenderer {
    private static final java.lang.String TAG = "SurfaceViewRenderer";
    private final org.webrtc.TextureEglRenderer eglRenderer;
    private org.webrtc.RendererCommon.RendererEvents rendererEvents;
    private final java.lang.String resourceName;
    private int rotatedFrameHeight;
    private int rotatedFrameWidth;
    private int surfaceHeight;
    private int surfaceWidth;
    private final org.webrtc.RendererCommon.VideoLayoutMeasure videoLayoutMeasure;

    public TextureViewRenderer(android.content.Context context) {
        super(context);
        this.videoLayoutMeasure = new org.webrtc.RendererCommon.VideoLayoutMeasure();
        java.lang.String resourceName = getResourceName();
        this.resourceName = resourceName;
        this.eglRenderer = new org.webrtc.TextureEglRenderer(resourceName);
        setSurfaceTextureListener(this);
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
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestCaptureOnce$1(org.webrtc.IRenderer.OnCaptureListener onCaptureListener) {
        onCaptureListener.onCapture(getBitmap());
    }

    private void logD(java.lang.String str) {
        org.webrtc.Logging.d(TAG, this.resourceName + ": " + str);
    }

    private void postOrRun(java.lang.Runnable runnable) {
        if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
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
        postOrRun(new java.lang.Runnable() { // from class: org.webrtc.TextureViewRenderer$$b
            @Override // java.lang.Runnable
            public final void run() {
                org.webrtc.TextureViewRenderer.this.lambda$onFrameResolutionChanged$0(i27, i17);
            }
        });
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        org.webrtc.ThreadUtils.checkIsOnMainThread();
        this.eglRenderer.setLayoutAspectRatio((i19 - i17) / (i27 - i18));
    }

    @Override // android.view.View
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

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        org.webrtc.ThreadUtils.checkIsOnMainThread();
        this.surfaceHeight = 0;
        this.surfaceWidth = 0;
        this.eglRenderer.onSurfaceTextureAvailable(surfaceTexture, i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        this.eglRenderer.onSurfaceTextureDestroyed(surfaceTexture);
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        this.eglRenderer.onSurfaceTextureSizeChanged(surfaceTexture, i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        this.eglRenderer.onSurfaceTextureUpdated(surfaceTexture);
    }

    @Override // android.view.TextureView, android.view.View
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
    public void requestCaptureOnce(final org.webrtc.IRenderer.OnCaptureListener onCaptureListener) {
        post(new java.lang.Runnable() { // from class: org.webrtc.TextureViewRenderer$$a
            @Override // java.lang.Runnable
            public final void run() {
                org.webrtc.TextureViewRenderer.this.lambda$requestCaptureOnce$1(onCaptureListener);
            }
        });
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

    public TextureViewRenderer(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.videoLayoutMeasure = new org.webrtc.RendererCommon.VideoLayoutMeasure();
        java.lang.String resourceName = getResourceName();
        this.resourceName = resourceName;
        this.eglRenderer = new org.webrtc.TextureEglRenderer(resourceName);
        setSurfaceTextureListener(this);
    }
}
