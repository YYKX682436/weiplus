package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class h6 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI f178198d;

    public h6(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI) {
        this.f178198d = walletLqtSaveFetchUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        if (editable.toString().startsWith(".")) {
            editable.insert(0, "0");
        }
        java.lang.String obj = editable.toString();
        int indexOf = obj.indexOf(".");
        int length = obj.length();
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f178198d;
        if (indexOf >= 0 && length - indexOf > 3) {
            com.tencent.mm.wallet_core.ui.formview.WalletFormView.g(walletLqtSaveFetchUI.f178056h.getContentEt(), obj, indexOf + 3, length);
        } else if (indexOf > 12) {
            com.tencent.mm.wallet_core.ui.formview.WalletFormView.g(walletLqtSaveFetchUI.f178056h.getContentEt(), obj, 12, indexOf);
        } else if (indexOf == -1 && length > 12) {
            com.tencent.mm.wallet_core.ui.formview.WalletFormView.g(walletLqtSaveFetchUI.f178056h.getContentEt(), obj, 12, length);
        }
        java.lang.String obj2 = editable.toString();
        int i17 = com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.R1;
        walletLqtSaveFetchUI.s7(obj2, false);
        walletLqtSaveFetchUI.f178077y1 = obj2;
        if (com.tencent.mm.sdk.platformtools.t8.K0(obj2)) {
            walletLqtSaveFetchUI.B.setVisibility(8);
        } else {
            walletLqtSaveFetchUI.B.setVisibility(0);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
