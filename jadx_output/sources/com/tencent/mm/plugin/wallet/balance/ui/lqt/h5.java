package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes3.dex */
public class h5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchFinishUI f178197d;

    public h5(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchFinishUI walletLqtSaveFetchFinishUI) {
        this.f178197d = walletLqtSaveFetchFinishUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchFinishUI walletLqtSaveFetchFinishUI = this.f178197d;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) walletLqtSaveFetchFinishUI.f178048p.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        }
        layoutParams.removeRule(12);
        walletLqtSaveFetchFinishUI.f178048p.setLayoutParams(layoutParams);
    }
}
