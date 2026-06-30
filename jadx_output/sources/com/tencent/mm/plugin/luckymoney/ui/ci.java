package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class ci implements com.tencent.mm.plugin.luckymoney.ui.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 f146797a;

    public ci(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f146797a = luckyMoneyNewYearSendUIV2;
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.l
    public void a() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f146797a;
        int i17 = luckyMoneyNewYearSendUIV2.f146444y2;
        if ((i17 == 1 || i17 == 0) && luckyMoneyNewYearSendUIV2.f146409j2) {
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.plugin.luckymoney.ui.ai aiVar = new com.tencent.mm.plugin.luckymoney.ui.ai(this);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(aiVar, 350L, false);
        }
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV22 = this.f146797a;
        if (luckyMoneyNewYearSendUIV22.N1) {
            androidx.appcompat.app.AppCompatActivity context = luckyMoneyNewYearSendUIV22.getContext();
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV23 = this.f146797a;
            com.tencent.mm.plugin.luckymoney.model.m5.E(context, luckyMoneyNewYearSendUIV23.G, luckyMoneyNewYearSendUIV23.K1);
            com.tencent.mm.plugin.luckymoney.model.e5.j(this.f146797a.D, 0);
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV24 = this.f146797a;
            if (luckyMoneyNewYearSendUIV24.f146409j2) {
                com.tencent.mm.plugin.luckymoney.model.e5.j(luckyMoneyNewYearSendUIV24.I, 0);
            } else {
                com.tencent.mm.plugin.luckymoney.model.e5.j(luckyMoneyNewYearSendUIV24.H, 0);
            }
            this.f146797a.N1 = false;
        } else {
            com.tencent.mm.plugin.luckymoney.model.e5.j(luckyMoneyNewYearSendUIV22.D, 0);
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV25 = this.f146797a;
            if (luckyMoneyNewYearSendUIV25.f146409j2) {
                luckyMoneyNewYearSendUIV25.I.setVisibility(0);
            } else {
                luckyMoneyNewYearSendUIV25.H.setVisibility(0);
            }
            androidx.appcompat.app.AppCompatActivity context2 = this.f146797a.getContext();
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV26 = this.f146797a;
            com.tencent.mm.plugin.luckymoney.model.m5.E(context2, luckyMoneyNewYearSendUIV26.G, luckyMoneyNewYearSendUIV26.K1);
            this.f146797a.D.invalidate();
        }
        this.f146797a.p7(true);
        this.f146797a.F.setFocusable(true);
        ku5.u0 u0Var2 = ku5.t0.f312615d;
        com.tencent.mm.plugin.luckymoney.ui.bi biVar = new com.tencent.mm.plugin.luckymoney.ui.bi(this);
        ku5.t0 t0Var2 = (ku5.t0) u0Var2;
        t0Var2.getClass();
        t0Var2.z(biVar, 300L, false);
        this.f146797a.F.setContentDescription("" + (this.f146797a.M1 / 100.0d));
    }
}
