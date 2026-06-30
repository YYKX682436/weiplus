package com.tencent.xweb.sys;

/* loaded from: classes13.dex */
public class a implements tx5.b {

    /* renamed from: a, reason: collision with root package name */
    public final android.webkit.CookieManager f220544a;

    public a() {
        by5.c4.c("SysCookieManagerWrapper", "SysCookieManagerWrapper, Default.");
        try {
            this.f220544a = android.webkit.CookieManager.getInstance();
        } catch (java.lang.Exception e17) {
            java.lang.String stackTraceString = android.util.Log.getStackTraceString(e17);
            by5.c4.g("SysCookieManagerWrapper", "Create sys cookie manager failed." + stackTraceString);
            xx5.g.a(4, stackTraceString, 3, java.lang.String.valueOf(by5.e.d()));
        }
    }

    @Override // tx5.b
    public java.lang.String a(java.lang.String str) {
        android.webkit.CookieManager cookieManager = this.f220544a;
        return cookieManager == null ? "" : cookieManager.getCookie(str);
    }

    @Override // tx5.b
    public void b(java.lang.String str, java.lang.String str2) {
        android.webkit.CookieManager cookieManager = this.f220544a;
        if (cookieManager == null) {
            return;
        }
        cookieManager.setCookie(str, str2);
    }

    @Override // tx5.b
    public void c() {
        android.webkit.CookieManager cookieManager = this.f220544a;
        if (cookieManager == null) {
            return;
        }
        cookieManager.removeSessionCookie();
    }

    @Override // tx5.b
    public void d(boolean z17) {
        android.webkit.CookieManager cookieManager = this.f220544a;
        if (cookieManager == null) {
            return;
        }
        cookieManager.setAcceptCookie(z17);
    }

    @Override // tx5.b
    public void e() {
        android.webkit.CookieManager cookieManager = this.f220544a;
        if (cookieManager == null) {
            return;
        }
        cookieManager.removeAllCookie();
    }

    @Override // tx5.b
    public void f(com.tencent.xweb.WebView webView, boolean z17) {
        android.webkit.CookieManager cookieManager = this.f220544a;
        if (cookieManager == null) {
            return;
        }
        if (webView == null || webView.getWebViewUI() == null || !(webView.getWebViewUI() instanceof android.webkit.WebView)) {
            by5.c4.c("SysCookieManagerWrapper", "setAcceptThirdPartyCookies, webview kind not match");
        } else {
            cookieManager.setAcceptThirdPartyCookies((android.webkit.WebView) webView.getWebViewUI(), z17);
        }
    }

    @Override // tx5.b
    public void flush() {
        android.webkit.CookieManager cookieManager = this.f220544a;
        if (cookieManager == null) {
            return;
        }
        cookieManager.flush();
    }

    public a(android.webkit.CookieManager cookieManager) {
        this.f220544a = cookieManager;
    }
}
