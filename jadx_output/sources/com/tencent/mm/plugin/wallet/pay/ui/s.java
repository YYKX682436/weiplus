package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class s implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI f178805d;

    public s(com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI walletLoanRepaymentUI) {
        this.f178805d = walletLoanRepaymentUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI walletLoanRepaymentUI = this.f178805d;
        if (walletLoanRepaymentUI.isTransparent()) {
            walletLoanRepaymentUI.finish();
        }
    }
}
