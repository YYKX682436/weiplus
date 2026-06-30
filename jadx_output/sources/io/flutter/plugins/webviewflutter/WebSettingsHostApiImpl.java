package io.flutter.plugins.webviewflutter;

/* loaded from: classes13.dex */
public class WebSettingsHostApiImpl implements io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi {
    private final io.flutter.plugins.webviewflutter.InstanceManager instanceManager;
    private final io.flutter.plugins.webviewflutter.WebSettingsHostApiImpl.WebSettingsCreator webSettingsCreator;

    /* loaded from: classes13.dex */
    public static class WebSettingsCreator {
        public android.webkit.WebSettings createWebSettings(android.webkit.WebView webView) {
            return webView.getSettings();
        }
    }

    public WebSettingsHostApiImpl(io.flutter.plugins.webviewflutter.InstanceManager instanceManager, io.flutter.plugins.webviewflutter.WebSettingsHostApiImpl.WebSettingsCreator webSettingsCreator) {
        this.instanceManager = instanceManager;
        this.webSettingsCreator = webSettingsCreator;
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi
    public void create(java.lang.Long l17, java.lang.Long l18) {
        android.webkit.WebView webView = (android.webkit.WebView) this.instanceManager.getInstance(l18.longValue());
        java.util.Objects.requireNonNull(webView);
        this.instanceManager.addDartCreatedInstance(this.webSettingsCreator.createWebSettings(webView), l17.longValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi
    public java.lang.String getUserAgentString(java.lang.Long l17) {
        android.webkit.WebSettings webSettings = (android.webkit.WebSettings) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(webSettings);
        return webSettings.getUserAgentString();
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi
    public void setAllowFileAccess(java.lang.Long l17, java.lang.Boolean bool) {
        android.webkit.WebSettings webSettings = (android.webkit.WebSettings) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(webSettings);
        webSettings.setAllowFileAccess(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi
    public void setBuiltInZoomControls(java.lang.Long l17, java.lang.Boolean bool) {
        android.webkit.WebSettings webSettings = (android.webkit.WebSettings) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(webSettings);
        webSettings.setBuiltInZoomControls(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi
    public void setDisplayZoomControls(java.lang.Long l17, java.lang.Boolean bool) {
        android.webkit.WebSettings webSettings = (android.webkit.WebSettings) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(webSettings);
        webSettings.setDisplayZoomControls(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi
    public void setDomStorageEnabled(java.lang.Long l17, java.lang.Boolean bool) {
        android.webkit.WebSettings webSettings = (android.webkit.WebSettings) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(webSettings);
        webSettings.setDomStorageEnabled(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi
    public void setJavaScriptCanOpenWindowsAutomatically(java.lang.Long l17, java.lang.Boolean bool) {
        android.webkit.WebSettings webSettings = (android.webkit.WebSettings) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(webSettings);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi
    public void setJavaScriptEnabled(java.lang.Long l17, java.lang.Boolean bool) {
        android.webkit.WebSettings webSettings = (android.webkit.WebSettings) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(webSettings);
        webSettings.setJavaScriptEnabled(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi
    public void setLoadWithOverviewMode(java.lang.Long l17, java.lang.Boolean bool) {
        android.webkit.WebSettings webSettings = (android.webkit.WebSettings) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(webSettings);
        webSettings.setLoadWithOverviewMode(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi
    public void setMediaPlaybackRequiresUserGesture(java.lang.Long l17, java.lang.Boolean bool) {
        android.webkit.WebSettings webSettings = (android.webkit.WebSettings) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(webSettings);
        webSettings.setMediaPlaybackRequiresUserGesture(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi
    public void setSupportMultipleWindows(java.lang.Long l17, java.lang.Boolean bool) {
        android.webkit.WebSettings webSettings = (android.webkit.WebSettings) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(webSettings);
        webSettings.setSupportMultipleWindows(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi
    public void setSupportZoom(java.lang.Long l17, java.lang.Boolean bool) {
        android.webkit.WebSettings webSettings = (android.webkit.WebSettings) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(webSettings);
        webSettings.setSupportZoom(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi
    public void setTextZoom(java.lang.Long l17, java.lang.Long l18) {
        android.webkit.WebSettings webSettings = (android.webkit.WebSettings) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(webSettings);
        webSettings.setTextZoom(l18.intValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi
    public void setUseWideViewPort(java.lang.Long l17, java.lang.Boolean bool) {
        android.webkit.WebSettings webSettings = (android.webkit.WebSettings) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(webSettings);
        webSettings.setUseWideViewPort(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi
    public void setUserAgentString(java.lang.Long l17, java.lang.String str) {
        android.webkit.WebSettings webSettings = (android.webkit.WebSettings) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(webSettings);
        webSettings.setUserAgentString(str);
    }
}
