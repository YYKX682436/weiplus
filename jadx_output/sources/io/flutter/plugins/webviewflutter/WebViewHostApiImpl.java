package io.flutter.plugins.webviewflutter;

/* loaded from: classes13.dex */
public class WebViewHostApiImpl implements io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi {
    private final io.flutter.plugin.common.BinaryMessenger binaryMessenger;
    private android.content.Context context;
    private final io.flutter.plugins.webviewflutter.InstanceManager instanceManager;
    private final io.flutter.plugins.webviewflutter.WebViewHostApiImpl.WebViewProxy webViewProxy;

    /* loaded from: classes13.dex */
    public static class WebViewPlatformView extends android.webkit.WebView implements io.flutter.plugin.platform.PlatformView {
        private io.flutter.plugins.webviewflutter.WebViewFlutterApiImpl api;
        private io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl.SecureWebChromeClient currentWebChromeClient;
        private android.webkit.WebViewClient currentWebViewClient;
        private final io.flutter.plugins.webviewflutter.WebViewHostApiImpl.WebViewPlatformView.AndroidSdkChecker sdkChecker;

        /* loaded from: classes13.dex */
        public interface AndroidSdkChecker {
            boolean sdkIsAtLeast(int i17);
        }

        public WebViewPlatformView(android.content.Context context, io.flutter.plugin.common.BinaryMessenger binaryMessenger, io.flutter.plugins.webviewflutter.InstanceManager instanceManager) {
            this(context, binaryMessenger, instanceManager, new io.flutter.plugins.webviewflutter.WebViewHostApiImpl$WebViewPlatformView$$b());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$new$0(int i17) {
            return android.os.Build.VERSION.SDK_INT >= i17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onScrollChanged$1(java.lang.Void r07) {
        }

        private io.flutter.embedding.android.FlutterView tryFindFlutterView() {
            android.view.ViewParent viewParent = this;
            while (viewParent.getParent() != null) {
                viewParent = viewParent.getParent();
                if (viewParent instanceof io.flutter.embedding.android.FlutterView) {
                    return (io.flutter.embedding.android.FlutterView) viewParent;
                }
            }
            return null;
        }

        @Override // io.flutter.plugin.platform.PlatformView
        public void dispose() {
        }

        @Override // io.flutter.plugin.platform.PlatformView
        public android.view.View getView() {
            return this;
        }

        @Override // android.webkit.WebView
        public android.webkit.WebChromeClient getWebChromeClient() {
            return this.currentWebChromeClient;
        }

        @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            io.flutter.embedding.android.FlutterView tryFindFlutterView;
            super.onAttachedToWindow();
            if (!this.sdkChecker.sdkIsAtLeast(26) || (tryFindFlutterView = tryFindFlutterView()) == null) {
                return;
            }
            tryFindFlutterView.setImportantForAutofill(1);
        }

        @Override // android.webkit.WebView, android.view.View
        public void onScrollChanged(int i17, int i18, int i19, int i27) {
            super.onScrollChanged(i17, i18, i19, i27);
            this.api.onScrollChanged(this, java.lang.Long.valueOf(i17), java.lang.Long.valueOf(i18), java.lang.Long.valueOf(i19), java.lang.Long.valueOf(i27), new io.flutter.plugins.webviewflutter.WebViewHostApiImpl$WebViewPlatformView$$a());
        }

        public void setApi(io.flutter.plugins.webviewflutter.WebViewFlutterApiImpl webViewFlutterApiImpl) {
            this.api = webViewFlutterApiImpl;
        }

        @Override // android.webkit.WebView
        public void setWebChromeClient(android.webkit.WebChromeClient webChromeClient) {
            super.setWebChromeClient(webChromeClient);
            if (!(webChromeClient instanceof io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl.SecureWebChromeClient)) {
                throw new java.lang.AssertionError("Client must be a SecureWebChromeClient.");
            }
            io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl.SecureWebChromeClient secureWebChromeClient = (io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl.SecureWebChromeClient) webChromeClient;
            this.currentWebChromeClient = secureWebChromeClient;
            secureWebChromeClient.setWebViewClient(this.currentWebViewClient);
        }

        @Override // android.webkit.WebView
        public void setWebViewClient(android.webkit.WebViewClient webViewClient) {
            super.setWebViewClient(webViewClient);
            this.currentWebViewClient = webViewClient;
            this.currentWebChromeClient.setWebViewClient(webViewClient);
        }

        public WebViewPlatformView(android.content.Context context, io.flutter.plugin.common.BinaryMessenger binaryMessenger, io.flutter.plugins.webviewflutter.InstanceManager instanceManager, io.flutter.plugins.webviewflutter.WebViewHostApiImpl.WebViewPlatformView.AndroidSdkChecker androidSdkChecker) {
            super(context);
            this.currentWebViewClient = new android.webkit.WebViewClient();
            this.currentWebChromeClient = new io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl.SecureWebChromeClient();
            this.api = new io.flutter.plugins.webviewflutter.WebViewFlutterApiImpl(binaryMessenger, instanceManager);
            this.sdkChecker = androidSdkChecker;
            setWebViewClient(this.currentWebViewClient);
            setWebChromeClient(this.currentWebChromeClient);
        }
    }

    /* loaded from: classes13.dex */
    public static class WebViewProxy {
        public io.flutter.plugins.webviewflutter.WebViewHostApiImpl.WebViewPlatformView createWebView(android.content.Context context, io.flutter.plugin.common.BinaryMessenger binaryMessenger, io.flutter.plugins.webviewflutter.InstanceManager instanceManager) {
            return new io.flutter.plugins.webviewflutter.WebViewHostApiImpl.WebViewPlatformView(context, binaryMessenger, instanceManager);
        }

        public void setWebContentsDebuggingEnabled(boolean z17) {
            android.webkit.WebView.setWebContentsDebuggingEnabled(z17);
        }
    }

    public WebViewHostApiImpl(io.flutter.plugins.webviewflutter.InstanceManager instanceManager, io.flutter.plugin.common.BinaryMessenger binaryMessenger, io.flutter.plugins.webviewflutter.WebViewHostApiImpl.WebViewProxy webViewProxy, android.content.Context context) {
        this.instanceManager = instanceManager;
        this.binaryMessenger = binaryMessenger;
        this.webViewProxy = webViewProxy;
        this.context = context;
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void addJavaScriptChannel(java.lang.Long l17, java.lang.Long l18) {
        android.webkit.WebView webView = (android.webkit.WebView) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(webView);
        io.flutter.plugins.webviewflutter.JavaScriptChannel javaScriptChannel = (io.flutter.plugins.webviewflutter.JavaScriptChannel) this.instanceManager.getInstance(l18.longValue());
        java.util.Objects.requireNonNull(javaScriptChannel);
        webView.addJavascriptInterface(javaScriptChannel, javaScriptChannel.javaScriptChannelName);
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public java.lang.Boolean canGoBack(java.lang.Long l17) {
        android.webkit.WebView webView = (android.webkit.WebView) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(webView);
        return java.lang.Boolean.valueOf(webView.canGoBack());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public java.lang.Boolean canGoForward(java.lang.Long l17) {
        android.webkit.WebView webView = (android.webkit.WebView) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(webView);
        return java.lang.Boolean.valueOf(webView.canGoForward());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void clearCache(java.lang.Long l17, java.lang.Boolean bool) {
        android.webkit.WebView webView = (android.webkit.WebView) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(webView);
        webView.clearCache(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void create(java.lang.Long l17) {
        io.flutter.plugins.webviewflutter.DisplayListenerProxy displayListenerProxy = new io.flutter.plugins.webviewflutter.DisplayListenerProxy();
        android.hardware.display.DisplayManager displayManager = (android.hardware.display.DisplayManager) this.context.getSystemService("display");
        displayListenerProxy.onPreWebViewInitialization(displayManager);
        io.flutter.plugins.webviewflutter.WebViewHostApiImpl.WebViewPlatformView createWebView = this.webViewProxy.createWebView(this.context, this.binaryMessenger, this.instanceManager);
        displayListenerProxy.onPostWebViewInitialization(displayManager);
        this.instanceManager.addDartCreatedInstance(createWebView, l17.longValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void evaluateJavascript(java.lang.Long l17, java.lang.String str, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.Result<java.lang.String> result) {
        android.webkit.WebView webView = (android.webkit.WebView) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(webView);
        java.util.Objects.requireNonNull(result);
        webView.evaluateJavascript(str, new android.webkit.ValueCallback() { // from class: io.flutter.plugins.webviewflutter.WebViewHostApiImpl$$a
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.Result.this.success((java.lang.String) obj);
            }
        });
    }

    public io.flutter.plugins.webviewflutter.InstanceManager getInstanceManager() {
        return this.instanceManager;
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewPoint getScrollPosition(java.lang.Long l17) {
        java.util.Objects.requireNonNull((android.webkit.WebView) this.instanceManager.getInstance(l17.longValue()));
        return new io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewPoint.Builder().setX(java.lang.Long.valueOf(r4.getScrollX())).setY(java.lang.Long.valueOf(r4.getScrollY())).build();
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public java.lang.Long getScrollX(java.lang.Long l17) {
        java.util.Objects.requireNonNull((android.webkit.WebView) this.instanceManager.getInstance(l17.longValue()));
        return java.lang.Long.valueOf(r4.getScrollX());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public java.lang.Long getScrollY(java.lang.Long l17) {
        java.util.Objects.requireNonNull((android.webkit.WebView) this.instanceManager.getInstance(l17.longValue()));
        return java.lang.Long.valueOf(r4.getScrollY());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public java.lang.String getTitle(java.lang.Long l17) {
        android.webkit.WebView webView = (android.webkit.WebView) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(webView);
        return webView.getTitle();
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public java.lang.String getUrl(java.lang.Long l17) {
        android.webkit.WebView webView = (android.webkit.WebView) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(webView);
        return webView.getUrl();
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void goBack(java.lang.Long l17) {
        android.webkit.WebView webView = (android.webkit.WebView) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(webView);
        webView.goBack();
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void goForward(java.lang.Long l17) {
        android.webkit.WebView webView = (android.webkit.WebView) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(webView);
        webView.goForward();
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void loadData(java.lang.Long l17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.webkit.WebView webView = (android.webkit.WebView) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(webView);
        webView.loadData(str, str2, str3);
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void loadDataWithBaseUrl(java.lang.Long l17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        android.webkit.WebView webView = (android.webkit.WebView) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(webView);
        webView.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void loadUrl(java.lang.Long l17, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        android.webkit.WebView webView = (android.webkit.WebView) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(webView);
        webView.loadUrl(str, map);
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void postUrl(java.lang.Long l17, java.lang.String str, byte[] bArr) {
        android.webkit.WebView webView = (android.webkit.WebView) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(webView);
        webView.postUrl(str, bArr);
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void reload(java.lang.Long l17) {
        android.webkit.WebView webView = (android.webkit.WebView) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(webView);
        webView.reload();
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void removeJavaScriptChannel(java.lang.Long l17, java.lang.Long l18) {
        android.webkit.WebView webView = (android.webkit.WebView) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(webView);
        io.flutter.plugins.webviewflutter.JavaScriptChannel javaScriptChannel = (io.flutter.plugins.webviewflutter.JavaScriptChannel) this.instanceManager.getInstance(l18.longValue());
        java.util.Objects.requireNonNull(javaScriptChannel);
        webView.removeJavascriptInterface(javaScriptChannel.javaScriptChannelName);
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void scrollBy(java.lang.Long l17, java.lang.Long l18, java.lang.Long l19) {
        android.webkit.WebView webView = (android.webkit.WebView) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(webView);
        webView.scrollBy(l18.intValue(), l19.intValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void scrollTo(java.lang.Long l17, java.lang.Long l18, java.lang.Long l19) {
        android.webkit.WebView webView = (android.webkit.WebView) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(webView);
        webView.scrollTo(l18.intValue(), l19.intValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void setBackgroundColor(java.lang.Long l17, java.lang.Long l18) {
        android.webkit.WebView webView = (android.webkit.WebView) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(webView);
        webView.setBackgroundColor(l18.intValue());
    }

    public void setContext(android.content.Context context) {
        this.context = context;
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void setDownloadListener(java.lang.Long l17, java.lang.Long l18) {
        android.webkit.WebView webView = (android.webkit.WebView) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(webView);
        io.flutter.plugins.webviewflutter.InstanceManager instanceManager = this.instanceManager;
        java.util.Objects.requireNonNull(l18);
        webView.setDownloadListener((android.webkit.DownloadListener) instanceManager.getInstance(l18.longValue()));
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void setWebChromeClient(java.lang.Long l17, java.lang.Long l18) {
        android.webkit.WebView webView = (android.webkit.WebView) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(webView);
        io.flutter.plugins.webviewflutter.InstanceManager instanceManager = this.instanceManager;
        java.util.Objects.requireNonNull(l18);
        webView.setWebChromeClient((android.webkit.WebChromeClient) instanceManager.getInstance(l18.longValue()));
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void setWebContentsDebuggingEnabled(java.lang.Boolean bool) {
        this.webViewProxy.setWebContentsDebuggingEnabled(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void setWebViewClient(java.lang.Long l17, java.lang.Long l18) {
        android.webkit.WebView webView = (android.webkit.WebView) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(webView);
        webView.setWebViewClient((android.webkit.WebViewClient) this.instanceManager.getInstance(l18.longValue()));
    }
}
