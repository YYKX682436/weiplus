package io.flutter.plugin.platform;

/* loaded from: classes15.dex */
public class PlatformViewsControllerDelegator implements io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate {
    io.flutter.plugin.platform.PlatformViewsController platformViewsController;
    io.flutter.plugin.platform.PlatformViewsController2 platformViewsController2;

    public PlatformViewsControllerDelegator(io.flutter.plugin.platform.PlatformViewsController platformViewsController, io.flutter.plugin.platform.PlatformViewsController2 platformViewsController2) {
        this.platformViewsController = platformViewsController;
        this.platformViewsController2 = platformViewsController2;
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public void attachAccessibilityBridge(io.flutter.view.AccessibilityBridge accessibilityBridge) {
        this.platformViewsController.attachAccessibilityBridge(accessibilityBridge);
        this.platformViewsController2.attachAccessibilityBridge(accessibilityBridge);
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public void detachAccessibilityBridge() {
        this.platformViewsController.detachAccessibilityBridge();
        this.platformViewsController2.detachAccessibilityBridge();
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public android.view.View getPlatformViewById(int i17) {
        return this.platformViewsController2.getPlatformViewById(i17) != null ? this.platformViewsController2.getPlatformViewById(i17) : this.platformViewsController.getPlatformViewById(i17);
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public boolean usesVirtualDisplay(int i17) {
        return this.platformViewsController2.getPlatformViewById(i17) != null ? this.platformViewsController2.usesVirtualDisplay(i17) : this.platformViewsController.usesVirtualDisplay(i17);
    }
}
