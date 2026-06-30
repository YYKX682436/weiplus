package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f177866d;

    public b0(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI walletBalanceFetchUI, android.widget.LinearLayout linearLayout) {
        this.f177866d = linearLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.LinearLayout linearLayout = this.f177866d;
        if (linearLayout != null) {
            linearLayout.sendAccessibilityEvent(8);
        }
    }
}
