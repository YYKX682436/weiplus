package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class ed implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.cd f146872d;

    public ed(com.tencent.mm.plugin.luckymoney.ui.cd cdVar) {
        this.f146872d = cdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.luckymoney.ui.cd cdVar = this.f146872d;
        if (cdVar != null) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.f146241x2;
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = ((com.tencent.mm.plugin.luckymoney.ui.xa) cdVar).f147680a;
            g0Var.d(18890, 6, java.lang.Integer.valueOf(luckyMoneyNewPrepareUI.q7()), luckyMoneyNewPrepareUI.T1, luckyMoneyNewPrepareUI.s7(), luckyMoneyNewPrepareUI.p7(), luckyMoneyNewPrepareUI.r7());
        }
    }
}
