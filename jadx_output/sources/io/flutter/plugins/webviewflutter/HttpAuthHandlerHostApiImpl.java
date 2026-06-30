package io.flutter.plugins.webviewflutter;

/* loaded from: classes13.dex */
public class HttpAuthHandlerHostApiImpl implements io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.HttpAuthHandlerHostApi {
    private final io.flutter.plugin.common.BinaryMessenger binaryMessenger;
    private final io.flutter.plugins.webviewflutter.InstanceManager instanceManager;

    public HttpAuthHandlerHostApiImpl(io.flutter.plugin.common.BinaryMessenger binaryMessenger, io.flutter.plugins.webviewflutter.InstanceManager instanceManager) {
        this.binaryMessenger = binaryMessenger;
        this.instanceManager = instanceManager;
    }

    private android.webkit.HttpAuthHandler getHttpAuthHandlerInstance(java.lang.Long l17) {
        android.webkit.HttpAuthHandler httpAuthHandler = (android.webkit.HttpAuthHandler) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(httpAuthHandler);
        return httpAuthHandler;
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.HttpAuthHandlerHostApi
    public void cancel(java.lang.Long l17) {
        getHttpAuthHandlerInstance(l17).cancel();
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.HttpAuthHandlerHostApi
    public void proceed(java.lang.Long l17, java.lang.String str, java.lang.String str2) {
        getHttpAuthHandlerInstance(l17).proceed(str, str2);
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.HttpAuthHandlerHostApi
    public java.lang.Boolean useHttpAuthUsernamePassword(java.lang.Long l17) {
        return java.lang.Boolean.valueOf(getHttpAuthHandlerInstance(l17).useHttpAuthUsernamePassword());
    }
}
