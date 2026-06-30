package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class p9 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI f157879d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI walletMerchantPayUI) {
        super(false);
        this.f157879d = walletMerchantPayUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15235, 5);
        int i17 = com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI.X;
        com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI walletMerchantPayUI = this.f157879d;
        walletMerchantPayUI.f157615x = walletMerchantPayUI.b7();
        if (walletMerchantPayUI.f157615x <= 0.0d) {
            db5.t7.makeText(walletMerchantPayUI.getContext(), com.tencent.mm.R.string.kfm, 0).show();
        } else {
            com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI.Z6(walletMerchantPayUI);
        }
    }
}
