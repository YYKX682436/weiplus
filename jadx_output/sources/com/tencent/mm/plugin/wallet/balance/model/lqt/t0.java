package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public class t0 implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.model.lqt.z0 f177716a;

    public t0(com.tencent.mm.plugin.wallet.balance.model.lqt.z0 z0Var) {
        this.f177716a = z0Var;
    }

    @Override // lm5.e
    public java.lang.String a() {
        return "Vending.LOGIC";
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        nm5.b bVar = (nm5.b) obj;
        com.tencent.mm.plugin.wallet.balance.model.lqt.s0 s0Var = this.f177716a.f177754a;
        java.lang.String str = (java.lang.String) bVar.a(0);
        int intValue = ((java.lang.Integer) bVar.a(1)).intValue();
        s0Var.getClass();
        km5.b b17 = km5.u.b();
        b17.b();
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtDetailInteractor", "closeAccount, accountType: %s", java.lang.Integer.valueOf(intValue));
        new com.tencent.mm.plugin.wallet.balance.model.lqt.f(str, intValue).l().q(new com.tencent.mm.plugin.wallet.balance.model.lqt.n0(s0Var, b17));
        return null;
    }
}
