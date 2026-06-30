package qh;

/* loaded from: classes12.dex */
public class v implements qh.w {

    /* renamed from: d, reason: collision with root package name */
    public qh.f0 f363388d;

    /* renamed from: e, reason: collision with root package name */
    public rh.c1 f363389e;

    /* renamed from: f, reason: collision with root package name */
    public long f363390f;

    @Override // rh.i3
    public void a(rh.h3 h3Var) {
    }

    @Override // rh.r3
    public void b(rh.w3 w3Var, long j17) {
    }

    @Override // qh.e0
    public void c(boolean z17) {
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        long j17 = this.f363390f;
        long j18 = uptimeMillis - j17;
        if (j17 <= 0 || j18 <= 0) {
            oj.j.f("Matrix.battery.BatteryPrinter", "skip invalid battery tracing, bgn = " + this.f363390f + ", during = " + j18, new java.lang.Object[0]);
            return;
        }
        this.f363389e.l();
        qh.b bVar = this.f363389e.f395330l;
        if (bVar != null) {
            bVar.f363322o = new java.util.concurrent.atomic.AtomicBoolean(z17);
        }
        l(this.f363389e);
    }

    @Override // qh.e0
    public void d() {
        this.f363390f = android.os.SystemClock.uptimeMillis();
        this.f363389e.b();
        this.f363389e.I();
    }

    @Override // rh.t
    public void e(boolean z17, int i17, int i18, android.content.ComponentName componentName, long j17) {
    }

    @Override // rh.f2
    public void f(rh.o2 o2Var) {
        rh.c1 c1Var = new rh.c1(this.f363388d, "internal");
        c1Var.f395330l = qh.b.b(o2Var.f395487d);
        ((java.util.HashMap) c1Var.f395321c).put(rh.g2.class, o2Var);
        m(c1Var);
    }

    @Override // com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesListener
    public void g(rh.y2 y2Var) {
        java.util.Iterator<java.util.Map.Entry<java.lang.Thread, java.lang.StackTraceElement[]>> it;
        int i17;
        qh.v vVar = this;
        rh.y2 y2Var2 = y2Var;
        qh.u uVar = new qh.u();
        uVar.i();
        java.lang.StringBuilder sb6 = uVar.f363387a;
        sb6.append("| Thread WatchDog");
        uVar.a("\n");
        uVar.b("jiffies(" + y2Var2.f395560a.size() + ")");
        uVar.h("desc", "(status)name(tid)\ttotal");
        for (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesEntry threadJiffiesEntry : y2Var2.f395560a) {
            long longValue = ((java.lang.Long) threadJiffiesEntry.f395552a).longValue();
            sb6.append("|   -> (");
            sb6.append(threadJiffiesEntry.f52567d ? "+" : "~");
            sb6.append("/");
            sb6.append(threadJiffiesEntry.f52568e);
            sb6.append(")");
            sb6.append(threadJiffiesEntry.f52566c);
            sb6.append("(");
            sb6.append(java.lang.Integer.valueOf(threadJiffiesEntry.f52565b));
            sb6.append(")\t");
            sb6.append(java.lang.Long.valueOf(longValue));
            sb6.append("\tjiffies");
            uVar.a("\n");
        }
        uVar.b("stacks");
        qh.a0 a0Var = vVar.f363388d.f363335d;
        boolean z17 = a0Var.f363300s;
        if (!z17 || !a0Var.f363305x.isEmpty()) {
            for (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesEntry threadJiffiesEntry2 : y2Var2.f395560a) {
                for (java.lang.String str : vVar.f363388d.f363335d.f363305x) {
                    if (str.equalsIgnoreCase(threadJiffiesEntry2.f52566c) || threadJiffiesEntry2.f52566c.contains(str)) {
                        z17 = true;
                        break;
                    }
                }
                if (z17) {
                    break;
                }
            }
        }
        if (z17) {
            java.util.Map<java.lang.Thread, java.lang.StackTraceElement[]> allStackTraces = java.lang.Thread.getAllStackTraces();
            int i18 = 0;
            oj.j.c("Matrix.battery.BatteryPrinter", "onWatchingThreads dump stacks, get all threads size = " + allStackTraces, new java.lang.Object[0]);
            java.util.Iterator<java.util.Map.Entry<java.lang.Thread, java.lang.StackTraceElement[]>> it6 = allStackTraces.entrySet().iterator();
            while (it6.hasNext()) {
                java.util.Map.Entry<java.lang.Thread, java.lang.StackTraceElement[]> next = it6.next();
                java.lang.Thread key = next.getKey();
                java.lang.StackTraceElement[] value = next.getValue();
                java.lang.String name = key.getName();
                java.util.Iterator it7 = y2Var2.f395560a.iterator();
                while (it7.hasNext()) {
                    java.lang.String str2 = ((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesEntry) it7.next()).f52566c;
                    if (str2.equalsIgnoreCase(name) || name.contains(str2)) {
                        sb6.append("|   -> ");
                        sb6.append("(");
                        sb6.append(key.getState());
                        sb6.append(")");
                        sb6.append((java.lang.Object) name);
                        sb6.append("(");
                        sb6.append(java.lang.Long.valueOf(key.getId()));
                        sb6.append(")");
                        uVar.a("\n");
                        vVar.f363388d.f363335d.A.getClass();
                        if (value == null) {
                            it = it6;
                            i17 = i18;
                        } else {
                            java.util.ArrayList arrayList = new java.util.ArrayList(value.length);
                            int length = value.length;
                            int i19 = i18;
                            while (i19 < length) {
                                java.lang.StackTraceElement stackTraceElement = value[i19];
                                java.lang.String className = stackTraceElement.getClassName();
                                kotlin.jvm.internal.o.f(className, "className");
                                java.util.Iterator<java.util.Map.Entry<java.lang.Thread, java.lang.StackTraceElement[]>> it8 = it6;
                                if (!r26.n0.B(className, "com.tencent.matrix", false) && !r26.n0.B(className, "java.lang.reflect", false) && !r26.n0.B(className, "$Proxy2", false) && !r26.n0.B(className, "android.os", false)) {
                                    arrayList.add(stackTraceElement);
                                }
                                i19++;
                                i18 = 0;
                                it6 = it8;
                            }
                            it = it6;
                            i17 = i18;
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                            java.util.Iterator it9 = arrayList.iterator();
                            while (it9.hasNext()) {
                                java.lang.StackTraceElement stackTraceElement2 = (java.lang.StackTraceElement) it9.next();
                                sb7.append((sb7.length() == 0 ? 1 : i17) != 0 ? "" : "\n");
                                sb7.append("at ");
                                sb7.append(stackTraceElement2);
                            }
                            if (sb7.length() == 0) {
                            }
                        }
                        int length2 = value.length;
                        for (int i27 = i17; i27 < length2; i27++) {
                            java.lang.StackTraceElement stackTraceElement3 = value[i27];
                            sb6.append("|      ");
                            sb6.append(stackTraceElement3);
                            uVar.a("\n");
                        }
                    } else {
                        it = it6;
                        i17 = i18;
                    }
                    vVar = this;
                    i18 = i17;
                    it6 = it;
                }
                vVar = this;
                y2Var2 = y2Var;
            }
        } else {
            sb6.append("|   disabled");
            uVar.a("\n");
        }
        uVar.f();
        uVar.d();
    }

    @Override // rh.r3
    public void h(int i17, rh.w3 w3Var) {
    }

    public qh.v i(qh.f0 f0Var) {
        this.f363388d = f0Var;
        rh.c1 c1Var = new rh.c1(f0Var, "canary");
        this.f363389e = c1Var;
        c1Var.G();
        return this;
    }

    public void j(rh.c1 c1Var) {
        c1Var.u(com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.class, new qh.e(this, c1Var));
    }

    public qh.t k() {
        return new qh.t();
    }

    public void l(rh.c1 c1Var) {
        qh.t k17 = k();
        qh.u uVar = new qh.u();
        uVar.i();
        k17.a(c1Var, uVar);
        uVar.f();
        uVar.d();
        j(c1Var);
        m(c1Var);
    }

    public void m(rh.c1 c1Var) {
        c1Var.x(com.tencent.matrix.batterycanary.stats.k.class, new qh.f(this, c1Var));
    }
}
