package lh;

/* loaded from: classes12.dex */
public final class l0 extends lh.i {

    /* renamed from: f, reason: collision with root package name */
    public static final lh.h0 f318609f = new lh.h0(null);

    /* renamed from: g, reason: collision with root package name */
    public static final lh.l0 f318610g = new lh.l0();

    /* renamed from: h, reason: collision with root package name */
    public static final long f318611h = 300000;

    /* renamed from: i, reason: collision with root package name */
    public static final long f318612i = 600000;

    /* renamed from: j, reason: collision with root package name */
    public static final long f318613j = 60000;

    /* renamed from: b, reason: collision with root package name */
    public boolean f318615b;

    /* renamed from: c, reason: collision with root package name */
    public long f318616c;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f318614a = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f318617d = new lh.j0(this);

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f318618e = new lh.i0(this);

    @Override // lh.i, lh.j
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.PowerAccMonitor", "#onClear");
        ((java.util.HashMap) this.f318614a).clear();
        com.tencent.mm.sdk.platformtools.o4.M("acc-power-stats.bin").d();
        boolean z17 = mm.w.f328542a;
        com.tencent.mars.xlog.Log.i("MicroMsg.NotifyPowerInspector", "#clear");
        mm.y yVar = mm.w.f328545d;
        yVar.f328570c = 0L;
        yVar.f328573f = 0L;
        mm.y yVar2 = mm.w.f328547f;
        yVar2.f328570c = 0L;
        yVar2.f328573f = 0L;
        mm.y yVar3 = mm.w.f328551j;
        yVar3.f328570c = 0L;
        yVar3.f328573f = 0L;
        mm.w.f328544c = 0L;
        com.tencent.mm.sdk.platformtools.o4.M("notify-inspect.bin").d();
    }

    @Override // lh.i, lh.j
    public void b(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PowerAccMonitor", "#onFlushing");
        ph.u e17 = gi.d.e();
        if (e17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PowerAccMonitor", "schedule SaveStats, delay=600000");
            qh.f0 f0Var = e17.f354296h;
            android.os.Handler handler = f0Var.f363337f;
            java.lang.Runnable runnable = this.f318617d;
            handler.removeCallbacks(runnable);
            f0Var.f363337f.postDelayed(runnable, 600000L);
            this.f318616c = java.lang.System.currentTimeMillis();
        }
    }

    @Override // lh.i, lh.j
    public void c(long j17) {
        if (f318609f.a()) {
            synchronized (this.f318614a) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PowerAccMonitor", "#report, periodMs=" + j17 + ", size=" + ((java.util.HashMap) this.f318614a).size());
                java.util.Iterator it = ((java.util.HashMap) this.f318614a).entrySet().iterator();
                while (it.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    java.lang.String str = (java.lang.String) entry.getKey();
                    com.tencent.matrix.battery.accumulate.AccPowerStats accPowerStats = (com.tencent.matrix.battery.accumulate.AccPowerStats) entry.getValue();
                    lh.k0 k0Var = new lh.k0(accPowerStats, j17, str);
                    kotlin.jvm.internal.o.g(accPowerStats, "<this>");
                    accPowerStats.lock(new mh.a(k0Var, accPowerStats));
                    it.remove();
                }
            }
        }
    }

    @Override // lh.i, lh.j
    public void f(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (f318609f.a()) {
            java.util.HashMap hashMap = new java.util.HashMap();
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("acc-power-stats.bin");
            java.lang.String[] b17 = M.b();
            if (b17 != null) {
                for (java.lang.String str : b17) {
                    mh.k kVar = mh.k.f326271a;
                    kotlin.jvm.internal.o.d(str);
                    com.tencent.matrix.battery.accumulate.AccPowerStats accPowerStats = (com.tencent.matrix.battery.accumulate.AccPowerStats) kVar.a(str, com.tencent.matrix.battery.accumulate.AccPowerStats.class, "acc-power-stats.bin");
                    if (accPowerStats != null) {
                        hashMap.put(accPowerStats.getAccName(), accPowerStats);
                    } else {
                        M.remove(str);
                    }
                }
            }
            synchronized (this.f318614a) {
                ((java.util.HashMap) this.f318614a).clear();
                ((java.util.HashMap) this.f318614a).putAll(hashMap);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.PowerAccMonitor", "#init, size=" + ((java.util.HashMap) this.f318614a).size());
            this.f318615b = true;
            mm.w.c();
        }
    }

    public final void g(java.lang.String accName, gi.w0 monitors) {
        kotlin.jvm.internal.o.g(accName, "accName");
        kotlin.jvm.internal.o.g(monitors, "monitors");
        com.tencent.mars.xlog.Log.i("MicroMsg.PowerAccMonitor", "#collect: ".concat(accName));
        java.util.Map map = this.f318614a;
        com.tencent.matrix.battery.accumulate.AccPowerStats accPowerStats = (com.tencent.matrix.battery.accumulate.AccPowerStats) ((java.util.HashMap) map).get(accName);
        if (accPowerStats == null) {
            accPowerStats = new com.tencent.matrix.battery.accumulate.AccPowerStats(accName);
            ((java.util.HashMap) map).put(accName, accPowerStats);
        }
        accPowerStats.acc(monitors);
    }

    public final void h() {
        ph.u e17 = gi.d.e();
        if (e17 != null) {
            qh.f0 f0Var = e17.f354296h;
            android.os.Handler handler = f0Var.f363337f;
            java.lang.Runnable runnable = this.f318618e;
            handler.removeCallbacks(runnable);
            f0Var.f363337f.postDelayed(runnable, f318613j);
        }
    }

    public final java.lang.String i() {
        return kotlin.jvm.internal.o.b(j62.e.g().a("clicfg_battery_acc_power_bg_poll", "0", false, true), "1") ? "ExplicitBgPoll" : "ExplicitBg";
    }

    public final java.lang.String j() {
        return kotlin.jvm.internal.o.b(j62.e.g().a("clicfg_battery_acc_power_fg_poll", "0", false, true), "1") ? "ExplicitFgPoll" : "ExplicitFg";
    }
}
