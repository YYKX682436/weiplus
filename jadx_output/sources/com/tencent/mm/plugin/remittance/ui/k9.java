package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class k9 implements com.tencent.mm.plugin.remittance.ui.m7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI f157798a;

    public k9(com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI walletMerchantPayUI) {
        this.f157798a = walletMerchantPayUI;
    }

    @Override // com.tencent.mm.plugin.remittance.ui.m7
    public void onResult(boolean z17, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI walletMerchantPayUI = this.f157798a;
        if (!z17) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                walletMerchantPayUI.f157616y = "";
            } else {
                walletMerchantPayUI.f157616y = str;
            }
            int i17 = com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI.X;
            walletMerchantPayUI.d7();
        }
        walletMerchantPayUI.f157602h.p();
        walletMerchantPayUI.showNormalStWcKb();
    }
}
