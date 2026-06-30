package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class m6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.d7 f178274d;

    public m6(com.tencent.mm.plugin.wallet.balance.ui.lqt.d7 d7Var) {
        this.f178274d = d7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtArriveTimeLayout walletLqtArriveTimeLayout = this.f178274d.f178150a.G;
        walletLqtArriveTimeLayout.setMinimumHeight(walletLqtArriveTimeLayout.getHeight());
    }
}
