package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class q extends com.tencent.mm.wallet_core.ui.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletDigitalCertUI f179058d;

    public q(com.tencent.mm.plugin.wallet.pwd.ui.WalletDigitalCertUI walletDigitalCertUI) {
        this.f179058d = walletDigitalCertUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.x, android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.wallet.pwd.ui.WalletDigitalCertUI walletDigitalCertUI = this.f179058d;
        intent.setClass(walletDigitalCertUI, com.tencent.mm.plugin.wallet.pwd.ui.WalletIdCardCheckUI.class);
        walletDigitalCertUI.startActivityForResult(intent, 1);
    }
}
