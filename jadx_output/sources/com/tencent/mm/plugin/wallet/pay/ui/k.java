package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class k extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI f178775d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI walletChangeBankcardUI) {
        super(false);
        this.f178775d = walletChangeBankcardUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI walletChangeBankcardUI = this.f178775d;
        com.tencent.mm.plugin.wallet_core.ui.n8 n8Var = walletChangeBankcardUI.f178655g;
        if (n8Var != null) {
            n8Var.dismiss();
        }
        walletChangeBankcardUI.V6(false);
        walletChangeBankcardUI.f178660o.c(walletChangeBankcardUI.f178656h, true);
        walletChangeBankcardUI.f178666u = (com.tencent.mm.plugin.wallet_core.model.FavorPayInfo) view.getTag();
        com.tencent.mm.plugin.wallet_core.model.FavorPayInfo favorPayInfo = walletChangeBankcardUI.f178666u;
        if (favorPayInfo != null) {
            favorPayInfo.f179671h = "";
        }
        walletChangeBankcardUI.getInput().putParcelable("key_favor_pay_info", walletChangeBankcardUI.f178666u);
        walletChangeBankcardUI.b7();
        walletChangeBankcardUI.setContentViewVisibility(0);
        walletChangeBankcardUI.f178668w = null;
    }
}
