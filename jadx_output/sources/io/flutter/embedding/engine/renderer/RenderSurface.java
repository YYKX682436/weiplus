package io.flutter.embedding.engine.renderer;

/* loaded from: classes15.dex */
public interface RenderSurface {
    void attachToRenderer(io.flutter.embedding.engine.renderer.FlutterRenderer flutterRenderer);

    void detachFromRenderer();

    io.flutter.embedding.engine.renderer.FlutterRenderer getAttachedRenderer();

    android.view.Surface getRenderSurface();

    boolean isAvailableForRendering();

    void markSurfaceIsSwapOut(boolean z17);

    void onRenderSurfaceNextUpdate(java.lang.Runnable runnable);

    void pause();

    void resume();
}
