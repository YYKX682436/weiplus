package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdVerifyIdUI f179049d;

    public p0(com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdVerifyIdUI walletForgotPwdVerifyIdUI) {
        this.f179049d = walletForgotPwdVerifyIdUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdVerifyIdUI walletForgotPwdVerifyIdUI = this.f179049d;
        walletForgotPwdVerifyIdUI.f178885f.setVisibility(8);
        walletForgotPwdVerifyIdUI.f178888i.setVisibility(8);
        walletForgotPwdVerifyIdUI.f178891o = (android.view.ViewGroup.MarginLayoutParams) walletForgotPwdVerifyIdUI.f178890n.getLayoutParams();
        walletForgotPwdVerifyIdUI.f178891o.topMargin = com.tencent.mm.ui.zk.a(walletForgotPwdVerifyIdUI, 47);
        walletForgotPwdVerifyIdUI.f178890n.setLayoutParams(walletForgotPwdVerifyIdUI.f178891o);
        walletForgotPwdVerifyIdUI.f178892p = (android.view.ViewGroup.MarginLayoutParams) walletForgotPwdVerifyIdUI.f178887h.getLayoutParams();
        walletForgotPwdVerifyIdUI.f178892p.topMargin = com.tencent.mm.ui.zk.a(walletForgotPwdVerifyIdUI, 48);
        walletForgotPwdVerifyIdUI.f178887h.setLayoutParams(walletForgotPwdVerifyIdUI.f178892p);
    }
}
