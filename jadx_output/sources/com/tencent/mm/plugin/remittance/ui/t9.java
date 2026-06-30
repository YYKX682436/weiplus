package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class t9 implements qp5.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI f157962a;

    public t9(com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI walletMerchantPayUI) {
        this.f157962a = walletMerchantPayUI;
    }

    @Override // qp5.k0
    public void a(java.lang.CharSequence charSequence) {
        com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI walletMerchantPayUI = this.f157962a;
        int i17 = walletMerchantPayUI.f157617z;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MerchantPayUI", "mAmountRemindBit == 0");
            walletMerchantPayUI.I.setVisibility(8);
            return;
        }
        long longValue = new java.lang.Double(com.tencent.mm.sdk.platformtools.t8.F(charSequence.toString(), 0.0d)).longValue();
        int i18 = 0;
        int i19 = 0;
        while (longValue != 0) {
            int i27 = (int) (longValue % 10);
            longValue /= 10;
            i18++;
            i19 = i27;
        }
        if (i18 < walletMerchantPayUI.f157617z) {
            walletMerchantPayUI.I.setVisibility(8);
            return;
        }
        int k17 = walletMerchantPayUI.f157602h.k(charSequence, walletMerchantPayUI.M, i19);
        if (k17 == 0) {
            walletMerchantPayUI.I.setVisibility(8);
            return;
        }
        walletMerchantPayUI.I.setVisibility(0);
        walletMerchantPayUI.L.setText(com.tencent.mm.wallet_core.model.b2.a(i18));
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) walletMerchantPayUI.K.getLayoutParams();
        layoutParams.leftMargin = k17;
        walletMerchantPayUI.K.setLayoutParams(layoutParams);
    }
}
