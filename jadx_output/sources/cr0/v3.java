package cr0;

/* loaded from: classes12.dex */
public final class v3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final cr0.v3 f221783d = new cr0.v3();

    public v3() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        cr0.d dVar = com.tencent.mm.matrix.battery.AccNetworkStats.Companion;
        com.tencent.mm.matrix.battery.AccNetworkStats accStats = cr0.w3.f221800a.a();
        dVar.getClass();
        kotlin.jvm.internal.o.g(accStats, "accStats");
        if ((!accStats.getAccRxStats().isEmpty()) || (!accStats.getAccTxStats().isEmpty())) {
            java.lang.String a17 = bm5.f1.a();
            kotlin.jvm.internal.o.f(a17, "getProcessName(...)");
            accStats.setAccProcName(a17);
            mh.k.f326271a.b("key_proc_network_stats_prefix" + ri.i.g(accStats.getAccProcName()), accStats, "full-charge-proc-life-stats.bin");
        }
        return jz5.f0.f302826a;
    }
}
