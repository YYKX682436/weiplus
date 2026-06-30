package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class cb extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI f146788d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI) {
        super(false);
        this.f146788d = luckyMoneyNewPrepareUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        gb3.p.f270042a.a(10);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = this.f146788d;
        luckyMoneyNewPrepareUI.hideTenpayKB();
        luckyMoneyNewPrepareUI.hideVKB();
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = luckyMoneyNewPrepareUI.f146245a2;
        if (wcPayKeyboard != null) {
            wcPayKeyboard.i();
        }
        androidx.appcompat.app.AppCompatActivity context = luckyMoneyNewPrepareUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(context).a(ec3.g1.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ((ec3.g1) a17).R6(false);
        al5.s0 s0Var = new al5.s0(luckyMoneyNewPrepareUI.getContext(), false, 1);
        s0Var.f211872n = new com.tencent.mm.plugin.luckymoney.ui.ab(luckyMoneyNewPrepareUI);
        s0Var.f211881s = new com.tencent.mm.plugin.luckymoney.ui.bb(luckyMoneyNewPrepareUI);
        s0Var.v();
    }
}
