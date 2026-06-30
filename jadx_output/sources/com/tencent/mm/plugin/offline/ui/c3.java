package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class c3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f152595d;

    public c3(com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI, android.widget.LinearLayout linearLayout) {
        this.f152595d = linearLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.LinearLayout linearLayout = this.f152595d;
        if (linearLayout != null) {
            linearLayout.sendAccessibilityEvent(8);
        }
    }
}
