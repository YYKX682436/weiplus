package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class y implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pay.ui.WalletPayDeductUI f178819a;

    public y(com.tencent.mm.plugin.wallet.pay.ui.WalletPayDeductUI walletPayDeductUI) {
        this.f178819a = walletPayDeductUI;
    }

    @Override // al5.c2
    public void onStatusChange(boolean z17) {
        com.tencent.mm.plugin.wallet.pay.ui.WalletPayDeductUI walletPayDeductUI = this.f178819a;
        walletPayDeductUI.W6(z17);
        if (walletPayDeductUI.f178695e != null) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(z17 ? 1 : 2);
            objArr[1] = walletPayDeductUI.f178695e.f179675e;
            g0Var.d(15379, objArr);
        }
    }
}
