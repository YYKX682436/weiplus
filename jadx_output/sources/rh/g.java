package rh;

/* loaded from: classes12.dex */
public abstract class g extends rh.a {

    /* renamed from: f, reason: collision with root package name */
    public wh.f2 f395394f;

    /* renamed from: g, reason: collision with root package name */
    public rh.w f395395g;

    /* renamed from: h, reason: collision with root package name */
    public rh.d2 f395396h;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f395390b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f395391c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f395392d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final android.util.SparseArray f395393e = new android.util.SparseArray();

    /* renamed from: i, reason: collision with root package name */
    public int f395397i = 200;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.Runnable f395398j = new rh.b(this);

    @Override // rh.a, rh.e3
    public void c() {
        super.c();
    }

    @Override // rh.a, rh.e3
    public void e() {
        super.e();
        ((java.util.concurrent.ConcurrentHashMap) this.f395391c).clear();
        synchronized (this.f395392d) {
            ((java.util.concurrent.ConcurrentHashMap) this.f395392d).clear();
        }
        synchronized (this.f395390b) {
            ((java.util.ArrayList) this.f395390b).clear();
        }
        synchronized (this.f395393e) {
            this.f395393e.clear();
        }
    }

    @Override // rh.a, rh.e3
    public void h(qh.f0 f0Var) {
        super.h(f0Var);
        this.f395395g = (rh.w) f0Var.i(rh.w.class);
        this.f395396h = (rh.d2) f0Var.i(rh.d2.class);
        this.f395394f = new wh.f2("thread_pool@idle", 0L);
        this.f395397i = java.lang.Math.max(f0Var.f363335d.f363289h, this.f395397i);
    }

    @Override // rh.a
    public java.lang.String i() {
        return "Matrix.battery.AbsTaskMonitorFeature";
    }

    public void k() {
        android.os.Handler handler = this.f395294a.f363337f;
        java.lang.Runnable runnable = this.f395398j;
        handler.removeCallbacks(runnable);
        this.f395294a.f363337f.postDelayed(runnable, 1000L);
    }

    public void l() {
        synchronized (this.f395390b) {
            ((java.util.ArrayList) this.f395390b).clear();
        }
    }

    public rh.f m(java.lang.String str, int i17) {
        rh.f fVar = new rh.f();
        fVar.f395374d = i17;
        fVar.f395375e = str;
        fVar.f395378h = wh.m.d(this.f395294a.d(), this.f395294a.f363343o);
        fVar.f395379i = wh.m.r(this.f395294a.d());
        try {
            java.util.concurrent.Callable callable = this.f395294a.f363335d.f363284c;
            fVar.f395380j = callable == null ? "" : (java.lang.String) callable.call();
        } catch (java.lang.Exception unused) {
            fVar.f395380j = "";
        }
        if (this.f395294a.f363335d.f363301t && i17 == android.os.Process.myTid()) {
            fVar.f395377g = rh.x2.b(java.lang.Long.valueOf(android.os.SystemClock.currentThreadTimeMillis() / 10));
            return fVar;
        }
        int myPid = android.os.Process.myPid();
        wh.t1 e17 = wh.u1.e(myPid, i17);
        if (e17 != null) {
            fVar.f395377g = rh.x2.b(java.lang.Long.valueOf(e17.a()));
            return fVar;
        }
        oj.j.f("Matrix.battery.AbsTaskMonitorFeature", "parse task procStat fail, name = " + str + ", tid = " + i17, new java.lang.Object[0]);
        q(str, myPid, i17);
        return null;
    }

    public java.util.List n(long j17) {
        java.util.ArrayList arrayList;
        synchronized (this.f395390b) {
            if (j17 <= 0) {
                arrayList = new java.util.ArrayList(this.f395390b);
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                long uptimeMillis = android.os.SystemClock.uptimeMillis() - j17;
                java.util.Iterator it = ((java.util.ArrayList) this.f395390b).iterator();
                while (it.hasNext()) {
                    rh.o2 o2Var = (rh.o2) it.next();
                    if (((rh.f) o2Var.f395484a).f395363a >= uptimeMillis) {
                        arrayList2.add(o2Var);
                    }
                }
                arrayList = arrayList2;
            }
        }
        java.util.Collections.sort(arrayList, new rh.c(this));
        return arrayList;
    }

    public wh.i2 o(int i17, long j17, long j18) {
        synchronized (this.f395393e) {
            if (j17 >= 0) {
                try {
                    if (this.f395393e.get(i17) != null) {
                        return wh.j2.a((java.util.List) this.f395393e.get(i17), j17, 10L, new rh.d(this, j18));
                    }
                } catch (java.lang.Throwable th6) {
                    throw th6;
                }
            }
            wh.i2 i2Var = new wh.i2();
            i2Var.f445804c = false;
            return i2Var;
        }
    }

    public java.util.ArrayList p(int i17) {
        synchronized (this.f395393e) {
            java.util.List list = (java.util.List) this.f395393e.get(i17);
            if (list == null) {
                return null;
            }
            return new java.util.ArrayList(list);
        }
    }

    public void q(java.lang.String str, int i17, int i18) {
    }

    public void r(int i17, java.lang.String str, long j17) {
        synchronized (this.f395393e) {
            java.util.List list = (java.util.List) this.f395393e.get(i17);
            java.util.List list2 = list;
            if (list == null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(0, this.f395394f);
                this.f395393e.put(i17, arrayList);
                list2 = arrayList;
            }
            list2.add(0, new wh.f2(str, j17));
        }
        k();
    }

    public void s(java.util.List list) {
    }

    public boolean t(rh.o2 o2Var) {
        return o2Var.f395487d > 1000 && ((java.lang.Long) ((rh.f) o2Var.f395486c).f395377g.f395552a).longValue() / java.lang.Math.max(1L, o2Var.f395487d / 60000) > 100;
    }

    public void u(rh.f fVar, rh.f fVar2) {
        long j17;
        if (fVar2.f395374d != fVar.f395374d) {
            oj.j.f("Matrix.battery.AbsTaskMonitorFeature", "task tid mismatch: " + fVar + " vs " + fVar2, new java.lang.Object[0]);
            return;
        }
        if (!fVar2.f395375e.equals(fVar.f395375e)) {
            oj.j.f("Matrix.battery.AbsTaskMonitorFeature", "task name mismatch: " + fVar + " vs " + fVar2, new java.lang.Object[0]);
            return;
        }
        rh.e eVar = new rh.e(fVar2, fVar, fVar2);
        if (t(eVar)) {
            rh.d3 d3Var = eVar.f395486c;
            java.lang.String str = ((rh.f) d3Var).f395375e;
            java.lang.Number number = ((rh.f) d3Var).f395377g.f395552a;
            long j18 = eVar.f395487d;
            oj.j.c("Matrix.battery.AbsTaskMonitorFeature", "onTaskReport: %s, jiffies = %s, millis = %s", str, number, java.lang.Long.valueOf(j18));
            rh.w wVar = this.f395395g;
            if (wVar != null) {
                rh.v k17 = wVar.k(j18);
                if (!k17.f395365c) {
                    fVar2.f395365c = false;
                    ((rh.f) d3Var).f395365c = false;
                }
                java.lang.String str2 = ((rh.f) d3Var).f395380j;
                wh.h2 b17 = this.f395395g.l(j18).b();
                if (b17 != null) {
                    j17 = b17.f445797b;
                    str2 = b17.f445796a;
                } else {
                    j17 = 100;
                }
                ((rh.f) d3Var).f395382l = ((java.lang.Long) k17.f395520f.f395552a).longValue();
                ((rh.f) d3Var).f395380j = str2;
                ((rh.f) d3Var).f395384n = j17;
            }
            rh.d2 d2Var = this.f395396h;
            if (d2Var != null) {
                rh.a2 m17 = d2Var.m(j18);
                if (!m17.f395365c) {
                    fVar2.f395365c = false;
                    ((rh.f) d3Var).f395365c = false;
                }
                ((rh.f) d3Var).f395383m = ((java.lang.Long) m17.f395300e.f395552a).longValue();
            }
            v(eVar);
            java.util.List list = this.f395390b;
            if (((java.util.ArrayList) list).size() >= this.f395397i) {
                oj.j.f("Matrix.battery.AbsTaskMonitorFeature", "task list overheat, size = " + ((java.util.ArrayList) list).size(), new java.lang.Object[0]);
                k();
            }
        }
    }

    public void v(rh.o2 o2Var) {
        synchronized (this.f395390b) {
            java.util.Iterator it = ((java.util.ArrayList) this.f395390b).iterator();
            while (it.hasNext()) {
                rh.o2 o2Var2 = (rh.o2) it.next();
                if (((rh.f) o2Var2.f395486c).f395375e.equals(((rh.f) o2Var.f395486c).f395375e)) {
                    rh.d3 d3Var = o2Var2.f395486c;
                    if (((rh.f) d3Var).f395374d == ((rh.f) o2Var.f395486c).f395374d && !((rh.f) d3Var).f395381k) {
                        it.remove();
                    }
                }
            }
            ((java.util.ArrayList) this.f395390b).add(o2Var);
        }
    }
}
