package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes8.dex */
public class t1 implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.model.lqt.u1 f177717a;

    public t1(com.tencent.mm.plugin.wallet.balance.model.lqt.u1 u1Var) {
        this.f177717a = u1Var;
    }

    @Override // lm5.e
    public java.lang.String a() {
        return "Vending.UI";
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        nm5.c cVar = (nm5.c) obj;
        com.tencent.mm.plugin.wallet.balance.model.lqt.q1 q1Var = this.f177717a.f177720a;
        int intValue = ((java.lang.Integer) cVar.a(0)).intValue();
        int intValue2 = ((java.lang.Integer) cVar.a(1)).intValue();
        int intValue3 = ((java.lang.Integer) cVar.a(2)).intValue();
        q1Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtPlanAddInteractor", "doPlanOrderList");
        km5.b b17 = km5.u.b();
        b17.b();
        new com.tencent.mm.plugin.wallet.balance.model.lqt.u(intValue, intValue2, intValue3).l().h(new com.tencent.mm.plugin.wallet.balance.model.lqt.p1(q1Var, b17));
        return null;
    }
}
