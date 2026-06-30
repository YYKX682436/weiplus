package io.flutter.plugins.webviewflutter;

/* loaded from: classes16.dex */
public class HttpAuthHandlerFlutterApiImpl {
    private final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.HttpAuthHandlerFlutterApi api;
    private final io.flutter.plugin.common.BinaryMessenger binaryMessenger;
    private final io.flutter.plugins.webviewflutter.InstanceManager instanceManager;

    public HttpAuthHandlerFlutterApiImpl(io.flutter.plugin.common.BinaryMessenger binaryMessenger, io.flutter.plugins.webviewflutter.InstanceManager instanceManager) {
        this.binaryMessenger = binaryMessenger;
        this.instanceManager = instanceManager;
        this.api = new io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.HttpAuthHandlerFlutterApi(binaryMessenger);
    }

    public void create(android.webkit.HttpAuthHandler httpAuthHandler, io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.HttpAuthHandlerFlutterApi.Reply<java.lang.Void> reply) {
        if (this.instanceManager.containsInstance(httpAuthHandler)) {
            return;
        }
        this.api.create(java.lang.Long.valueOf(this.instanceManager.addHostCreatedInstance(httpAuthHandler)), reply);
    }
}
