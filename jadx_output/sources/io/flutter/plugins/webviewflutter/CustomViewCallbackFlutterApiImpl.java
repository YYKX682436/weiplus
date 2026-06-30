package io.flutter.plugins.webviewflutter;

/* loaded from: classes16.dex */
public class CustomViewCallbackFlutterApiImpl {
    private io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CustomViewCallbackFlutterApi api;
    private final io.flutter.plugin.common.BinaryMessenger binaryMessenger;
    private final io.flutter.plugins.webviewflutter.InstanceManager instanceManager;

    public CustomViewCallbackFlutterApiImpl(io.flutter.plugin.common.BinaryMessenger binaryMessenger, io.flutter.plugins.webviewflutter.InstanceManager instanceManager) {
        this.binaryMessenger = binaryMessenger;
        this.instanceManager = instanceManager;
        this.api = new io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CustomViewCallbackFlutterApi(binaryMessenger);
    }

    public void create(android.webkit.WebChromeClient.CustomViewCallback customViewCallback, io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CustomViewCallbackFlutterApi.Reply<java.lang.Void> reply) {
        if (this.instanceManager.containsInstance(customViewCallback)) {
            return;
        }
        this.api.create(java.lang.Long.valueOf(this.instanceManager.addHostCreatedInstance(customViewCallback)), reply);
    }

    public void setApi(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CustomViewCallbackFlutterApi customViewCallbackFlutterApi) {
        this.api = customViewCallbackFlutterApi;
    }
}
