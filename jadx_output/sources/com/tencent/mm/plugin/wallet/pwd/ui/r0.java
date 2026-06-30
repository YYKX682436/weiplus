package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class r0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdVerifyIdUI f179063d;

    public r0(com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdVerifyIdUI walletForgotPwdVerifyIdUI) {
        this.f179063d = walletForgotPwdVerifyIdUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdVerifyIdUI walletForgotPwdVerifyIdUI = this.f179063d;
        if (walletForgotPwdVerifyIdUI.f178886g.getText() != null) {
            walletForgotPwdVerifyIdUI.f178896t = true;
        } else {
            walletForgotPwdVerifyIdUI.f178896t = false;
        }
        com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdVerifyIdUI.U6(walletForgotPwdVerifyIdUI);
    }
}
