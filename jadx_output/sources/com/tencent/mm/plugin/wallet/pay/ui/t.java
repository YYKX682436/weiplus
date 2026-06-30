package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class t implements com.tencent.mm.wallet_core.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI f178807a;

    public t(com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI walletLoanRepaymentUI) {
        this.f178807a = walletLoanRepaymentUI;
    }

    @Override // com.tencent.mm.wallet_core.g
    public android.content.Intent onProcessEnd(int i17, android.os.Bundle bundle) {
        com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI walletLoanRepaymentUI = this.f178807a;
        if (i17 == -1) {
            walletLoanRepaymentUI.doSceneProgress(new zr4.c(walletLoanRepaymentUI.f178684r), true);
        } else {
            at4.t1 bj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).bj();
            if (bj6.c()) {
                com.tencent.mm.plugin.wallet_core.model.Bankcard b17 = bj6.b();
                if (b17 == null || !com.tencent.mm.sdk.platformtools.t8.K0(b17.field_forbidWord)) {
                    int i18 = com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI.f178672w;
                    walletLoanRepaymentUI.V6();
                } else {
                    walletLoanRepaymentUI.W6(b17, walletLoanRepaymentUI.f178682p, walletLoanRepaymentUI.f178683q);
                }
            } else {
                walletLoanRepaymentUI.setResult(0, null);
            }
        }
        return null;
    }
}
