package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class r9 implements com.tencent.mm.wallet_core.ui.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI f157926a;

    public r9(com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI walletMerchantPayUI) {
        this.f157926a = walletMerchantPayUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.m
    public void onVisibleStateChange(boolean z17) {
        int i17 = com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI.X;
        com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI walletMerchantPayUI = this.f157926a;
        walletMerchantPayUI.getClass();
        if (z17) {
            return;
        }
        walletMerchantPayUI.f157611t.scrollTo(0, 0);
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = walletMerchantPayUI.f157602h;
        if (walletFormView == null || walletFormView.getVisibility() != 0) {
            return;
        }
        walletMerchantPayUI.f157602h.setFocusable(false);
    }
}
