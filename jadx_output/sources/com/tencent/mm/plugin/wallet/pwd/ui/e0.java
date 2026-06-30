package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class e0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI f178991d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI walletForgotPwdUI) {
        super(false);
        this.f178991d = walletForgotPwdUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11353, 1, 0);
        int i17 = com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI.f178867t;
        this.f178991d.V6();
    }
}
