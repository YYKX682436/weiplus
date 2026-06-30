package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class t6 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178382a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.u6 f178383b;

    public t6(com.tencent.mm.plugin.wallet.balance.ui.lqt.u6 u6Var, int i17) {
        this.f178383b = u6Var;
        this.f178382a = i17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.an5 an5Var = (r45.an5) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "redeem succ: %s, is_realtime_arrivial: %s, is_redeem_into_pocket: %s", an5Var, java.lang.Boolean.valueOf(an5Var.f370144f), java.lang.Boolean.valueOf(an5Var.f370145g));
        com.tencent.mm.plugin.wallet.balance.ui.lqt.u6 u6Var = this.f178383b;
        u6Var.f178399d.j7();
        boolean z17 = an5Var.f370144f;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI = u6Var.f178399d;
        if (z17 && an5Var.f370145g) {
            android.content.Intent intent = new android.content.Intent(walletLqtSaveFetchUI, (java.lang.Class<?>) com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchFinishUI.class);
            intent.putExtra("key_amount", com.tencent.mm.wallet_core.ui.r1.j("" + this.f178382a, "100", 2, java.math.RoundingMode.HALF_UP));
            intent.putExtra("key_mode", 2);
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI2 = u6Var.f178399d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(walletLqtSaveFetchUI2, arrayList.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchUI$31$4", "call", "(Lcom/tencent/mm/protocal/protobuf/RedeemFundRes;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            walletLqtSaveFetchUI2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(walletLqtSaveFetchUI2, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchUI$31$4", "call", "(Lcom/tencent/mm/protocal/protobuf/RedeemFundRes;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            android.content.Intent intent2 = new android.content.Intent(walletLqtSaveFetchUI, (java.lang.Class<?>) com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchFinishProgressNewUI.class);
            try {
                intent2.putExtra("key_redeem_res", an5Var.toByteArray());
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletLqtSaveFetchUI", e17, "pass redeemFundRes error: %s", e17.getMessage());
            }
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI3 = u6Var.f178399d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(walletLqtSaveFetchUI3, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchUI$31$4", "call", "(Lcom/tencent/mm/protocal/protobuf/RedeemFundRes;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            walletLqtSaveFetchUI3.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(walletLqtSaveFetchUI3, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchUI$31$4", "call", "(Lcom/tencent/mm/protocal/protobuf/RedeemFundRes;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        walletLqtSaveFetchUI.finish();
        return null;
    }
}
