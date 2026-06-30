package kh;

/* loaded from: classes12.dex */
public abstract class d extends rh.g implements kh.e2 {

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f307774k = jz5.h.a(jz5.i.f302829d, new kh.c(this));

    @Override // rh.g, rh.a, rh.e3
    public void c() {
        super.c();
        kotlin.jvm.internal.o.f(this.f395294a.d(), "getContext(...)");
        kh.p2.f307885a.a(this);
    }

    @Override // kh.e2
    public void d() {
    }

    @Override // kh.e2
    public void f() {
        ((kh.d2) this.f307774k.getValue()).a();
    }

    @Override // rh.g
    public boolean t(rh.o2 delta) {
        kotlin.jvm.internal.o.g(delta, "delta");
        kh.d2 d2Var = (kh.d2) this.f307774k.getValue();
        rh.f fVar = (rh.f) delta.f395486c;
        java.lang.String name = fVar.f395375e;
        kotlin.jvm.internal.o.f(name, "name");
        java.lang.Number number = fVar.f395377g.f395552a;
        kotlin.jvm.internal.o.f(number, "get(...)");
        long longValue = number.longValue();
        d2Var.getClass();
        if (kh.d2.f307778c.a()) {
            d2Var.b().lock(new kh.b2(d2Var, name, longValue));
        }
        return super.t(delta);
    }

    @Override // rh.g
    public void u(rh.f bgn, rh.f end) {
        kotlin.jvm.internal.o.g(bgn, "bgn");
        kotlin.jvm.internal.o.g(end, "end");
        if (end.f395374d != bgn.f395374d) {
            com.tencent.mars.xlog.Log.w("Matrix.battery.AbsTaskMonitorFeatureKt", "task tid mismatch: " + bgn + " vs " + end);
            return;
        }
        rh.e eVar = new rh.e(end, bgn, end);
        if (t(eVar)) {
            rh.d3 d3Var = eVar.f395486c;
            com.tencent.mars.xlog.Log.i("Matrix.battery.AbsTaskMonitorFeatureKt", "onTaskReport: %s, jiffies = %s, millis = %s", ((rh.f) d3Var).f395375e, ((rh.f) d3Var).f395377g.f395552a, java.lang.Long.valueOf(eVar.f395487d));
            v(eVar);
            java.util.List list = this.f395390b;
            if (((java.util.ArrayList) list).size() >= this.f395397i) {
                com.tencent.mars.xlog.Log.w("Matrix.battery.AbsTaskMonitorFeatureKt", "task list overheat, size = " + ((java.util.ArrayList) list).size());
                k();
            }
        }
    }

    public void w(java.lang.String key, int i17) {
        rh.f m17;
        kotlin.jvm.internal.o.g(key, "key");
        rh.f fVar = (rh.f) ((java.util.concurrent.ConcurrentHashMap) this.f395391c).remove(java.lang.Integer.valueOf(i17));
        if (fVar == null || (m17 = m(key, android.os.Process.myTid())) == null) {
            return;
        }
        m17.f395381k = true;
        u(fVar, m17);
    }

    public void x(java.lang.String key, int i17) {
        kotlin.jvm.internal.o.g(key, "key");
        pj.e.f354903a.g("Matrix.battery.AbsTaskMonitorFeatureKt", 100, new kh.a(key, i17));
        rh.f m17 = m(key, android.os.Process.myTid());
        if (m17 != null) {
            java.util.Map mTaskJiffiesTrace = this.f395391c;
            kotlin.jvm.internal.o.f(mTaskJiffiesTrace, "mTaskJiffiesTrace");
            ((java.util.concurrent.ConcurrentHashMap) mTaskJiffiesTrace).put(java.lang.Integer.valueOf(i17), m17);
        }
    }
}
