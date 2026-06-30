package io.flutter.plugins.webviewflutter;

/* loaded from: classes13.dex */
class FlutterWebViewFactory extends io.flutter.plugin.platform.PlatformViewFactory {
    private final io.flutter.plugins.webviewflutter.InstanceManager instanceManager;

    public FlutterWebViewFactory(io.flutter.plugins.webviewflutter.InstanceManager instanceManager) {
        super(io.flutter.plugin.common.StandardMessageCodec.INSTANCE);
        this.instanceManager = instanceManager;
    }

    @Override // io.flutter.plugin.platform.PlatformViewFactory
    public io.flutter.plugin.platform.PlatformView create(android.content.Context context, int i17, java.lang.Object obj) {
        if (((java.lang.Integer) obj) == null) {
            throw new java.lang.IllegalStateException("An identifier is required to retrieve WebView instance.");
        }
        io.flutter.plugin.platform.PlatformView platformView = (io.flutter.plugin.platform.PlatformView) this.instanceManager.getInstance(r3.intValue());
        if (platformView != null) {
            return platformView;
        }
        throw new java.lang.IllegalStateException("Unable to find WebView instance: " + obj);
    }
}
