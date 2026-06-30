package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public abstract class i3 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.core.r0 f181851a;

    public int a(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        return -1;
    }

    public com.tencent.mm.plugin.webview.core.o1 b() {
        return null;
    }

    public final com.tencent.mm.plugin.webview.core.r0 c() {
        com.tencent.mm.plugin.webview.core.r0 r0Var = this.f181851a;
        if (r0Var != null) {
            return r0Var;
        }
        kotlin.jvm.internal.o.o("controller");
        throw null;
    }

    public com.tencent.mm.plugin.webview.core.f3 d() {
        return null;
    }

    public int e() {
        return -1;
    }

    public com.tencent.xweb.y0 f(com.tencent.xweb.WebView webview, com.tencent.xweb.x0 request) {
        kotlin.jvm.internal.o.g(webview, "webview");
        kotlin.jvm.internal.o.g(request, "request");
        return null;
    }

    public boolean g(com.tencent.xweb.WebView webview, int i17, java.lang.String description, java.lang.String failingUrl) {
        kotlin.jvm.internal.o.g(webview, "webview");
        kotlin.jvm.internal.o.g(description, "description");
        kotlin.jvm.internal.o.g(failingUrl, "failingUrl");
        return false;
    }

    public void h() {
    }

    public boolean i() {
        return false;
    }

    public boolean j(java.lang.String url, boolean z17, int i17) {
        kotlin.jvm.internal.o.g(url, "url");
        return false;
    }

    public boolean k(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        return true;
    }

    public boolean l(int i17, java.lang.String reqUrl, r45.s83 resp) {
        kotlin.jvm.internal.o.g(reqUrl, "reqUrl");
        kotlin.jvm.internal.o.g(resp, "resp");
        return false;
    }

    public boolean m(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        return false;
    }

    public boolean n() {
        return false;
    }

    public boolean o(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        return false;
    }

    public boolean p(java.lang.String url, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(url, "url");
        return false;
    }

    public com.tencent.mm.plugin.webview.core.h3 q(com.tencent.xweb.WebView webView, com.tencent.xweb.x0 request) {
        kotlin.jvm.internal.o.g(webView, "webView");
        kotlin.jvm.internal.o.g(request, "request");
        return new com.tencent.mm.plugin.webview.core.h3(false, false);
    }

    public com.tencent.mm.plugin.webview.core.h3 r(com.tencent.xweb.WebView webView, java.lang.String url) {
        kotlin.jvm.internal.o.g(webView, "webView");
        kotlin.jvm.internal.o.g(url, "url");
        return new com.tencent.mm.plugin.webview.core.h3(false, false);
    }

    public boolean s(int i17, boolean z17, java.lang.String reqUrl, java.lang.String fullUrl) {
        kotlin.jvm.internal.o.g(reqUrl, "reqUrl");
        kotlin.jvm.internal.o.g(fullUrl, "fullUrl");
        return false;
    }

    public boolean t() {
        return false;
    }

    public boolean u() {
        return false;
    }
}
