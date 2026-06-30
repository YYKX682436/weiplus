package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class j5 implements com.tencent.mm.wallet_core.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178226a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI f178227b;

    public j5(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI, int i17) {
        this.f178227b = walletLqtSaveFetchUI;
        this.f178226a = i17;
    }

    @Override // com.tencent.mm.wallet_core.ui.z
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f178227b;
        walletLqtSaveFetchUI.f178056h.setText(com.tencent.mm.wallet_core.ui.r1.o(walletLqtSaveFetchUI.c7(this.f178226a + "", "100", 2)));
        walletLqtSaveFetchUI.f178056h.getContentEt().requestFocus();
        walletLqtSaveFetchUI.showWcKb();
    }
}
