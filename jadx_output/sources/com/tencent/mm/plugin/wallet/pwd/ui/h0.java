package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI f179006d;

    public h0(com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI walletForgotPwdUI) {
        this.f179006d = walletForgotPwdUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.text.SpannableString spannableString;
        com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI walletForgotPwdUI = this.f179006d;
        walletForgotPwdUI.f178871g.notifyDataSetChanged();
        walletForgotPwdUI.getClass();
        if (!"1".equals(((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0().field_reset_passwd_flag)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdUI", "hy: not support bind new");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0().field_find_passwd_url)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdUI", "hy: support bind new directly");
            ((android.view.ViewStub) walletForgotPwdUI.findViewById(com.tencent.mm.R.id.gct)).inflate();
            ((com.tencent.mm.wallet_core.ui.formview.WalletFormView) walletForgotPwdUI.findViewById(com.tencent.mm.R.id.aih)).setOnClickListener(new com.tencent.mm.plugin.wallet.pwd.ui.j0(walletForgotPwdUI));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdUI", "hy: support bind new h5");
        ((android.view.ViewStub) walletForgotPwdUI.findViewById(com.tencent.mm.R.id.gcu)).inflate();
        android.widget.TextView textView = (android.widget.TextView) walletForgotPwdUI.findViewById(com.tencent.mm.R.id.gcv);
        com.tencent.mm.plugin.wallet_core.ui.b4 b4Var = new com.tencent.mm.plugin.wallet_core.ui.b4(walletForgotPwdUI);
        b4Var.f180146d = new com.tencent.mm.plugin.wallet.pwd.ui.i0(walletForgotPwdUI);
        if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().t()) {
            java.lang.String string = walletForgotPwdUI.getString(com.tencent.mm.R.string.ktf);
            spannableString = new android.text.SpannableString(string);
            spannableString.setSpan(b4Var, string.length() - 12, string.length(), 33);
        } else {
            java.lang.String string2 = walletForgotPwdUI.getString(com.tencent.mm.R.string.ktg);
            spannableString = new android.text.SpannableString(string2);
            spannableString.setSpan(b4Var, 0, string2.length(), 18);
        }
        textView.setText(spannableString);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
    }
}
