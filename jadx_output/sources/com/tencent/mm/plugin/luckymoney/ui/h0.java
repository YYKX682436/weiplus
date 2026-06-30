package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class h0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI f146975d;

    public h0(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI luckyMoneyBusiReceiveUI) {
        this.f146975d = luckyMoneyBusiReceiveUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI luckyMoneyBusiReceiveUI = this.f146975d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = luckyMoneyBusiReceiveUI.A;
        if (u3Var != null && u3Var.isShowing()) {
            luckyMoneyBusiReceiveUI.A.dismiss();
        }
        luckyMoneyBusiReceiveUI.forceCancel();
        if (luckyMoneyBusiReceiveUI.getContentView().getVisibility() == 8 || luckyMoneyBusiReceiveUI.getContentView().getVisibility() == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBusiReceiveUI", "user cancel & finish");
            luckyMoneyBusiReceiveUI.finish();
        }
    }
}
