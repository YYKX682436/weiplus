package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class c9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f146784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f146785e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.e1 f146786f;

    public c9(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI, java.lang.String str, com.tencent.mm.plugin.luckymoney.model.e1 e1Var) {
        this.f146784d = luckyMoneyNewDetailUI;
        this.f146785e = str;
        this.f146786f = e1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI = this.f146784d;
        ((java.util.HashSet) luckyMoneyNewDetailUI.f146219r2).remove(this.f146785e);
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        com.tencent.mm.plugin.luckymoney.model.e1 e1Var = this.f146786f;
        java.lang.String str = e1Var.Q;
        ((sg3.a) v0Var).getClass();
        e1Var.f145239i = c01.a2.e(str);
        com.tencent.mm.plugin.luckymoney.model.m5.E(luckyMoneyNewDetailUI.getContext(), luckyMoneyNewDetailUI.f146207o, luckyMoneyNewDetailUI.getString(com.tencent.mm.R.string.god, e1Var.f145239i));
    }
}
