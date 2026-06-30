package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class n implements h45.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI f178788a;

    public n(com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI walletLoanRepaymentUI) {
        this.f178788a = walletLoanRepaymentUI;
    }

    public void a(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI walletLoanRepaymentUI = this.f178788a;
        if (str == null || str2 == null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("is_new_cashier", true);
            walletLoanRepaymentUI.setResult(0, intent);
            walletLoanRepaymentUI.finish();
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("token", str);
        intent2.putExtra("bind_serial", str2);
        intent2.putExtra("is_new_cashier", true);
        walletLoanRepaymentUI.setResult(-1, intent2);
        walletLoanRepaymentUI.finish();
    }
}
