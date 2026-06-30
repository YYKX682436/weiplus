package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class ng implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.og f147241d;

    public ng(com.tencent.mm.plugin.luckymoney.ui.og ogVar) {
        this.f147241d = ogVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.og ogVar = this.f147241d;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2 = ogVar.f147279a;
        luckyMoneyNewYearReceiveUIV2.A1 = false;
        com.tencent.mm.plugin.luckymoney.model.e5.n(luckyMoneyNewYearReceiveUIV2.f146362y0);
        long j17 = ogVar.f147279a.I1;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV22 = ogVar.f147279a;
        luckyMoneyNewYearReceiveUIV22.I1 = 0L;
        luckyMoneyNewYearReceiveUIV22.e7(16, currentTimeMillis);
    }
}
