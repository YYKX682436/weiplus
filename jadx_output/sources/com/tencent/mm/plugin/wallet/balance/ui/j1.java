package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class j1 implements com.tencent.mm.wallet_core.ui.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI f177907a;

    public j1(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI walletBalanceSaveUI) {
        this.f177907a = walletBalanceSaveUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.m
    public void onVisibleStateChange(boolean z17) {
        com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI walletBalanceSaveUI = this.f177907a;
        if (!z17) {
            walletBalanceSaveUI.f177837m.scrollTo(0, 0);
        } else {
            int i17 = com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI.A;
            walletBalanceSaveUI.getClass();
        }
    }
}
