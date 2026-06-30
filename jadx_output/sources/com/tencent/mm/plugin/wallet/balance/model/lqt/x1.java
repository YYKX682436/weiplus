package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes8.dex */
public class x1 implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.model.lqt.y1 f177748a;

    public x1(com.tencent.mm.plugin.wallet.balance.model.lqt.y1 y1Var) {
        this.f177748a = y1Var;
    }

    @Override // lm5.e
    public java.lang.String a() {
        return "Vending.UI";
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        nm5.c cVar = (nm5.c) obj;
        com.tencent.mm.plugin.wallet.balance.model.lqt.w1 w1Var = this.f177748a.f177751a;
        int intValue = ((java.lang.Integer) cVar.a(0)).intValue();
        int intValue2 = ((java.lang.Integer) cVar.a(1)).intValue();
        java.lang.String str = (java.lang.String) cVar.a(2);
        w1Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtPlanHomeInteractor", "do oper plan");
        km5.b b17 = km5.u.b();
        b17.b();
        new com.tencent.mm.plugin.wallet.balance.model.lqt.h(intValue, intValue2, str).l().h(new com.tencent.mm.plugin.wallet.balance.model.lqt.v1(w1Var, b17));
        return null;
    }
}
