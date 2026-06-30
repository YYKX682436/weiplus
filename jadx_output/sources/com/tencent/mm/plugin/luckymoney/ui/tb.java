package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes4.dex */
public final class tb extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI f147452d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI) {
        super(false);
        this.f147452d = luckyMoneyNewPrepareUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = this.f147452d;
        g0Var.d(11701, 4, 0, 0, java.lang.Integer.valueOf(luckyMoneyNewPrepareUI.k7()), 6);
        com.tencent.mm.plugin.luckymoney.model.m5.o(luckyMoneyNewPrepareUI, com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.B2, luckyMoneyNewPrepareUI.T, luckyMoneyNewPrepareUI.W, true);
        android.view.View view = luckyMoneyNewPrepareUI.f146279u;
        if (view != null) {
            view.postDelayed(new com.tencent.mm.plugin.luckymoney.ui.sb(luckyMoneyNewPrepareUI), 100L);
        }
    }
}
