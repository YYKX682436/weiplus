package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes.dex */
public class t4 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f180625d;

    public t4(android.app.Dialog dialog) {
        this.f180625d = dialog;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletIdCardTip", "SnsLuckyMoneyNewYearTipsUI onCancel");
        android.app.Dialog dialog = this.f180625d;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        dialog.dismiss();
    }
}
