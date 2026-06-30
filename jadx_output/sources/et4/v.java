package et4;

/* loaded from: classes9.dex */
public class v implements lz2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog f256663a;

    public v(com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog wcPayCashierDialog) {
        this.f256663a = wcPayCashierDialog;
    }

    @Override // lz2.a
    public void onAuthCancel() {
        com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog wcPayCashierDialog = this.f256663a;
        wcPayCashierDialog.Q = true;
        wcPayCashierDialog.f180200d.setVisibility(0);
    }

    @Override // lz2.a
    public void onAuthFail(int i17) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog wcPayCashierDialog = this.f256663a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierDialog", "face id auth fail: %s, %s", valueOf, java.lang.Integer.valueOf(wcPayCashierDialog.L.D));
        wcPayCashierDialog.Q = true;
        wcPayCashierDialog.f180200d.setVisibility(0);
        wcPayCashierDialog.F(true);
        wcPayCashierDialog.f180212r.setText(com.tencent.mm.R.string.klu);
        wcPayCashierDialog.f180212r.setVisibility(0);
        wcPayCashierDialog.L.D++;
    }

    @Override // lz2.a
    public void onAuthSuccess(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierDialog", "face id auth success");
        com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog wcPayCashierDialog = this.f256663a;
        if (wcPayCashierDialog.Q) {
            return;
        }
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = wcPayCashierDialog.L;
        payInfo.f192125x = 1;
        payInfo.A = "";
        payInfo.B = "";
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(((pz2.a) gm0.j1.s(pz2.a.class)).Uh());
            jSONObject.put("soter_type", ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().G());
            wcPayCashierDialog.L.G = jSONObject.toString();
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WcPayCashierDialog", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo2 = wcPayCashierDialog.L;
        payInfo2.C = i17;
        payInfo2.D = i18;
        com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog.e(wcPayCashierDialog, "", payInfo2, wcPayCashierDialog.N);
    }
}
