package io.flutter.plugins.webviewflutter;

/* loaded from: classes16.dex */
public class WebViewClientFlutterApiImpl extends io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi {
    private final io.flutter.plugin.common.BinaryMessenger binaryMessenger;
    private final io.flutter.plugins.webviewflutter.InstanceManager instanceManager;
    private final io.flutter.plugins.webviewflutter.WebViewFlutterApiImpl webViewFlutterApi;

    public WebViewClientFlutterApiImpl(io.flutter.plugin.common.BinaryMessenger binaryMessenger, io.flutter.plugins.webviewflutter.InstanceManager instanceManager) {
        super(binaryMessenger);
        this.binaryMessenger = binaryMessenger;
        this.instanceManager = instanceManager;
        this.webViewFlutterApi = new io.flutter.plugins.webviewflutter.WebViewFlutterApiImpl(binaryMessenger, instanceManager);
    }

    public static io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebResourceErrorData createWebResourceErrorData(android.webkit.WebResourceError webResourceError) {
        return new io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebResourceErrorData.Builder().setErrorCode(java.lang.Long.valueOf(webResourceError.getErrorCode())).setDescription(webResourceError.getDescription().toString()).build();
    }

    public static io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebResourceRequestData createWebResourceRequestData(android.webkit.WebResourceRequest webResourceRequest) {
        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebResourceRequestData.Builder requestHeaders = new io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebResourceRequestData.Builder().setUrl(webResourceRequest.getUrl().toString()).setIsForMainFrame(java.lang.Boolean.valueOf(webResourceRequest.isForMainFrame())).setHasGesture(java.lang.Boolean.valueOf(webResourceRequest.hasGesture())).setMethod(webResourceRequest.getMethod()).setRequestHeaders(webResourceRequest.getRequestHeaders() != null ? webResourceRequest.getRequestHeaders() : new java.util.HashMap<>());
        requestHeaders.setIsRedirect(java.lang.Boolean.valueOf(webResourceRequest.isRedirect()));
        return requestHeaders.build();
    }

    private long getIdentifierForClient(android.webkit.WebViewClient webViewClient) {
        java.lang.Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webViewClient);
        if (identifierForStrongReference != null) {
            return identifierForStrongReference.longValue();
        }
        throw new java.lang.IllegalStateException("Could not find identifier for WebViewClient.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$doUpdateVisitedHistory$7(java.lang.Void r07) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onPageFinished$1(java.lang.Void r07) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onPageStarted$0(java.lang.Void r07) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onReceivedError$4(java.lang.Void r07) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onReceivedHttpAuthRequest$8(java.lang.Void r07) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onReceivedRequestError$2(java.lang.Void r07) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onReceivedRequestError$3(java.lang.Void r07) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$requestLoading$5(java.lang.Void r07) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$urlLoading$6(java.lang.Void r07) {
    }

    public void doUpdateVisitedHistory(android.webkit.WebViewClient webViewClient, android.webkit.WebView webView, java.lang.String str, boolean z17, io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<java.lang.Void> reply) {
        this.webViewFlutterApi.create(webView, new io.flutter.plugins.webviewflutter.WebViewClientFlutterApiImpl$$b());
        java.lang.Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webView);
        java.util.Objects.requireNonNull(identifierForStrongReference);
        doUpdateVisitedHistory(java.lang.Long.valueOf(getIdentifierForClient(webViewClient)), identifierForStrongReference, str, java.lang.Boolean.valueOf(z17), reply);
    }

    public void onPageFinished(android.webkit.WebViewClient webViewClient, android.webkit.WebView webView, java.lang.String str, io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<java.lang.Void> reply) {
        this.webViewFlutterApi.create(webView, new io.flutter.plugins.webviewflutter.WebViewClientFlutterApiImpl$$h());
        java.lang.Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webView);
        java.util.Objects.requireNonNull(identifierForStrongReference);
        onPageFinished(java.lang.Long.valueOf(getIdentifierForClient(webViewClient)), identifierForStrongReference, str, reply);
    }

    public void onPageStarted(android.webkit.WebViewClient webViewClient, android.webkit.WebView webView, java.lang.String str, io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<java.lang.Void> reply) {
        this.webViewFlutterApi.create(webView, new io.flutter.plugins.webviewflutter.WebViewClientFlutterApiImpl$$d());
        java.lang.Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webView);
        java.util.Objects.requireNonNull(identifierForStrongReference);
        onPageStarted(java.lang.Long.valueOf(getIdentifierForClient(webViewClient)), identifierForStrongReference, str, reply);
    }

    public void onReceivedError(android.webkit.WebViewClient webViewClient, android.webkit.WebView webView, java.lang.Long l17, java.lang.String str, java.lang.String str2, io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<java.lang.Void> reply) {
        this.webViewFlutterApi.create(webView, new io.flutter.plugins.webviewflutter.WebViewClientFlutterApiImpl$$e());
        java.lang.Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webView);
        java.util.Objects.requireNonNull(identifierForStrongReference);
        onReceivedError(java.lang.Long.valueOf(getIdentifierForClient(webViewClient)), identifierForStrongReference, l17, str, str2, reply);
    }

    public void onReceivedHttpAuthRequest(android.webkit.WebViewClient webViewClient, android.webkit.WebView webView, android.webkit.HttpAuthHandler httpAuthHandler, java.lang.String str, java.lang.String str2, io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<java.lang.Void> reply) {
        new io.flutter.plugins.webviewflutter.HttpAuthHandlerFlutterApiImpl(this.binaryMessenger, this.instanceManager).create(httpAuthHandler, new io.flutter.plugins.webviewflutter.WebViewClientFlutterApiImpl$$c());
        java.lang.Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webViewClient);
        java.util.Objects.requireNonNull(identifierForStrongReference);
        java.lang.Long identifierForStrongReference2 = this.instanceManager.getIdentifierForStrongReference(webView);
        java.util.Objects.requireNonNull(identifierForStrongReference2);
        java.lang.Long identifierForStrongReference3 = this.instanceManager.getIdentifierForStrongReference(httpAuthHandler);
        java.util.Objects.requireNonNull(identifierForStrongReference3);
        onReceivedHttpAuthRequest(identifierForStrongReference, identifierForStrongReference2, identifierForStrongReference3, str, str2, reply);
    }

    public void onReceivedRequestError(android.webkit.WebViewClient webViewClient, android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError, io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<java.lang.Void> reply) {
        this.webViewFlutterApi.create(webView, new io.flutter.plugins.webviewflutter.WebViewClientFlutterApiImpl$$g());
        java.lang.Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webView);
        java.util.Objects.requireNonNull(identifierForStrongReference);
        onReceivedRequestError(java.lang.Long.valueOf(getIdentifierForClient(webViewClient)), identifierForStrongReference, createWebResourceRequestData(webResourceRequest), createWebResourceErrorData(webResourceError), reply);
    }

    public void requestLoading(android.webkit.WebViewClient webViewClient, android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<java.lang.Void> reply) {
        this.webViewFlutterApi.create(webView, new io.flutter.plugins.webviewflutter.WebViewClientFlutterApiImpl$$a());
        java.lang.Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webView);
        java.util.Objects.requireNonNull(identifierForStrongReference);
        requestLoading(java.lang.Long.valueOf(getIdentifierForClient(webViewClient)), identifierForStrongReference, createWebResourceRequestData(webResourceRequest), reply);
    }

    public void urlLoading(android.webkit.WebViewClient webViewClient, android.webkit.WebView webView, java.lang.String str, io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<java.lang.Void> reply) {
        this.webViewFlutterApi.create(webView, new io.flutter.plugins.webviewflutter.WebViewClientFlutterApiImpl$$f());
        java.lang.Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webView);
        java.util.Objects.requireNonNull(identifierForStrongReference);
        urlLoading(java.lang.Long.valueOf(getIdentifierForClient(webViewClient)), identifierForStrongReference, str, reply);
    }

    public static io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebResourceErrorData createWebResourceErrorData(y4.k kVar) {
        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebResourceErrorData.Builder builder = new io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebResourceErrorData.Builder();
        z4.b0 b0Var = (z4.b0) kVar;
        b0Var.getClass();
        z4.e0.f470060b.getClass();
        if (b0Var.f470056a == null) {
            b0Var.f470056a = (android.webkit.WebResourceError) z4.f0.f470066a.f470072a.convertWebResourceError(java.lang.reflect.Proxy.getInvocationHandler(b0Var.f470057b));
        }
        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebResourceErrorData.Builder errorCode = builder.setErrorCode(java.lang.Long.valueOf(z4.n.f(b0Var.f470056a)));
        z4.e0.f470059a.getClass();
        if (b0Var.f470056a == null) {
            b0Var.f470056a = (android.webkit.WebResourceError) z4.f0.f470066a.f470072a.convertWebResourceError(java.lang.reflect.Proxy.getInvocationHandler(b0Var.f470057b));
        }
        return errorCode.setDescription(z4.n.e(b0Var.f470056a).toString()).build();
    }

    public void onReceivedRequestError(android.webkit.WebViewClient webViewClient, android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, y4.k kVar, io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<java.lang.Void> reply) {
        this.webViewFlutterApi.create(webView, new io.flutter.plugins.webviewflutter.WebViewClientFlutterApiImpl$$i());
        java.lang.Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webView);
        java.util.Objects.requireNonNull(identifierForStrongReference);
        onReceivedRequestError(java.lang.Long.valueOf(getIdentifierForClient(webViewClient)), identifierForStrongReference, createWebResourceRequestData(webResourceRequest), createWebResourceErrorData(kVar), reply);
    }
}
