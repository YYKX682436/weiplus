package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes8.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.webcompt.f1 f187876d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.r f187877e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(com.tencent.mm.plugin.webview.webcompt.f1 f1Var, com.tencent.mm.plugin.appbrand.jsruntime.r rVar) {
        super(1);
        this.f187876d = f1Var;
        this.f187877e = rVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.webview.webcompt.i0 ex6 = (com.tencent.mm.plugin.webview.webcompt.i0) obj;
        kotlin.jvm.internal.o.g(ex6, "ex");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WeixinWebCompt.onError(");
        cl0.g gVar = new cl0.g();
        gVar.o("retCode", ex6.f187824d);
        gVar.h("webComptName", com.tencent.mm.plugin.webview.webcompt.a.c(ex6.f187825e));
        gVar.h("error", com.tencent.mm.plugin.webview.webcompt.a.c(ex6.f187826f));
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        com.tencent.mm.plugin.webview.webcompt.h0 h0Var = com.tencent.mm.plugin.webview.webcompt.f1.f187797e;
        com.tencent.mars.xlog.Log.e("MicroMsg.WebComponent", "CreateJSContextException:".concat(gVar2));
        sb6.append(gVar2);
        sb6.append(')');
        this.f187876d.h(this.f187877e, sb6.toString());
        return jz5.f0.f302826a;
    }
}
