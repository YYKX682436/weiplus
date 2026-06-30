package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class ui implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 f147505d;

    public ui(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f147505d = luckyMoneyNewYearSendUIV2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f147505d;
        if (luckyMoneyNewYearSendUIV2.f146432u2) {
            int i17 = luckyMoneyNewYearSendUIV2.f146424q2;
            if (i17 == 4) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "afterUploadDoSend upload voice fail, tip retry");
                luckyMoneyNewYearSendUIV2.f146432u2 = false;
                android.app.Dialog dialog = luckyMoneyNewYearSendUIV2.G1;
                if (dialog != null && dialog.isShowing()) {
                    luckyMoneyNewYearSendUIV2.G1.dismiss();
                }
            } else if (i17 == 3) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "afterUploadDoSend upload voice success, now doSend");
                luckyMoneyNewYearSendUIV2.f146432u2 = false;
                luckyMoneyNewYearSendUIV2.a7(0);
            }
        }
        if (luckyMoneyNewYearSendUIV2.f146424q2 == 4) {
            db5.t7.m(luckyMoneyNewYearSendUIV2.getContext(), luckyMoneyNewYearSendUIV2.getContext().getResources().getString(com.tencent.mm.R.string.go_));
            luckyMoneyNewYearSendUIV2.f146444y2 = 1;
            luckyMoneyNewYearSendUIV2.q7();
        }
    }
}
