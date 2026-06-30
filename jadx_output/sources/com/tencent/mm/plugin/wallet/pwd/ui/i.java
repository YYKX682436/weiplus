package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class i implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.r f179009d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletBiometricPaySettingsUI f179010e;

    public i(com.tencent.mm.plugin.wallet.pwd.ui.WalletBiometricPaySettingsUI walletBiometricPaySettingsUI, com.tencent.mm.ui.base.preference.r rVar) {
        this.f179010e = walletBiometricPaySettingsUI;
        this.f179009d = rVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.wallet.pwd.ui.WalletBiometricPaySettingsUI walletBiometricPaySettingsUI = this.f179010e;
        android.app.Dialog e17 = com.tencent.mm.wallet_core.ui.b2.e(walletBiometricPaySettingsUI.getContext(), false, false, null);
        com.tencent.mm.autogen.events.CloseFingerPrintEvent closeFingerPrintEvent = new com.tencent.mm.autogen.events.CloseFingerPrintEvent();
        closeFingerPrintEvent.f54065g.f6432a = ((mz2.a) walletBiometricPaySettingsUI.f178838u).a() ? 1 : 2;
        closeFingerPrintEvent.f192364d = new com.tencent.mm.plugin.wallet.pwd.ui.h(this, closeFingerPrintEvent, e17);
        closeFingerPrintEvent.b(walletBiometricPaySettingsUI.getMainLooper());
        walletBiometricPaySettingsUI.X6();
        ((com.tencent.mm.ui.base.preference.h0) this.f179009d).notifyDataSetChanged();
    }
}
