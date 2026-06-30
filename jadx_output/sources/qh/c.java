package qh;

/* loaded from: classes12.dex */
public class c implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesEntry f363323a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f363324b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qh.b f363325c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qh.d f363326d;

    public c(qh.d dVar, com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesEntry threadJiffiesEntry, long j17, qh.b bVar) {
        this.f363326d = dVar;
        this.f363323a = threadJiffiesEntry;
        this.f363324b = j17;
        this.f363325c = bVar;
    }

    @Override // wh.t0
    public void accept(java.lang.Object obj) {
        com.tencent.matrix.batterycanary.monitor.feature.c cVar = (com.tencent.matrix.batterycanary.monitor.feature.c) obj;
        com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesEntry threadJiffiesEntry = this.f363323a;
        long longValue = ((java.lang.Long) threadJiffiesEntry.f395552a).longValue();
        long j17 = this.f363324b;
        long j18 = longValue / j17;
        boolean h17 = this.f363325c.h();
        qh.d dVar = this.f363326d;
        if (h17) {
            if (j17 <= 10 || j18 <= dVar.f363330b.f363334b.f363388d.f363335d.f363291j) {
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("threadWatchDog fg set, name = ");
            rh.o2 o2Var = dVar.f363329a;
            sb6.append(((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) o2Var.f395486c).f52560f);
            sb6.append(", pid = ");
            sb6.append(((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) o2Var.f395486c).f52558d);
            sb6.append(", tid = ");
            sb6.append(threadJiffiesEntry.f52565b);
            oj.j.c("Matrix.battery.BatteryPrinter", sb6.toString(), new java.lang.Object[0]);
            cVar.m(true, ((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) o2Var.f395486c).f52558d, threadJiffiesEntry.f52565b);
            return;
        }
        if (j17 <= 10 || j18 <= dVar.f363330b.f363334b.f363388d.f363335d.f363292k) {
            return;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("threadWatchDog bg set, name = ");
        rh.o2 o2Var2 = dVar.f363329a;
        sb7.append(((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) o2Var2.f395486c).f52560f);
        sb7.append(", pid = ");
        sb7.append(((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) o2Var2.f395486c).f52558d);
        sb7.append(", tid = ");
        sb7.append(threadJiffiesEntry.f52565b);
        oj.j.c("Matrix.battery.BatteryPrinter", sb7.toString(), new java.lang.Object[0]);
        cVar.m(false, ((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) o2Var2.f395486c).f52558d, threadJiffiesEntry.f52565b);
    }
}
