package io.flutter.plugins.webviewflutter;

/* loaded from: classes13.dex */
public class GeolocationPermissionsCallbackHostApiImpl implements io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.GeolocationPermissionsCallbackHostApi {
    private final io.flutter.plugin.common.BinaryMessenger binaryMessenger;
    private final io.flutter.plugins.webviewflutter.InstanceManager instanceManager;

    public GeolocationPermissionsCallbackHostApiImpl(io.flutter.plugin.common.BinaryMessenger binaryMessenger, io.flutter.plugins.webviewflutter.InstanceManager instanceManager) {
        this.binaryMessenger = binaryMessenger;
        this.instanceManager = instanceManager;
    }

    private android.webkit.GeolocationPermissions.Callback getGeolocationPermissionsCallbackInstance(java.lang.Long l17) {
        android.webkit.GeolocationPermissions.Callback callback = (android.webkit.GeolocationPermissions.Callback) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(callback);
        return callback;
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.GeolocationPermissionsCallbackHostApi
    public void invoke(java.lang.Long l17, java.lang.String str, java.lang.Boolean bool, java.lang.Boolean bool2) {
        getGeolocationPermissionsCallbackInstance(l17).invoke(str, bool.booleanValue(), bool2.booleanValue());
    }
}
