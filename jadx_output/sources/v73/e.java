package v73;

/* loaded from: classes9.dex */
public class e extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI f433684d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI honeyPayCardManagerUI) {
        super(false);
        this.f433684d = honeyPayCardManagerUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI honeyPayCardManagerUI = this.f433684d;
        r45.n75 n75Var = honeyPayCardManagerUI.H;
        if (n75Var != null) {
            java.lang.String str = honeyPayCardManagerUI.f142260d;
            boolean z17 = n75Var.f381139i;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(honeyPayCardManagerUI.L)) {
                int hashCode = honeyPayCardManagerUI.hashCode() & 65535;
                com.tencent.mars.xlog.Log.i(honeyPayCardManagerUI.f142260d, "show kinda select payment, requestCode:%d", java.lang.Integer.valueOf(hashCode));
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("appId", honeyPayCardManagerUI.f142286J);
                hashMap.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, honeyPayCardManagerUI.L);
                h45.a0.h(honeyPayCardManagerUI, "selectPayment", hashMap, hashCode, new v73.h(honeyPayCardManagerUI, hashCode));
                return;
            }
            com.tencent.mars.xlog.Log.i(honeyPayCardManagerUI.f142260d, "show select payway dialog");
            honeyPayCardManagerUI.showLoading();
            at4.y1 y1Var = honeyPayCardManagerUI.T;
            if (y1Var != null) {
                at4.c2.f13816d.d(y1Var);
            }
            at4.y1 y1Var2 = new at4.y1(26, false, true, new v73.j(honeyPayCardManagerUI));
            honeyPayCardManagerUI.T = y1Var2;
            at4.c2 c2Var = at4.c2.f13816d;
            com.tencent.mars.xlog.Log.i("MicroMsg.WcPayBindQueryDataFetcher", "fetch bind query data: " + y1Var2);
            if (y1Var2.f14017b) {
                y1Var2.f14019d.invoke(c2Var.a(y1Var2.f14016a, null, at4.a2.f13806d, true));
                if (y1Var2.f14018c) {
                    c2Var.b(y1Var2);
                }
            } else {
                c2Var.b(y1Var2);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15191, 0, 0, 1, 0, 0, 0);
        }
    }
}
