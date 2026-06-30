package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class yh implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 f147742d;

    public yh(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f147742d = luckyMoneyNewYearSendUIV2;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f147742d;
        android.app.Dialog dialog = luckyMoneyNewYearSendUIV2.G1;
        if (dialog != null && dialog.isShowing()) {
            luckyMoneyNewYearSendUIV2.G1.dismiss();
        }
        if (luckyMoneyNewYearSendUIV2.getContentView().getVisibility() == 8 || luckyMoneyNewYearSendUIV2.getContentView().getVisibility() == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "usr cancel, & visibility not visiable, so finish");
            luckyMoneyNewYearSendUIV2.finish();
        }
        luckyMoneyNewYearSendUIV2.forceCancel();
    }
}
