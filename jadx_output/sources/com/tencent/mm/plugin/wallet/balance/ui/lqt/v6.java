package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class v6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI f178412d;

    public v6(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI) {
        this.f178412d = walletLqtSaveFetchUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f178412d;
        walletLqtSaveFetchUI.findViewById(com.tencent.mm.R.id.ixo).getLocationInWindow(iArr);
        walletLqtSaveFetchUI.H.getLocationInWindow(iArr2);
        walletLqtSaveFetchUI.H.scrollBy(0, iArr[1] - iArr2[1]);
    }
}
