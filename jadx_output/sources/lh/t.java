package lh;

/* loaded from: classes12.dex */
public final class t {

    /* renamed from: e, reason: collision with root package name */
    public static boolean f318630e = true;

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f318631f = jz5.h.b(lh.m.f318619d);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f318632g = jz5.h.b(lh.n.f318620d);

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f318633h = jz5.h.b(lh.o.f318621d);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f318634a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f318635b;

    /* renamed from: c, reason: collision with root package name */
    public rh.c1 f318636c;

    /* renamed from: d, reason: collision with root package name */
    public int f318637d;

    public t(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        this.f318634a = name;
        this.f318635b = jz5.h.b(lh.s.f318629d);
    }

    public final void a() {
        synchronized (((java.util.List) ((jz5.n) this.f318635b).getValue())) {
            this.f318637d = 0;
            rh.c1 c1Var = this.f318636c;
            if (c1Var != null) {
                c1Var.l();
            }
            this.f318636c = null;
            ((ku5.t0) ku5.t0.f312615d).A("MicroMsg.battery.CpuAlertInspector");
            kz5.h0.B((java.util.List) ((jz5.n) this.f318635b).getValue(), lh.r.f318628d);
        }
    }

    public final java.util.List b() {
        float o17 = wh.m.o();
        java.util.List k17 = kz5.c0.k(new lh.q(this, 10, 10.0f * o17), new lh.q(this, 20, 7.5f * o17), new lh.q(this, 60, 2.5f * o17), new lh.q(this, 120, o17 * 1.25f));
        java.util.Iterator it = k17.iterator();
        while (it.hasNext()) {
            ((ku5.t0) ku5.t0.f312615d).l((lh.q) it.next(), r2.f318625e * 60000, "MicroMsg.battery.CpuAlertInspector");
        }
        return k17;
    }

    public final void c(int i17) {
        gi.w0 w0Var = null;
        if (mm.k.j(mm.k.f328503n, null, 1, null)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.battery.CpuAlertInspector", "#start " + this.f318634a + ": loop=" + i17);
            ph.u e17 = gi.d.e();
            if (e17 != null) {
                w0Var = new gi.w0(e17.f354296h, "biz");
                w0Var.f395327i.putString("extra_module_name", this.f318634a);
                w0Var.f395327i.putLong("extra_report_during", 300000L);
                w0Var.F(com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot.class);
            }
            if (w0Var != null) {
                w0Var.I();
                synchronized (((java.util.List) ((jz5.n) this.f318635b).getValue())) {
                    a();
                    this.f318637d = i17;
                    this.f318636c = w0Var;
                    ((java.util.List) ((jz5.n) this.f318635b).getValue()).addAll(b());
                }
            }
        }
    }
}
