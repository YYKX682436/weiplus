package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class s0 implements com.tencent.mm.wallet_core.ui.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdVerifyIdUI f179068a;

    public s0(com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdVerifyIdUI walletForgotPwdVerifyIdUI) {
        this.f179068a = walletForgotPwdVerifyIdUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.m
    public void onVisibleStateChange(boolean z17) {
        com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdVerifyIdUI walletForgotPwdVerifyIdUI = this.f179068a;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdVerifyIdUI", " TenpayKBS visible");
            walletForgotPwdVerifyIdUI.scrollToFormEditPosAfterShowTenPay(walletForgotPwdVerifyIdUI.f178889m, walletForgotPwdVerifyIdUI.f178886g, 10);
            walletForgotPwdVerifyIdUI.V6();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdVerifyIdUI", " TenpayKBS unvisible");
        int i17 = com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdVerifyIdUI.f178882u;
        walletForgotPwdVerifyIdUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdVerifyIdUI", " resetParams()");
        walletForgotPwdVerifyIdUI.f178885f.setVisibility(0);
        walletForgotPwdVerifyIdUI.f178888i.setVisibility(0);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) walletForgotPwdVerifyIdUI.f178890n.getLayoutParams();
        walletForgotPwdVerifyIdUI.f178891o = marginLayoutParams;
        marginLayoutParams.topMargin = com.tencent.mm.ui.zk.a(walletForgotPwdVerifyIdUI, 59);
        walletForgotPwdVerifyIdUI.f178890n.setLayoutParams(walletForgotPwdVerifyIdUI.f178891o);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) walletForgotPwdVerifyIdUI.f178887h.getLayoutParams();
        walletForgotPwdVerifyIdUI.f178892p = marginLayoutParams2;
        marginLayoutParams2.topMargin = com.tencent.mm.ui.zk.a(walletForgotPwdVerifyIdUI, 114);
        walletForgotPwdVerifyIdUI.f178887h.setLayoutParams(walletForgotPwdVerifyIdUI.f178892p);
        walletForgotPwdVerifyIdUI.f178889m.scrollTo(0, 0);
    }
}
