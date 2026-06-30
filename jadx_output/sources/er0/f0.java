package er0;

/* loaded from: classes12.dex */
public abstract class f0 {
    public static final com.tencent.mm.sdk.platformtools.o4 a() {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("acc-proc-life-stats.bin");
        kotlin.jvm.internal.o.f(M, "getMMKV(...)");
        return M;
    }

    public static final com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats b(java.lang.String str) {
        java.lang.String key = "acc-proc-life-stats-" + ri.i.g(str);
        kotlin.jvm.internal.o.g(key, "key");
        com.tencent.matrix.battery.accumulate.persist.FlattParcelable a17 = mh.k.f326271a.a(key, com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats.class, "acc-proc-life-stats.bin");
        if (a17 instanceof com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats) {
            return (com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats) a17;
        }
        return null;
    }
}
