package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class q implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI f178799d;

    public q(com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI walletLoanRepaymentUI) {
        this.f178799d = walletLoanRepaymentUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI walletLoanRepaymentUI = this.f178799d;
        com.tencent.mm.plugin.wallet_core.ui.n8 n8Var = walletLoanRepaymentUI.f178680n;
        if (n8Var != null) {
            n8Var.cancel();
            walletLoanRepaymentUI.setResult(0);
            walletLoanRepaymentUI.finish();
        }
    }
}
