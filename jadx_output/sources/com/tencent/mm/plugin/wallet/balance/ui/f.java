package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI f177887d;

    public f(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI walletBalanceFetchUI) {
        this.f177887d = walletBalanceFetchUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f177887d.showNormalStWcKb();
    }
}
