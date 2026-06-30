package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class q0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdVerifyIdUI f179059d;

    public q0(com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdVerifyIdUI walletForgotPwdVerifyIdUI) {
        this.f179059d = walletForgotPwdVerifyIdUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" haveNameext：");
        com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdVerifyIdUI walletForgotPwdVerifyIdUI = this.f179059d;
        sb6.append((java.lang.Object) walletForgotPwdVerifyIdUI.f178883d.getText());
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdVerifyIdUI", sb6.toString());
        if (walletForgotPwdVerifyIdUI.f178883d.getText() == null || "".equals(walletForgotPwdVerifyIdUI.f178883d.getText().toString())) {
            walletForgotPwdVerifyIdUI.f178895s = false;
        } else {
            walletForgotPwdVerifyIdUI.f178895s = true;
        }
        com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdVerifyIdUI.U6(walletForgotPwdVerifyIdUI);
    }
}
