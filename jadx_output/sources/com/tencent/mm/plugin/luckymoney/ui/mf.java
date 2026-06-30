package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class mf implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI f147187d;

    public mf(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI luckyMoneyNewYearReceiveUI) {
        this.f147187d = luckyMoneyNewYearReceiveUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI luckyMoneyNewYearReceiveUI = this.f147187d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = luckyMoneyNewYearReceiveUI.f146339z;
        if (u3Var != null && u3Var.isShowing()) {
            luckyMoneyNewYearReceiveUI.f146339z.dismiss();
        }
        luckyMoneyNewYearReceiveUI.forceCancel();
        if (luckyMoneyNewYearReceiveUI.getContentView().getVisibility() == 8 || luckyMoneyNewYearReceiveUI.getContentView().getVisibility() == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "usr cancel, & visibility not visiable, so finish");
            luckyMoneyNewYearReceiveUI.finish();
        }
    }
}
