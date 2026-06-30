package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class c2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI f177876d;

    public c2(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI walletBalanceSaveUI) {
        this.f177876d = walletBalanceSaveUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f177876d.showNormalStWcKb();
    }
}
