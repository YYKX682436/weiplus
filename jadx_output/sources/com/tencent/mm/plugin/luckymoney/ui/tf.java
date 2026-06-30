package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class tf implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 f147460d;

    public tf(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2) {
        this.f147460d = luckyMoneyNewYearReceiveUIV2;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2 = this.f147460d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = luckyMoneyNewYearReceiveUIV2.A;
        if (u3Var != null && u3Var.isShowing()) {
            luckyMoneyNewYearReceiveUIV2.A.dismiss();
        }
        luckyMoneyNewYearReceiveUIV2.forceCancel();
        if (luckyMoneyNewYearReceiveUIV2.getContentView().getVisibility() == 8 || luckyMoneyNewYearReceiveUIV2.getContentView().getVisibility() == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "usr cancel, & visibility not visiable, so finish");
            luckyMoneyNewYearReceiveUIV2.finish();
        }
    }
}
