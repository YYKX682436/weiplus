package io.flutter.plugins.webviewflutter;

/* loaded from: classes13.dex */
public class PermissionRequestHostApiImpl implements io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.PermissionRequestHostApi {
    private final io.flutter.plugin.common.BinaryMessenger binaryMessenger;
    private final io.flutter.plugins.webviewflutter.InstanceManager instanceManager;

    public PermissionRequestHostApiImpl(io.flutter.plugin.common.BinaryMessenger binaryMessenger, io.flutter.plugins.webviewflutter.InstanceManager instanceManager) {
        this.binaryMessenger = binaryMessenger;
        this.instanceManager = instanceManager;
    }

    private android.webkit.PermissionRequest getPermissionRequestInstance(java.lang.Long l17) {
        android.webkit.PermissionRequest permissionRequest = (android.webkit.PermissionRequest) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(permissionRequest);
        return permissionRequest;
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.PermissionRequestHostApi
    public void deny(java.lang.Long l17) {
        getPermissionRequestInstance(l17).deny();
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.PermissionRequestHostApi
    public void grant(java.lang.Long l17, java.util.List<java.lang.String> list) {
        getPermissionRequestInstance(l17).grant((java.lang.String[]) list.toArray(new java.lang.String[0]));
    }
}
