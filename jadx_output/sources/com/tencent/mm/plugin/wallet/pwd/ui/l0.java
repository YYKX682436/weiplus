package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class l0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.model.Bankcard f179026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.m0 f179027e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.tencent.mm.plugin.wallet.pwd.ui.m0 m0Var, com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard) {
        super(false);
        this.f179027e = m0Var;
        this.f179026d = bankcard;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.wallet.pwd.ui.m0 m0Var = this.f179027e;
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = this.f179026d;
        if (bankcard == null || bankcard.field_bankcardState != 1) {
            com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI walletForgotPwdUI = m0Var.f179035f;
            walletForgotPwdUI.f178870f = bankcard;
            walletForgotPwdUI.f178877p = false;
            walletForgotPwdUI.V6();
            return;
        }
        com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(m0Var.f179033d);
        i0Var.d(com.tencent.mm.R.string.f493530km2);
        i0Var.f(com.tencent.mm.R.string.f493531km3);
        i0Var.f211821b.E = new com.tencent.mm.plugin.wallet.pwd.ui.k0(this);
        i0Var.e(com.tencent.mm.R.string.f490455vj);
        i0Var.f211821b.A = false;
        i0Var.a().show();
    }
}
