package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public class g2 implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.model.lqt.i2 f177641a;

    public g2(com.tencent.mm.plugin.wallet.balance.model.lqt.i2 i2Var) {
        this.f177641a = i2Var;
    }

    @Override // lm5.e
    public java.lang.String a() {
        return "Vending.UI";
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        nm5.e eVar = (nm5.e) obj;
        com.tencent.mm.plugin.wallet.balance.model.lqt.d2 d2Var = this.f177641a.f177654a;
        int intValue = ((java.lang.Integer) eVar.a(0)).intValue();
        java.lang.String str = (java.lang.String) eVar.a(1);
        java.lang.String str2 = (java.lang.String) eVar.a(2);
        int intValue2 = ((java.lang.Integer) eVar.a(3)).intValue();
        java.lang.String str3 = (java.lang.String) eVar.a(4);
        d2Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtSaveFetchInteractor", "do lqtRedeemFund, redeemListId: %s, accountType: %s", str2, java.lang.Integer.valueOf(intValue2));
        km5.b b17 = km5.u.b();
        b17.b();
        new com.tencent.mm.plugin.wallet.balance.model.lqt.a0(intValue, str, str2, intValue2, str3).l().h(new com.tencent.mm.plugin.wallet.balance.model.lqt.b2(d2Var, b17));
        return null;
    }
}
