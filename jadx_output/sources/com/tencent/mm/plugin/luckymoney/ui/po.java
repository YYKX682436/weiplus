package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class po implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.no f147331d;

    public po(com.tencent.mm.plugin.luckymoney.ui.no noVar) {
        this.f147331d = noVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.luckymoney.ui.no noVar = this.f147331d;
        if (noVar != null) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.AnonymousClass19 anonymousClass19 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.AnonymousClass19.this;
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this;
            java.lang.String str = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.D2;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(luckyMoneyPrepareUI.p7());
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI2 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.this;
            g0Var.d(18890, 6, valueOf, luckyMoneyPrepareUI2.Y1, luckyMoneyPrepareUI2.r7(), luckyMoneyPrepareUI2.o7(), luckyMoneyPrepareUI2.q7());
        }
    }
}
