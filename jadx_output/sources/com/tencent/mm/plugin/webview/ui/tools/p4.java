package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public final class p4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.q4 f186747d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(com.tencent.mm.plugin.webview.ui.tools.q4 q4Var) {
        super(1);
        this.f186747d = q4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List resp = (java.util.List) obj;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mm.plugin.webview.ui.tools.q4 q4Var = this.f186747d;
        q4Var.f186768a = resp;
        q4Var.f186769b.countDown();
        return jz5.f0.f302826a;
    }
}
