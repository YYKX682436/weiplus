package com.tencent.mm.plugin.webview.permission;

/* loaded from: classes8.dex */
public class s implements com.tencent.mm.plugin.webview.permission.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f183455a;

    public s(java.lang.ref.WeakReference weakAuthCallback) {
        kotlin.jvm.internal.o.g(weakAuthCallback, "weakAuthCallback");
        this.f183455a = weakAuthCallback;
    }

    @Override // com.tencent.mm.plugin.webview.permission.a
    public void a(int i17, java.lang.String str, java.lang.String str2) {
        pm0.v.X(new com.tencent.mm.plugin.webview.permission.o(this, i17, str, str2));
    }

    @Override // com.tencent.mm.plugin.webview.permission.a
    public void c(int i17, java.lang.String reqUrl, int i18, int i19, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(reqUrl, "reqUrl");
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        pm0.v.X(new com.tencent.mm.plugin.webview.permission.p(this, i17, reqUrl, i18, i19, errMsg));
    }

    @Override // com.tencent.mm.plugin.webview.permission.a
    public void d(int i17, java.lang.String reqUrl) {
        kotlin.jvm.internal.o.g(reqUrl, "reqUrl");
        pm0.v.X(new com.tencent.mm.plugin.webview.permission.n(this, i17, reqUrl));
    }

    @Override // com.tencent.mm.plugin.webview.permission.a
    public void e(int i17, java.lang.String reqUrl, java.lang.String fullUrl, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(reqUrl, "reqUrl");
        kotlin.jvm.internal.o.g(fullUrl, "fullUrl");
        pm0.v.X(new com.tencent.mm.plugin.webview.permission.q(this, i17, reqUrl, fullUrl, obj));
    }

    @Override // com.tencent.mm.plugin.webview.permission.a
    public void f(int i17, java.lang.String reqUrl) {
        kotlin.jvm.internal.o.g(reqUrl, "reqUrl");
        pm0.v.X(new com.tencent.mm.plugin.webview.permission.m(this, i17, reqUrl));
    }

    @Override // com.tencent.mm.plugin.webview.permission.a
    public boolean g(int i17, java.lang.String reqUrl, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(reqUrl, "reqUrl");
        com.tencent.mm.plugin.webview.permission.a aVar = (com.tencent.mm.plugin.webview.permission.a) this.f183455a.get();
        return aVar != null && aVar.g(i17, reqUrl, obj);
    }

    @Override // com.tencent.mm.plugin.webview.permission.a
    public void h(int i17, boolean z17, java.lang.String reqUrl, java.lang.String fullUrl, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(reqUrl, "reqUrl");
        kotlin.jvm.internal.o.g(fullUrl, "fullUrl");
        pm0.v.X(new com.tencent.mm.plugin.webview.permission.r(this, i17, z17, reqUrl, fullUrl, obj));
    }
}
