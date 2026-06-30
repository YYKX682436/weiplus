package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.Toast f179119d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletIdCardCheckUI f179120e;

    public y0(com.tencent.mm.plugin.wallet.pwd.ui.WalletIdCardCheckUI walletIdCardCheckUI, android.widget.Toast toast) {
        this.f179120e = walletIdCardCheckUI;
        this.f179119d = toast;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f179119d.cancel();
        com.tencent.mm.plugin.wallet.pwd.ui.WalletIdCardCheckUI walletIdCardCheckUI = this.f179120e;
        walletIdCardCheckUI.setResult(-1);
        walletIdCardCheckUI.finish();
    }
}
