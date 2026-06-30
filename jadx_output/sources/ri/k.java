package ri;

/* loaded from: classes12.dex */
public class k extends qh.v {

    /* renamed from: g, reason: collision with root package name */
    public int f395893g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f395894h;

    @Override // qh.v, rh.i3
    public void a(rh.h3 h3Var) {
        java.lang.String str = h3Var.f395410a;
        java.lang.String str2 = h3Var.f395411b;
        java.lang.String str3 = h3Var.f395412c;
        long j17 = h3Var.f395413d;
        java.util.List list = ri.p.f395959a;
        qh.b a17 = qh.b.a();
        if (a17.f363320m) {
            int c17 = a17.c();
            int d17 = a17.d();
            java.lang.String f17 = ri.i.f();
            long max = j17 > 0 ? java.lang.Math.max(1L, j17 / 60000) : 0L;
            java.lang.String str4 = android.text.TextUtils.isEmpty(str2) ? "empty" : str2;
            com.tencent.mars.xlog.Log.i("Matrix.battery.BatteryReporter", "#reportIllegalNotification");
            android.util.SparseArray sparseArray = ri.s.f396008a;
            if (android.text.TextUtils.isEmpty(str)) {
                str = "empty";
            }
            ri.s.b(1, 5, f17, str4, c17, d17, "illNotify", 0L, str, 0L, "duringMin", max, a17.f363316i, str3, a17.f363309b, a17.f363312e, a17.f363317j, "");
        }
    }

    @Override // qh.v, rh.r3
    public void b(final rh.w3 w3Var, final long j17) {
        java.lang.String str = w3Var.f395540b;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.lang.String str2 = w3Var.f395541c;
        com.tencent.mars.xlog.Log.i("Matrix.battery.listener", "#onBgWakeLockTimeout tag=%s packageName=%s millis=%s", str, str2, valueOf);
        jx3.f.INSTANCE.idkeyStat(1540L, 50L, 1L, false);
        if (!android.text.TextUtils.isEmpty(w3Var.f395542d)) {
            final long a17 = w3Var.a();
            this.f363389e.x(rh.w.class, new wh.t0() { // from class: ri.k$$a
                @Override // wh.t0
                public final void accept(java.lang.Object obj) {
                    final long j18 = a17;
                    final long j19 = j17;
                    final rh.w3 w3Var2 = w3Var;
                    rh.w wVar = (rh.w) obj;
                    ri.k kVar = ri.k.this;
                    kVar.getClass();
                    rh.v k17 = wVar.k(j18);
                    if (k17.f395365c) {
                        final long longValue = ((java.lang.Long) k17.f395520f.f395552a).longValue();
                        wh.h2 b17 = wVar.l(j18).b();
                        if (b17 != null) {
                            final java.lang.String str3 = b17.f445796a;
                            final long j27 = b17.f445797b;
                            kVar.f363389e.x(rh.d2.class, new wh.t0() { // from class: ri.k$$d
                                @Override // wh.t0
                                public final void accept(java.lang.Object obj2) {
                                    long j28 = j19;
                                    long j29 = longValue;
                                    java.lang.String str4 = str3;
                                    long j37 = j27;
                                    rh.a2 m17 = ((rh.d2) obj2).m(j18);
                                    if (m17.f395365c) {
                                        long longValue2 = ((java.lang.Long) m17.f395300e.f395552a).longValue();
                                        com.tencent.mars.xlog.Log.w("Matrix.battery.listener", "#onBgWakeLockTimeout report as exception!");
                                        java.util.List list = ri.p.f395959a;
                                        java.lang.String f17 = ri.i.f();
                                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                        rh.w3 w3Var3 = w3Var2;
                                        sb6.append(w3Var3.f395541c);
                                        sb6.append("-");
                                        sb6.append(w3Var3.f395540b);
                                        java.lang.String sb7 = sb6.toString();
                                        int d17 = ri.i.d();
                                        int e17 = ri.i.e();
                                        com.tencent.mars.xlog.Log.i("Matrix.battery.BatteryReporter", "#reportWakeLocksOvertimeBg, mills = " + j28);
                                        android.util.SparseArray sparseArray = ri.s.f396008a;
                                        ri.s.b(1, 5, f17, sb7, d17, e17, "wakeBgException", j28, "lockMils", w3Var3.a(), "flag", (long) w3Var3.f395539a, str4, w3Var3.f395542d, j29, longValue2, j37, "");
                                    }
                                }
                            });
                        }
                    }
                }
            });
        }
        if (w3Var.a() > 3600000 || !mm.o.c()) {
            return;
        }
        java.lang.String f17 = ri.i.f();
        java.lang.String str3 = str2 + "-" + w3Var.f395540b;
        int d17 = ri.i.d();
        int e17 = ri.i.e();
        java.lang.String a18 = ri.t.a();
        com.tencent.mars.xlog.Log.i("Matrix.battery.BatteryReporter", "#statBgWakeLocks, millis = " + j17);
        android.util.SparseArray sparseArray = ri.s.f396008a;
        ri.s.b(0, 5, f17, str3, d17, e17, "wakeBgWarning", j17, "lockMils", w3Var.a(), "flag", (long) w3Var.f395539a, a18, w3Var.f395542d, 0L, 0L, 0L, "");
    }

    @Override // qh.v, qh.e0
    public void c(boolean z17) {
        rh.e3 w17;
        com.tencent.mars.xlog.Log.i("Matrix.battery.listener", "#onTraceEnd, fg = " + z17);
        if ((z65.c.a() || com.tencent.mm.sdk.platformtools.s9.f192975c) && (w17 = this.f363389e.w(com.tencent.matrix.batterycanary.stats.k.class)) != null) {
            ((com.tencent.matrix.batterycanary.stats.k) w17).k("Canary End: count = " + this.f395893g + ", fg = " + z17, 0, java.util.Collections.emptyMap());
        }
        super.c(z17);
    }

    @Override // qh.v, qh.e0
    public void d() {
        rh.e3 w17;
        com.tencent.mars.xlog.Log.i("Matrix.battery.listener", "#onTraceBegin");
        if (this.f363389e.E()) {
            com.tencent.mars.xlog.Log.w("Matrix.battery.listener", "monitors is still running, cancel it before a re-start");
            this.f363389e.a();
            this.f363389e.b();
        }
        if ((z65.c.a() || com.tencent.mm.sdk.platformtools.s9.f192975c) && (w17 = this.f363389e.w(com.tencent.matrix.batterycanary.stats.k.class)) != null) {
            ((com.tencent.matrix.batterycanary.stats.k) w17).k("Canary Begin: count = " + this.f395893g, 0, java.util.Collections.emptyMap());
        }
        super.d();
    }

    @Override // qh.v, rh.t
    public void e(boolean z17, int i17, int i18, android.content.ComponentName componentName, long j17) {
        com.tencent.mars.xlog.Log.i("Matrix.battery.listener", "statForegroundServiceLeak");
        if ((z17 || com.tencent.mm.sdk.platformtools.x2.n()) && mm.o.c() && componentName != null) {
            java.lang.String f17 = ri.i.f();
            java.lang.String className = componentName.getClassName();
            int d17 = ri.i.d();
            int e17 = ri.i.e();
            java.lang.String a17 = ri.t.a();
            com.tencent.mars.xlog.Log.i("Matrix.battery.BatteryReporter", "#statForegroundServiceLeak, isMyself = " + z17);
            android.util.SparseArray sparseArray = ri.s.f396008a;
            ri.s.b(0, 5, f17, className, d17, e17, z17 ? "statMyImportance" : "statOtherImportance", i17, "gblIpt", i18, "duringMin", j17, a17, "", 0L, 0L, 0L, "");
        }
    }

    @Override // qh.v, rh.f2
    public void f(rh.o2 o2Var) {
        gi.w0 w0Var = new gi.w0(this.f363388d, "internal");
        w0Var.f395330l = qh.b.b(o2Var.f395487d);
        ((java.util.HashMap) w0Var.f395321c).put(rh.g2.class, o2Var);
        new ri.n("internal").a(w0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02d8 A[LOOP:7: B:86:0x02d6->B:87:0x02d8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x030a A[LOOP:8: B:90:0x0308->B:91:0x030a, LOOP_END] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [int] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r4v42, types: [java.lang.CharSequence, java.lang.String] */
    @Override // qh.v, com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(rh.y2 r45) {
        /*
            Method dump skipped, instructions count: 991
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ri.k.g(rh.y2):void");
    }

    @Override // qh.v, rh.r3
    public void h(final int i17, final rh.w3 w3Var) {
        java.lang.String str = w3Var.f395540b;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.String str2 = w3Var.f395541c;
        com.tencent.mars.xlog.Log.i("Matrix.battery.listener", "#onWakeLockTimeout tag=%s packageName=%s warningCount=%s", str, str2, valueOf);
        if (i17 <= 1) {
            jx3.f.INSTANCE.idkeyStat(1013L, 201L, 1L, false);
        }
        long j17 = i17;
        if (j17 == java.lang.Math.max(gi.d.f272000h, 2L) && !android.text.TextUtils.isEmpty(w3Var.f395542d)) {
            final long a17 = w3Var.a();
            this.f363389e.x(rh.w.class, new wh.t0() { // from class: ri.k$$b
                @Override // wh.t0
                public final void accept(java.lang.Object obj) {
                    final long j18 = a17;
                    final int i18 = i17;
                    final rh.w3 w3Var2 = w3Var;
                    rh.w wVar = (rh.w) obj;
                    ri.k kVar = ri.k.this;
                    kVar.getClass();
                    rh.v k17 = wVar.k(j18);
                    if (k17.f395365c) {
                        final long longValue = ((java.lang.Long) k17.f395520f.f395552a).longValue();
                        wh.h2 b17 = wVar.l(j18).b();
                        if (b17 != null) {
                            final java.lang.String str3 = b17.f445796a;
                            final long j19 = b17.f445797b;
                            kVar.f363389e.x(rh.d2.class, new wh.t0() { // from class: ri.k$$e
                                @Override // wh.t0
                                public final void accept(java.lang.Object obj2) {
                                    long j27 = longValue;
                                    java.lang.String str4 = str3;
                                    long j28 = j19;
                                    rh.a2 m17 = ((rh.d2) obj2).m(j18);
                                    if (m17.f395365c) {
                                        long longValue2 = ((java.lang.Long) m17.f395300e.f395552a).longValue();
                                        com.tencent.mars.xlog.Log.w("Matrix.battery.listener", "#onWakeLockTimeout report as exception!");
                                        java.util.List list = ri.p.f395959a;
                                        java.lang.String f17 = ri.i.f();
                                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                        rh.w3 w3Var3 = w3Var2;
                                        sb6.append(w3Var3.f395541c);
                                        sb6.append("-");
                                        sb6.append(w3Var3.f395540b);
                                        java.lang.String sb7 = sb6.toString();
                                        int d17 = ri.i.d();
                                        int e17 = ri.i.e();
                                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("#reportWakeLocksOvertime, count = ");
                                        int i19 = i18;
                                        sb8.append(i19);
                                        com.tencent.mars.xlog.Log.i("Matrix.battery.BatteryReporter", sb8.toString());
                                        android.util.SparseArray sparseArray = ri.s.f396008a;
                                        ri.s.b(1, 5, f17, sb7, d17, e17, "wakeWarningException", i19, "lockMils", w3Var3.a(), "flag", w3Var3.f395539a, str4, w3Var3.f395542d, j27, longValue2, j28, "");
                                    }
                                }
                            });
                        }
                    }
                }
            });
        }
        if (i17 > 100 || w3Var.a() > 3600000 || !mm.o.c()) {
            return;
        }
        java.lang.String f17 = ri.i.f();
        java.lang.String str3 = str2 + "-" + w3Var.f395540b;
        int d17 = ri.i.d();
        int e17 = ri.i.e();
        java.lang.String a18 = ri.t.a();
        com.tencent.mars.xlog.Log.i("Matrix.battery.BatteryReporter", "#statWakeLocks, count = " + i17);
        android.util.SparseArray sparseArray = ri.s.f396008a;
        ri.s.b(0, 5, f17, str3, d17, e17, "wakeWarning", j17, "lockMils", w3Var.a(), "flag", (long) w3Var.f395539a, a18, w3Var.f395542d, 0L, 0L, 0L, "");
    }

    @Override // qh.v
    public qh.v i(qh.f0 f0Var) {
        this.f363388d = f0Var;
        this.f363389e = new ri.l(this, f0Var, "canary").f272021a;
        return this;
    }

    @Override // qh.v
    public void j(final rh.c1 c1Var) {
        final qh.b bVar;
        super.j(c1Var);
        if (!gi.d.g(c1Var.f395337s, c1Var) || (bVar = c1Var.f395330l) == null) {
            return;
        }
        c1Var.u(com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.class, new wh.t0() { // from class: ri.k$$f
            @Override // wh.t0
            public final void accept(java.lang.Object obj) {
                final rh.o2 o2Var = (rh.o2) obj;
                if (!o2Var.b() || ((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) o2Var.f395486c).f52562h.f395560a.isEmpty()) {
                    return;
                }
                final qh.b bVar2 = bVar;
                rh.c1.this.x(com.tencent.matrix.batterycanary.monitor.feature.c.class, new wh.t0() { // from class: ri.k$$g
                    @Override // wh.t0
                    public final void accept(java.lang.Object obj2) {
                        ((com.tencent.matrix.batterycanary.monitor.feature.c) obj2).m(qh.b.this.h(), android.os.Process.myPid(), ((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesSnapshot) ((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) o2Var.f395486c).f52562h.f395560a.get(0)).f52565b);
                    }
                });
            }
        });
    }

    @Override // qh.v
    public qh.t k() {
        return new ri.m();
    }

    @Override // qh.v
    public void l(rh.c1 c1Var) {
        com.tencent.mars.xlog.Log.i("Matrix.battery.listener", "onCanaryDump monitors");
        c1Var.q(new wh.t0() { // from class: ri.k$$c
            @Override // wh.t0
            public final void accept(java.lang.Object obj) {
                ri.k kVar = ri.k.this;
                kVar.getClass();
                long j17 = ((qh.b) obj).f363321n;
                if (j17 < gi.d.c()) {
                    com.tencent.mars.xlog.Log.w("Matrix.battery.BatteryReporter", "#batteryDumpError, minWindowMillis = " + gi.d.c() + ", actual = " + j17);
                    if (j17 <= 0) {
                        com.tencent.mars.xlog.Log.e("Matrix.battery.BatteryReporter", "#batteryDumpError fatal, windowMillis = " + j17);
                        jx3.f.INSTANCE.idkeyStat(1540L, 9L, 1L, false);
                    } else {
                        jx3.f.INSTANCE.idkeyStat(1540L, 10L, 1L, false);
                    }
                } else if (j17 <= 600000) {
                    jx3.f.INSTANCE.idkeyStat(1540L, 11L, 1L, false);
                } else if (j17 <= 1200000) {
                    jx3.f.INSTANCE.idkeyStat(1540L, 12L, 1L, false);
                } else if (j17 <= 1800000) {
                    jx3.f.INSTANCE.idkeyStat(1540L, 13L, 1L, false);
                } else {
                    jx3.f.INSTANCE.idkeyStat(1540L, 14L, 1L, false);
                }
                java.lang.String valueOf = java.lang.String.valueOf(android.text.format.DateFormat.format("yyyyMMdd", java.lang.System.currentTimeMillis()));
                if (!android.text.TextUtils.isEmpty(kVar.f395894h) && !kVar.f395894h.equalsIgnoreCase(valueOf)) {
                    kVar.f395893g = 0;
                }
                kVar.f395894h = valueOf;
                int i17 = kVar.f395893g + 1;
                kVar.f395893g = i17;
                int i18 = i17 + 200;
                if (i18 <= 256) {
                    jx3.f.INSTANCE.idkeyStat(1540L, i18, 1L, false);
                }
            }
        });
        super.l(c1Var);
    }

    @Override // qh.v
    public void m(rh.c1 c1Var) {
        new ri.n("canary").a(c1Var);
        super.m(c1Var);
    }
}
