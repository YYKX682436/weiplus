package com.tencent.mm.plugin.webview.model;

/* loaded from: classes7.dex */
public final class p2 implements ui1.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.y2 f183059a;

    public p2(com.tencent.mm.plugin.webview.model.y2 y2Var) {
        this.f183059a = y2Var;
    }

    @Override // ui1.y
    public void a(int i17, java.util.ArrayList select, int i18, boolean z17) {
        com.tencent.mm.plugin.webview.model.e3 e3Var;
        kotlin.jvm.internal.o.g(select, "select");
        com.tencent.mm.plugin.webview.model.y2 y2Var = this.f183059a;
        if (i17 != 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OauthMultiAccountMgr", "[OauthDialog.revnListener] REJECT, scope = " + ((java.lang.String) select.get(0)));
            com.tencent.mm.plugin.webview.model.e3 e3Var2 = y2Var.f183196d;
            if (e3Var2 != null) {
                e3Var2.b();
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OauthMultiAccountMgr", "[OauthDialog.revnListener] ACCEPT, scope = " + ((java.lang.String) select.get(0)));
        if (!com.tencent.mm.sdk.platformtools.t8.L0(select) && (e3Var = y2Var.f183196d) != null) {
            java.lang.Object obj = select.get(0);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            e3Var.f182858h.add((java.lang.String) obj);
        }
        com.tencent.mm.plugin.webview.model.e3 e3Var3 = y2Var.f183196d;
        if (e3Var3 != null) {
            e3Var3.b();
        }
    }
}
