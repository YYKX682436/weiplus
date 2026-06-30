package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI f177869d;

    public b2(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI walletBalanceSaveUI) {
        this.f177869d = walletBalanceSaveUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI walletBalanceSaveUI = this.f177869d;
        if (walletBalanceSaveUI.f177847w == 2 && walletBalanceSaveUI.isHandleAutoShowNormalStWcKb()) {
            walletBalanceSaveUI.showNormalStWcKb();
        }
    }
}
