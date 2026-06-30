package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f178194d;

    public h3(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI, android.widget.TextView textView) {
        this.f178194d = textView;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.TextView textView = this.f178194d;
        if (textView != null) {
            textView.sendAccessibilityEvent(8);
        }
    }
}
