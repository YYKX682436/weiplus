package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class o implements com.tencent.mm.plugin.wallet_core.ui.m8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI f178793a;

    public o(com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI walletLoanRepaymentUI) {
        this.f178793a = walletLoanRepaymentUI;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.m8
    public void a(java.lang.String str, com.tencent.mm.plugin.wallet_core.model.FavorPayInfo favorPayInfo, boolean z17) {
        com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI walletLoanRepaymentUI = this.f178793a;
        walletLoanRepaymentUI.f178685s = str;
        walletLoanRepaymentUI.doSceneProgress(new ss4.y(walletLoanRepaymentUI.f178685s, walletLoanRepaymentUI.f178684r));
    }
}
