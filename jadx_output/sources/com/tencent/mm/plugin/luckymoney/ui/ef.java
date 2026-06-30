package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class ef implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI f146874d;

    public ef(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI luckyMoneyNewReceiveUI) {
        this.f146874d = luckyMoneyNewReceiveUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI luckyMoneyNewReceiveUI = this.f146874d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var2 = luckyMoneyNewReceiveUI.f146314x;
        if ((u3Var2 != null && u3Var2.isShowing()) && (u3Var = luckyMoneyNewReceiveUI.f146314x) != null) {
            u3Var.dismiss();
        }
        luckyMoneyNewReceiveUI.forceCancel();
        android.view.View contentView = luckyMoneyNewReceiveUI.getContentView();
        if (!(contentView != null && contentView.getVisibility() == 8)) {
            android.view.View contentView2 = luckyMoneyNewReceiveUI.getContentView();
            if (!(contentView2 != null && contentView2.getVisibility() == 4)) {
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewReceiveUI", "[showLoading] user cancel & finish");
        luckyMoneyNewReceiveUI.finish();
    }
}
