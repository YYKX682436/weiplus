package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes8.dex */
public class c0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdSelectUI f178980d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdSelectUI walletForgotPwdSelectUI) {
        super(false);
        this.f178980d = walletForgotPwdSelectUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        int i17 = com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdSelectUI.f178864f;
        com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdSelectUI walletForgotPwdSelectUI = this.f178980d;
        if (walletForgotPwdSelectUI.getProcess() != null) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.d(15774, java.lang.Integer.valueOf(walletForgotPwdSelectUI.getProcess().f213801c.getInt("key_forgot_scene", 1)), 2);
            g0Var.idkeyStat(917L, 33L, 1L, false);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdSelectUI", "gotToFaceCheck");
        com.tencent.mm.autogen.events.RequestFaceVerifyForPayEvent requestFaceVerifyForPayEvent = new com.tencent.mm.autogen.events.RequestFaceVerifyForPayEvent();
        am.jr jrVar = requestFaceVerifyForPayEvent.f54694g;
        jrVar.f7076j = walletForgotPwdSelectUI;
        jrVar.f7067a = walletForgotPwdSelectUI.getInput().getInt("key_face_action_scene");
        jrVar.f7068b = walletForgotPwdSelectUI.getInput().getString("key_face_action_package");
        jrVar.f7069c = walletForgotPwdSelectUI.getInput().getString("key_face_action_package_sign");
        jrVar.f7070d = walletForgotPwdSelectUI.getString(com.tencent.mm.R.string.f493533km5);
        jrVar.f7074h = com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR;
        requestFaceVerifyForPayEvent.e();
    }
}
