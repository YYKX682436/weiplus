package io.flutter.plugins.webviewflutter;

/* loaded from: classes16.dex */
public class GeolocationPermissionsCallbackFlutterApiImpl {
    private io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.GeolocationPermissionsCallbackFlutterApi api;
    private final io.flutter.plugin.common.BinaryMessenger binaryMessenger;
    private final io.flutter.plugins.webviewflutter.InstanceManager instanceManager;

    public GeolocationPermissionsCallbackFlutterApiImpl(io.flutter.plugin.common.BinaryMessenger binaryMessenger, io.flutter.plugins.webviewflutter.InstanceManager instanceManager) {
        this.binaryMessenger = binaryMessenger;
        this.instanceManager = instanceManager;
        this.api = new io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.GeolocationPermissionsCallbackFlutterApi(binaryMessenger);
    }

    public void create(android.webkit.GeolocationPermissions.Callback callback, io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.GeolocationPermissionsCallbackFlutterApi.Reply<java.lang.Void> reply) {
        if (this.instanceManager.containsInstance(callback)) {
            return;
        }
        this.api.create(java.lang.Long.valueOf(this.instanceManager.addHostCreatedInstance(callback)), reply);
    }

    public void setApi(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.GeolocationPermissionsCallbackFlutterApi geolocationPermissionsCallbackFlutterApi) {
        this.api = geolocationPermissionsCallbackFlutterApi;
    }
}
