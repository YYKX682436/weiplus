package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class dh implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI f146843d;

    public dh(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI luckyMoneyNewYearSendUI) {
        this.f146843d = luckyMoneyNewYearSendUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        int i17 = this.f146843d.K;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (i17 == 1) {
            g4Var.a(1, com.tencent.mm.R.string.gm6);
        }
        g4Var.a(2, com.tencent.mm.R.string.gnk);
    }
}
