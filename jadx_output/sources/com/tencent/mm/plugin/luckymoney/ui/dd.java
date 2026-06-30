package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class dd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.cd f146839d;

    public dd(com.tencent.mm.plugin.luckymoney.ui.cd cdVar) {
        this.f146839d = cdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.luckymoney.ui.cd cdVar = this.f146839d;
        if (cdVar != null) {
            com.tencent.mm.plugin.luckymoney.ui.xa xaVar = (com.tencent.mm.plugin.luckymoney.ui.xa) cdVar;
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.f146241x2;
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = xaVar.f147680a;
            g0Var.d(18890, 7, java.lang.Integer.valueOf(luckyMoneyNewPrepareUI.q7()), luckyMoneyNewPrepareUI.T1, luckyMoneyNewPrepareUI.s7(), luckyMoneyNewPrepareUI.p7(), luckyMoneyNewPrepareUI.r7());
            luckyMoneyNewPrepareUI.m7(xaVar.f147681b);
        }
    }
}
