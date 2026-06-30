package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.CloseFingerPrintEvent f179003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f179004e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.i f179005f;

    public h(com.tencent.mm.plugin.wallet.pwd.ui.i iVar, com.tencent.mm.autogen.events.CloseFingerPrintEvent closeFingerPrintEvent, android.app.Dialog dialog) {
        this.f179005f = iVar;
        this.f179003d = closeFingerPrintEvent;
        this.f179004e = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.CloseFingerPrintEvent closeFingerPrintEvent = this.f179003d;
        if (closeFingerPrintEvent.f54066h != null) {
            android.app.Dialog dialog = this.f179004e;
            if (dialog != null) {
                dialog.dismiss();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBiometricPaySettingsUI", "close event result: %s", java.lang.Integer.valueOf(closeFingerPrintEvent.f54066h.f6535a));
            if (closeFingerPrintEvent.f54066h.f6535a == 0) {
                gm0.j1.n().f273288b.g(new ss4.e0(null, 19));
                return;
            }
            com.tencent.mm.plugin.wallet.pwd.ui.i iVar = this.f179005f;
            com.tencent.mm.plugin.wallet.pwd.ui.WalletBiometricPaySettingsUI walletBiometricPaySettingsUI = iVar.f179010e;
            walletBiometricPaySettingsUI.Z6(walletBiometricPaySettingsUI.f178827g, walletBiometricPaySettingsUI.f178837t);
            if (walletBiometricPaySettingsUI.f178833p == 1) {
                walletBiometricPaySettingsUI.Z6(walletBiometricPaySettingsUI.f178830m, walletBiometricPaySettingsUI.f178835r);
                walletBiometricPaySettingsUI.Z6(walletBiometricPaySettingsUI.f178829i, walletBiometricPaySettingsUI.f178836s);
            } else {
                walletBiometricPaySettingsUI.Z6(walletBiometricPaySettingsUI.f178828h, walletBiometricPaySettingsUI.f178834q);
            }
            ((com.tencent.mm.ui.base.preference.h0) walletBiometricPaySettingsUI.getPreferenceScreen()).notifyDataSetChanged();
            com.tencent.mm.plugin.wallet.pwd.ui.WalletBiometricPaySettingsUI walletBiometricPaySettingsUI2 = iVar.f179010e;
            if (((mz2.a) walletBiometricPaySettingsUI2.f178838u).a()) {
                db5.e1.F(walletBiometricPaySettingsUI2, walletBiometricPaySettingsUI2.getResources().getString(com.tencent.mm.R.string.f_h), "", true);
            } else {
                db5.e1.F(walletBiometricPaySettingsUI2, walletBiometricPaySettingsUI2.getResources().getString(com.tencent.mm.R.string.kud), "", true);
            }
        }
    }
}
