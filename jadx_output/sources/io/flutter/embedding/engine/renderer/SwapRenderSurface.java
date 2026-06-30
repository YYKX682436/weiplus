package io.flutter.embedding.engine.renderer;

/* loaded from: classes15.dex */
public interface SwapRenderSurface {
    void attachToFlutterView(io.flutter.embedding.android.FlutterView flutterView);

    void onNextSurfaceUpdate(java.lang.Runnable runnable);

    void resumeSurface();

    void swapSurface();
}
