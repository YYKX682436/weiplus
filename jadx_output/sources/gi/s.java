package gi;

/* loaded from: classes12.dex */
public class s extends ph.f {

    /* renamed from: b, reason: collision with root package name */
    public long f272102b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Runnable f272103c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f272104d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f272105e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(boolean z17, final android.content.Context context, boolean z18) {
        super(z17);
        this.f272104d = context;
        this.f272105e = z18;
        this.f272102b = 0L;
        this.f272103c = new java.lang.Runnable() { // from class: gi.s$$b
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mars.xlog.Log.i("Matrix.battery.LifeCycle", "onRefreshHealthStats");
                gi.u0.c(context);
            }
        };
    }

    @Override // ph.f, ph.g
    public boolean a(final ph.c cVar, int i17) {
        ku5.u0 u0Var = ku5.t0.f312615d;
        final android.content.Context context = this.f272104d;
        ((ku5.t0) u0Var).g(new java.lang.Runnable() { // from class: gi.s$$d
            /* JADX WARN: Removed duplicated region for block: B:18:0x01a1 A[Catch: all -> 0x01c0, TryCatch #0 {all -> 0x01c0, blocks: (B:12:0x0175, B:14:0x0184, B:16:0x0199, B:18:0x01a1, B:19:0x01a7), top: B:11:0x0175 }] */
            /* JADX WARN: Removed duplicated region for block: B:21:0x01a6  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x016f  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 474
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: gi.s$$d.run():void");
            }
        });
        return false;
    }

    @Override // ph.f, ph.g
    public boolean c(ph.c cVar, int i17) {
        if (mm.o.c()) {
            qh.b a17 = qh.b.a();
            if (a17.f363320m) {
                java.lang.String f17 = ri.i.f();
                int c17 = a17.c();
                int d17 = a17.d();
                ri.r$$a r__a = new ri.r$$a();
                android.util.SparseArray sparseArray = ri.s.f396008a;
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                r__a.accept(linkedHashMap);
                java.lang.String a18 = ri.s.a(linkedHashMap);
                com.tencent.mars.xlog.Log.i("Matrix.battery.BatteryReporter", "#statSamplingData");
                ri.s.b(0, 5, f17, a18, c17, d17, "samplingData", 0L, "", 0L, "", 0L, a17.f363316i, "", a17.f363309b, a17.f363312e, a17.f363317j, "");
            }
        }
        if (i17 >= 430 && ((mm.l.b() || i17 >= 450) && com.tencent.mm.sdk.platformtools.x2.n() && !com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.isBackground())) {
            java.util.List list = ri.p.f395959a;
            qh.b a19 = qh.b.a();
            java.lang.String f18 = ri.i.f();
            java.lang.String a27 = ri.t.a();
            ri.p$$j p__j = new ri.p$$j();
            android.util.SparseArray sparseArray2 = ri.s.f396008a;
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            p__j.accept(linkedHashMap2);
            java.lang.String a28 = ri.s.a(linkedHashMap2);
            int u17 = wh.m.u(com.tencent.mm.sdk.platformtools.x2.f193071a);
            float a29 = pj.h.f354909a ? pj.h.a() : 0.0f;
            com.tencent.mars.xlog.Log.i("Matrix.battery.BatteryReporter", "#reportThermalException");
            ri.s.b(1, 5, f18, a28, a19.c(), a19.d(), "thermalException", u17, "oppo", (int) a29, "", i17, a27, "", 0L, 0L, 0L, "");
            final gi.q1 q1Var = gi.q1.f272091f;
            q1Var.getClass();
            try {
                if (j62.e.g().a("clicfg_battery_thermal_enable", "1", false, true).equals("1")) {
                    ph.u uVar = q1Var.f272096d;
                    if (uVar != null) {
                        final android.os.Handler handler = uVar.f354296h.f363337f;
                        handler.post(new java.lang.Runnable() { // from class: gi.q1$$a
                            @Override // java.lang.Runnable
                            public final void run() {
                                gi.q1 q1Var2 = gi.q1.this;
                                if (q1Var2.f272093a) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.ThermalExceptionMonitor", "monitor is already running, skip");
                                    return;
                                }
                                long currentTimeMillis = java.lang.System.currentTimeMillis();
                                long j17 = gi.q1.f272092g;
                                if (j17 != 0 && currentTimeMillis - j17 < 1800000) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.ThermalExceptionMonitor", "monitor too many, fromLast = " + ((currentTimeMillis - gi.q1.f272092g) / 60000) + "min");
                                    return;
                                }
                                com.tencent.mars.xlog.Log.i("MicroMsg.ThermalExceptionMonitor", "start watching");
                                ph.u e17 = gi.d.e();
                                rh.c1 c1Var = e17 == null ? null : new gi.s1(e17.f354296h, "alertBatt").f272021a;
                                q1Var2.f272095c = c1Var;
                                if (c1Var != null) {
                                    q1Var2.f272094b = 0;
                                    com.tencent.mars.xlog.Log.i("MicroMsg.ThermalExceptionMonitor", "start, loop count: " + (q1Var2.f272094b + 1));
                                    q1Var2.f272095c.I();
                                    handler.postDelayed(q1Var2.f272097e, 60000L);
                                    q1Var2.f272093a = true;
                                    gi.q1.f272092g = currentTimeMillis;
                                }
                            }
                        });
                    }
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ThermalExceptionMonitor", "monitor disabled");
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return false;
    }

    @Override // ph.f, ph.h
    public boolean d(final ph.c cVar, final long j17) {
        com.tencent.mars.xlog.Log.i("Matrix.battery.LifeCycle", "#onAppLowEnergy, bgMillis=" + j17);
        ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: gi.s$$e
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mars.xlog.Log.i("Matrix.battery.LifeCycle", "isAudioActive: " + kh.y.f307947d.b());
                ph.c cVar2 = ph.c.this;
                if (cVar2.d()) {
                    return;
                }
                if (cVar2.e() && wh.m.A(cVar2.f354256b)) {
                    return;
                }
                boolean f17 = qh.b.a().f();
                long j18 = j17;
                if (!f17 && !gi.i0.f272055b && j18 >= 300000) {
                    gi.i0.b(true);
                }
                ri.o.a(j18);
            }
        });
        return false;
    }

    @Override // ph.f, ph.g
    public boolean e(ph.c cVar) {
        com.tencent.mars.xlog.Log.i("Matrix.battery.LifeCycle", "#onBatteryFullCharged");
        ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: gi.s$$c
            @Override // java.lang.Runnable
            public final void run() {
                gi.s.this.h();
                ((ob0.y2) i95.n0.c(ob0.y2.class)).getClass();
            }
        });
        return false;
    }

    @Override // ph.f, ph.g
    public boolean f(final ph.c cVar, final java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Matrix.battery.LifeCycle", "#onStateChanged");
        ku5.u0 u0Var = ku5.t0.f312615d;
        final android.content.Context context = this.f272104d;
        final boolean z17 = this.f272105e;
        ((ku5.t0) u0Var).g(new java.lang.Runnable() { // from class: gi.s$$a
            @Override // java.lang.Runnable
            public final void run() {
                gi.s sVar = gi.s.this;
                sVar.getClass();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("currStat, charging = ");
                ph.c cVar2 = cVar;
                sb6.append(cVar2.d());
                sb6.append(", fg = ");
                sb6.append(cVar2.e());
                sb6.append(", screenOn = ");
                android.content.Context context2 = cVar2.f354256b;
                sb6.append(wh.m.A(context2));
                com.tencent.mars.xlog.Log.i("Matrix.battery.LifeCycle", sb6.toString());
                java.lang.String str2 = str;
                boolean equals = "android.os.action.DEVICE_IDLE_MODE_CHANGED".equals(str2);
                final android.content.Context context3 = context;
                if (equals || wh.e1.a(context3).equals(str2)) {
                    com.tencent.mars.xlog.Log.i("Matrix.battery.LifeCycle", "currStat, devIdle = " + wh.m.z(context2) + ", powerSave = " + cVar2.c());
                }
                if ("android.intent.action.ACTION_POWER_CONNECTED".equals(str2) && java.lang.System.currentTimeMillis() - sVar.f272102b > 3600000) {
                    sVar.f272102b = java.lang.System.currentTimeMillis();
                    gi.d.f();
                }
                if ("android.intent.action.ACTION_POWER_DISCONNECTED".equals(str2) && android.os.Build.VERSION.SDK_INT < 29) {
                    sVar.h();
                    ((ob0.y2) i95.n0.c(ob0.y2.class)).getClass();
                }
                if ("android.intent.action.ACTION_POWER_CONNECTED".equals(str2) || "android.intent.action.ACTION_POWER_DISCONNECTED".equals(str2)) {
                    java.util.Map map = pj.i.f354910a;
                    ph.u e17 = gi.d.e();
                    if (e17 != null) {
                        e17.f354296h.f363337f.post(new java.lang.Runnable() { // from class: pj.i$$c
                            @Override // java.lang.Runnable
                            public final void run() {
                                final android.content.Context context4 = context3;
                                if (wh.m.w(context4)) {
                                    pj.i.b("posInCharge", "batt_amp_charge_pos", "batt_amp_charge_neg", new m3.i() { // from class: pj.i$$d
                                        @Override // m3.i
                                        public final java.lang.Object get() {
                                            android.content.Context context5 = context4;
                                            if (wh.m.w(context5)) {
                                                long h17 = wh.m.h(context5);
                                                if (h17 != -1 && h17 != 0) {
                                                    return new pj.j(h17 > 0, true, h17);
                                                }
                                            }
                                            return null;
                                        }
                                    });
                                } else {
                                    pj.i.b("posOutOfCharge", "batt_amp_uncharge_pos", "batt_amp_uncharge_neg", new m3.i() { // from class: pj.i$$e
                                        @Override // m3.i
                                        public final java.lang.Object get() {
                                            android.content.Context context5 = context4;
                                            if (!wh.m.w(context5)) {
                                                long h17 = wh.m.h(context5);
                                                if (h17 != -1 && h17 != 0) {
                                                    return new pj.j(h17 > 0, false, h17);
                                                }
                                            }
                                            return null;
                                        }
                                    });
                                }
                            }
                        });
                    }
                }
                if (z17) {
                    if ("android.intent.action.SCREEN_OFF".equals(str2)) {
                        ((lh.t) ((jz5.n) lh.t.f318633h).getValue()).c(0);
                    }
                    if ("android.intent.action.SCREEN_ON".equals(str2)) {
                        ((lh.t) ((jz5.n) lh.t.f318633h).getValue()).a();
                    }
                }
            }
        });
        return false;
    }

    public final void h() {
        ((com.tencent.mm.feature.performance.q) ((ob0.y2) i95.n0.c(ob0.y2.class))).getClass();
        cr0.r2.f221734a.c(null);
        android.os.Handler handler = gi.p.f272075a;
        java.lang.Runnable runnable = this.f272103c;
        handler.removeCallbacks(runnable);
        gi.p.f272075a.postDelayed(runnable, 300000L);
    }
}
