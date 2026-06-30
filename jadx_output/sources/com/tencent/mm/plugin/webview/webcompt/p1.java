package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes8.dex */
public final class p1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.webcompt.r1 f187878d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(com.tencent.mm.plugin.webview.webcompt.r1 r1Var) {
        super(1);
        this.f187878d = r1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.webview.webcompt.i0 ex6 = (com.tencent.mm.plugin.webview.webcompt.i0) obj;
        kotlin.jvm.internal.o.g(ex6, "ex");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WeixinWebCompt.onError({retCode: 20002, webComptName:");
        com.tencent.mm.plugin.webview.webcompt.r1 r1Var = this.f187878d;
        sb6.append(com.tencent.mm.plugin.webview.webcompt.a.c(r1Var.f187895b));
        sb6.append(", error:'refresh a8key failed'})");
        com.tencent.mm.plugin.webview.webcompt.r1.a(r1Var, sb6.toString());
        return jz5.f0.f302826a;
    }
}
