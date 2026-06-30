package org.webrtc;

/* loaded from: classes16.dex */
public class TextureEglRenderer extends org.webrtc.EglRenderer implements android.view.TextureView.SurfaceTextureListener {
    private static final java.lang.String TAG = "SurfaceEglRenderer";
    private int frameRotation;
    private boolean isFirstFrameRendered;
    private boolean isRenderingPaused;
    private final java.lang.Object layoutLock;
    private org.webrtc.RendererCommon.RendererEvents rendererEvents;
    private int rotatedFrameHeight;
    private int rotatedFrameWidth;

    public TextureEglRenderer(java.lang.String str) {
        super(str);
        this.layoutLock = new java.lang.Object();
    }

    private void logD(java.lang.String str) {
        org.webrtc.Logging.d(TAG, this.name + ": " + str);
    }

    private void updateFrameDimensionsAndReportEvents(org.webrtc.VideoFrame videoFrame) {
        synchronized (this.layoutLock) {
            if (this.isRenderingPaused) {
                return;
            }
            if (!this.isFirstFrameRendered) {
                this.isFirstFrameRendered = true;
                logD("Reporting first rendered frame.");
                org.webrtc.RendererCommon.RendererEvents rendererEvents = this.rendererEvents;
                if (rendererEvents != null) {
                    rendererEvents.onFirstFrameRendered();
                }
            }
            if (this.rotatedFrameWidth != videoFrame.getRotatedWidth() || this.rotatedFrameHeight != videoFrame.getRotatedHeight() || this.frameRotation != videoFrame.getRotation()) {
                logD("Reporting frame resolution changed to " + videoFrame.getBuffer().getWidth() + "x" + videoFrame.getBuffer().getHeight() + " with rotation " + videoFrame.getRotation());
                org.webrtc.RendererCommon.RendererEvents rendererEvents2 = this.rendererEvents;
                if (rendererEvents2 != null) {
                    rendererEvents2.onFrameResolutionChanged(videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation());
                }
                this.rotatedFrameWidth = videoFrame.getRotatedWidth();
                this.rotatedFrameHeight = videoFrame.getRotatedHeight();
                this.frameRotation = videoFrame.getRotation();
            }
        }
    }

    @Override // org.webrtc.EglRenderer
    public void disableFpsReduction() {
        synchronized (this.layoutLock) {
            this.isRenderingPaused = false;
        }
        super.disableFpsReduction();
    }

    public void init(org.webrtc.EglBase.Context context, org.webrtc.RendererCommon.RendererEvents rendererEvents, int[] iArr, org.webrtc.RendererCommon.GlDrawer glDrawer) {
        org.webrtc.ThreadUtils.checkIsOnMainThread();
        this.rendererEvents = rendererEvents;
        synchronized (this.layoutLock) {
            this.isFirstFrameRendered = false;
            this.rotatedFrameWidth = 0;
            this.rotatedFrameHeight = 0;
            this.frameRotation = 0;
        }
        super.init(context, iArr, glDrawer);
    }

    @Override // org.webrtc.EglRenderer, org.webrtc.VideoSink
    public void onFrame(org.webrtc.VideoFrame videoFrame) {
        updateFrameDimensionsAndReportEvents(videoFrame);
        super.onFrame(videoFrame);
    }

    @Override // org.webrtc.EglRenderer
    public void onRenderStats(org.webrtc.PerformanceStatistics performanceStatistics) {
        org.webrtc.RendererCommon.RendererEvents rendererEvents = this.rendererEvents;
        if (rendererEvents != null) {
            rendererEvents.onRenderStats(performanceStatistics);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        org.webrtc.ThreadUtils.checkIsOnMainThread();
        createEglSurface(new android.view.Surface(surfaceTexture));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        org.webrtc.ThreadUtils.checkIsOnMainThread();
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        releaseEglSurface(new org.webrtc.SurfaceEglRenderer$$a(countDownLatch));
        org.webrtc.ThreadUtils.awaitUninterruptibly(countDownLatch);
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        org.webrtc.ThreadUtils.checkIsOnMainThread();
        logD("surfaceChanged: size: " + i17 + "x" + i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }

    @Override // org.webrtc.EglRenderer
    public void pauseVideo() {
        synchronized (this.layoutLock) {
            this.isRenderingPaused = true;
        }
        super.pauseVideo();
    }

    @Override // org.webrtc.EglRenderer
    public void setFpsReduction(float f17) {
        synchronized (this.layoutLock) {
            this.isRenderingPaused = f17 == 0.0f;
        }
        super.setFpsReduction(f17);
    }

    @Override // org.webrtc.EglRenderer
    public void init(org.webrtc.EglBase.Context context, int[] iArr, org.webrtc.RendererCommon.GlDrawer glDrawer) {
        init(context, (org.webrtc.RendererCommon.RendererEvents) null, iArr, glDrawer);
    }
}
