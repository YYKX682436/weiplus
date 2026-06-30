package io.flutter.embedding.android;

/* loaded from: classes15.dex */
public class SwapSurfaceViewRenderSurface extends android.view.SurfaceView implements io.flutter.embedding.engine.renderer.SwapRenderSurface, android.view.SurfaceHolder.Callback {
    private io.flutter.embedding.android.SwapSurfaceController controller;
    private java.lang.Runnable nextSurfaceUpdateCallback;
    private boolean surfaceAvailable;

    public SwapSurfaceViewRenderSurface(android.content.Context context) {
        super(context);
        this.nextSurfaceUpdateCallback = null;
        this.surfaceAvailable = true;
    }

    private void invokeNextSurfaceUpdate() {
        if (this.nextSurfaceUpdateCallback != null) {
            android.view.Choreographer.getInstance().postFrameCallback(new android.view.Choreographer.FrameCallback() { // from class: io.flutter.embedding.android.SwapSurfaceViewRenderSurface$$a
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j17) {
                    io.flutter.embedding.android.SwapSurfaceViewRenderSurface.this.lambda$invokeNextSurfaceUpdate$0(j17);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$invokeNextSurfaceUpdate$0(long j17) {
        java.lang.Runnable runnable = this.nextSurfaceUpdateCallback;
        if (runnable != null) {
            runnable.run();
            this.nextSurfaceUpdateCallback = null;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.SwapRenderSurface
    public void attachToFlutterView(io.flutter.embedding.android.FlutterView flutterView) {
        this.controller = new io.flutter.embedding.android.SwapSurfaceController(flutterView, this);
        flutterView.addView(this, new android.view.ViewGroup.LayoutParams(1, 1));
        setZOrderOnTop(false);
        getHolder().addCallback(this);
    }

    @Override // android.view.SurfaceView, android.view.View
    public boolean gatherTransparentRegion(android.graphics.Region region) {
        if (getAlpha() < 1.0f || !this.surfaceAvailable) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i17 = iArr[0];
        region.op(i17, iArr[1], (getRight() + i17) - getLeft(), (iArr[1] + getBottom()) - getTop(), android.graphics.Region.Op.DIFFERENCE);
        return true;
    }

    @Override // io.flutter.embedding.engine.renderer.SwapRenderSurface
    public void onNextSurfaceUpdate(java.lang.Runnable runnable) {
        this.nextSurfaceUpdateCallback = runnable;
        if (this.surfaceAvailable) {
            invokeNextSurfaceUpdate();
        }
    }

    @Override // io.flutter.embedding.engine.renderer.SwapRenderSurface
    public void resumeSurface() {
        this.controller.resumeSurface();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
        this.controller.surfaceSizeChanged(i18, i19);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        this.surfaceAvailable = true;
        this.controller.surfaceAvailable(surfaceHolder.getSurface());
        invokeNextSurfaceUpdate();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        this.surfaceAvailable = false;
        this.controller.surfaceDestroyed();
    }

    @Override // io.flutter.embedding.engine.renderer.SwapRenderSurface
    public void swapSurface() {
        this.controller.swapSurface();
    }

    public SwapSurfaceViewRenderSurface(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.nextSurfaceUpdateCallback = null;
        this.surfaceAvailable = true;
    }

    public SwapSurfaceViewRenderSurface(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.nextSurfaceUpdateCallback = null;
        this.surfaceAvailable = true;
    }
}
