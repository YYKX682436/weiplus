package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class e6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI f180253d;

    public e6(com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI walletOrderInfoNewUI) {
        this.f180253d = walletOrderInfoNewUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View findViewById;
        com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI walletOrderInfoNewUI = this.f180253d;
        int height = walletOrderInfoNewUI.J1.getHeight();
        android.view.ViewGroup viewGroup = walletOrderInfoNewUI.Q;
        int height2 = viewGroup != null ? viewGroup.getHeight() : 0;
        boolean z17 = walletOrderInfoNewUI.R.getVisibility() == 0;
        boolean z18 = walletOrderInfoNewUI.H.getVisibility() == 0;
        boolean z19 = walletOrderInfoNewUI.N1.getVisibility() == 0;
        int bottom = z18 ? walletOrderInfoNewUI.H.getBottom() : -1;
        if (z17) {
            bottom = walletOrderInfoNewUI.R.getBottom();
        }
        if (z19) {
            bottom = walletOrderInfoNewUI.N1.getBottom();
        }
        if (bottom <= 0 && (findViewById = walletOrderInfoNewUI.findViewById(com.tencent.mm.R.id.kqt)) != null) {
            bottom = findViewById.getBottom();
        }
        if (walletOrderInfoNewUI.A1.getVisibility() != 0 && walletOrderInfoNewUI.H1.getVisibility() != 0) {
            height += i65.a.b(walletOrderInfoNewUI, 70);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "autoAdjustLayout inner, height: %s, topViewPos: %s, contentHeight: %s, topMargin: %s, 50dp: %s", java.lang.Integer.valueOf(height), java.lang.Integer.valueOf(bottom), java.lang.Integer.valueOf(height2), java.lang.Integer.valueOf((height2 - bottom) - height), java.lang.Integer.valueOf(i65.a.b(walletOrderInfoNewUI, 50)));
    }
}
