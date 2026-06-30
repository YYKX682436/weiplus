package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class oh implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.ph f147280d;

    public oh(com.tencent.mm.plugin.luckymoney.ui.ph phVar) {
        this.f147280d = phVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.ph phVar = this.f147280d;
        if (phVar.f147319d.f146432u2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "wait upload out of time");
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = phVar.f147319d;
            luckyMoneyNewYearSendUIV2.f146432u2 = false;
            android.app.Dialog dialog = luckyMoneyNewYearSendUIV2.G1;
            if (dialog != null && dialog.isShowing()) {
                luckyMoneyNewYearSendUIV2.G1.dismiss();
            }
            db5.t7.m(luckyMoneyNewYearSendUIV2.getContext(), luckyMoneyNewYearSendUIV2.getContext().getResources().getString(com.tencent.mm.R.string.go_));
            luckyMoneyNewYearSendUIV2.f146424q2 = 1;
            luckyMoneyNewYearSendUIV2.f146444y2 = 1;
            luckyMoneyNewYearSendUIV2.q7();
        }
    }
}
