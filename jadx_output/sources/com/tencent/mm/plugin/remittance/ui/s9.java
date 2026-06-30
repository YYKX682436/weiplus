package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class s9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI f157939d;

    public s9(com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI walletMerchantPayUI) {
        this.f157939d = walletMerchantPayUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI walletMerchantPayUI = this.f157939d;
        walletMerchantPayUI.M = walletMerchantPayUI.K.getWidth();
        walletMerchantPayUI.I.setVisibility(8);
        int i17 = walletMerchantPayUI.M;
    }
}
