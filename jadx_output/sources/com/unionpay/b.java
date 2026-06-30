package com.unionpay;

/* loaded from: classes13.dex */
public class b implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final android.webkit.WebView f220700d;

    /* renamed from: e, reason: collision with root package name */
    public final android.app.Activity f220701e;

    /* renamed from: h, reason: collision with root package name */
    public boolean f220704h = false;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f220702f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f220703g = new java.util.HashMap();

    public b(android.app.Activity activity, android.webkit.WebView webView, com.unionpay.f fVar) {
        this.f220701e = activity;
        this.f220700d = webView;
        android.webkit.WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setAllowFileAccess(false);
        settings.setDomStorageEnabled(true);
        try {
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
        } catch (java.lang.Throwable unused) {
        }
        this.f220700d.addJavascriptInterface(this, "_WebViewJavascriptBridge");
        this.f220700d.setWebViewClient(new com.unionpay.e(this, (byte) 0));
        this.f220700d.setWebChromeClient(new com.unionpay.ab(this, (byte) 0));
    }

    @android.webkit.JavascriptInterface
    public void _handleMessageFromJs(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        if (str2 != null) {
            java.util.HashMap hashMap = (java.util.HashMap) this.f220703g;
            ((com.unionpay.d) ((com.unionpay.g) hashMap.get(str2))).a(str3);
            hashMap.remove(str2);
            return;
        }
        com.unionpay.f fVar = null;
        com.unionpay.d dVar = str4 != null ? new com.unionpay.d(this, str4) : null;
        if (str5 != null && (fVar = (com.unionpay.f) ((java.util.HashMap) this.f220702f).get(str5)) == null) {
            "WVJB Warning: No handler for ".concat(str5);
            return;
        }
        try {
            this.f220701e.runOnUiThread(new com.unionpay.c0(this, fVar, str, dVar));
        } catch (java.lang.Exception e17) {
            e17.getMessage();
        }
    }

    public void a(java.lang.String str, com.unionpay.f fVar) {
        ((java.util.HashMap) this.f220702f).put(str, fVar);
    }
}
