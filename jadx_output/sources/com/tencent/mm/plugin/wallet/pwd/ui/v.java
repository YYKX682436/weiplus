package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletDigitalCertUI f179090d;

    public v(com.tencent.mm.plugin.wallet.pwd.ui.WalletDigitalCertUI walletDigitalCertUI) {
        this.f179090d = walletDigitalCertUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wallet.pwd.ui.WalletDigitalCertUI walletDigitalCertUI = this.f179090d;
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) walletDigitalCertUI.f178860m.getLayoutParams();
        layoutParams.topMargin = walletDigitalCertUI.f178862o.getLineHeight() / 2;
        walletDigitalCertUI.f178860m.setLayoutParams(layoutParams);
    }
}
