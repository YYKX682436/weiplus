package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class j1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI f179018d;

    public j1(com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI walletPasswordSettingUI) {
        this.f179018d = walletPasswordSettingUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI walletPasswordSettingUI = this.f179018d;
        android.app.Dialog e17 = com.tencent.mm.wallet_core.ui.b2.e(walletPasswordSettingUI.getContext(), false, false, null);
        com.tencent.mm.autogen.events.CloseFingerPrintEvent closeFingerPrintEvent = new com.tencent.mm.autogen.events.CloseFingerPrintEvent();
        closeFingerPrintEvent.f192364d = new com.tencent.mm.plugin.wallet.pwd.ui.i1(this, closeFingerPrintEvent, e17);
        closeFingerPrintEvent.b(walletPasswordSettingUI.getMainLooper());
    }
}
