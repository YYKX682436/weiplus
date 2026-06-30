package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class i0 implements com.tencent.mm.plugin.wallet_core.ui.a4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI f179011a;

    public i0(com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI walletForgotPwdUI) {
        this.f179011a = walletForgotPwdUI;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.a4
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI walletForgotPwdUI = this.f179011a;
        walletForgotPwdUI.f178877p = true;
        walletForgotPwdUI.V6();
    }
}
