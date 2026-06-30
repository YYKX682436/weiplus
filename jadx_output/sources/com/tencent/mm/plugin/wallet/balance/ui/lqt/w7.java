package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class w7 implements com.tencent.mm.wallet_core.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI f178429a;

    public w7(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI) {
        this.f178429a = walletLqtSaveFetchUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17084, 33, 0);
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f178429a;
        walletLqtSaveFetchUI.f178056h.setText(com.tencent.mm.wallet_core.ui.r1.o(walletLqtSaveFetchUI.R.O2));
        walletLqtSaveFetchUI.f178056h.getContentEt().requestFocus();
        walletLqtSaveFetchUI.showNormalStWcKb();
    }
}
