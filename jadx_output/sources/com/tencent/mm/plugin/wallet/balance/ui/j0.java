package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class j0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI f177906d;

    public j0(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI walletBalanceFetchUI) {
        this.f177906d = walletBalanceFetchUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        if (editable.toString().startsWith(".")) {
            editable.insert(0, "0");
        }
        java.lang.String obj = editable.toString();
        int indexOf = obj.indexOf(".");
        int lastIndexOf = obj.lastIndexOf(".");
        int length = obj.length();
        com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI walletBalanceFetchUI = this.f177906d;
        if (indexOf >= 0 && length - indexOf > 3) {
            com.tencent.mm.wallet_core.ui.formview.WalletFormView.g(walletBalanceFetchUI.f177787i.getContentEt(), obj, indexOf + 3, length);
        } else if (lastIndexOf != indexOf) {
            com.tencent.mm.wallet_core.ui.formview.WalletFormView.g(walletBalanceFetchUI.f177787i.getContentEt(), obj, lastIndexOf, length);
        }
        walletBalanceFetchUI.f177784f = com.tencent.mm.sdk.platformtools.t8.F(editable.toString(), 0.0d);
        walletBalanceFetchUI.getClass();
        walletBalanceFetchUI.g7();
        walletBalanceFetchUI.f7();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
