package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public class w0 implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.model.lqt.z0 f177730a;

    public w0(com.tencent.mm.plugin.wallet.balance.model.lqt.z0 z0Var) {
        this.f177730a = z0Var;
    }

    @Override // lm5.e
    public java.lang.String a() {
        return "Vending.UI";
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        nm5.c cVar = (nm5.c) obj;
        com.tencent.mm.plugin.wallet.balance.model.lqt.s0 s0Var = this.f177730a.f177754a;
        int intValue = ((java.lang.Integer) cVar.a(0)).intValue();
        int intValue2 = ((java.lang.Integer) cVar.a(1)).intValue();
        long longValue = ((java.lang.Long) cVar.a(2)).longValue();
        s0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtDetailInteractor", "lqtOnClickPurchase, accountType: %s", java.lang.Integer.valueOf(intValue));
        km5.b b17 = km5.u.b();
        b17.b();
        new com.tencent.mm.plugin.wallet.balance.model.lqt.j(intValue, intValue2, longValue).l().h(new com.tencent.mm.plugin.wallet.balance.model.lqt.q0(s0Var, intValue2, b17));
        return null;
    }
}
