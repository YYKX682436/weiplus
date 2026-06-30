package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class cc implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f146789d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI f146790e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f146791f;

    public cc(boolean z17, com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI, com.tencent.mm.modelbase.m1 m1Var) {
        this.f146789d = z17;
        this.f146790e = luckyMoneyNewPrepareUI;
        this.f146791f = m1Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 menu) {
        kotlin.jvm.internal.o.g(menu, "menu");
        boolean z17 = this.f146789d;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = this.f146790e;
        if (z17) {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.W6(luckyMoneyNewPrepareUI, 23);
            menu.d(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.I2, luckyMoneyNewPrepareUI.getResources().getColor(com.tencent.mm.R.color.f479364xj), luckyMoneyNewPrepareUI.getContext().getString(com.tencent.mm.R.string.gjr));
            return;
        }
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.W6(luckyMoneyNewPrepareUI, 21);
        int i17 = ((com.tencent.mm.plugin.luckymoney.model.x5) this.f146791f).B;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (i17 == 1) {
            menu.a(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.G2, com.tencent.mm.R.string.gm6);
        }
        menu.a(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.H2, com.tencent.mm.R.string.gnk);
    }
}
