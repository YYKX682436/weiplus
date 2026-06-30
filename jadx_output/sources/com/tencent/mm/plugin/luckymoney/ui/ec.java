package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class ec extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI f146870d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f146871e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI, com.tencent.mm.modelbase.m1 m1Var) {
        super(false);
        this.f146870d = luckyMoneyNewPrepareUI;
        this.f146871e = m1Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        gb3.p.f270042a.a(7);
        com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct redEnvSendWithEmoticonClickStruct = new com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = this.f146870d;
        luckyMoneyNewPrepareUI.L1 = redEnvSendWithEmoticonClickStruct;
        com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct redEnvSendWithEmoticonClickStruct2 = luckyMoneyNewPrepareUI.L1;
        if (redEnvSendWithEmoticonClickStruct2 != null) {
            redEnvSendWithEmoticonClickStruct2.f59936d = 2L;
        }
        if (redEnvSendWithEmoticonClickStruct2 != null) {
            redEnvSendWithEmoticonClickStruct2.k();
        }
        boolean C0 = com.tencent.mm.sdk.platformtools.t8.C0(v17.getTag(), "delete");
        com.tencent.mm.modelbase.m1 m1Var = this.f146871e;
        if (!C0) {
            if (!(((com.tencent.mm.plugin.luckymoney.model.x5) m1Var).B == 1)) {
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.W6(luckyMoneyNewPrepareUI, 21);
                luckyMoneyNewPrepareUI.P1 = 2;
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.X6(luckyMoneyNewPrepareUI);
                return;
            }
        }
        al5.s0 s0Var = new al5.s0(luckyMoneyNewPrepareUI.getContext(), 1, false);
        s0Var.f211872n = new com.tencent.mm.plugin.luckymoney.ui.cc(C0, luckyMoneyNewPrepareUI, m1Var);
        s0Var.f211881s = new com.tencent.mm.plugin.luckymoney.ui.dc(luckyMoneyNewPrepareUI);
        s0Var.v();
    }
}
