package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes8.dex */
public final class a1 implements com.tencent.mm.plugin.webview.permission.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f187739a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.permission.d f187740b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.webcompt.f1 f187741c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187742d;

    public a1(kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.webview.permission.d dVar, com.tencent.mm.plugin.webview.webcompt.f1 f1Var, java.lang.String str) {
        this.f187739a = continuation;
        this.f187740b = dVar;
        this.f187741c = f1Var;
        this.f187742d = str;
    }

    @Override // com.tencent.mm.plugin.webview.permission.a
    public void a(int i17, java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.mm.plugin.webview.permission.a
    public void c(int i17, java.lang.String reqUrl, int i18, int i19, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(reqUrl, "reqUrl");
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f187739a.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new com.tencent.mm.plugin.webview.webcompt.i0(20001, this.f187742d, "getA8Key error:" + i18 + ", " + i19 + ", " + errMsg))));
        this.f187741c.f187812b.a(com.tencent.mm.plugin.webview.webcompt.b.f187762z);
    }

    @Override // com.tencent.mm.plugin.webview.permission.a
    public void d(int i17, java.lang.String reqUrl) {
        kotlin.jvm.internal.o.g(reqUrl, "reqUrl");
    }

    @Override // com.tencent.mm.plugin.webview.permission.a
    public void e(int i17, java.lang.String reqUrl, java.lang.String fullUrl, java.lang.Object obj) {
        r45.s83 response = (r45.s83) obj;
        kotlin.jvm.internal.o.g(reqUrl, "reqUrl");
        kotlin.jvm.internal.o.g(fullUrl, "fullUrl");
        kotlin.jvm.internal.o.g(response, "response");
    }

    @Override // com.tencent.mm.plugin.webview.permission.a
    public void f(int i17, java.lang.String reqUrl) {
        kotlin.jvm.internal.o.g(reqUrl, "reqUrl");
    }

    @Override // com.tencent.mm.plugin.webview.permission.a
    public boolean g(int i17, java.lang.String reqUrl, java.lang.Object obj) {
        r45.s83 response = (r45.s83) obj;
        kotlin.jvm.internal.o.g(reqUrl, "reqUrl");
        kotlin.jvm.internal.o.g(response, "response");
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.permission.a
    public void h(int i17, boolean z17, java.lang.String reqUrl, java.lang.String fullUrl, java.lang.Object obj) {
        r45.s83 response = (r45.s83) obj;
        kotlin.jvm.internal.o.g(reqUrl, "reqUrl");
        kotlin.jvm.internal.o.g(fullUrl, "fullUrl");
        kotlin.jvm.internal.o.g(response, "response");
        com.tencent.mm.plugin.webview.webcompt.h0 h0Var = com.tencent.mm.plugin.webview.webcompt.f1.f187797e;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebComponent", "finish geta8key:".concat(fullUrl));
        java.util.LinkedList<r45.rx3> HttpHeader = response.f385562x;
        kotlin.jvm.internal.o.f(HttpHeader, "HttpHeader");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(HttpHeader, 10));
        for (r45.rx3 rx3Var : HttpHeader) {
            arrayList.add(new jz5.l(rx3Var.f385272d, rx3Var.f385273e));
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        kz5.c1.r(arrayList, hashMap);
        this.f187739a.resumeWith(kotlin.Result.m521constructorimpl(new com.tencent.mm.plugin.webview.webcompt.c(this.f187740b, fullUrl, hashMap)));
        this.f187741c.f187812b.a(com.tencent.mm.plugin.webview.webcompt.b.f187761y);
    }
}
