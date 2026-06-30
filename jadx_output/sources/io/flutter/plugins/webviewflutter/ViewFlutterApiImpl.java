package io.flutter.plugins.webviewflutter;

/* loaded from: classes16.dex */
public class ViewFlutterApiImpl {
    private io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.ViewFlutterApi api;
    private final io.flutter.plugin.common.BinaryMessenger binaryMessenger;
    private final io.flutter.plugins.webviewflutter.InstanceManager instanceManager;

    public ViewFlutterApiImpl(io.flutter.plugin.common.BinaryMessenger binaryMessenger, io.flutter.plugins.webviewflutter.InstanceManager instanceManager) {
        this.binaryMessenger = binaryMessenger;
        this.instanceManager = instanceManager;
        this.api = new io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.ViewFlutterApi(binaryMessenger);
    }

    public void create(android.view.View view, io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.ViewFlutterApi.Reply<java.lang.Void> reply) {
        if (this.instanceManager.containsInstance(view)) {
            return;
        }
        this.api.create(java.lang.Long.valueOf(this.instanceManager.addHostCreatedInstance(view)), reply);
    }

    public void setApi(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.ViewFlutterApi viewFlutterApi) {
        this.api = viewFlutterApi;
    }
}
