package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class g9 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI f157729d;

    public g9(com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI walletMerchantPayUI) {
        this.f157729d = walletMerchantPayUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI walletMerchantPayUI = this.f157729d;
        if (!walletMerchantPayUI.f157609r || walletMerchantPayUI.U.getVisibility() != 0 || editable.length() <= 0 || walletMerchantPayUI.f157615x <= 0.0d) {
            walletMerchantPayUI.U.setEnabled(false);
        } else {
            walletMerchantPayUI.U.setEnabled(true);
        }
        if (editable.length() > 0) {
            walletMerchantPayUI.f157616y = editable.toString();
        } else {
            walletMerchantPayUI.f157616y = "";
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
