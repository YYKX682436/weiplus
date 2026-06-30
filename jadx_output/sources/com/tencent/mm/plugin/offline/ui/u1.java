package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI f152728d;

    public u1(com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        this.f152728d = walletOfflineCoinPurseUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f152728d;
        android.view.ViewGroup.LayoutParams layoutParams = walletOfflineCoinPurseUI.B.getLayoutParams();
        if (layoutParams != null) {
            walletOfflineCoinPurseUI.B.setMinimumHeight(layoutParams.height);
        }
    }
}
