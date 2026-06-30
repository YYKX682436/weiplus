package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes7.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.webcompt.y f187942d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.plugin.webview.webcompt.y yVar) {
        super(0);
        this.f187942d = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.webview.webcompt.y yVar = this.f187942d;
        if (!yVar.f187948d) {
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("power");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            if (!((android.os.PowerManager) systemService).isInteractive() || !com.tencent.mm.sdk.platformtools.t8.V0(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                com.tencent.mm.plugin.webview.webcompt.h0 h0Var = com.tencent.mm.plugin.webview.webcompt.f1.f187797e;
                com.tencent.mars.xlog.Log.i("MicroMsg.WebComponent", "jsEngine pause");
                yVar.f187948d = true;
                com.tencent.mm.plugin.webview.webcompt.h0.b(h0Var).pause();
            }
        }
        return jz5.f0.f302826a;
    }
}
