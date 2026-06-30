package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class m3 implements com.tencent.mm.wallet_core.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI f178269a;

    public m3(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI) {
        this.f178269a = walletLqtPlanAddUI;
    }

    @Override // com.tencent.mm.wallet_core.g
    public android.content.Intent onProcessEnd(int i17, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanAddUI", "bind card finish: %s", java.lang.Integer.valueOf(i17));
        if (i17 != -1) {
            return null;
        }
        com.tencent.mm.plugin.wallet_core.model.BindCardOrder bindCardOrder = (com.tencent.mm.plugin.wallet_core.model.BindCardOrder) bundle.getParcelable("key_bindcard_value_result");
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI = this.f178269a;
        if (bindCardOrder != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanAddUI", "bind card serial: %s", bindCardOrder.f179617n);
            java.lang.String str = bindCardOrder.f179617n;
            int i18 = com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI.f177980y0;
            com.tencent.mm.plugin.wallet_core.model.Bankcard c76 = walletLqtPlanAddUI.c7(str);
            if (c76 != null) {
                r45.n85 n85Var = walletLqtPlanAddUI.I;
                n85Var.f381167h = c76.field_bindSerial;
                n85Var.f381165f = c76.field_bankcardType;
                n85Var.f381174r = c76.field_bankName;
                n85Var.f381166g = c76.field_bankcardTail;
                walletLqtPlanAddUI.f7();
            }
        }
        int i19 = com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI.f177980y0;
        walletLqtPlanAddUI.b7(false);
        return null;
    }
}
