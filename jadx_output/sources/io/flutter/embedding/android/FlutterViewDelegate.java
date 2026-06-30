package io.flutter.embedding.android;

/* loaded from: classes14.dex */
public class FlutterViewDelegate {
    public java.util.List<android.graphics.Rect> getCaptionBarInsets(android.content.Context context) {
        android.view.WindowInsets windowInsets = getWindowInsets(context);
        return windowInsets == null ? java.util.Collections.emptyList() : windowInsets.getBoundingRects(android.view.WindowInsets.Type.captionBar());
    }

    public android.view.WindowInsets getWindowInsets(android.content.Context context) {
        android.view.Window window;
        android.app.Activity activity = io.flutter.util.ViewUtils.getActivity(context);
        if (activity == null || (window = activity.getWindow()) == null) {
            return null;
        }
        return window.getDecorView().getRootWindowInsets();
    }

    public void growViewportMetricsToCaptionBar(android.content.Context context, io.flutter.embedding.engine.renderer.FlutterRenderer.ViewportMetrics viewportMetrics) {
        getCaptionBarInsets(context);
        viewportMetrics.viewPaddingTop = viewportMetrics.viewPaddingTop;
    }
}
