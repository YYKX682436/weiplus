package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes8.dex */
public class r1 implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.model.lqt.u1 f177712a;

    public r1(com.tencent.mm.plugin.wallet.balance.model.lqt.u1 u1Var) {
        this.f177712a = u1Var;
    }

    @Override // lm5.e
    public java.lang.String a() {
        return "Vending.UI";
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        nm5.g gVar = (nm5.g) obj;
        com.tencent.mm.plugin.wallet.balance.model.lqt.q1 q1Var = this.f177712a.f177720a;
        java.lang.String str = (java.lang.String) gVar.a(0);
        java.lang.String str2 = (java.lang.String) gVar.a(1);
        java.lang.String str3 = (java.lang.String) gVar.a(2);
        java.lang.String str4 = (java.lang.String) gVar.a(3);
        int intValue = ((java.lang.Integer) gVar.a(4)).intValue();
        int intValue2 = ((java.lang.Integer) gVar.a(5)).intValue();
        int intValue3 = ((java.lang.Integer) gVar.a(6)).intValue();
        q1Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtPlanAddInteractor", "do add plan");
        km5.b b17 = km5.u.b();
        b17.b();
        new com.tencent.mm.plugin.wallet.balance.model.lqt.a(str, str2, str3, str4, intValue, intValue2, intValue3).l().h(new com.tencent.mm.plugin.wallet.balance.model.lqt.n1(q1Var, b17));
        return null;
    }
}
