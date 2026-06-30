package io.flutter.plugin.platform;

/* loaded from: classes15.dex */
public interface PlatformViewsAccessibilityDelegate {
    void attachAccessibilityBridge(io.flutter.view.AccessibilityBridge accessibilityBridge);

    void detachAccessibilityBridge();

    android.view.View getPlatformViewById(int i17);

    boolean usesVirtualDisplay(int i17);
}
