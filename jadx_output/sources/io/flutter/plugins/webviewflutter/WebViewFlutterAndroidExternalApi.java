package io.flutter.plugins.webviewflutter;

/* loaded from: classes15.dex */
public interface WebViewFlutterAndroidExternalApi {
    static android.webkit.WebView getWebView(io.flutter.embedding.engine.FlutterEngine flutterEngine, long j17) {
        io.flutter.plugins.webviewflutter.WebViewFlutterPlugin webViewFlutterPlugin = (io.flutter.plugins.webviewflutter.WebViewFlutterPlugin) flutterEngine.getPlugins().get(io.flutter.plugins.webviewflutter.WebViewFlutterPlugin.class);
        if (webViewFlutterPlugin == null || webViewFlutterPlugin.getInstanceManager() == null) {
            return null;
        }
        java.lang.Object instanceManager = webViewFlutterPlugin.getInstanceManager().getInstance(j17);
        if (instanceManager instanceof android.webkit.WebView) {
            return (android.webkit.WebView) instanceManager;
        }
        return null;
    }
}
