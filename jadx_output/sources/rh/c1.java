package rh;

/* loaded from: classes12.dex */
public class c1 {

    /* renamed from: k, reason: collision with root package name */
    public final qh.f0 f395329k;

    /* renamed from: l, reason: collision with root package name */
    public qh.b f395330l;

    /* renamed from: n, reason: collision with root package name */
    public qh.g0 f395332n;

    /* renamed from: o, reason: collision with root package name */
    public rh.x0 f395333o;

    /* renamed from: p, reason: collision with root package name */
    public rh.w0 f395334p;

    /* renamed from: q, reason: collision with root package name */
    public wh.s0 f395335q;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f395337s;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f395319a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f395320b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f395321c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f395322d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f395323e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f395324f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f395325g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f395326h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final android.os.Bundle f395327i = new android.os.Bundle();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.Map f395328j = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public boolean f395331m = true;

    /* renamed from: r, reason: collision with root package name */
    public long f395336r = android.os.SystemClock.uptimeMillis();

    /* renamed from: t, reason: collision with root package name */
    public boolean f395338t = false;

    public c1(qh.f0 f0Var, java.lang.String str) {
        this.f395329k = f0Var;
        this.f395337s = str;
    }

    public static long f(long j17, long j18) {
        if (j18 > 0) {
            return ((float) j17) / (((float) j18) / 60000.0f);
        }
        throw new java.lang.IllegalArgumentException("Illegal millis: " + j18);
    }

    public int A() {
        int s17 = s();
        if (s17 == -1) {
            oj.j.f("Matrix.battery.CompositeMonitors", "cpu is invalid", new java.lang.Object[0]);
            return -1;
        }
        rh.b3 B = B(rh.w1.class);
        if (B == null) {
            oj.j.f("Matrix.battery.CompositeMonitors", "cpufreq is null", new java.lang.Object[0]);
            return -1;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) wh.m.q();
        if (arrayList.size() != wh.m.o()) {
            oj.j.f("Matrix.battery.CompositeMonitors", "cpuCore is invalid: " + arrayList.size() + " vs " + wh.m.o(), new java.lang.Object[0]);
        }
        java.util.Iterator it = arrayList.iterator();
        long j17 = 0;
        while (it.hasNext()) {
            int i17 = 0;
            for (int i18 : (int[]) it.next()) {
                if (i18 > i17) {
                    i17 = i18;
                }
            }
            j17 += i17;
        }
        if (j17 <= 0) {
            oj.j.f("Matrix.battery.CompositeMonitors", "cpufreq sum is invalid: " + j17, new java.lang.Object[0]);
            return -1;
        }
        double d17 = j17;
        if (B.f395316h >= d17) {
            oj.j.f("Matrix.battery.CompositeMonitors", "NorCpuLoad err: sampling = " + B, new java.lang.Object[0]);
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                oj.j.f("Matrix.battery.CompositeMonitors", "NorCpuLoad err: freqs = " + java.util.Arrays.toString((int[]) it6.next()), new java.lang.Object[0]);
            }
        }
        return (int) ((s17 * B.f395316h) / d17);
    }

    public rh.b3 B(java.lang.Class cls) {
        return (rh.b3) ((java.util.HashMap) this.f395324f).get(cls);
    }

    public void C(java.lang.Class cls, wh.t0 t0Var) {
        rh.b3 B = B(cls);
        if (B != null) {
            t0Var.accept(B);
        }
    }

    public java.util.List D(java.lang.Class cls) {
        java.util.List list = (java.util.List) ((java.util.HashMap) this.f395325g).get(cls);
        return list == null ? java.util.Collections.emptyList() : list;
    }

    public boolean E() {
        boolean z17;
        synchronized (this) {
            z17 = this.f395338t;
        }
        return z17;
    }

    public rh.c1 F(java.lang.Class cls) {
        java.util.List list = this.f395319a;
        if (!((java.util.ArrayList) list).contains(cls)) {
            ((java.util.ArrayList) list).add(cls);
        }
        return this;
    }

    public rh.c1 G() {
        F(com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.class);
        F(rh.k.class);
        F(rh.t3.class);
        F(rh.f1.class);
        F(rh.v.class);
        F(rh.w1.class);
        F(rh.t1.class);
        F(rh.n3.class);
        F(rh.z.class);
        F(rh.c4.class);
        F(rh.k2.class);
        return this;
    }

    public rh.c1 H(java.lang.Class cls, long j17) {
        ((java.util.HashMap) this.f395322d).put(cls, java.lang.Long.valueOf(j17));
        return this;
    }

    public void I() {
        synchronized (this) {
            oj.j.c("Matrix.battery.CompositeMonitors", hashCode() + " #start: " + this.f395337s, new java.lang.Object[0]);
            this.f395338t = true;
            this.f395330l = null;
            if (this.f395331m && ph.t.o()) {
                qh.g0 g0Var = new qh.g0();
                this.f395332n = g0Var;
                g0Var.i();
            }
            this.f395336r = android.os.SystemClock.uptimeMillis();
            g();
            j();
            wh.s0 s0Var = this.f395335q;
            if (s0Var != null && s0Var.k()) {
                throw new java.lang.IllegalStateException("Leaked CallStackSampler?");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [int] */
    /* JADX WARN: Type inference failed for: r12v5 */
    public rh.d3 J(java.lang.Class cls) {
        uh.h hVar;
        java.lang.String str;
        java.lang.String obj;
        rh.f1 a17;
        wh.u0 u0Var;
        com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature$UidCpuStateSnapshot$IpcCpuStat$RemoteStat cpuStatFeature$UidCpuStateSnapshot$IpcCpuStat$RemoteStat;
        qh.f0 f0Var;
        com.tencent.matrix.batterycanary.monitor.feature.c cVar;
        qh.f0 f0Var2;
        rh.w1 l17;
        boolean z17 = false;
        rh.k kVar = null;
        if (cls == rh.k.class) {
            rh.m mVar = (rh.m) w(rh.m.class);
            if (mVar != null) {
                rh.l lVar = mVar.f395451c;
                lVar.getClass();
                kVar = new rh.k();
                synchronized (lVar.f395438a) {
                    kVar.f395429d = rh.x2.b(java.lang.Integer.valueOf(lVar.f395439b));
                    kVar.f395430e = rh.x2.b(java.lang.Integer.valueOf(lVar.f395440c));
                    kVar.f395431f = rh.x2.b(0);
                    kVar.f395432g = rh.x2.b(0);
                    kVar.f395433h = rh.y2.b();
                }
            }
            return kVar;
        }
        if (cls == rh.z.class) {
            rh.b0 b0Var = (rh.b0) w(rh.b0.class);
            if (b0Var == null) {
                return null;
            }
            rh.a0 a0Var = b0Var.f395307b;
            a0Var.getClass();
            rh.z zVar = new rh.z();
            zVar.f395566d = rh.x2.b(java.lang.Integer.valueOf(a0Var.f395295a));
            zVar.f395567e = rh.x2.b(java.lang.Integer.valueOf(a0Var.f395296b));
            zVar.f395568f = rh.x2.b(java.lang.Integer.valueOf(a0Var.f395297c));
            zVar.f395569g = a0Var.f395298d;
            return zVar;
        }
        if (cls == rh.w1.class) {
            rh.d2 d2Var = (rh.d2) w(rh.d2.class);
            if (d2Var == null) {
                return null;
            }
            try {
                l17 = d2Var.l(wh.m.p());
            } catch (java.lang.Throwable th6) {
                oj.j.d("Matrix.battery.DeviceStatusMonitorFeature", th6, "#currentCpuFreq error", new java.lang.Object[0]);
                l17 = d2Var.l(new int[0]);
            }
            return l17;
        }
        if (cls == rh.t1.class) {
            rh.d2 d2Var2 = (rh.d2) w(rh.d2.class);
            if (d2Var2 == null || (f0Var2 = this.f395329k) == null) {
                return null;
            }
            return d2Var2.k(f0Var2.d());
        }
        if (cls == com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.class) {
            com.tencent.matrix.batterycanary.monitor.feature.c cVar2 = (com.tencent.matrix.batterycanary.monitor.feature.c) w(com.tencent.matrix.batterycanary.monitor.feature.c.class);
            if (cVar2 != null) {
                return cVar2.k(true);
            }
            return null;
        }
        if (cls == com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot.class && (cVar = (com.tencent.matrix.batterycanary.monitor.feature.c) w(com.tencent.matrix.batterycanary.monitor.feature.c.class)) != null) {
            return cVar.l();
        }
        if (cls == rh.k2.class) {
            rh.m2 m2Var = (rh.m2) w(rh.m2.class);
            if (m2Var == null) {
                return null;
            }
            rh.l2 l2Var = m2Var.f395460b;
            l2Var.getClass();
            rh.k2 k2Var = new rh.k2();
            k2Var.f395436d = rh.x2.b(java.lang.Integer.valueOf(l2Var.f395444a));
            k2Var.f395437e = l2Var.f395445b;
            return k2Var;
        }
        if (cls == rh.n3.class) {
            rh.o3 o3Var = (rh.o3) w(rh.o3.class);
            if (o3Var == null || (f0Var = this.f395329k) == null) {
                return null;
            }
            return o3Var.k(f0Var.d());
        }
        if (cls == rh.t3.class) {
            rh.z3 z3Var = (rh.z3) w(rh.z3.class);
            if (z3Var == null) {
                return null;
            }
            rh.y3 y3Var = z3Var.f395576d;
            y3Var.getClass();
            rh.t3 t3Var = new rh.t3();
            t3Var.f395509d = rh.x2.b(java.lang.Long.valueOf(y3Var.f395563c));
            t3Var.f395510e = rh.x2.b(java.lang.Integer.valueOf(y3Var.f395562b));
            t3Var.f395511f = rh.y2.b();
            t3Var.f395512g = rh.x2.b(java.lang.Integer.valueOf(y3Var.f395564d));
            t3Var.f395513h = rh.x2.b(java.lang.Integer.valueOf(y3Var.f395565e));
            return t3Var;
        }
        if (cls == rh.c4.class) {
            rh.e4 e4Var = (rh.e4) w(rh.e4.class);
            if (e4Var == null) {
                return null;
            }
            rh.d4 d4Var = e4Var.f395372b;
            d4Var.getClass();
            rh.c4 c4Var = new rh.c4();
            c4Var.f395354d = rh.x2.b(java.lang.Integer.valueOf(d4Var.f395366a));
            c4Var.f395355e = rh.x2.b(java.lang.Integer.valueOf(d4Var.f395367b));
            c4Var.f395356f = d4Var.f395368c;
            return c4Var;
        }
        if (cls == rh.f1.class) {
            rh.k1 k1Var = (rh.k1) w(rh.k1.class);
            if (k1Var == null || !k1Var.y()) {
                return null;
            }
            return k1Var.w();
        }
        if (cls == rh.j1.class) {
            rh.k1 k1Var2 = (rh.k1) w(rh.k1.class);
            if (k1Var2 == null || !k1Var2.y()) {
                return null;
            }
            rh.j1 j1Var = new rh.j1();
            try {
                java.util.ArrayList arrayList = (java.util.ArrayList) sh.c.n(k1Var2.f395294a.d());
                j1Var.f395424d = new java.util.ArrayList(arrayList.size());
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m3.d dVar = (m3.d) it.next();
                    int intValue = ((java.lang.Integer) dVar.f323092a).intValue();
                    java.lang.String valueOf = java.lang.String.valueOf(dVar.f323093b);
                    if (intValue == android.os.Process.myPid()) {
                        a17 = k1Var2.w();
                    } else {
                        rh.f1 x17 = wh.u1.a(intValue) ? k1Var2.x(intValue) : null;
                        a17 = (x17 == null || x17.f395365c || (u0Var = k1Var2.f395294a.f363335d.C) == null || (cpuStatFeature$UidCpuStateSnapshot$IpcCpuStat$RemoteStat = (com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature$UidCpuStateSnapshot$IpcCpuStat$RemoteStat) ((com.tencent.mm.feature.performance.c2$$d) u0Var).apply(dVar)) == null) ? x17 : rh.i1.a(cpuStatFeature$UidCpuStateSnapshot$IpcCpuStat$RemoteStat);
                    }
                    if (a17 != null) {
                        a17.f395387f = intValue;
                        a17.f395388g = th.o.c(valueOf);
                        j1Var.f395424d.add(a17);
                    }
                }
            } catch (java.lang.Exception e17) {
                oj.j.f("Matrix.battery.CpuStatFeature", "get curr UidCpuStatSnapshot failed: " + e17.getMessage(), new java.lang.Object[0]);
                j1Var.f395365c = false;
            }
            return j1Var;
        }
        if (cls != rh.n1.class) {
            if (cls == rh.v.class) {
                rh.w wVar = (rh.w) w(rh.w.class);
                if (wVar != null) {
                    return wVar.k(0L);
                }
                return null;
            }
            if (cls != uh.g.class || (hVar = (uh.h) w(uh.h.class)) == null) {
                return null;
            }
            return hVar.k();
        }
        rh.n1 n1Var = new rh.n1(null);
        int o17 = wh.m.o();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i17 = 0;
        while (i17 < o17) {
            java.util.HashMap hashMap = new java.util.HashMap();
            java.io.File[] listFiles = new java.io.File("/sys/devices/system/cpu/cpu" + i17 + "/cpuidle").listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                for (?? r122 = z17; r122 < length; r122++) {
                    java.io.File it6 = listFiles[r122];
                    kotlin.jvm.internal.o.f(it6, "it");
                    java.lang.String name = it6.getName();
                    kotlin.jvm.internal.o.f(name, "it.name");
                    if (r26.i0.y(name, "state", z17)) {
                        java.lang.String a18 = wh.m.a(new java.io.File(it6, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME).getAbsolutePath());
                        if (a18 == null || (str = r26.n0.u0(a18).toString()) == null) {
                            str = "";
                        }
                        if (str.length() > 0 ? true : z17) {
                            java.lang.String a19 = wh.m.a(new java.io.File(it6, "time").getAbsolutePath());
                            hashMap.put(str, java.lang.Long.valueOf(((a19 == null || (obj = r26.n0.u0(a19).toString()) == null) ? 0L : java.lang.Long.parseLong(obj)) / 1000));
                        }
                    }
                    z17 = false;
                }
            }
            arrayList2.add(hashMap);
            i17++;
            z17 = false;
        }
        n1Var.b().addAll(arrayList2);
        return n1Var;
    }

    public rh.c3 K(java.lang.Class cls) {
        uh.h hVar;
        java.lang.Long l17;
        java.util.Map map = this.f395323e;
        qh.f0 f0Var = this.f395329k;
        if (cls == rh.w1.class) {
            rh.d2 d2Var = (rh.d2) w(rh.d2.class);
            if (d2Var == null || f0Var == null) {
                return null;
            }
            rh.k1 k1Var = (rh.k1) w(rh.k1.class);
            if (k1Var != null && k1Var.y()) {
                this.f395333o = new rh.x0(wh.m.q());
            }
            rh.c3 c3Var = new rh.c3("cpufreq", f0Var.f363337f, new rh.p0(this, k1Var, d2Var));
            ((java.util.HashMap) map).put(cls, c3Var);
            return c3Var;
        }
        if (cls == rh.t1.class) {
            rh.d2 d2Var2 = (rh.d2) w(rh.d2.class);
            if (d2Var2 == null || f0Var == null) {
                return null;
            }
            rh.c3 c3Var2 = new rh.c3("batt-temp", f0Var.f363337f, new rh.q0(this, d2Var2));
            ((java.util.HashMap) map).put(cls, c3Var2);
            return c3Var2;
        }
        if (cls == rh.c2.class) {
            rh.d2 d2Var3 = (rh.d2) w(rh.d2.class);
            if (android.os.Build.VERSION.SDK_INT < 29 || d2Var3 == null || f0Var == null) {
                return null;
            }
            rh.c3 c3Var3 = new rh.c3("thermal-stat", f0Var.f363337f, new rh.r0(this));
            ((java.util.HashMap) map).put(cls, c3Var3);
            return c3Var3;
        }
        if (cls == rh.b2.class) {
            rh.d2 d2Var4 = (rh.d2) w(rh.d2.class);
            if (android.os.Build.VERSION.SDK_INT < 30 || d2Var4 == null || f0Var == null || (l17 = (java.lang.Long) ((java.util.HashMap) this.f395322d).get(cls)) == null || l17.longValue() < 1000) {
                return null;
            }
            rh.c3 c3Var4 = new rh.c3("thermal-headroom", f0Var.f363337f, new rh.s0(this, l17));
            ((java.util.HashMap) map).put(cls, c3Var4);
            return c3Var4;
        }
        if (cls == rh.u1.class) {
            if (((rh.d2) w(rh.d2.class)) == null || f0Var == null) {
                return null;
            }
            rh.c3 c3Var5 = new rh.c3("batt-watt", f0Var.f363337f, new rh.t0(this));
            ((java.util.HashMap) map).put(cls, c3Var5);
            return c3Var5;
        }
        if (cls == rh.f1.class) {
            rh.k1 k1Var2 = (rh.k1) w(rh.k1.class);
            if (k1Var2 == null || !k1Var2.y() || f0Var == null) {
                return null;
            }
            rh.c3 c3Var6 = new rh.c3("cpu-stat", f0Var.f363337f, new rh.u0(this, k1Var2));
            ((java.util.HashMap) map).put(cls, c3Var6);
            return c3Var6;
        }
        if (cls == com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot.class) {
            com.tencent.matrix.batterycanary.monitor.feature.c cVar = (com.tencent.matrix.batterycanary.monitor.feature.c) w(com.tencent.matrix.batterycanary.monitor.feature.c.class);
            if (cVar == null || f0Var == null) {
                return null;
            }
            rh.c3 c3Var7 = new rh.c3("uid-jiffies", f0Var.f363337f, new com.tencent.matrix.batterycanary.monitor.feature.b(this, cVar));
            ((java.util.HashMap) map).put(cls, c3Var7);
            return c3Var7;
        }
        if (cls == rh.n3.class) {
            rh.o3 o3Var = (rh.o3) w(rh.o3.class);
            if (o3Var == null || f0Var == null) {
                return null;
            }
            rh.c3 c3Var8 = new rh.c3("traffic", f0Var.f363337f, new rh.v0(this, o3Var));
            ((java.util.HashMap) map).put(cls, c3Var8);
            return c3Var8;
        }
        if (cls == rh.l3.class) {
            rh.o3 o3Var2 = (rh.o3) w(rh.o3.class);
            if (o3Var2 == null || f0Var == null) {
                return null;
            }
            this.f395334p = new rh.w0();
            rh.c3 c3Var9 = new rh.c3("trafficBps", f0Var.f363337f, new rh.c0(this, o3Var2));
            ((java.util.HashMap) map).put(cls, c3Var9);
            return c3Var9;
        }
        if (cls == rh.r1.class) {
            if (((rh.d2) w(rh.d2.class)) == null || f0Var == null) {
                return null;
            }
            rh.c3 c3Var10 = new rh.c3("batt-curr", f0Var.f363337f, new rh.d0(this));
            ((java.util.HashMap) map).put(cls, c3Var10);
            return c3Var10;
        }
        if (cls != uh.g.class || (hVar = (uh.h) w(uh.h.class)) == null || f0Var == null) {
            return null;
        }
        rh.c3 c3Var11 = new rh.c3("health-stats", f0Var.f363337f, new rh.e0(this, hVar));
        ((java.util.HashMap) map).put(cls, c3Var11);
        return c3Var11;
    }

    public void a() {
        synchronized (this) {
            oj.j.c("Matrix.battery.CompositeMonitors", hashCode() + " #cancel: " + this.f395337s, new java.lang.Object[0]);
            this.f395338t = false;
            i();
        }
    }

    public void b() {
        synchronized (this) {
            oj.j.c("Matrix.battery.CompositeMonitors", hashCode() + " #clear: " + this.f395337s, new java.lang.Object[0]);
            ((java.util.HashMap) this.f395320b).clear();
            ((java.util.HashMap) this.f395321c).clear();
            ((java.util.HashMap) this.f395323e).clear();
            ((java.util.HashMap) this.f395324f).clear();
            ((java.util.HashMap) this.f395325g).clear();
            ((java.util.HashMap) this.f395326h).clear();
            this.f395327i.clear();
            ((java.util.HashMap) this.f395328j).clear();
            this.f395333o = null;
            this.f395334p = null;
            wh.s0 s0Var = this.f395335q;
            if (s0Var != null) {
                if (s0Var.k()) {
                    this.f395335q.m();
                }
                this.f395335q.a();
            }
            this.f395335q = null;
        }
    }

    public void c() {
        qh.b bVar;
        wh.s0 s0Var = this.f395335q;
        if (s0Var != null) {
            synchronized (((jz5.n) s0Var.f445868f).getValue()) {
                if (this.f395335q.k()) {
                    this.f395335q.m();
                }
            }
            java.util.Map g17 = this.f395335q.g();
            oj.j.c("Matrix.battery.CompositeMonitors", "callstacks sampling size: " + g17.size(), new java.lang.Object[0]);
            if (!g17.isEmpty()) {
                wh.s0 s0Var2 = this.f395335q;
                s0Var2.getClass();
                wh.f.a("Matrix.battery.CompositeMonitors", "CallStack", "Thread WatchDog dump callstacks sampling:\n".concat(wh.s0.e(s0Var2, null, 0.0f, false, 7, null)), 0, 8, null);
                for (java.util.Map.Entry entry : g17.entrySet()) {
                    java.lang.Integer num = (java.lang.Integer) entry.getKey();
                    java.lang.String j17 = this.f395335q.j(num.intValue(), true);
                    if (j17 == null) {
                        java.util.List list = (java.util.List) entry.getValue();
                        if (!list.isEmpty()) {
                            j17 = (java.lang.String) ((jz5.o) list.get(list.size() - 1)).f302843f;
                        }
                    }
                    if (j17 != null) {
                        ((java.util.HashMap) this.f395328j).put(java.lang.String.valueOf(num), j17);
                    }
                }
                return;
            }
        }
        if (this.f395329k == null || !"canary".equals(this.f395337s) || (bVar = this.f395330l) == null || bVar.h()) {
            return;
        }
        u(com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.class, new com.tencent.matrix.batterycanary.monitor.feature.a(this));
    }

    public void d() {
        java.util.Map map = this.f395325g;
        if (((java.util.HashMap) map).isEmpty()) {
            return;
        }
        for (java.util.Map.Entry entry : ((java.util.HashMap) map).entrySet()) {
            java.lang.Class cls = (java.lang.Class) entry.getKey();
            for (rh.o2 o2Var : (java.util.List) entry.getValue()) {
                if (((rh.f) o2Var.f395484a).f395363a >= this.f395336r) {
                    java.util.Map map2 = this.f395326h;
                    rh.d3 d3Var = o2Var.f395486c;
                    java.util.List list = (java.util.List) ((java.util.HashMap) map2).get(((rh.f) d3Var).f395375e);
                    if (list == null) {
                        list = new java.util.ArrayList();
                        ((java.util.HashMap) map2).put(((rh.f) d3Var).f395375e, list);
                    }
                    list.add(new m3.d(cls, o2Var));
                }
            }
        }
    }

    public long e(long j17) {
        qh.b bVar = this.f395330l;
        if (bVar != null) {
            return f(j17, bVar.f363321n);
        }
        oj.j.f("Matrix.battery.CompositeMonitors", "AppStats should not be null to computeAvgJiffies", new java.lang.Object[0]);
        return -1L;
    }

    public void g() {
        java.util.Iterator it = ((java.util.ArrayList) this.f395319a).iterator();
        while (it.hasNext()) {
            java.lang.Class cls = (java.lang.Class) it.next();
            rh.d3 J2 = J(cls);
            if (J2 != null) {
                ((java.util.HashMap) this.f395320b).put(cls, J2);
                if ((J2 instanceof uh.g) && ((java.util.HashMap) this.f395322d).containsKey(uh.g.class)) {
                    uh.g gVar = (uh.g) J2;
                    gVar.f427677d = new uh.f(gVar);
                }
            }
        }
    }

    public void h() {
        java.lang.Class cls;
        rh.d3 J2;
        rh.o2 a17;
        for (java.util.Map.Entry entry : ((java.util.HashMap) this.f395320b).entrySet()) {
            rh.d3 d3Var = (rh.d3) entry.getValue();
            if (d3Var != null && (J2 = J((cls = (java.lang.Class) entry.getKey()))) != null && J2.getClass() == d3Var.getClass()) {
                if (d3Var instanceof uh.g) {
                    uh.g gVar = (uh.g) d3Var;
                    if (gVar.f427677d != null) {
                        uh.g gVar2 = (uh.g) J2;
                        gVar.b(gVar2);
                        a17 = new rh.n2(gVar, gVar2, gVar.f427677d.f427672c);
                        ((java.util.HashMap) this.f395321c).put(cls, a17);
                    }
                }
                a17 = J2.a(d3Var);
                ((java.util.HashMap) this.f395321c).put(cls, a17);
            }
        }
    }

    public void i() {
        for (java.util.Map.Entry entry : ((java.util.HashMap) this.f395323e).entrySet()) {
            oj.j.c("Matrix.battery.CompositeMonitors", hashCode() + " " + ((rh.c3) entry.getValue()).f395340a + " #pause: " + this.f395337s, new java.lang.Object[0]);
            rh.c3 c3Var = (rh.c3) entry.getValue();
            c3Var.f395344e = true;
            c3Var.f395348i = android.os.SystemClock.uptimeMillis();
            c3Var.f395341b.removeCallbacks(c3Var.f395343d);
            rh.c3 c3Var2 = (rh.c3) entry.getValue();
            int i17 = c3Var2.f395346g;
            rh.b3 b3Var = null;
            if (i17 <= 0) {
                oj.j.f("Matrix.battery.Sampler", "Sampling count is invalid: " + c3Var2.f395346g, new java.lang.Object[0]);
            } else {
                long j17 = c3Var2.f395347h;
                if (j17 > 0) {
                    long j18 = c3Var2.f395348i;
                    if (j18 > 0 && j17 <= j18) {
                        b3Var = new rh.b3();
                        b3Var.f395309a = c3Var2.f395345f;
                        b3Var.f395310b = i17;
                        b3Var.f395311c = j18 - j17;
                        b3Var.f395312d = c3Var2.f395349j;
                        b3Var.f395313e = c3Var2.f395350k;
                        b3Var.f395314f = c3Var2.f395351l;
                        b3Var.f395315g = c3Var2.f395352m;
                        b3Var.f395316h = c3Var2.f395353n;
                    }
                }
                oj.j.f("Matrix.battery.Sampler", "Sampling bgn/end millis is invalid: " + c3Var2.f395347h + " - " + c3Var2.f395348i, new java.lang.Object[0]);
            }
            if (b3Var != null) {
                ((java.util.HashMap) this.f395324f).put((java.lang.Class) entry.getKey(), b3Var);
            }
        }
    }

    public void j() {
        for (java.util.Map.Entry entry : ((java.util.HashMap) this.f395322d).entrySet()) {
            rh.c3 K = K((java.lang.Class) entry.getKey());
            if (K != null) {
                long longValue = ((java.lang.Long) entry.getValue()).longValue();
                if (longValue > 0) {
                    K.f395345f = longValue;
                }
                K.f395344e = false;
                K.f395347h = android.os.SystemClock.uptimeMillis();
                K.f395341b.postDelayed(K.f395343d, K.f395345f);
            }
        }
    }

    public void k(java.lang.Class cls) {
        rh.g gVar;
        if (this.f395330l == null || (gVar = (rh.g) w(cls)) == null) {
            return;
        }
        ((java.util.HashMap) this.f395325g).put(cls, gVar.n(this.f395330l.f363321n));
    }

    public void l() {
        int j17;
        synchronized (this) {
            oj.j.c("Matrix.battery.CompositeMonitors", hashCode() + " #finish: " + this.f395337s, new java.lang.Object[0]);
            this.f395338t = false;
            h();
            c();
            i();
            this.f395330l = qh.b.b(android.os.SystemClock.uptimeMillis() - this.f395336r);
            qh.g0 g0Var = this.f395332n;
            if (g0Var != null) {
                g0Var.h();
                qh.b bVar = this.f395330l;
                long j18 = bVar.f363321n;
                if (j18 > 0 && (j17 = this.f395332n.j(j18, bVar.f363312e)) != this.f395330l.f363312e) {
                    oj.j.c("Matrix.battery.CompositeMonitors", "correctify charging ratio: " + this.f395330l.f363312e + ">>" + j17, new java.lang.Object[0]);
                    this.f395330l.f363312e = j17;
                }
            }
            u(uh.g.class, new rh.g0(this));
        }
    }

    public rh.c1 m() {
        rh.c1 c1Var = new rh.c1(this.f395329k, this.f395337s);
        n(c1Var);
        return c1Var;
    }

    public rh.c1 n(rh.c1 c1Var) {
        synchronized (this) {
            oj.j.c("Matrix.battery.CompositeMonitors", hashCode() + " #fork: " + this.f395337s, new java.lang.Object[0]);
            c1Var.b();
            c1Var.f395336r = this.f395336r;
            c1Var.f395330l = this.f395330l;
            c1Var.f395331m = this.f395331m;
            c1Var.f395338t = this.f395338t;
            ((java.util.ArrayList) c1Var.f395319a).addAll(this.f395319a);
            ((java.util.HashMap) c1Var.f395320b).putAll(this.f395320b);
            ((java.util.HashMap) c1Var.f395321c).putAll(this.f395321c);
            c1Var.f395333o = this.f395333o;
            c1Var.f395334p = this.f395334p;
            ((java.util.HashMap) c1Var.f395325g).putAll(this.f395325g);
            ((java.util.HashMap) c1Var.f395326h).putAll(this.f395326h);
            c1Var.f395327i.putAll(this.f395327i);
            ((java.util.HashMap) c1Var.f395328j).putAll(this.f395328j);
        }
        return c1Var;
    }

    public java.util.List o() {
        rh.o2 t17 = t(com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot.class);
        if (t17 != null) {
            return ((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot) t17.f395486c).f52584f;
        }
        rh.o2 t18 = t(com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.class);
        return t18 != null ? java.util.Collections.singletonList(t18) : java.util.Collections.emptyList();
    }

    public void p(wh.t0 t0Var) {
        java.util.List o17 = o();
        if (o17 != null) {
            t0Var.accept(o17);
        }
    }

    public void q(wh.t0 t0Var) {
        qh.b bVar = this.f395330l;
        if (bVar != null) {
            t0Var.accept(bVar);
        }
    }

    public void r(wh.t0 t0Var) {
        java.util.Map map = this.f395326h;
        if (((java.util.HashMap) map).size() > 1) {
            map = wh.m.B(map, new rh.f0(this));
        }
        t0Var.accept(map);
    }

    public int s() {
        long longValue;
        if (this.f395330l == null) {
            oj.j.f("Matrix.battery.CompositeMonitors", "AppStats should not be null to get CpuLoad", new java.lang.Object[0]);
            return -1;
        }
        rh.o2 t17 = t(com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot.class);
        if (t17 != null) {
            longValue = ((java.lang.Long) ((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot) t17.f395486c).f52582d.f395552a).longValue();
        } else {
            rh.o2 t18 = t(com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.class);
            if (t18 == null) {
                oj.j.f("Matrix.battery.CompositeMonitors", com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.class + " should be metrics to get CpuLoad", new java.lang.Object[0]);
                return -1;
            }
            longValue = ((java.lang.Long) ((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) t18.f395486c).f52561g.f395552a).longValue();
        }
        long j17 = this.f395330l.f363321n;
        return (int) ((j17 > 0 ? ((float) (longValue * 10)) / ((float) j17) : 0.0f) * 100.0f);
    }

    public rh.o2 t(java.lang.Class cls) {
        return (rh.o2) ((java.util.HashMap) this.f395321c).get(cls);
    }

    public java.lang.String toString() {
        return "CompositeMonitors{\nRunning=" + this.f395338t + "\n, Metrics=" + this.f395319a + "\n, BgnSnapshots=" + this.f395320b + "\n, Deltas=" + this.f395321c + "\n, SampleRegs=" + this.f395322d + "\n, Samplers=" + this.f395323e + "\n, SampleResults=" + this.f395324f + "\n, TaskDeltas=" + this.f395325g + "\n, AppStats=" + this.f395330l + "\n, Stacks=" + this.f395328j + "\n, Extras =" + this.f395327i + "\n}";
    }

    public void u(java.lang.Class cls, wh.t0 t0Var) {
        rh.o2 t17 = t(cls);
        if (t17 != null) {
            t0Var.accept(t17);
        }
    }

    public int v() {
        if (this.f395330l == null) {
            oj.j.f("Matrix.battery.CompositeMonitors", "AppStats should not be null to get DevCpuLoad", new java.lang.Object[0]);
            return -1;
        }
        rh.o2 t17 = t(rh.n1.class);
        if (t17 == null) {
            oj.j.f("Matrix.battery.CompositeMonitors", rh.n1.class + " should be metrics to get DevCpuLoad", new java.lang.Object[0]);
            return -1;
        }
        rh.n1 n1Var = (rh.n1) t17.f395486c;
        long j17 = this.f395330l.f363321n;
        n1Var.getClass();
        int o17 = wh.m.o();
        float f17 = 1;
        java.util.Iterator it = n1Var.b().iterator();
        long j18 = 0;
        while (it.hasNext()) {
            j18 += kz5.n0.J0(((java.util.Map) it.next()).values());
        }
        return (int) new java.math.BigDecimal(java.lang.String.valueOf((f17 - (((float) j18) / ((float) (j17 * o17)))) * 100 * o17)).setScale(2, java.math.RoundingMode.HALF_EVEN).floatValue();
    }

    public rh.e3 w(java.lang.Class cls) {
        qh.f0 f0Var = this.f395329k;
        if (f0Var == null) {
            return null;
        }
        java.util.Iterator it = ((java.util.ArrayList) f0Var.f363335d.f363306y).iterator();
        while (it.hasNext()) {
            rh.e3 e3Var = (rh.e3) it.next();
            if (cls.isAssignableFrom(e3Var.getClass())) {
                return e3Var;
            }
        }
        return null;
    }

    public void x(java.lang.Class cls, wh.t0 t0Var) {
        rh.e3 w17 = w(cls);
        if (w17 != null) {
            t0Var.accept(w17);
        }
    }

    public java.lang.String y() {
        return this.f395337s;
    }

    public java.lang.String z() {
        return this.f395327i.getString("extra_module_name", "");
    }
}
