package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class d2 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI f177881d;

    public d2(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI walletBalanceSaveUI) {
        this.f177881d = walletBalanceSaveUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        if (editable.toString().startsWith(".")) {
            editable.insert(0, "0");
        }
        java.lang.String obj = editable.toString();
        int indexOf = obj.indexOf(".");
        int length = obj.length();
        com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI walletBalanceSaveUI = this.f177881d;
        if (indexOf >= 0 && length - indexOf > 3) {
            com.tencent.mm.wallet_core.ui.formview.WalletFormView.g(walletBalanceSaveUI.f177835h.getContentEt(), obj, indexOf + 3, length);
        } else if (indexOf > 10) {
            com.tencent.mm.wallet_core.ui.formview.WalletFormView.g(walletBalanceSaveUI.f177835h.getContentEt(), obj, 10, indexOf);
        } else if (indexOf == -1 && length > 10) {
            com.tencent.mm.wallet_core.ui.formview.WalletFormView.g(walletBalanceSaveUI.f177835h.getContentEt(), obj, 10, length);
        }
        int i17 = com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI.A;
        walletBalanceSaveUI.Y6();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
