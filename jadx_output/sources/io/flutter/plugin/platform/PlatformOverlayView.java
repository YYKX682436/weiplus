package io.flutter.plugin.platform;

/* loaded from: classes15.dex */
public class PlatformOverlayView extends io.flutter.embedding.android.FlutterImageView {
    private io.flutter.plugin.platform.AccessibilityEventsDelegate accessibilityDelegate;

    public PlatformOverlayView(android.content.Context context, int i17, int i18, io.flutter.plugin.platform.AccessibilityEventsDelegate accessibilityEventsDelegate) {
        super(context, i17, i18, io.flutter.embedding.android.FlutterImageView.SurfaceKind.overlay);
        this.accessibilityDelegate = accessibilityEventsDelegate;
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        io.flutter.plugin.platform.AccessibilityEventsDelegate accessibilityEventsDelegate = this.accessibilityDelegate;
        if (accessibilityEventsDelegate == null || !accessibilityEventsDelegate.onAccessibilityHoverEvent(motionEvent, true)) {
            return super.onHoverEvent(motionEvent);
        }
        return true;
    }

    public PlatformOverlayView(android.content.Context context) {
        this(context, 1, 1, null);
    }

    public PlatformOverlayView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, 1, 1, null);
    }
}
