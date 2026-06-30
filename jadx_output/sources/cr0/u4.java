package cr0;

/* loaded from: classes12.dex */
public final class u4 implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f221771a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f221772b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qh.b f221773c;

    public u4(rh.c1 c1Var, java.util.List list, qh.b bVar) {
        this.f221771a = c1Var;
        this.f221772b = list;
        this.f221773c = bVar;
    }

    @Override // wh.t0
    public void accept(java.lang.Object obj) {
        java.lang.Object obj2;
        int b17;
        java.lang.String str;
        rh.o2 o2Var = (rh.o2) obj;
        cr0.v4 v4Var = cr0.v4.f221784a;
        rh.d3 end = o2Var.f395485b;
        kotlin.jvm.internal.o.f(end, "end");
        cr0.v4.a(v4Var, (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) end);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dumpThreadSizing, fork=");
        rh.c1 c1Var = this.f221771a;
        sb6.append(c1Var.f395337s);
        sb6.append('-');
        sb6.append(c1Var.z());
        sb6.append(", isRunning=");
        sb6.append(c1Var.E());
        com.tencent.mars.xlog.Log.i("MicroMsg.ThreadProfiler", sb6.toString());
        int i17 = com.tencent.mm.feature.performance.api.a.f67523m0;
        for (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesEntry threadJiffiesEntry : this.f221772b) {
            java.util.List list = ((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) o2Var.f395486c).f52562h.f395560a;
            kotlin.jvm.internal.o.f(list, "getList(...)");
            java.util.Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesSnapshot) obj2).f52565b == threadJiffiesEntry.f52565b) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesSnapshot threadJiffiesSnapshot = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesSnapshot) obj2;
            if (threadJiffiesSnapshot != null) {
                java.lang.String stat = threadJiffiesSnapshot.f52568e;
                kotlin.jvm.internal.o.f(stat, "stat");
                java.lang.String upperCase = stat.toUpperCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.o.f(upperCase, "toUpperCase(...)");
                if (kotlin.jvm.internal.o.b(upperCase, "R") && (b17 = a06.d.b((((float) (threadJiffiesSnapshot.f395552a.longValue() * 10)) * 100.0f) / ((float) o2Var.f395487d))) >= 50) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("Thread WatchDog Alert: ");
                    sb7.append(threadJiffiesSnapshot.f52566c);
                    sb7.append(", tid=");
                    sb7.append(threadJiffiesSnapshot.f52565b);
                    sb7.append(", cpuLoad=");
                    sb7.append(b17);
                    sb7.append("%, chargeLoad=");
                    qh.b bVar = this.f221773c;
                    sb7.append(bVar.f363312e);
                    sb7.append('%');
                    com.tencent.mars.xlog.Log.w("MicroMsg.ThreadProfiler", sb7.toString());
                    ph.u e17 = gi.d.e();
                    if (e17 == null || (str = e17.f354296h.f363335d.A.a(threadJiffiesSnapshot.f52565b)) == null) {
                        str = "";
                    }
                    ap.a.b(10002, "ThreadProfiler", r26.i0.t(r26.i0.t(str, "\n", ";", false), "\t", "", false), null, "WatchDogAlert", threadJiffiesSnapshot.f52566c, java.lang.String.valueOf(b17), java.lang.String.valueOf(bVar.f363312e));
                    int i18 = com.tencent.mm.feature.performance.api.a.f67523m0;
                }
            }
        }
    }
}
