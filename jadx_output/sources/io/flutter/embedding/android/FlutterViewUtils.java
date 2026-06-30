package io.flutter.embedding.android;

/* loaded from: classes15.dex */
public final class FlutterViewUtils {
    private FlutterViewUtils() {
    }

    public static void toggleHideCurrentRenderSurface(io.flutter.embedding.android.FlutterView flutterView, boolean z17, boolean z18) {
        flutterView.toggleHideCurrentRenderSurface(z17);
        if (z18 && (flutterView.renderSurface instanceof io.flutter.embedding.android.FlutterTextureView) && flutterView.getAttachedRenderer() != null) {
            ((io.flutter.embedding.android.FlutterTextureView) flutterView.renderSurface).setAlpha(1.0f);
        }
    }
}
