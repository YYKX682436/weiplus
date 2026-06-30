package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public class y0 implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.model.lqt.z0 f177750a;

    public y0(com.tencent.mm.plugin.wallet.balance.model.lqt.z0 z0Var) {
        this.f177750a = z0Var;
    }

    @Override // lm5.e
    public java.lang.String a() {
        return "Vending.UI";
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        nm5.b bVar = (nm5.b) obj;
        com.tencent.mm.plugin.wallet.balance.model.lqt.s0 s0Var = this.f177750a.f177754a;
        int intValue = ((java.lang.Integer) bVar.a(0)).intValue();
        int intValue2 = ((java.lang.Integer) bVar.a(1)).intValue();
        s0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtDetailInteractor", "lqtOnClickRedeem, accountType: %s", java.lang.Integer.valueOf(intValue));
        km5.b b17 = km5.u.b();
        b17.b();
        new com.tencent.mm.plugin.wallet.balance.model.lqt.k(intValue, intValue2).l().h(new com.tencent.mm.plugin.wallet.balance.model.lqt.o0(s0Var, b17));
        return null;
    }
}
