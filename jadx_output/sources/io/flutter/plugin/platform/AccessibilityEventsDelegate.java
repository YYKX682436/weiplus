package io.flutter.plugin.platform;

/* loaded from: classes15.dex */
class AccessibilityEventsDelegate {
    private io.flutter.view.AccessibilityBridge accessibilityBridge;

    public boolean onAccessibilityHoverEvent(android.view.MotionEvent motionEvent, boolean z17) {
        io.flutter.view.AccessibilityBridge accessibilityBridge = this.accessibilityBridge;
        if (accessibilityBridge == null) {
            return false;
        }
        return accessibilityBridge.onAccessibilityHoverEvent(motionEvent, z17);
    }

    public boolean requestSendAccessibilityEvent(android.view.View view, android.view.View view2, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        io.flutter.view.AccessibilityBridge accessibilityBridge = this.accessibilityBridge;
        if (accessibilityBridge == null) {
            return false;
        }
        return accessibilityBridge.externalViewRequestSendAccessibilityEvent(view, view2, accessibilityEvent);
    }

    public void setAccessibilityBridge(io.flutter.view.AccessibilityBridge accessibilityBridge) {
        this.accessibilityBridge = accessibilityBridge;
    }
}
