package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class z1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ss4.l0 f178538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI f178539e;

    public z1(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI walletBalanceSaveUI, ss4.l0 l0Var) {
        this.f178539e = walletBalanceSaveUI;
        this.f178538d = l0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        ss4.l0 l0Var = this.f178538d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceSaveUI", "click open lqt: %s", java.lang.Integer.valueOf(l0Var.f412090c));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17084, 8);
        int i18 = l0Var.f412090c;
        com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI walletBalanceSaveUI = this.f178539e;
        if (i18 == 2) {
            walletBalanceSaveUI.f177843s = true;
            com.tencent.mm.wallet_core.ui.r1.V(walletBalanceSaveUI.getContext(), l0Var.f412089b, true);
        } else if (i18 == 3) {
            walletBalanceSaveUI.f177843s = true;
            com.tencent.mm.wallet_core.ui.r1.b0(l0Var.f412091d, l0Var.f412089b, 0, 1000);
        }
    }
}
