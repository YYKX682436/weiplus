package rh;

/* loaded from: classes12.dex */
public final class f1 extends rh.d3 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f395385d = java.util.Collections.emptyList();

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f395386e = java.util.Collections.emptyList();

    /* renamed from: f, reason: collision with root package name */
    public int f395387f = android.os.Process.myPid();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f395388g = wh.m.s();

    @Override // rh.d3
    public rh.o2 a(rh.d3 d3Var) {
        return new rh.e1(this, (rh.f1) d3Var, this);
    }

    public double b(wh.n1 n1Var) {
        double d17 = 0.0d;
        if (!n1Var.l()) {
            return 0.0d;
        }
        for (int i17 = 0; i17 < this.f395385d.size(); i17++) {
            java.util.List list = ((rh.y2) this.f395385d.get(i17)).f395560a;
            for (int i18 = 0; i18 < list.size(); i18++) {
                d17 += n1Var.d(n1Var.f(i17), i18) * ((((java.lang.Long) ((rh.x2) list.get(i18)).f395552a).longValue() * 10.0d) / 3600000.0d);
            }
        }
        return d17;
    }

    public double c(wh.n1 n1Var, long j17) {
        double d17 = 0.0d;
        if (!n1Var.l()) {
            return 0.0d;
        }
        java.util.Iterator it = this.f395386e.iterator();
        long j18 = 0;
        while (it.hasNext()) {
            java.util.Iterator it6 = ((rh.y2) it.next()).f395560a.iterator();
            while (it6.hasNext()) {
                j18 += ((java.lang.Long) ((rh.x2) it6.next()).f395552a).longValue();
            }
        }
        for (int i17 = 0; i17 < this.f395386e.size(); i17++) {
            java.util.List list = ((rh.y2) this.f395386e.get(i17)).f395560a;
            for (int i18 = 0; i18 < list.size(); i18++) {
                d17 += n1Var.d(i17, i18) * ((((((java.lang.Long) ((rh.x2) list.get(i18)).f395552a).longValue() / j18) * j17) * 10.0d) / 3600000.0d);
            }
        }
        return d17;
    }
}
