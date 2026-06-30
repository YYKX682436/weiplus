package rh;

/* loaded from: classes12.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh.g f395306d;

    public b(rh.g gVar) {
        this.f395306d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        rh.g gVar = this.f395306d;
        synchronized (gVar.f395393e) {
            for (int i17 = 0; i17 < gVar.f395393e.size(); i17++) {
                java.util.List list = (java.util.List) gVar.f395393e.valueAt(i17);
                if (list != null && list.size() > gVar.f395397i) {
                    wh.j2.b(list);
                }
            }
        }
        if (((java.util.ArrayList) gVar.f395390b).size() > gVar.f395397i) {
            oj.j.f("Matrix.battery.AbsTaskMonitorFeature", "cooling task jiffies list, before = " + ((java.util.ArrayList) gVar.f395390b).size(), new java.lang.Object[0]);
            java.util.List n17 = gVar.n(0L);
            gVar.l();
            oj.j.f("Matrix.battery.AbsTaskMonitorFeature", "cooling task jiffies list, after = " + ((java.util.ArrayList) gVar.f395390b).size(), new java.lang.Object[0]);
            oj.j.f("Matrix.battery.AbsTaskMonitorFeature", "report task jiffies list overheat", new java.lang.Object[0]);
            gVar.s(n17);
        }
    }
}
