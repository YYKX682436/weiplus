package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes5.dex */
public class h9 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI f157755d;

    public h9(com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI walletMerchantPayUI) {
        this.f157755d = walletMerchantPayUI;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        boolean isFocused = view.isFocused();
        com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI walletMerchantPayUI = this.f157755d;
        if (isFocused) {
            walletMerchantPayUI.f157608q.setHint("");
            ((android.view.inputmethod.InputMethodManager) walletMerchantPayUI.getContext().getSystemService("input_method")).showSoftInput(walletMerchantPayUI.f157608q, 0);
        } else {
            if (walletMerchantPayUI.f157608q.getText().length() > 0) {
                return;
            }
            walletMerchantPayUI.f157608q.setHint(walletMerchantPayUI.f157610s);
        }
    }
}
