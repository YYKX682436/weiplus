package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class o9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI f157865d;

    public o9(com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI walletMerchantPayUI) {
        this.f157865d = walletMerchantPayUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI walletMerchantPayUI = this.f157865d;
        if (walletMerchantPayUI.V == 2 && walletMerchantPayUI.isHandleAutoShowNormalStWcKb() && !walletMerchantPayUI.f157609r) {
            walletMerchantPayUI.showNormalStWcKb();
        }
    }
}
