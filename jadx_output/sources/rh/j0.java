package rh;

/* loaded from: classes12.dex */
public class j0 implements rh.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.o2 f395423a;

    public j0(rh.k0 k0Var, rh.o2 o2Var) {
        this.f395423a = o2Var;
    }

    @Override // rh.a1
    public long a(java.lang.String str) {
        long longValue;
        rh.o2 o2Var = this.f395423a;
        if (str != null) {
            for (rh.o2 o2Var2 : ((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot) o2Var.f395486c).f52584f) {
                if (((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) o2Var2.f395486c).f52560f.equals(str)) {
                    longValue = ((java.lang.Long) ((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) o2Var2.f395486c).f52561g.f395552a).longValue();
                }
            }
            return 0L;
        }
        longValue = ((java.lang.Long) ((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot) o2Var.f395486c).f52582d.f395552a).longValue();
        return longValue * 10;
    }
}
