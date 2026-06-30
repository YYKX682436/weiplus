package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class pg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 f147318d;

    public pg(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2) {
        this.f147318d = luckyMoneyNewYearReceiveUIV2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2 = this.f147318d;
        com.tencent.mm.plugin.luckymoney.model.l6 l6Var = luckyMoneyNewYearReceiveUIV2.R1;
        if (l6Var == null || l6Var.f145426s == 5) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "mReceiveScene is null or expired, no neet play");
        } else if (luckyMoneyNewYearReceiveUIV2.N1) {
            int i17 = luckyMoneyNewYearReceiveUIV2.M1;
            if (i17 == 4) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "afterDownloadPlay download voice fail, tip retry");
                luckyMoneyNewYearReceiveUIV2.N1 = false;
                com.tencent.mm.ui.widget.dialog.u3 u3Var = luckyMoneyNewYearReceiveUIV2.A;
                if (u3Var != null && u3Var.isShowing()) {
                    luckyMoneyNewYearReceiveUIV2.A.dismiss();
                }
                db5.t7.m(luckyMoneyNewYearReceiveUIV2.getContext(), luckyMoneyNewYearReceiveUIV2.getContext().getResources().getString(com.tencent.mm.R.string.f492419gk4));
            } else if (i17 == 3) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "afterUploadDoSend upload voice success, now doSend");
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2.V6(luckyMoneyNewYearReceiveUIV2);
            }
        }
        if (luckyMoneyNewYearReceiveUIV2.M1 == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "download voice fail, tip retry");
        }
    }
}
