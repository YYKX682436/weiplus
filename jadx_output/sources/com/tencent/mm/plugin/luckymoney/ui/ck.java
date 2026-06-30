package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class ck implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI f146801d;

    public ck(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI) {
        this.f146801d = luckyMoneyNotHookReceiveUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI = this.f146801d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = luckyMoneyNotHookReceiveUI.f146484w;
        if (u3Var != null && u3Var.isShowing()) {
            luckyMoneyNotHookReceiveUI.f146484w.dismiss();
        }
        luckyMoneyNotHookReceiveUI.forceCancel();
        if (luckyMoneyNotHookReceiveUI.getContentView().getVisibility() == 8 || luckyMoneyNotHookReceiveUI.getContentView().getVisibility() == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNotHookReceiveUI", "user cancel & finish");
            luckyMoneyNotHookReceiveUI.finish();
        }
    }
}
