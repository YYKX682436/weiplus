package io.flutter.plugins.webviewflutter;

/* loaded from: classes13.dex */
public class WebViewFlutterApiImpl {
    private io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewFlutterApi api;
    private final io.flutter.plugin.common.BinaryMessenger binaryMessenger;
    private final io.flutter.plugins.webviewflutter.InstanceManager instanceManager;

    public WebViewFlutterApiImpl(io.flutter.plugin.common.BinaryMessenger binaryMessenger, io.flutter.plugins.webviewflutter.InstanceManager instanceManager) {
        this.binaryMessenger = binaryMessenger;
        this.instanceManager = instanceManager;
        this.api = new io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewFlutterApi(binaryMessenger);
    }

    public void create(android.webkit.WebView webView, io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewFlutterApi.Reply<java.lang.Void> reply) {
        if (this.instanceManager.containsInstance(webView)) {
            return;
        }
        this.api.create(java.lang.Long.valueOf(this.instanceManager.addHostCreatedInstance(webView)), reply);
    }

    public void onScrollChanged(android.webkit.WebView webView, java.lang.Long l17, java.lang.Long l18, java.lang.Long l19, java.lang.Long l27, io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewFlutterApi.Reply<java.lang.Void> reply) {
        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewFlutterApi webViewFlutterApi = this.api;
        java.lang.Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webView);
        java.util.Objects.requireNonNull(identifierForStrongReference);
        webViewFlutterApi.onScrollChanged(identifierForStrongReference, l17, l18, l19, l27, reply);
    }

    public void setApi(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewFlutterApi webViewFlutterApi) {
        this.api = webViewFlutterApi;
    }
}
