package dr0;

/* loaded from: classes12.dex */
public final class f3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final dr0.f3 f242423d = new dr0.f3();

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String f17 = ri.i.f();
        java.lang.String key = "acc-proc-life-stats-" + f17;
        dr0.t tVar = dr0.t0.f242539j;
        com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accPowerStats = dr0.t0.f242540k.i();
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(accPowerStats, "accPowerStats");
        if (mh.k.f326271a.b(key, accPowerStats, "acc-proc-life-stats.bin")) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.proc.ProcLifeTasks", "mmkv encode failed: " + f17);
    }
}
