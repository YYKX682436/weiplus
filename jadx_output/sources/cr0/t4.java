package cr0;

/* loaded from: classes12.dex */
public final class t4 implements gi.l0 {
    @Override // gi.l0
    public void a(rh.y2 threadJiffiesList) {
        qh.b bVar;
        kotlin.jvm.internal.o.g(threadJiffiesList, "threadJiffiesList");
        ph.u e17 = gi.d.e();
        if (e17 != null) {
            qh.w wVar = e17.f354296h.f363335d.f363283b;
            ri.k kVar = wVar instanceof ri.k ? (ri.k) wVar : null;
            if (kVar != null) {
                rh.c1 m17 = kVar.f363389e.m();
                kotlin.jvm.internal.o.f(m17, "fork(...)");
                if (m17.E()) {
                    m17.l();
                }
                java.util.List list = threadJiffiesList.f395560a;
                kotlin.jvm.internal.o.f(list, "getList(...)");
                boolean z17 = true;
                if (!list.isEmpty()) {
                    synchronized (m17) {
                        if (m17.E() || m17.f395330l == null) {
                            z17 = false;
                        }
                    }
                    if (!z17 || (bVar = m17.f395330l) == null || bVar.g()) {
                        return;
                    }
                    m17.u(com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.class, new cr0.u4(m17, list, bVar));
                }
            }
        }
    }
}
