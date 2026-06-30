package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class g0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI f179001d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI walletForgotPwdUI) {
        super(false);
        this.f179001d = walletForgotPwdUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11353, 2, 0);
        com.tencent.mm.wallet_core.ui.r1.B0(this.f179001d, vr4.f1.wi().Ai().q());
    }
}
