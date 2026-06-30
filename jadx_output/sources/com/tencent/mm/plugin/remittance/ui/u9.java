package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class u9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI f157982d;

    public u9(com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI walletMerchantPayUI) {
        this.f157982d = walletMerchantPayUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI walletMerchantPayUI = this.f157982d;
        sb6.append(walletMerchantPayUI.getString(com.tencent.mm.R.string.gv7));
        sb6.append(" ");
        sb6.append(walletMerchantPayUI.B);
        walletMerchantPayUI.f157599e.setText(sb6.toString());
        java.lang.String str = walletMerchantPayUI.D;
        if (str == null || str.length() <= 0) {
            java.lang.String str2 = walletMerchantPayUI.C;
            if (str2 != null && str2.length() > 0) {
                walletMerchantPayUI.f157600f.setText(walletMerchantPayUI.C);
            }
        } else {
            walletMerchantPayUI.f157600f.setText(walletMerchantPayUI.D);
        }
        walletMerchantPayUI.f157601g.setRoundCorner(true);
        int d17 = com.tencent.mm.sdk.platformtools.j.d(walletMerchantPayUI, 36.0f);
        walletMerchantPayUI.f157601g.b(walletMerchantPayUI.E, d17, d17, -1);
    }
}
