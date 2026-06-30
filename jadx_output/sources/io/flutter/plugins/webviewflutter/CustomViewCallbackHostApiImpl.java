package io.flutter.plugins.webviewflutter;

/* loaded from: classes13.dex */
public class CustomViewCallbackHostApiImpl implements io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CustomViewCallbackHostApi {
    private final io.flutter.plugin.common.BinaryMessenger binaryMessenger;
    private final io.flutter.plugins.webviewflutter.InstanceManager instanceManager;

    public CustomViewCallbackHostApiImpl(io.flutter.plugin.common.BinaryMessenger binaryMessenger, io.flutter.plugins.webviewflutter.InstanceManager instanceManager) {
        this.binaryMessenger = binaryMessenger;
        this.instanceManager = instanceManager;
    }

    private android.webkit.WebChromeClient.CustomViewCallback getCustomViewCallbackInstance(java.lang.Long l17) {
        android.webkit.WebChromeClient.CustomViewCallback customViewCallback = (android.webkit.WebChromeClient.CustomViewCallback) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(customViewCallback);
        return customViewCallback;
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CustomViewCallbackHostApi
    public void onCustomViewHidden(java.lang.Long l17) {
        getCustomViewCallbackInstance(l17).onCustomViewHidden();
    }
}
