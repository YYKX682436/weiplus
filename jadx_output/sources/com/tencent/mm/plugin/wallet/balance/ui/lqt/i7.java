package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class i7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI f178211d;

    public i7(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI) {
        this.f178211d = walletLqtSaveFetchUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f178211d;
        if (walletLqtSaveFetchUI.N1 == 2 && walletLqtSaveFetchUI.isHandleAutoShowNormalStWcKb()) {
            walletLqtSaveFetchUI.showNormalStWcKb();
        }
    }
}
