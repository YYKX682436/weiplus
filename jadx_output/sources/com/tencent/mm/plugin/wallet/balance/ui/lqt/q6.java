package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class q6 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178341a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.u6 f178342b;

    public q6(com.tencent.mm.plugin.wallet.balance.ui.lqt.u6 u6Var, int i17) {
        this.f178342b = u6Var;
        this.f178341a = i17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.vg5 vg5Var = (r45.vg5) obj;
        if (vg5Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "save failed, qryPurchaseResultRes is null");
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "save finish: %s", java.lang.Integer.valueOf(vg5Var.f388214f));
        com.tencent.mm.plugin.wallet.balance.ui.lqt.u6 u6Var = this.f178342b;
        u6Var.f178399d.j7();
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI = u6Var.f178399d;
        android.content.Intent intent = new android.content.Intent(walletLqtSaveFetchUI, (java.lang.Class<?>) com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchFinishUI.class);
        intent.putExtra("key_amount", com.tencent.mm.wallet_core.ui.r1.j("" + this.f178341a, "100", 2, java.math.RoundingMode.HALF_UP));
        intent.putExtra("key_mode", 1);
        intent.putExtra("profile_date_wording", vg5Var.f388216h);
        r45.iu3 iu3Var = vg5Var.f388217i;
        if (iu3Var != null) {
            try {
                intent.putExtra("key_guide_cell", iu3Var.toByteArray());
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletLqtSaveFetchUI", e17, "", new java.lang.Object[0]);
            }
        }
        r45.du4 du4Var = vg5Var.f388220o;
        if (du4Var != null) {
            try {
                intent.putExtra("key_operation_view", du4Var.toByteArray());
            } catch (java.io.IOException e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletLqtSaveFetchUI", e18, "", new java.lang.Object[0]);
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(vg5Var.f388218m)) {
            intent.putExtra("KEY_Purchase_Result_Wording", vg5Var.f388218m);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(vg5Var.f388219n)) {
            intent.putExtra("KEY_Confirm_Result_Wording", vg5Var.f388219n);
        }
        intent.putExtra("entrance_type", walletLqtSaveFetchUI.getIntent().getIntExtra("entrance_type", 0));
        if (walletLqtSaveFetchUI.getIntent().getIntExtra("is_from_kinda_balance", 0) == 1) {
            intent.putExtra("is_from_kinda_balance", 1);
            walletLqtSaveFetchUI.startActivityForResult(intent, 4097);
            return null;
        }
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI2 = u6Var.f178399d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(walletLqtSaveFetchUI2, arrayList.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchUI$31$2", "call", "(Lcom/tencent/mm/protocal/protobuf/QryPurchaseResultRes;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        walletLqtSaveFetchUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(walletLqtSaveFetchUI2, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchUI$31$2", "call", "(Lcom/tencent/mm/protocal/protobuf/QryPurchaseResultRes;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        walletLqtSaveFetchUI.finish();
        return null;
    }
}
