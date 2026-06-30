package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class n6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI f178289d;

    public n6(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI) {
        this.f178289d = walletLqtSaveFetchUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f178289d;
        int width = walletLqtSaveFetchUI.E.getWidth();
        if (width <= 0) {
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) walletLqtSaveFetchUI.C.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.leftMargin = width;
        }
        walletLqtSaveFetchUI.C.setLayoutParams(layoutParams);
    }
}
