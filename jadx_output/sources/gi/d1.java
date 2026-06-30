package gi;

/* loaded from: classes12.dex */
public abstract class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final rh.c1 f272021a;

    public d1(qh.f0 f0Var, java.lang.String str) {
        this.f272021a = new gi.w0(f0Var, str);
        a();
    }

    public abstract void a();

    public gi.d1 b(boolean z17, boolean z18) {
        rh.c1 c1Var = this.f272021a;
        c1Var.F(com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.class);
        if (z17) {
            c1Var.F(com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot.class);
        }
        if (z18) {
            c1Var.F(rh.n1.class);
        }
        return this;
    }

    public gi.d1 c() {
        this.f272021a.F(rh.f1.class);
        return this;
    }

    public gi.d1 d() {
        rh.c1 c1Var = this.f272021a;
        if (c1Var instanceof gi.w0) {
            gi.w0 monitors = (gi.w0) c1Var;
            ((com.tencent.mm.feature.performance.q) ((ob0.t2) i95.n0.c(ob0.t2.class))).getClass();
            kotlin.jvm.internal.o.g(monitors, "monitors");
            java.lang.String str = monitors.f395337s;
            boolean b17 = kotlin.jvm.internal.o.b(str, "canary");
            qh.f0 f0Var = monitors.f395329k;
            if (b17) {
                cr0.u1 u1Var = cr0.u1.f221760a;
                if (!u1Var.e() ? false : u1Var.g().f221757a) {
                    monitors.F(cr0.k0.class);
                }
                if (cr0.w3.f221800a.b()) {
                    monitors.F(cr0.n3.class);
                }
                if (cr0.k3.f221666a.a()) {
                    monitors.F(cr0.d3.class);
                }
                if ((f0Var != null ? (gi.y1) f0Var.i(gi.y1.class) : null) != null) {
                    monitors.F(gi.x1.class);
                }
                if ((f0Var != null ? (kh.k1) f0Var.i(kh.k1.class) : null) != null) {
                    monitors.F(kh.w0.class);
                    if (kh.b0.f307756f.c()) {
                        monitors.F(kh.a0.class);
                    }
                    if (kh.g.f307802f.c()) {
                        monitors.F(kh.f.class);
                    }
                    if (kh.t3.f307922f.c()) {
                        monitors.F(kh.s3.class);
                    }
                }
            } else if (kotlin.jvm.internal.o.b(str, "module") && kotlin.jvm.internal.o.b(monitors.z(), "Finder")) {
                cr0.u1 u1Var2 = cr0.u1.f221760a;
                if (!u1Var2.e() ? false : u1Var2.g().f221757a) {
                    monitors.F(cr0.k0.class);
                    monitors.F(cr0.j.class);
                }
                if (cr0.w3.f221800a.b()) {
                    monitors.F(cr0.n3.class);
                    monitors.F(cr0.p.class);
                }
                if (cr0.k3.f221666a.a()) {
                    monitors.F(cr0.d3.class);
                }
                if ((f0Var != null ? (gi.y1) f0Var.i(gi.y1.class) : null) != null) {
                    monitors.F(gi.x1.class);
                }
                if ((f0Var != null ? (kh.k1) f0Var.i(kh.k1.class) : null) != null) {
                    monitors.F(kh.w0.class);
                    if (kh.b0.f307756f.c()) {
                        monitors.F(kh.a0.class);
                    }
                    if (kh.g.f307802f.c()) {
                        monitors.F(kh.f.class);
                    }
                    if (kh.t3.f307922f.c()) {
                        monitors.F(kh.s3.class);
                    }
                }
                monitors.H(oh.f.class, 5000L);
            }
        }
        return this;
    }

    public gi.d1 e() {
        if (j62.e.g().a("clicfg_battery_health_enable", "1", false, true).equals("1")) {
            rh.c1 c1Var = this.f272021a;
            c1Var.F(uh.g.class);
            c1Var.F(rh.j1.class);
            c1Var.F(rh.n3.class);
            if ((c1Var instanceof gi.w0) && "biz".equals(c1Var.f395337s)) {
                java.lang.String z17 = ((gi.w0) c1Var).z();
                if ("ExplicitBg".equals(z17) || "ExplicitFg".equals(z17)) {
                    long E1 = com.tencent.mm.sdk.platformtools.t8.E1(j62.e.g().a("clicfg_battery_health_acc_ms", "1", false, true));
                    if (E1 >= 1) {
                        if (E1 == 1) {
                            E1 = "ExplicitBg".equals(z17) ? lh.l0.f318612i : lh.l0.f318611h;
                        }
                        c1Var.H(uh.g.class, E1);
                    }
                }
            }
        }
        return this;
    }

    public gi.d1 f(java.lang.String str) {
        rh.c1 c1Var = this.f272021a;
        if (c1Var instanceof gi.w0) {
            ((gi.w0) c1Var).f395327i.putString("extra_module_name", str);
        }
        return this;
    }

    public gi.d1 g(long j17) {
        boolean equals = j62.e.g().a("clicfg_battery_allpid_enable", "1", false, true).equals("1");
        boolean equals2 = j62.e.g().a("clicfg_battery_thermal_sample_2", "1", false, true).equals("1");
        boolean equals3 = j62.e.g().a("clicfg_battery_cpu_sample", "1", false, true).equals("1");
        rh.c1 c1Var = this.f272021a;
        c1Var.H(rh.t1.class, j17);
        c1Var.H(rh.w1.class, j17);
        c1Var.H(rh.n3.class, j17);
        if (equals2) {
            c1Var.H(rh.c2.class, j17);
            c1Var.H(rh.u1.class, j17);
            c1Var.H(gi.k.class, j17);
            c1Var.H(gi.n.class, j17);
            c1Var.H(gi.o.class, j17);
            if (pj.h.f354909a) {
                c1Var.H(gi.l.class, j17);
                c1Var.H(gi.m.class, j17);
            }
        }
        if (equals3) {
            c1Var.H(rh.f1.class, j17);
            c1Var.H(rh.r1.class, j17);
        }
        if (equals) {
            c1Var.H(com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot.class, j17);
        }
        return this;
    }

    public gi.d1 h(long j17) {
        rh.c1 c1Var = this.f272021a;
        if (c1Var instanceof gi.w0) {
            ((gi.w0) c1Var).f395327i.putLong("extra_report_during", j17);
        }
        return this;
    }
}
