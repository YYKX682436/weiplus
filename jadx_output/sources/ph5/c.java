package ph5;

/* loaded from: classes12.dex */
public final class c implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final wh.t0 f354491a;

    public c(wh.t0 t0Var) {
        this.f354491a = t0Var;
    }

    @Override // wh.t0
    public void accept(java.lang.Object obj) {
        rh.o2 o2Var = (rh.o2) obj;
        if (o2Var != null) {
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot jiffiesMonitorFeature$JiffiesSnapshot = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) o2Var.f395486c;
            if (jiffiesMonitorFeature$JiffiesSnapshot.f52558d != android.os.Process.myPid()) {
                int i17 = jiffiesMonitorFeature$JiffiesSnapshot.f52558d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesEntry threadJiffiesEntry : jiffiesMonitorFeature$JiffiesSnapshot.f52562h.f395560a) {
                    float k17 = sh.c.k(((java.lang.Long) threadJiffiesEntry.f395552a).longValue(), o2Var.f395487d / 10);
                    if (k17 >= 1.0f) {
                        arrayList.add(java.lang.Integer.valueOf(threadJiffiesEntry.f52565b));
                    } else if (k17 < 0.1f || arrayList.size() >= 3) {
                        break;
                    } else {
                        arrayList.add(java.lang.Integer.valueOf(threadJiffiesEntry.f52565b));
                    }
                }
                if (!arrayList.isEmpty()) {
                    ph5.b.a(i17, arrayList);
                    return;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TopThreadDumpTask", "Dump skip, no tid needs");
                    ph5.b.c("Skip dump: no tid needed", 0);
                    return;
                }
            }
        }
        this.f354491a.accept(o2Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.TopThreadDumpTask", "Dump local process finished");
    }
}
