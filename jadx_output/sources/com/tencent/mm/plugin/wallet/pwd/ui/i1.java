package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.CloseFingerPrintEvent f179012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f179013e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.j1 f179014f;

    public i1(com.tencent.mm.plugin.wallet.pwd.ui.j1 j1Var, com.tencent.mm.autogen.events.CloseFingerPrintEvent closeFingerPrintEvent, android.app.Dialog dialog) {
        this.f179014f = j1Var;
        this.f179012d = closeFingerPrintEvent;
        this.f179013e = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.CloseFingerPrintEvent closeFingerPrintEvent = this.f179012d;
        if (closeFingerPrintEvent.f54066h != null) {
            android.app.Dialog dialog = this.f179013e;
            if (dialog != null) {
                dialog.dismiss();
            }
            int i17 = closeFingerPrintEvent.f54066h.f6535a;
            com.tencent.mm.plugin.wallet.pwd.ui.j1 j1Var = this.f179014f;
            if (i17 != 0) {
                com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI.V6(j1Var.f179018d, 0);
                com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI walletPasswordSettingUI = j1Var.f179018d;
                db5.e1.F(walletPasswordSettingUI, walletPasswordSettingUI.getResources().getString(com.tencent.mm.R.string.f_h), "", true);
            } else {
                com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI walletPasswordSettingUI2 = j1Var.f179018d;
                int i18 = com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI.G;
                walletPasswordSettingUI2.c7(false);
                gm0.j1.i();
                gm0.j1.n().f273288b.g(new ss4.e0(null, 19));
            }
        }
    }
}
