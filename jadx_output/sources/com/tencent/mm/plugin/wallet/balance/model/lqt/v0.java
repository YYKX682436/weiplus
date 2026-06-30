package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public class v0 implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.model.lqt.z0 f177727a;

    public v0(com.tencent.mm.plugin.wallet.balance.model.lqt.z0 z0Var) {
        this.f177727a = z0Var;
    }

    @Override // lm5.e
    public java.lang.String a() {
        return "Vending.UI";
    }

    public km5.d b(int i17, int i18) {
        return ((km5.q) km5.u.f(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18))).n(this);
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        nm5.b bVar = (nm5.b) obj;
        com.tencent.mm.plugin.wallet.balance.model.lqt.s0 s0Var = this.f177727a.f177754a;
        int intValue = ((java.lang.Integer) bVar.a(0)).intValue();
        int intValue2 = ((java.lang.Integer) bVar.a(1)).intValue();
        s0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtDetailInteractor", "lqtOnClickPurchase, accountType: %s", java.lang.Integer.valueOf(intValue));
        km5.b b17 = km5.u.b();
        b17.b();
        new com.tencent.mm.plugin.wallet.balance.model.lqt.j(intValue, intValue2).l().h(new com.tencent.mm.plugin.wallet.balance.model.lqt.p0(s0Var, intValue2, b17));
        return null;
    }
}
