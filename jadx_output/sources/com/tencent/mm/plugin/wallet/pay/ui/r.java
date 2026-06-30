package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class r implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI f178803d;

    public r(com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI walletLoanRepaymentUI) {
        this.f178803d = walletLoanRepaymentUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLoanRepaymentUI", "to bind a new bankcard");
        this.f178803d.U6();
    }
}
