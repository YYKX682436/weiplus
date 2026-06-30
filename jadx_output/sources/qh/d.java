package qh;

/* loaded from: classes12.dex */
public class d implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.o2 f363329a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qh.e f363330b;

    public d(qh.e eVar, rh.o2 o2Var) {
        this.f363330b = eVar;
        this.f363329a = o2Var;
    }

    @Override // wh.t0
    public void accept(java.lang.Object obj) {
        qh.b bVar = (qh.b) obj;
        long e17 = bVar.e();
        for (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesEntry threadJiffiesEntry : ((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) this.f363329a.f395486c).f52562h.f395560a) {
            if (threadJiffiesEntry.f52568e.toUpperCase().contains("R")) {
                this.f363330b.f363333a.x(com.tencent.matrix.batterycanary.monitor.feature.c.class, new qh.c(this, threadJiffiesEntry, e17, bVar));
            }
        }
    }
}
