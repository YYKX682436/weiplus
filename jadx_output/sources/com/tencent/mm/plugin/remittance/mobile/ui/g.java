package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class g implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.BankMobileRemittanceChooseUI f156668d;

    public g(com.tencent.mm.plugin.remittance.mobile.ui.BankMobileRemittanceChooseUI bankMobileRemittanceChooseUI) {
        this.f156668d = bankMobileRemittanceChooseUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.remittance.mobile.ui.BankMobileRemittanceChooseUI bankMobileRemittanceChooseUI = this.f156668d;
        android.app.Dialog dialog = bankMobileRemittanceChooseUI.f156560g;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        bankMobileRemittanceChooseUI.f156560g.dismiss();
    }
}
