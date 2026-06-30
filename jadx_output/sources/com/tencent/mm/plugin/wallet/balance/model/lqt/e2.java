package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public class e2 implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.model.lqt.i2 f177628a;

    public e2(com.tencent.mm.plugin.wallet.balance.model.lqt.i2 i2Var) {
        this.f177628a = i2Var;
    }

    @Override // lm5.e
    public java.lang.String a() {
        return "Vending.UI";
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        nm5.e eVar = (nm5.e) obj;
        com.tencent.mm.plugin.wallet.balance.model.lqt.d2 d2Var = this.f177628a.f177654a;
        int intValue = ((java.lang.Integer) eVar.a(0)).intValue();
        r45.kd kdVar = (r45.kd) eVar.a(1);
        int intValue2 = ((java.lang.Integer) eVar.a(2)).intValue();
        int intValue3 = ((java.lang.Integer) eVar.a(3)).intValue();
        java.lang.String str = (java.lang.String) eVar.a(4);
        d2Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtSaveFetchInteractor", "do lqtPreRedeemFund, accountType: %s", java.lang.Integer.valueOf(intValue2));
        km5.b b17 = km5.u.b();
        b17.b();
        new com.tencent.mm.plugin.wallet.balance.model.lqt.w(intValue, kdVar, intValue2, intValue3, str).l().h(new com.tencent.mm.plugin.wallet.balance.model.lqt.c2(d2Var, b17));
        return null;
    }
}
