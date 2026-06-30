package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletDigitalCertUI f179099d;

    public w(com.tencent.mm.plugin.wallet.pwd.ui.WalletDigitalCertUI walletDigitalCertUI) {
        this.f179099d = walletDigitalCertUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wallet.pwd.ui.WalletDigitalCertUI walletDigitalCertUI = this.f179099d;
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) walletDigitalCertUI.f178861n.getLayoutParams();
        layoutParams.topMargin = walletDigitalCertUI.f178863p.getLineHeight() / 2;
        walletDigitalCertUI.f178861n.setLayoutParams(layoutParams);
    }
}
