package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes8.dex */
public final class q1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.webcompt.r1 f187885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187886e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(com.tencent.mm.plugin.webview.webcompt.r1 r1Var, java.lang.String str) {
        super(1);
        this.f187885d = r1Var;
        this.f187886e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.webview.webcompt.r1.a(this.f187885d, "WeixinWebCompt._callback(" + com.tencent.mm.plugin.webview.webcompt.a.c(this.f187886e) + ',' + it + ')');
        return jz5.f0.f302826a;
    }
}
