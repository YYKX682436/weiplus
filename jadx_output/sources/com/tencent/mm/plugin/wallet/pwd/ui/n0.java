package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class n0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdVerifyIdUI f179038d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdVerifyIdUI walletForgotPwdVerifyIdUI) {
        super(false);
        this.f179038d = walletForgotPwdVerifyIdUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdVerifyIdUI walletForgotPwdVerifyIdUI = this.f179038d;
        java.lang.String text = walletForgotPwdVerifyIdUI.f178886g.getText();
        int o17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().o();
        java.lang.String obj = walletForgotPwdVerifyIdUI.f178883d.getText().toString();
        if (com.tencent.mm.sdk.platformtools.t8.K0(text) || com.tencent.mm.sdk.platformtools.t8.K0(obj)) {
            return;
        }
        walletForgotPwdVerifyIdUI.getInput().putString("key_identity", text);
        walletForgotPwdVerifyIdUI.getInput().putInt("key_id_type", o17);
        walletForgotPwdVerifyIdUI.getInput().putString("key_true_name", obj);
        if (walletForgotPwdVerifyIdUI.getProcess() != null) {
            walletForgotPwdVerifyIdUI.getProcess().f213801c.putString("key_identity", text);
            walletForgotPwdVerifyIdUI.getProcess().f213801c.putInt("key_id_type", o17);
            walletForgotPwdVerifyIdUI.getProcess().f213801c.putString("key_true_name", obj);
        }
        walletForgotPwdVerifyIdUI.getNetController().d(text, java.lang.Integer.valueOf(o17), obj);
    }
}
