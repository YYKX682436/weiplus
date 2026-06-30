package io.flutter.embedding.android;

/* loaded from: classes15.dex */
public class SwapTextureViewRenderSurface extends android.view.TextureView implements io.flutter.embedding.engine.renderer.SwapRenderSurface, android.view.TextureView.SurfaceTextureListener {
    private static final java.lang.String TAG = "SwapTextureViewRenderSurface";
    private io.flutter.embedding.android.SwapSurfaceController controller;
    private java.lang.Runnable nextSurfaceUpdateCallback;
    private android.view.Surface textureSurface;

    public SwapTextureViewRenderSurface(android.content.Context context) {
        super(context);
        this.nextSurfaceUpdateCallback = null;
    }

    @Override // io.flutter.embedding.engine.renderer.SwapRenderSurface
    public void attachToFlutterView(io.flutter.embedding.android.FlutterView flutterView) {
        this.controller = new io.flutter.embedding.android.SwapSurfaceController(flutterView, this);
        flutterView.addView(this, new android.view.ViewGroup.LayoutParams(1, 1));
        setSurfaceTextureListener(this);
    }

    @Override // io.flutter.embedding.engine.renderer.SwapRenderSurface
    public void onNextSurfaceUpdate(java.lang.Runnable runnable) {
        this.nextSurfaceUpdateCallback = runnable;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        android.view.Surface surface = new android.view.Surface(surfaceTexture);
        this.textureSurface = surface;
        this.controller.surfaceAvailable(surface);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        this.controller.surfaceDestroyed();
        this.textureSurface.release();
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        this.controller.surfaceSizeChanged(i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        java.lang.Runnable runnable = this.nextSurfaceUpdateCallback;
        if (runnable != null) {
            runnable.run();
            this.nextSurfaceUpdateCallback = null;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.SwapRenderSurface
    public void resumeSurface() {
        this.controller.resumeSurface();
    }

    @Override // io.flutter.embedding.engine.renderer.SwapRenderSurface
    public void swapSurface() {
        this.controller.swapSurface();
    }

    public SwapTextureViewRenderSurface(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.nextSurfaceUpdateCallback = null;
    }

    public SwapTextureViewRenderSurface(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.nextSurfaceUpdateCallback = null;
    }
}
