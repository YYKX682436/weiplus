package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class x5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f178438d;

    public x5(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI, android.widget.LinearLayout linearLayout) {
        this.f178438d = linearLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.LinearLayout linearLayout = this.f178438d;
        if (linearLayout != null) {
            linearLayout.sendAccessibilityEvent(8);
        }
    }
}
