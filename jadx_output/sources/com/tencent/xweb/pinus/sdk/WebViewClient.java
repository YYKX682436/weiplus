package com.tencent.xweb.pinus.sdk;

/* loaded from: classes13.dex */
public class WebViewClient {
    public static final int ERROR_AUTHENTICATION = -4;
    public static final int ERROR_BAD_URL = -12;
    public static final int ERROR_CONNECT = -6;
    public static final int ERROR_FAILED_SSL_HANDSHAKE = -11;
    public static final int ERROR_FILE = -13;
    public static final int ERROR_FILE_NOT_FOUND = -14;
    public static final int ERROR_HOST_LOOKUP = -2;
    public static final int ERROR_IO = -7;
    public static final int ERROR_PROXY_AUTHENTICATION = -5;
    public static final int ERROR_REDIRECT_LOOP = -9;
    public static final int ERROR_TIMEOUT = -8;
    public static final int ERROR_TOO_MANY_REQUESTS = -15;
    public static final int ERROR_UNKNOWN = -1;
    public static final int ERROR_UNSAFE_RESOURCE = -16;
    public static final int ERROR_UNSUPPORTED_AUTH_SCHEME = -3;
    public static final int ERROR_UNSUPPORTED_SCHEME = -10;
    public static final int SAFE_BROWSING_THREAT_BILLING = 4;
    public static final int SAFE_BROWSING_THREAT_MALWARE = 1;
    public static final int SAFE_BROWSING_THREAT_PHISHING = 2;
    public static final int SAFE_BROWSING_THREAT_UNKNOWN = 0;
    public static final int SAFE_BROWSING_THREAT_UNWANTED_SOFTWARE = 3;

    private void onReceivedError2(com.tencent.xweb.pinus.sdk.WebView webView, android.webkit.WebResourceRequest webResourceRequest, java.lang.Object obj) {
        onReceivedError(webView, webResourceRequest, new com.tencent.xweb.pinus.sdk.t(obj));
    }

    private void onReceivedHttpAuthRequestInner(com.tencent.xweb.pinus.sdk.WebView webView, java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        onReceivedHttpAuthRequest(webView, new com.tencent.xweb.pinus.sdk.h(obj), str, str2);
    }

    private void onReceivedSslErrorInner(com.tencent.xweb.pinus.sdk.WebView webView, java.lang.Object obj, android.net.http.SslError sslError) {
        onReceivedSslError(webView, new com.tencent.xweb.pinus.sdk.r(obj), sslError);
    }

    public void doUpdateVisitedHistory(com.tencent.xweb.pinus.sdk.WebView webView, java.lang.String str, boolean z17) {
    }

    public void onFormResubmission(com.tencent.xweb.pinus.sdk.WebView webView, android.os.Message message, android.os.Message message2) {
        message.sendToTarget();
    }

    public void onLoadResource(com.tencent.xweb.pinus.sdk.WebView webView, java.lang.String str) {
    }

    public void onPageCommitVisible(com.tencent.xweb.pinus.sdk.WebView webView, java.lang.String str) {
    }

    public void onPageFinished(com.tencent.xweb.pinus.sdk.WebView webView, java.lang.String str) {
    }

    public void onPageStarted(com.tencent.xweb.pinus.sdk.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
    }

    public void onReceivedClientCertRequest(com.tencent.xweb.pinus.sdk.WebView webView, android.webkit.ClientCertRequest clientCertRequest) {
        clientCertRequest.cancel();
    }

    public void onReceivedError(com.tencent.xweb.pinus.sdk.WebView webView, int i17, java.lang.String str, java.lang.String str2) {
    }

    public void onReceivedHttpAuthRequest(com.tencent.xweb.pinus.sdk.WebView webView, com.tencent.xweb.pinus.sdk.g gVar, java.lang.String str, java.lang.String str2) {
        ((com.tencent.xweb.pinus.sdk.h) gVar).a();
    }

    public void onReceivedHttpError(com.tencent.xweb.pinus.sdk.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
    }

    public void onReceivedLoginRequest(com.tencent.xweb.pinus.sdk.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3) {
    }

    public void onReceivedSslError(com.tencent.xweb.pinus.sdk.WebView webView, com.tencent.xweb.pinus.sdk.q qVar, android.net.http.SslError sslError) {
        ((com.tencent.xweb.pinus.sdk.r) qVar).a();
    }

    public boolean onRenderProcessGone(com.tencent.xweb.pinus.sdk.WebView webView, com.tencent.xweb.j0 j0Var) {
        return true;
    }

    public boolean onRenderProcessGoneInner(com.tencent.xweb.pinus.sdk.WebView webView, boolean z17, int i17) {
        return onRenderProcessGone(webView, new com.tencent.xweb.pinus.sdk.c0(this, z17, i17));
    }

    public void onScaleChanged(com.tencent.xweb.pinus.sdk.WebView webView, float f17, float f18) {
    }

    @java.lang.Deprecated
    public void onTooManyRedirects(com.tencent.xweb.pinus.sdk.WebView webView, android.os.Message message, android.os.Message message2) {
        message.sendToTarget();
    }

    public void onUnhandledInputEvent(com.tencent.xweb.pinus.sdk.WebView webView, android.view.InputEvent inputEvent) {
        if (inputEvent instanceof android.view.KeyEvent) {
            onUnhandledKeyEvent(webView, (android.view.KeyEvent) inputEvent);
        }
    }

    public void onUnhandledKeyEvent(com.tencent.xweb.pinus.sdk.WebView webView, android.view.KeyEvent keyEvent) {
    }

    public android.webkit.WebResourceResponse shouldInterceptRequest(com.tencent.xweb.pinus.sdk.WebView webView, java.lang.String str) {
        return null;
    }

    public boolean shouldOverrideKeyEvent(com.tencent.xweb.pinus.sdk.WebView webView, android.view.KeyEvent keyEvent) {
        return false;
    }

    @java.lang.Deprecated
    public boolean shouldOverrideUrlLoading(com.tencent.xweb.pinus.sdk.WebView webView, java.lang.String str) {
        return false;
    }

    public void onReceivedError(com.tencent.xweb.pinus.sdk.WebView webView, android.webkit.WebResourceRequest webResourceRequest, com.tencent.xweb.pinus.sdk.s sVar) {
    }

    public android.webkit.WebResourceResponse shouldInterceptRequest(com.tencent.xweb.pinus.sdk.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
    }

    public boolean shouldOverrideUrlLoading(com.tencent.xweb.pinus.sdk.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }
}
