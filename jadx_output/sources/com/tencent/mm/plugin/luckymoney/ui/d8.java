package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class d8 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f146833d;

    public d8(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI) {
        this.f146833d = luckyMoneyNewDetailUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        android.app.Dialog dialog;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI = this.f146833d;
        android.app.Dialog dialog2 = luckyMoneyNewDetailUI.P;
        boolean z17 = false;
        if (dialog2 != null && dialog2.isShowing()) {
            z17 = true;
        }
        if (z17 && (dialog = luckyMoneyNewDetailUI.P) != null) {
            dialog.dismiss();
        }
        luckyMoneyNewDetailUI.forceCancel();
        wb3.a aVar = luckyMoneyNewDetailUI.f146190h3;
        if (aVar != null) {
            aVar.j();
        }
        if (luckyMoneyNewDetailUI.getContentView().getVisibility() == 8 || luckyMoneyNewDetailUI.getContentView().getVisibility() == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "user cancel & finish");
            luckyMoneyNewDetailUI.finish();
        }
    }
}
