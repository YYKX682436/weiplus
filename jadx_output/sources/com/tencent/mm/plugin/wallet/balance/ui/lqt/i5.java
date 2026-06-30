package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes3.dex */
public class i5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchFinishUI f178209d;

    public i5(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchFinishUI walletLqtSaveFetchFinishUI) {
        this.f178209d = walletLqtSaveFetchFinishUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchFinishUI walletLqtSaveFetchFinishUI = this.f178209d;
        android.view.ViewGroup viewGroup = walletLqtSaveFetchFinishUI.f178048p;
        if (viewGroup == null) {
            return;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        }
        layoutParams.addRule(12);
        walletLqtSaveFetchFinishUI.f178048p.setLayoutParams(layoutParams);
    }
}
