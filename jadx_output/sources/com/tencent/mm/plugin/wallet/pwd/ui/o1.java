package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class o1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI f179042d;

    public o1(com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI walletPasswordSettingUI) {
        this.f179042d = walletPasswordSettingUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        android.app.Dialog dialog = this.f179042d.f178936y;
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}
