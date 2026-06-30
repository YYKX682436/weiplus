package io.flutter.plugins.webviewflutter;

/* loaded from: classes16.dex */
public class PermissionRequestFlutterApiImpl {
    private io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.PermissionRequestFlutterApi api;
    private final io.flutter.plugin.common.BinaryMessenger binaryMessenger;
    private final io.flutter.plugins.webviewflutter.InstanceManager instanceManager;

    public PermissionRequestFlutterApiImpl(io.flutter.plugin.common.BinaryMessenger binaryMessenger, io.flutter.plugins.webviewflutter.InstanceManager instanceManager) {
        this.binaryMessenger = binaryMessenger;
        this.instanceManager = instanceManager;
        this.api = new io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.PermissionRequestFlutterApi(binaryMessenger);
    }

    public void create(android.webkit.PermissionRequest permissionRequest, java.lang.String[] strArr, io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.PermissionRequestFlutterApi.Reply<java.lang.Void> reply) {
        if (this.instanceManager.containsInstance(permissionRequest)) {
            return;
        }
        this.api.create(java.lang.Long.valueOf(this.instanceManager.addHostCreatedInstance(permissionRequest)), java.util.Arrays.asList(strArr), reply);
    }

    public void setApi(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.PermissionRequestFlutterApi permissionRequestFlutterApi) {
        this.api = permissionRequestFlutterApi;
    }
}
