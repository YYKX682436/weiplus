package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes7.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.webcompt.y f187945d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.plugin.webview.webcompt.y yVar) {
        super(0);
        this.f187945d = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.webview.webcompt.y yVar = this.f187945d;
        if (yVar.f187948d) {
            com.tencent.mm.plugin.webview.webcompt.h0 h0Var = com.tencent.mm.plugin.webview.webcompt.f1.f187797e;
            com.tencent.mars.xlog.Log.i("MicroMsg.WebComponent", "jsEngine resume");
            yVar.f187948d = false;
            com.tencent.mm.plugin.webview.webcompt.h0.b(h0Var).resume();
        }
        return jz5.f0.f302826a;
    }
}
