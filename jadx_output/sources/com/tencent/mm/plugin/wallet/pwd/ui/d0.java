package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes8.dex */
public class d0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdSelectUI f178985d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdSelectUI walletForgotPwdSelectUI) {
        super(false);
        this.f178985d = walletForgotPwdSelectUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdSelectUI walletForgotPwdSelectUI = this.f178985d;
        if (walletForgotPwdSelectUI.getProcess() != null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15774, java.lang.Integer.valueOf(walletForgotPwdSelectUI.getProcess().f213801c.getInt("key_forgot_scene", 1)), 3);
        }
        int i17 = com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdSelectUI.f178864f;
        walletForgotPwdSelectUI.U6();
    }
}
