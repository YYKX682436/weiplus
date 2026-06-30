package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class ek implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.fk f146880d;

    public ek(com.tencent.mm.plugin.luckymoney.ui.fk fkVar) {
        this.f146880d = fkVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.fk fkVar = this.f146880d;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI = fkVar.f146914a;
        ((java.util.HashSet) luckyMoneyNotHookReceiveUI.F1).remove(luckyMoneyNotHookReceiveUI.D1.f145433z);
        com.tencent.mm.plugin.luckymoney.model.l6 l6Var = fkVar.f146914a.D1;
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String str = fkVar.f146914a.D1.f145433z;
        ((sg3.a) v0Var).getClass();
        l6Var.f145422o = c01.a2.e(str);
        androidx.appcompat.app.AppCompatActivity context = fkVar.f146914a.getContext();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI2 = fkVar.f146914a;
        com.tencent.mm.plugin.luckymoney.model.m5.E(context, luckyMoneyNotHookReceiveUI2.f146470i, luckyMoneyNotHookReceiveUI2.getString(com.tencent.mm.R.string.goe, luckyMoneyNotHookReceiveUI2.D1.f145422o));
    }
}
