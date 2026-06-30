package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f178503d;

    public s1(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI walletBalanceSaveUI, android.widget.TextView textView) {
        this.f178503d = textView;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.TextView textView = this.f178503d;
        if (textView != null) {
            textView.sendAccessibilityEvent(8);
        }
    }
}
