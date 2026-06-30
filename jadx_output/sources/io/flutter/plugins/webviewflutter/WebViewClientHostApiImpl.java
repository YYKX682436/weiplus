package io.flutter.plugins.webviewflutter;

/* loaded from: classes16.dex */
public class WebViewClientHostApiImpl implements io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientHostApi {
    private final io.flutter.plugins.webviewflutter.WebViewClientFlutterApiImpl flutterApi;
    private final io.flutter.plugins.webviewflutter.InstanceManager instanceManager;
    private final io.flutter.plugins.webviewflutter.WebViewClientHostApiImpl.WebViewClientCreator webViewClientCreator;

    /* loaded from: classes16.dex */
    public static class WebViewClientCompatImpl extends androidx.webkit.WebViewClientCompat {
        private final io.flutter.plugins.webviewflutter.WebViewClientFlutterApiImpl flutterApi;
        private boolean returnValueForShouldOverrideUrlLoading = false;

        public WebViewClientCompatImpl(io.flutter.plugins.webviewflutter.WebViewClientFlutterApiImpl webViewClientFlutterApiImpl) {
            this.flutterApi = webViewClientFlutterApiImpl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$doUpdateVisitedHistory$6(java.lang.Void r07) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onPageFinished$1(java.lang.Void r07) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onPageStarted$0(java.lang.Void r07) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onReceivedError$2(java.lang.Void r07) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onReceivedError$3(java.lang.Void r07) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onReceivedHttpAuthRequest$7(java.lang.Void r07) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$shouldOverrideUrlLoading$4(java.lang.Void r07) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$shouldOverrideUrlLoading$5(java.lang.Void r07) {
        }

        @Override // android.webkit.WebViewClient
        public void doUpdateVisitedHistory(android.webkit.WebView webView, java.lang.String str, boolean z17) {
            this.flutterApi.doUpdateVisitedHistory(this, webView, str, z17, new io.flutter.plugins.webviewflutter.WebViewClientHostApiImpl$WebViewClientCompatImpl$$b());
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
            this.flutterApi.onPageFinished(this, webView, str, new io.flutter.plugins.webviewflutter.WebViewClientHostApiImpl$WebViewClientCompatImpl$$c());
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
            this.flutterApi.onPageStarted(this, webView, str, new io.flutter.plugins.webviewflutter.WebViewClientHostApiImpl$WebViewClientCompatImpl$$h());
        }

        @Override // androidx.webkit.WebViewClientCompat
        public void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, y4.k kVar) {
            this.flutterApi.onReceivedRequestError(this, webView, webResourceRequest, kVar, new io.flutter.plugins.webviewflutter.WebViewClientHostApiImpl$WebViewClientCompatImpl$$d());
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(android.webkit.WebView webView, android.webkit.HttpAuthHandler httpAuthHandler, java.lang.String str, java.lang.String str2) {
            this.flutterApi.onReceivedHttpAuthRequest(this, webView, httpAuthHandler, str, str2, new io.flutter.plugins.webviewflutter.WebViewClientHostApiImpl$WebViewClientCompatImpl$$a());
        }

        @Override // android.webkit.WebViewClient
        public void onUnhandledKeyEvent(android.webkit.WebView webView, android.view.KeyEvent keyEvent) {
        }

        public void setReturnValueForShouldOverrideUrlLoading(boolean z17) {
            this.returnValueForShouldOverrideUrlLoading = z17;
        }

        @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
            this.flutterApi.requestLoading(this, webView, webResourceRequest, new io.flutter.plugins.webviewflutter.WebViewClientHostApiImpl$WebViewClientCompatImpl$$f());
            return this.returnValueForShouldOverrideUrlLoading;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(android.webkit.WebView webView, int i17, java.lang.String str, java.lang.String str2) {
            this.flutterApi.onReceivedError(this, webView, java.lang.Long.valueOf(i17), str, str2, new io.flutter.plugins.webviewflutter.WebViewClientHostApiImpl$WebViewClientCompatImpl$$g());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
            this.flutterApi.urlLoading(this, webView, str, new io.flutter.plugins.webviewflutter.WebViewClientHostApiImpl$WebViewClientCompatImpl$$e());
            return this.returnValueForShouldOverrideUrlLoading;
        }
    }

    /* loaded from: classes16.dex */
    public static class WebViewClientCreator {
        public android.webkit.WebViewClient createWebViewClient(io.flutter.plugins.webviewflutter.WebViewClientFlutterApiImpl webViewClientFlutterApiImpl) {
            return new io.flutter.plugins.webviewflutter.WebViewClientHostApiImpl.WebViewClientImpl(webViewClientFlutterApiImpl);
        }
    }

    /* loaded from: classes16.dex */
    public static class WebViewClientImpl extends android.webkit.WebViewClient {
        private final io.flutter.plugins.webviewflutter.WebViewClientFlutterApiImpl flutterApi;
        private boolean returnValueForShouldOverrideUrlLoading = false;

        public WebViewClientImpl(io.flutter.plugins.webviewflutter.WebViewClientFlutterApiImpl webViewClientFlutterApiImpl) {
            this.flutterApi = webViewClientFlutterApiImpl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$doUpdateVisitedHistory$6(java.lang.Void r07) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onPageFinished$1(java.lang.Void r07) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onPageStarted$0(java.lang.Void r07) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onReceivedError$2(java.lang.Void r07) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onReceivedError$3(java.lang.Void r07) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onReceivedHttpAuthRequest$7(java.lang.Void r07) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$shouldOverrideUrlLoading$4(java.lang.Void r07) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$shouldOverrideUrlLoading$5(java.lang.Void r07) {
        }

        @Override // android.webkit.WebViewClient
        public void doUpdateVisitedHistory(android.webkit.WebView webView, java.lang.String str, boolean z17) {
            this.flutterApi.doUpdateVisitedHistory(this, webView, str, z17, new io.flutter.plugins.webviewflutter.WebViewClientHostApiImpl$WebViewClientImpl$$c());
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
            this.flutterApi.onPageFinished(this, webView, str, new io.flutter.plugins.webviewflutter.WebViewClientHostApiImpl$WebViewClientImpl$$b());
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
            this.flutterApi.onPageStarted(this, webView, str, new io.flutter.plugins.webviewflutter.WebViewClientHostApiImpl$WebViewClientImpl$$a());
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
            this.flutterApi.onReceivedRequestError(this, webView, webResourceRequest, webResourceError, new io.flutter.plugins.webviewflutter.WebViewClientHostApiImpl$WebViewClientImpl$$g());
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(android.webkit.WebView webView, android.webkit.HttpAuthHandler httpAuthHandler, java.lang.String str, java.lang.String str2) {
            this.flutterApi.onReceivedHttpAuthRequest(this, webView, httpAuthHandler, str, str2, new io.flutter.plugins.webviewflutter.WebViewClientHostApiImpl$WebViewClientImpl$$h());
        }

        @Override // android.webkit.WebViewClient
        public void onUnhandledKeyEvent(android.webkit.WebView webView, android.view.KeyEvent keyEvent) {
        }

        public void setReturnValueForShouldOverrideUrlLoading(boolean z17) {
            this.returnValueForShouldOverrideUrlLoading = z17;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
            this.flutterApi.requestLoading(this, webView, webResourceRequest, new io.flutter.plugins.webviewflutter.WebViewClientHostApiImpl$WebViewClientImpl$$f());
            return this.returnValueForShouldOverrideUrlLoading;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(android.webkit.WebView webView, int i17, java.lang.String str, java.lang.String str2) {
            this.flutterApi.onReceivedError(this, webView, java.lang.Long.valueOf(i17), str, str2, new io.flutter.plugins.webviewflutter.WebViewClientHostApiImpl$WebViewClientImpl$$d());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
            this.flutterApi.urlLoading(this, webView, str, new io.flutter.plugins.webviewflutter.WebViewClientHostApiImpl$WebViewClientImpl$$e());
            return this.returnValueForShouldOverrideUrlLoading;
        }
    }

    public WebViewClientHostApiImpl(io.flutter.plugins.webviewflutter.InstanceManager instanceManager, io.flutter.plugins.webviewflutter.WebViewClientHostApiImpl.WebViewClientCreator webViewClientCreator, io.flutter.plugins.webviewflutter.WebViewClientFlutterApiImpl webViewClientFlutterApiImpl) {
        this.instanceManager = instanceManager;
        this.webViewClientCreator = webViewClientCreator;
        this.flutterApi = webViewClientFlutterApiImpl;
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientHostApi
    public void create(java.lang.Long l17) {
        this.instanceManager.addDartCreatedInstance(this.webViewClientCreator.createWebViewClient(this.flutterApi), l17.longValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientHostApi
    public void setSynchronousReturnValueForShouldOverrideUrlLoading(java.lang.Long l17, java.lang.Boolean bool) {
        android.webkit.WebViewClient webViewClient = (android.webkit.WebViewClient) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(webViewClient);
        if (webViewClient instanceof io.flutter.plugins.webviewflutter.WebViewClientHostApiImpl.WebViewClientCompatImpl) {
            ((io.flutter.plugins.webviewflutter.WebViewClientHostApiImpl.WebViewClientCompatImpl) webViewClient).setReturnValueForShouldOverrideUrlLoading(bool.booleanValue());
        } else {
            if (!(webViewClient instanceof io.flutter.plugins.webviewflutter.WebViewClientHostApiImpl.WebViewClientImpl)) {
                throw new java.lang.IllegalStateException("This WebViewClient doesn't support setting the returnValueForShouldOverrideUrlLoading.");
            }
            ((io.flutter.plugins.webviewflutter.WebViewClientHostApiImpl.WebViewClientImpl) webViewClient).setReturnValueForShouldOverrideUrlLoading(bool.booleanValue());
        }
    }
}
