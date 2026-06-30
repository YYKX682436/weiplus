package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class i6 implements com.tencent.mm.wallet_core.ui.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI f178210a;

    public i6(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI) {
        this.f178210a = walletLqtSaveFetchUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.m
    public void onVisibleStateChange(boolean z17) {
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f178210a;
        if (z17) {
            if (walletLqtSaveFetchUI.S == 2) {
                walletLqtSaveFetchUI.H.postDelayed(new com.tencent.mm.plugin.wallet.balance.ui.lqt.v6(walletLqtSaveFetchUI), 100L);
            }
        } else {
            walletLqtSaveFetchUI.H.scrollTo(0, 0);
            if (walletLqtSaveFetchUI.S == 2 && com.tencent.mm.sdk.platformtools.t8.K0(walletLqtSaveFetchUI.f178056h.getText())) {
                walletLqtSaveFetchUI.G.removeAllViews();
            }
        }
    }
}
