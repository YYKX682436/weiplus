package io.flutter.embedding.android;

/* loaded from: classes15.dex */
public class SwapSurfaceController {
    private static final java.lang.String TAG = "SwapSurfaceController";
    private boolean firstTimeSwap;
    private io.flutter.embedding.android.FlutterView flutterView;
    private android.view.Surface surface;
    private io.flutter.embedding.engine.renderer.SwapRenderSurface swapSurface;
    private android.view.View swapView;
    private boolean surfaceAvailable = false;
    private boolean swappingSurface = false;
    private boolean isInSwapSurface = false;
    private boolean isResumingSurface = false;
    boolean isFullScreenSize = false;

    /* JADX WARN: Multi-variable type inference failed */
    public SwapSurfaceController(io.flutter.embedding.android.FlutterView flutterView, io.flutter.embedding.engine.renderer.SwapRenderSurface swapRenderSurface) {
        this.firstTimeSwap = false;
        this.flutterView = flutterView;
        this.swapSurface = swapRenderSurface;
        this.swapView = (android.view.View) swapRenderSurface;
        this.firstTimeSwap = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resumeSurface$2() {
        io.flutter.Log.i(TAG, "resumeSurface on onRenderSurfaceNextUpdate, isResumingSurface:" + this.isResumingSurface);
        if (this.isResumingSurface) {
            makeSmallSize();
            this.flutterView.toggleHideCurrentRenderSurface(false);
        }
        this.isResumingSurface = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resumeSurface$3(io.flutter.embedding.engine.renderer.RenderSurface renderSurface) {
        io.flutter.Log.i(TAG, "resumeSurface onNextFrameDisplayed");
        renderSurface.onRenderSurfaceNextUpdate(new java.lang.Runnable() { // from class: io.flutter.embedding.android.SwapSurfaceController$$a
            @Override // java.lang.Runnable
            public final void run() {
                io.flutter.embedding.android.SwapSurfaceController.this.lambda$resumeSurface$2();
            }
        });
        renderSurface.markSurfaceIsSwapOut(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$swapSurfaceAfterReachFullScreenSize$0() {
        io.flutter.Log.i(TAG, "swapSurface onNextSurfaceUpdate, hide current renderSurface, isResumingSurface:" + this.isResumingSurface);
        if (this.isResumingSurface) {
            return;
        }
        this.flutterView.toggleHideCurrentRenderSurface(true);
        this.swapView.bringToFront();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$swapSurfaceAfterReachFullScreenSize$1() {
        this.swapSurface.onNextSurfaceUpdate(new java.lang.Runnable() { // from class: io.flutter.embedding.android.SwapSurfaceController$$b
            @Override // java.lang.Runnable
            public final void run() {
                io.flutter.embedding.android.SwapSurfaceController.this.lambda$swapSurfaceAfterReachFullScreenSize$0();
            }
        });
        io.flutter.Log.i(TAG, "swapSurface onNextFrameDisplayed, markSurfaceIsSwapOut");
        io.flutter.embedding.engine.renderer.RenderSurface renderSurface = this.flutterView.renderSurface;
        if (renderSurface != null) {
            renderSurface.markSurfaceIsSwapOut(true);
        }
    }

    private void makeFullScreen() {
        io.flutter.Log.i(TAG, "makeFullScreen");
        android.view.ViewGroup.LayoutParams layoutParams = this.swapView.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        this.swapView.setLayoutParams(layoutParams);
    }

    private void makeSmallSize() {
        io.flutter.Log.i(TAG, "makeSmallSize");
        android.view.ViewGroup.LayoutParams layoutParams = this.swapView.getLayoutParams();
        layoutParams.width = 1;
        layoutParams.height = 1;
        this.swapView.setLayoutParams(layoutParams);
        this.isFullScreenSize = false;
    }

    private void swapSurfaceAfterReachFullScreenSize() {
        io.flutter.embedding.android.FlutterView flutterView = this.flutterView;
        if (flutterView == null || flutterView.getAttachedRenderer() == null) {
            return;
        }
        io.flutter.embedding.engine.renderer.FlutterRenderer attachedRenderer = this.flutterView.getAttachedRenderer();
        io.flutter.Log.i(TAG, "swapSurfaceAfterReachFullScreenSize");
        attachedRenderer.swapSurface(this.surface);
        attachedRenderer.onNextFrameDisplayed(new java.lang.Runnable() { // from class: io.flutter.embedding.android.SwapSurfaceController$$d
            @Override // java.lang.Runnable
            public final void run() {
                io.flutter.embedding.android.SwapSurfaceController.this.lambda$swapSurfaceAfterReachFullScreenSize$1();
            }
        });
        attachedRenderer.requestDrawLastFrame();
        this.swappingSurface = false;
        this.isInSwapSurface = true;
        this.isResumingSurface = false;
    }

    public void resumeSurface() {
        io.flutter.embedding.android.FlutterView flutterView = this.flutterView;
        if (flutterView == null || flutterView.getAttachedRenderer() == null || this.flutterView.renderSurface == null) {
            return;
        }
        io.flutter.Log.i(TAG, "resumeSurface, swappingSurface:" + this.swappingSurface);
        this.isResumingSurface = true;
        this.swappingSurface = false;
        io.flutter.embedding.engine.renderer.FlutterRenderer attachedRenderer = this.flutterView.getAttachedRenderer();
        final io.flutter.embedding.engine.renderer.RenderSurface renderSurface = this.flutterView.renderSurface;
        if (renderSurface == null || !renderSurface.isAvailableForRendering()) {
            io.flutter.Log.i(TAG, "resume surface originRenderSurfacenot not available" + renderSurface);
        } else {
            io.flutter.Log.i(TAG, "show current renderSurface");
            attachedRenderer.onNextFrameDisplayed(new java.lang.Runnable() { // from class: io.flutter.embedding.android.SwapSurfaceController$$c
                @Override // java.lang.Runnable
                public final void run() {
                    io.flutter.embedding.android.SwapSurfaceController.this.lambda$resumeSurface$3(renderSurface);
                }
            });
            attachedRenderer.swapSurface(renderSurface.getRenderSurface());
            attachedRenderer.requestDrawLastFrame();
            this.isInSwapSurface = false;
        }
    }

    public void surfaceAvailable(android.view.Surface surface) {
        io.flutter.Log.i(TAG, "surfaceCreated, swappingSurface:" + this.swappingSurface + ", isInSwapSurface: " + this.isInSwapSurface);
        this.surface = surface;
        this.surfaceAvailable = true;
        if (this.swappingSurface) {
            makeFullScreen();
            return;
        }
        if (this.isInSwapSurface) {
            io.flutter.embedding.android.FlutterView flutterView = this.flutterView;
            if (flutterView != null && flutterView.getAttachedRenderer() != null) {
                this.flutterView.getAttachedRenderer().startRenderingToSurface(surface, false);
            }
            this.isInSwapSurface = true;
        }
    }

    public void surfaceDestroyed() {
        io.flutter.embedding.android.FlutterView flutterView;
        io.flutter.Log.i(TAG, "surfaceDestroyed, isInSwapSurface:" + this.isInSwapSurface);
        this.surfaceAvailable = false;
        this.isFullScreenSize = false;
        if (!this.isInSwapSurface || (flutterView = this.flutterView) == null || flutterView.getAttachedRenderer() == null) {
            return;
        }
        io.flutter.Log.i(TAG, "stopRenderingToSurface");
        this.flutterView.getAttachedRenderer().stopRenderingToSurface(this.surface);
        this.flutterView.getAttachedRenderer().clearNextFrameDisplayedListener();
    }

    public void surfaceSizeChanged(int i17, int i18) {
        this.isFullScreenSize = i17 > 1 && i18 > 1;
        io.flutter.Log.i(TAG, "surfaceSizeChanged: " + i17 + " , " + i18 + ", swappingSurface: " + this.swappingSurface + ", isFullScreenSize:" + this.isFullScreenSize);
        io.flutter.embedding.android.FlutterView flutterView = this.flutterView;
        if (flutterView == null || flutterView.getAttachedRenderer() == null) {
            return;
        }
        io.flutter.embedding.engine.renderer.FlutterRenderer attachedRenderer = this.flutterView.getAttachedRenderer();
        if (this.isInSwapSurface) {
            attachedRenderer.surfaceChanged(i17, i18);
        } else if (this.isFullScreenSize) {
            if (this.swappingSurface) {
                swapSurfaceAfterReachFullScreenSize();
            } else {
                makeSmallSize();
            }
        }
    }

    public void swapSurface() {
        io.flutter.Log.i(TAG, "swapSurface, surfaceAvailable:" + this.surfaceAvailable + ", isFullScreenSize:" + this.isFullScreenSize);
        this.swappingSurface = true;
        this.isResumingSurface = false;
        if (!this.surfaceAvailable) {
            io.flutter.Log.w(TAG, "swapSurface not is not available!");
        } else if (this.isFullScreenSize) {
            swapSurfaceAfterReachFullScreenSize();
        } else {
            makeFullScreen();
        }
    }
}
