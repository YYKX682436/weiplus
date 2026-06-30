package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public final class a9 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f146697d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.e1 f146698e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI, com.tencent.mm.plugin.luckymoney.model.e1 e1Var) {
        super(false);
        this.f146697d = luckyMoneyNewDetailUI;
        this.f146698e = e1Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        int i17 = this.f146698e.f145233J;
        int i18 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI.f146171r3;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI = this.f146697d;
        luckyMoneyNewDetailUI.getClass();
        g0Var.d(11701, java.lang.Integer.valueOf(i17 == 2 ? 13 : 7), 0, 0, 0, 3);
        com.tencent.mm.plugin.luckymoney.model.m5.p(luckyMoneyNewDetailUI, 1, false);
    }
}
