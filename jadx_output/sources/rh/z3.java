package rh;

/* loaded from: classes12.dex */
public final class z3 extends rh.a {

    /* renamed from: b, reason: collision with root package name */
    public long f395574b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f395575c = new java.util.concurrent.ConcurrentHashMap(2);

    /* renamed from: d, reason: collision with root package name */
    public final rh.y3 f395576d = new rh.y3();

    /* renamed from: e, reason: collision with root package name */
    public wh.h1 f395577e;

    public static void k(rh.z3 z3Var, java.lang.String str) {
        if (z3Var.f395294a.f363335d.f363303v.contains(str)) {
            oj.j.f("Matrix.battery.WakeLockMonitorFeature", "dump wakelocks tracing for tag '" + str + "':", new java.lang.Object[0]);
            for (rh.x3 x3Var : ((java.util.concurrent.ConcurrentHashMap) z3Var.f395575c).values()) {
                if (x3Var.f395554b.f395540b.equalsIgnoreCase(str)) {
                    oj.j.f("Matrix.battery.WakeLockMonitorFeature", " - " + x3Var.f395554b, new java.lang.Object[0]);
                }
            }
        }
    }

    @Override // rh.e3
    public int b() {
        return Integer.MIN_VALUE;
    }

    @Override // rh.a, rh.e3
    public void c() {
        super.c();
        if (this.f395294a.f363335d.f363298q) {
            rh.q3 q3Var = new rh.q3(this);
            this.f395577e = q3Var;
            java.util.List list = wh.j1.f445813a;
            synchronized (wh.j1.class) {
                java.util.List list2 = wh.j1.f445813a;
                if (((java.util.ArrayList) list2).contains(q3Var)) {
                    return;
                }
                ((java.util.ArrayList) list2).add(q3Var);
                if (!wh.j1.f445814b && !((java.util.ArrayList) list2).isEmpty()) {
                    oj.j.c("Matrix.battery.PowerHooker", "checkHook hookRet:%b", java.lang.Boolean.valueOf(wh.j1.f445815c.a()));
                    wh.j1.f445814b = true;
                }
            }
        }
    }

    @Override // rh.a, rh.e3
    public void e() {
        super.e();
        wh.h1 h1Var = this.f395577e;
        java.util.List list = wh.j1.f445813a;
        synchronized (wh.j1.class) {
            if (h1Var != null) {
                java.util.List list2 = wh.j1.f445813a;
                ((java.util.ArrayList) list2).remove(h1Var);
                if (wh.j1.f445814b && ((java.util.ArrayList) list2).isEmpty()) {
                    oj.j.c("Matrix.battery.PowerHooker", "checkUnHook unHookRet:%b", java.lang.Boolean.valueOf(wh.j1.f445815c.b()));
                    wh.j1.f445814b = false;
                }
            }
        }
        this.f395294a.f363337f.removeCallbacksAndMessages(null);
        ((java.util.concurrent.ConcurrentHashMap) this.f395575c).clear();
        rh.y3 y3Var = this.f395576d;
        y3Var.f395562b = 0;
        y3Var.f395563c = 0L;
        y3Var.f395564d = 0;
        y3Var.f395565e = 0;
    }

    @Override // rh.a, rh.e3
    public void g(long j17) {
        super.g(j17);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.f395575c;
        if (concurrentHashMap.isEmpty()) {
            return;
        }
        java.util.Iterator it = concurrentHashMap.values().iterator();
        while (it.hasNext()) {
            rh.w3 w3Var = ((rh.x3) it.next()).f395554b;
            if (!(w3Var.f395544f >= w3Var.f395543e) && l(w3Var.f395540b)) {
                this.f395294a.b(w3Var, j17);
            }
        }
    }

    @Override // rh.a, rh.e3
    public void h(qh.f0 f0Var) {
        super.h(f0Var);
        this.f395574b = f0Var.f363335d.f363285d;
    }

    @Override // rh.a
    public java.lang.String i() {
        return "Matrix.battery.WakeLockMonitorFeature";
    }

    public final boolean l(java.lang.String str) {
        return j() || !this.f395294a.f363335d.f363302u.contains(str) || this.f395294a.f363335d.f363303v.contains(str);
    }
}
