package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class v6 implements db5.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.c6 f186963a;

    public v6(com.tencent.mm.plugin.webview.ui.tools.c6 c6Var) {
        this.f186963a = c6Var;
    }

    @Override // db5.d1
    public void a(int i17, int i18) {
        if (i18 != -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewMenuHelper", "do del cancel");
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mm.plugin.webview.ui.tools.c6 c6Var = this.f186963a;
        bundle.putLong("fav_local_id", c6Var.b().getLongExtra("fav_local_id", -1L));
        try {
            if (!c6Var.c().L1.A.uf(bundle)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WebViewMenuHelper", "try to del web url fail");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewMenuHelper", "del fav web url ok, finish webview ui");
            com.tencent.mm.plugin.webview.model.b6 b6Var = c6Var.c().f183835m2;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            com.tencent.mm.plugin.webview.model.p5 p5Var = b6Var.f182807j;
            if (p5Var != null) {
                try {
                    p5Var.a("mm_del_fav", bool);
                } catch (java.lang.Exception unused) {
                }
            }
            c6Var.c().finish();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebViewMenuHelper", e17, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewMenuHelper", "try to del web url crash");
        }
    }
}
