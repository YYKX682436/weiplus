package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class s1 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI f147398d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI) {
        super(false);
        this.f147398d = luckyMoneyDetailUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        gb3.o.f270035a.a(8);
        com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonClickStruct redEnvReplyWithEmoticonClickStruct = new com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonClickStruct();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI = this.f147398d;
        luckyMoneyDetailUI.f146062g2 = redEnvReplyWithEmoticonClickStruct;
        int id6 = view.getId();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (id6 == com.tencent.mm.R.id.j76) {
            com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonClickStruct redEnvReplyWithEmoticonClickStruct2 = luckyMoneyDetailUI.f146062g2;
            redEnvReplyWithEmoticonClickStruct2.f59932d = 1L;
            redEnvReplyWithEmoticonClickStruct2.k();
        }
        if ((luckyMoneyDetailUI.f146059f2.f145156g == 0) && com.tencent.mm.sdk.platformtools.t8.C0(view.getTag(), "nodelete")) {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI.V6(luckyMoneyDetailUI);
            return;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) luckyMoneyDetailUI.getContext(), 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.luckymoney.ui.q1(this, view);
        k0Var.f211881s = new com.tencent.mm.plugin.luckymoney.ui.r1(this);
        com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonClickStruct redEnvReplyWithEmoticonClickStruct3 = luckyMoneyDetailUI.f146062g2;
        redEnvReplyWithEmoticonClickStruct3.f59932d = 2L;
        redEnvReplyWithEmoticonClickStruct3.k();
        k0Var.v();
    }
}
