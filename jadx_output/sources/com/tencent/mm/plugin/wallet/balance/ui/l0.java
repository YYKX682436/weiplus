package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI f177916d;

    public l0(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI walletBalanceFetchUI) {
        this.f177916d = walletBalanceFetchUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI walletBalanceFetchUI = this.f177916d;
        if (walletBalanceFetchUI.R == 2 && walletBalanceFetchUI.isHandleAutoShowNormalStWcKb()) {
            walletBalanceFetchUI.showNormalStWcKb();
        }
    }
}
