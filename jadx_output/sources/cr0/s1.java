package cr0;

/* loaded from: classes12.dex */
public final class s1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr0.u0 f221748d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(cr0.u0 u0Var) {
        super(0);
        this.f221748d = u0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        cr0.b bVar = com.tencent.mm.matrix.battery.AccBinderCallsStats.Companion;
        com.tencent.mm.matrix.battery.AccBinderCallsStats accProxyCallsStats = this.f221748d.c();
        bVar.getClass();
        kotlin.jvm.internal.o.g(accProxyCallsStats, "accProxyCallsStats");
        if (!accProxyCallsStats.getAccBinderCallsStats().isEmpty()) {
            java.lang.String a17 = bm5.f1.a();
            kotlin.jvm.internal.o.f(a17, "getProcessName(...)");
            accProxyCallsStats.setAccProcName(a17);
            mh.k.f326271a.b("key_proc_binder_calls_prefix_" + ri.i.g(accProxyCallsStats.getAccProcName()), accProxyCallsStats, "full-charge-proc-life-stats.bin");
        }
        return jz5.f0.f302826a;
    }
}
