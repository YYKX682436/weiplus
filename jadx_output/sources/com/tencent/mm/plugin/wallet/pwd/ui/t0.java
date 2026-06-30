package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class t0 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdVerifyIdUI f179072d;

    public t0(com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdVerifyIdUI walletForgotPwdVerifyIdUI) {
        this.f179072d = walletForgotPwdVerifyIdUI;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdVerifyIdUI", " lose focus");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdVerifyIdUI", " has focus");
        int i17 = com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdVerifyIdUI.f178882u;
        this.f179072d.V6();
    }
}
