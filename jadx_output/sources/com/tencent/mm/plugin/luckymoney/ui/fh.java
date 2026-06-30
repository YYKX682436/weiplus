package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class fh implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI f146910d;

    public fh(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI luckyMoneyNewYearSendUI) {
        this.f146910d = luckyMoneyNewYearSendUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI luckyMoneyNewYearSendUI = this.f146910d;
        android.app.Dialog dialog = luckyMoneyNewYearSendUI.F;
        if (dialog != null && dialog.isShowing()) {
            luckyMoneyNewYearSendUI.F.dismiss();
        }
        if (luckyMoneyNewYearSendUI.getContentView().getVisibility() == 8 || luckyMoneyNewYearSendUI.getContentView().getVisibility() == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "usr cancel, & visibility not visiable, so finish");
            luckyMoneyNewYearSendUI.finish();
        }
        luckyMoneyNewYearSendUI.forceCancel();
    }
}
