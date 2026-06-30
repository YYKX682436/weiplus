package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public class f2 implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.model.lqt.i2 f177631a;

    public f2(com.tencent.mm.plugin.wallet.balance.model.lqt.i2 i2Var) {
        this.f177631a = i2Var;
    }

    @Override // lm5.e
    public java.lang.String a() {
        return "Vending.UI";
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        nm5.g gVar = (nm5.g) obj;
        com.tencent.mm.plugin.wallet.balance.model.lqt.d2 d2Var = this.f177631a.f177654a;
        java.lang.String str = (java.lang.String) gVar.a(0);
        java.lang.String str2 = (java.lang.String) gVar.a(1);
        int intValue = ((java.lang.Integer) gVar.a(2)).intValue();
        int intValue2 = ((java.lang.Integer) gVar.a(3)).intValue();
        java.lang.String str3 = (java.lang.String) gVar.a(4);
        int intValue3 = ((java.lang.Integer) gVar.a(5)).intValue();
        int intValue4 = ((java.lang.Integer) gVar.a(6)).intValue();
        d2Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtSaveFetchInteractor", "do lqtQueryPurchaseResult, tradeNo: %s, transactionId: %s, accountType: %s", str, str2, java.lang.Integer.valueOf(intValue2));
        km5.b b17 = km5.u.b();
        b17.b();
        new com.tencent.mm.plugin.wallet.balance.model.lqt.y(str, str2, intValue, intValue2, str3, intValue3, intValue4).l().h(new com.tencent.mm.plugin.wallet.balance.model.lqt.a2(d2Var, b17));
        return null;
    }
}
