package gi;

/* loaded from: classes12.dex */
public final class h1 extends rh.a {

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f272038b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public android.app.Application.ActivityLifecycleCallbacks f272039c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f272040d;

    @Override // rh.e3
    public int b() {
        return 0;
    }

    @Override // rh.a, rh.e3
    public void c() {
        android.os.PowerManager powerManager;
        super.c();
        this.f272039c = new gi.j1(this);
        com.tencent.mm.sdk.platformtools.i.a().registerActivityLifecycleCallbacks(this.f272039c);
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            try {
                if (!j62.e.g().a("clicfg_battery_thermal_alert", "1", false, true).equals("1") || (powerManager = (android.os.PowerManager) this.f395294a.d().getSystemService("power")) == null) {
                    return;
                }
                java.lang.Object obj = this.f272040d;
                if (obj != null) {
                    try {
                        powerManager.removeThermalStatusListener((android.os.PowerManager.OnThermalStatusChangedListener) obj);
                    } catch (java.lang.Throwable unused) {
                    }
                }
                android.os.PowerManager.OnThermalStatusChangedListener onThermalStatusChangedListener = new android.os.PowerManager.OnThermalStatusChangedListener() { // from class: gi.h1$$e
                    @Override // android.os.PowerManager.OnThermalStatusChangedListener
                    public final void onThermalStatusChanged(final int i17) {
                        final gi.h1 h1Var = gi.h1.this;
                        h1Var.f395294a.f363337f.post(new java.lang.Runnable() { // from class: gi.h1$$f
                            @Override // java.lang.Runnable
                            public final void run() {
                                gi.h1.this.getClass();
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ThermalStatus = ");
                                int i18 = i17;
                                sb6.append(i18);
                                com.tencent.mars.xlog.Log.i("Matrix.battery.ModuleJiffiesMonitor", sb6.toString());
                                if (android.os.Build.VERSION.SDK_INT < 29) {
                                    java.util.List list = ri.p.f395959a;
                                    return;
                                }
                                int i19 = ri.p.f395960b;
                                ri.p.f395960b = i18;
                                if (com.tencent.mm.sdk.platformtools.x2.n()) {
                                    boolean c17 = mm.o.c();
                                    boolean z17 = i18 >= 4 && i18 <= 6 && i19 < i18;
                                    if (c17 || z17) {
                                        java.util.ArrayList arrayList = new java.util.ArrayList();
                                        if (c17) {
                                            arrayList.add(java.lang.Boolean.FALSE);
                                        }
                                        if (z17) {
                                            arrayList.add(java.lang.Boolean.TRUE);
                                        }
                                        long currentTimeMillis = ri.p.f395961c != 0 ? (java.lang.System.currentTimeMillis() - ri.p.f395961c) / 60000 : 0L;
                                        qh.b a17 = qh.b.a();
                                        java.lang.String f17 = ri.i.f();
                                        java.lang.String a18 = ri.t.a();
                                        int m17 = wh.m.m(com.tencent.mm.sdk.platformtools.x2.f193071a);
                                        com.tencent.mars.xlog.Log.i("Matrix.battery.BatteryReporter", "#reportThermalStatus");
                                        java.util.Iterator it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            boolean booleanValue = ((java.lang.Boolean) it.next()).booleanValue();
                                            android.util.SparseArray sparseArray = ri.s.f396008a;
                                            ri.s.b(booleanValue ? 1 : 0, 5, f17, "duringMin", a17.c(), a17.d(), "thermalStatus".concat(booleanValue ? "Exception" : "Stat"), i18, "lastStatus", i19, "duringMin", currentTimeMillis, a18, "", m17, 0L, 0L, "");
                                            ri.p.f395961c = java.lang.System.currentTimeMillis();
                                            m17 = m17;
                                        }
                                    }
                                }
                            }
                        });
                    }
                };
                this.f272040d = onThermalStatusChangedListener;
                powerManager.addThermalStatusListener(onThermalStatusChangedListener);
            } catch (java.lang.Exception unused2) {
            }
        }
    }

    @Override // rh.a, rh.e3
    public void e() {
        super.e();
        if (this.f272039c != null) {
            com.tencent.mm.sdk.platformtools.i.a().unregisterActivityLifecycleCallbacks(this.f272039c);
        }
        ((java.util.HashMap) this.f272038b).clear();
        if (android.os.Build.VERSION.SDK_INT < 29 || this.f272040d == null) {
            return;
        }
        try {
            android.os.PowerManager powerManager = (android.os.PowerManager) this.f395294a.d().getSystemService("power");
            if (powerManager != null) {
                powerManager.removeThermalStatusListener((android.os.PowerManager.OnThermalStatusChangedListener) this.f272040d);
            }
        } catch (java.lang.Throwable unused) {
        }
        this.f272040d = null;
    }

    @Override // rh.a
    public java.lang.String i() {
        return "Matrix.battery.ModuleJiffiesMonitor";
    }

    public final void k(gi.l1 l1Var, boolean z17) {
        com.tencent.mars.xlog.Log.i("Matrix.battery.ModuleJiffiesMonitor", "traceEnd: " + l1Var.hashCode());
        rh.c1 c1Var = l1Var.f272068c;
        synchronized (l1Var) {
            l1Var.f272069d = true;
            if (!z17) {
                c1Var.l();
            } else if (c1Var instanceof gi.w0) {
                ((gi.w0) c1Var).a();
                c1Var.b();
            }
        }
    }
}
