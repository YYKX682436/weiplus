package ef3;

/* loaded from: classes9.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f252426a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f252427b = new java.util.ArrayList();

    public static void a(ef3.p pVar, boolean z17, boolean z18, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.QueryWeChatWalletManager", "do query wechat wallet: %s", java.lang.Boolean.valueOf(z17));
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.QueryWeChatWalletManager", "account not ready");
            return;
        }
        r45.wh5 wh5Var = new r45.wh5();
        java.lang.String str = (java.lang.String) ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().i(com.tencent.mm.storage.u3.USERINFO_WALLET_RESP_CACHE_STRING_SYNC, null);
        boolean z19 = false;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            try {
                wh5Var.parseFrom(str.getBytes(s46.a.f403001a));
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.QueryWeChatWalletManager", e17, "", new java.lang.Object[0]);
            }
        }
        if (z18) {
            if (pVar != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MallWalletUI", "cache callback");
                com.tencent.mm.plugin.mall.ui.MallWalletUI mallWalletUI = ((com.tencent.mm.plugin.mall.ui.t2) pVar).f148493a;
                android.app.Dialog dialog = mallWalletUI.f148321m;
                if (dialog != null) {
                    dialog.dismiss();
                    mallWalletUI.f148321m = null;
                }
                mallWalletUI.f148319h = wh5Var.f389165d;
                mallWalletUI.V6(true);
            }
            z19 = true;
        }
        if ((!z18 || z19) && !z17) {
            return;
        }
        if (pVar != null) {
            java.util.ArrayList arrayList = (java.util.ArrayList) f252427b;
            if (!arrayList.contains(pVar)) {
                arrayList.add(pVar);
            }
        }
        if (f252426a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.QueryWeChatWalletManager", "is quering");
        } else {
            f252426a = true;
            ef3.m mVar = new ef3.m(i17, wh5Var);
            java.util.regex.Pattern pattern = com.tencent.mm.wallet_core.ui.r1.f214222a;
            gm0.j1.i();
            gm0.j1.n().f273288b.g(new c01.ra(new com.tencent.mm.wallet_core.ui.g1("wallet_balance_version", mVar), null));
        }
        if (z19 || z17) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(997, 1);
    }
}
