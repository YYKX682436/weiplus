package rh;

/* loaded from: classes12.dex */
public final class d2 extends rh.a {

    /* renamed from: b, reason: collision with root package name */
    public rh.x1 f395360b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.List f395361c = java.util.Collections.emptyList();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f395362d = new rh.o1(this);

    @Override // rh.a, rh.e3
    public void a(boolean z17) {
        super.a(z17);
    }

    @Override // rh.e3
    public int b() {
        return Integer.MAX_VALUE;
    }

    @Override // rh.a, rh.e3
    public void c() {
        super.c();
        wh.f2 f2Var = new wh.f2(java.lang.String.valueOf(wh.m.r(this.f395294a.d())));
        synchronized ("Matrix.battery.DeviceStatusMonitorFeature") {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.f395361c = arrayList;
            arrayList.add(0, f2Var);
        }
        rh.x1 x1Var = this.f395360b;
        x1Var.f395551d = new rh.p1(this);
        if (x1Var.f395549b) {
            return;
        }
        this.f395294a.d();
        if (x1Var.f395549b) {
            return;
        }
        if (!ph.t.o()) {
            throw new java.lang.IllegalStateException("BatteryEventDelegate is not yet init!");
        }
        x1Var.f395550c = new rh.y1(x1Var, true);
        boolean d17 = ph.t.k().c().d();
        x1Var.f395551d.accept(java.lang.Integer.valueOf(d17 ? 1 : 2));
        x1Var.f395548a = d17;
        ph.t.k().b(x1Var.f395550c);
        x1Var.f395549b = true;
    }

    @Override // rh.a, rh.e3
    public void e() {
        super.e();
        rh.x1 x1Var = this.f395360b;
        if (x1Var.f395549b) {
            try {
                if (x1Var.f395550c != null && ph.t.o()) {
                    ph.t.k().p(x1Var.f395550c);
                }
            } catch (java.lang.Throwable unused) {
            }
            x1Var.f395549b = false;
        }
    }

    @Override // rh.a, rh.e3
    public void h(qh.f0 f0Var) {
        super.h(f0Var);
        this.f395360b = new rh.x1();
    }

    @Override // rh.a
    public java.lang.String i() {
        return "Matrix.battery.DeviceStatusMonitorFeature";
    }

    public rh.t1 k(android.content.Context context) {
        int i17;
        rh.t1 t1Var = new rh.t1();
        this.f395294a.getClass();
        try {
            i17 = wh.m.l(context);
            oj.j.c("Matrix.battery.BatteryMonitorCore", "onGetTemperature, battery = " + i17, new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.battery.BatteryMonitorCore", th6, "#currentBatteryTemperature error", new java.lang.Object[0]);
            i17 = -1;
        }
        t1Var.f395508d = rh.x2.b(java.lang.Integer.valueOf(i17));
        return t1Var;
    }

    public rh.w1 l(int[] iArr) {
        rh.w1 w1Var = new rh.w1();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 : iArr) {
            arrayList.add(rh.x2.b(java.lang.Integer.valueOf(i17)));
        }
        rh.y2 y2Var = new rh.y2();
        y2Var.f395560a = arrayList;
        w1Var.f395538d = y2Var;
        return w1Var;
    }

    public rh.a2 m(long j17) {
        try {
            wh.i2 a17 = wh.j2.a(this.f395361c, j17, 10L, new rh.q1(this));
            rh.a2 a2Var = new rh.a2();
            a2Var.f395365c = a17.f445804c;
            a2Var.f395299d = rh.x2.b(java.lang.Long.valueOf(a17.f445802a));
            a2Var.f395300e = rh.x2.b(java.lang.Long.valueOf(a17.a("1")));
            a2Var.f395301f = rh.x2.b(java.lang.Long.valueOf(a17.a("2")));
            a2Var.f395302g = rh.x2.b(java.lang.Long.valueOf(a17.a("3")));
            a2Var.f395303h = rh.x2.b(java.lang.Long.valueOf(a17.a("4")));
            return a2Var;
        } catch (java.lang.Throwable th6) {
            oj.j.f("Matrix.battery.DeviceStatusMonitorFeature", "configureSnapshot fail: " + th6.getMessage(), new java.lang.Object[0]);
            rh.a2 a2Var2 = new rh.a2();
            a2Var2.f395365c = false;
            return a2Var2;
        }
    }
}
