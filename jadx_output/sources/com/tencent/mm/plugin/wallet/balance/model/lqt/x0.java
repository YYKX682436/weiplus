package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public class x0 implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.model.lqt.z0 f177747a;

    public x0(com.tencent.mm.plugin.wallet.balance.model.lqt.z0 z0Var) {
        this.f177747a = z0Var;
    }

    @Override // lm5.e
    public java.lang.String a() {
        return "Vending.LOGIC";
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mm.plugin.wallet.balance.model.lqt.s0 s0Var = this.f177747a.f177754a;
        s0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtDetailInteractor", "lqtOnClickRedDotReq, redDotID: %s", str);
        km5.b b17 = km5.u.b();
        b17.b();
        new com.tencent.mm.plugin.wallet.balance.model.lqt.b0(str).l().q(new com.tencent.mm.plugin.wallet.balance.model.lqt.r0(s0Var, b17));
        return null;
    }
}
