package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public class r2 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.e1 f147362d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI f147363e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI, com.tencent.mm.plugin.luckymoney.model.e1 e1Var) {
        super(false);
        this.f147363e = luckyMoneyDetailUI;
        this.f147362d = e1Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        int i17 = this.f147362d.f145233J;
        int i18 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI.f146047p3;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI = this.f147363e;
        luckyMoneyDetailUI.getClass();
        g0Var.d(11701, java.lang.Integer.valueOf(i17 == 2 ? 13 : 7), 0, 0, 0, 3);
        com.tencent.mm.plugin.luckymoney.model.m5.p(luckyMoneyDetailUI, 1, false);
    }
}
