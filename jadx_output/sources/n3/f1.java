package n3;

/* loaded from: classes14.dex */
public abstract class f1 {
    public static android.view.View.AccessibilityDelegate a(android.view.View view) {
        return view.getAccessibilityDelegate();
    }

    public static android.view.contentcapture.ContentCaptureSession b(android.view.View view) {
        return view.getContentCaptureSession();
    }

    public static java.util.List<android.graphics.Rect> c(android.view.View view) {
        return view.getSystemGestureExclusionRects();
    }

    public static void d(android.view.View view, android.content.Context context, int[] iArr, android.util.AttributeSet attributeSet, android.content.res.TypedArray typedArray, int i17, int i18) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i17, i18);
    }

    public static void e(android.view.View view, android.view.contentcapture.ContentCaptureSession contentCaptureSession) {
        view.setContentCaptureSession(contentCaptureSession);
    }

    public static void f(android.view.View view, java.util.List<android.graphics.Rect> list) {
        view.setSystemGestureExclusionRects(list);
    }
}
