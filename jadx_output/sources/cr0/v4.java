package cr0;

/* loaded from: classes12.dex */
public final class v4 {

    /* renamed from: a, reason: collision with root package name */
    public static final cr0.v4 f221784a = new cr0.v4();

    public static final void a(cr0.v4 v4Var, com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot jiffiesMonitorFeature$JiffiesSnapshot) {
        v4Var.getClass();
        java.util.List list = jiffiesMonitorFeature$JiffiesSnapshot.f52562h.f395560a;
        kotlin.jvm.internal.o.d(list);
        com.tencent.mars.xlog.Log.i("MicroMsg.ThreadProfiler", "dumpCurrThreadSizing: " + list.size() + ", " + kz5.n0.g0(kz5.t0.a(new cr0.r4(list)).entrySet(), ", ", null, null, 0, null, cr0.s4.f221749d, 30, null));
    }
}
