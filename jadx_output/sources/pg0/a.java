package pg0;

/* loaded from: classes9.dex */
public final class a extends com.tencent.mm.sdk.event.n {
    public a() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        androidx.lifecycle.c1 a17;
        com.tencent.mm.autogen.events.DelWalletAppMsgEvent event = (com.tencent.mm.autogen.events.DelWalletAppMsgEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        p75.n0 n0Var = dm.ec.f236713p;
        p75.m0 i17 = dm.ec.f236718u.i(java.lang.Long.valueOf(event.f54082g.f8051a));
        p75.n0 n0Var2 = dm.ec.f236713p;
        n0Var2.getClass();
        if (n0Var2 instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        java.lang.String table = n0Var2.b();
        p75.h hVar = (p75.h) i17;
        java.lang.String b17 = hVar.b();
        java.lang.String[] e17 = hVar.e();
        kotlin.jvm.internal.o.g(table, "table");
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(xs4.b.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(xs4.b.class);
        }
        l75.k0 Q4 = ((xs4.b) a17).Q4();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedger", "try delete record msgId:%s ret:%s", java.lang.Long.valueOf(event.f54082g.f8051a), java.lang.Integer.valueOf(Q4 != null ? Q4.delete(table, b17, e17) : -1));
        return true;
    }
}
