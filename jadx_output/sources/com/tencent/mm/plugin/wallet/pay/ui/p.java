package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class p extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.model.Bankcard f178796d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI f178797e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI walletLoanRepaymentUI, com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard) {
        super(false);
        this.f178797e = walletLoanRepaymentUI;
        this.f178796d = bankcard;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        java.lang.String str = this.f178796d.field_bindSerial;
        int i17 = com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI.f178672w;
        com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI walletLoanRepaymentUI = this.f178797e;
        walletLoanRepaymentUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLoanRepaymentUI", "to change a bankcard " + str);
        android.content.Intent intent = new android.content.Intent(walletLoanRepaymentUI, (java.lang.Class<?>) com.tencent.mm.plugin.wallet.pay.ui.WalletChangeLoanRepayBankcardUI.class);
        intent.putExtra("bindSerial", str);
        walletLoanRepaymentUI.startActivityForResult(intent, 1);
        com.tencent.mm.plugin.wallet_core.ui.n8 n8Var = walletLoanRepaymentUI.f178680n;
        if (n8Var != null) {
            n8Var.dismiss();
        }
    }
}
