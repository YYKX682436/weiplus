package kj;

/* loaded from: classes12.dex */
public class m extends kj.g0 implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: w, reason: collision with root package name */
    public static final int f308241w = android.os.Build.VERSION.SDK_INT;

    /* renamed from: x, reason: collision with root package name */
    public static float f308242x = 60.0f;

    /* renamed from: e, reason: collision with root package name */
    public double f308243e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f308244f;

    /* renamed from: g, reason: collision with root package name */
    public final jj.f f308245g;

    /* renamed from: h, reason: collision with root package name */
    public jj.b f308246h;

    /* renamed from: i, reason: collision with root package name */
    public int f308247i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashSet f308248m;

    /* renamed from: n, reason: collision with root package name */
    public final long f308249n;

    /* renamed from: o, reason: collision with root package name */
    public final long f308250o;

    /* renamed from: p, reason: collision with root package name */
    public final long f308251p;

    /* renamed from: q, reason: collision with root package name */
    public final long f308252q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f308253r;

    /* renamed from: s, reason: collision with root package name */
    public final android.app.Application f308254s;

    /* renamed from: t, reason: collision with root package name */
    public final kj.l f308255t;

    /* renamed from: u, reason: collision with root package name */
    public kj.g f308256u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.Map f308257v;

    public m(android.app.Application application, ej.c cVar) {
        this.f308243e = 0.0d;
        this.f308244f = new java.util.HashSet();
        this.f308245g = new kj.e(this);
        this.f308247i = 0;
        this.f308248m = new java.util.HashSet();
        this.f308255t = new kj.l(this, null);
        this.f308257v = new java.util.concurrent.ConcurrentHashMap();
        boolean z17 = cVar.f253261h;
        this.f308253r = false;
        boolean z18 = cVar.f253260g;
        this.f308254s = application;
        long j17 = gj.o.f272367n.f272370f;
        this.f308249n = cVar.f253254a != null ? ((com.tencent.mm.matrix.o0) r5).a("clicfg_matrix_fps_dropped_frozen", 42) : 42;
        this.f308250o = cVar.f253254a != null ? ((com.tencent.mm.matrix.o0) r5).a("clicfg_matrix_fps_dropped_high", 24) : 24;
        this.f308252q = cVar.f253254a != null ? ((com.tencent.mm.matrix.o0) r5).a("clicfg_matrix_fps_dropped_normal", 3) : 3;
        this.f308251p = cVar.f253254a != null ? ((com.tencent.mm.matrix.o0) r5).a("clicfg_matrix_fps_dropped_middle", 9) : 9;
        oj.j.c("Matrix.FrameTracer", "[init] frameIntervalMs:%s isFPSEnable:%s", java.lang.Long.valueOf(j17), java.lang.Boolean.FALSE);
    }

    @Override // kj.g0
    public void d() {
        super.d();
        if (this.f308253r) {
            i();
        }
    }

    @Override // kj.g0
    public void f() {
        super.f();
        if (this.f308253r) {
            h();
        }
    }

    public void h() {
        oj.j.c("Matrix.FrameTracer", "forceDisable", new java.lang.Object[0]);
        this.f308246h = null;
        if (f308241w >= 24) {
            this.f308254s.unregisterActivityLifecycleCallbacks(this);
            this.f308248m.clear();
            ((java.util.concurrent.ConcurrentHashMap) this.f308257v).clear();
            kj.g gVar = this.f308256u;
            if (gVar != null) {
                l(gVar, false);
                this.f308256u = null;
                return;
            }
            return;
        }
        gj.o oVar = gj.o.f272367n;
        jj.f fVar = this.f308245g;
        synchronized (oVar.f272369e) {
            oVar.f272369e.remove(fVar);
            if (oVar.f272369e.isEmpty()) {
                oVar.f();
            }
        }
        this.f308244f.clear();
    }

    public void i() {
        oj.j.c("Matrix.FrameTracer", "forceEnable", new java.lang.Object[0]);
        if (f308241w < 24) {
            gj.o.f272367n.b(this.f308245g);
            return;
        }
        this.f308254s.registerActivityLifecycleCallbacks(this);
        kj.l lVar = this.f308255t;
        synchronized (this.f308248m) {
            this.f308248m.add(lVar);
        }
        if (ih.d.c()) {
            kj.g gVar = new kj.g();
            this.f308256u = gVar;
            k(gVar);
        }
    }

    public final float j(android.view.Window window) {
        return f308241w >= 30 ? window.getContext().getDisplay().getRefreshRate() : window.getWindowManager().getDefaultDisplay().getRefreshRate();
    }

    public void k(jj.e eVar) {
        kj.l lVar = this.f308255t;
        synchronized (lVar) {
            if (eVar.c() >= 1 && eVar.d() >= 0) {
                java.lang.String name = eVar.getName();
                kj.j jVar = new kj.j(lVar.f308240d, eVar);
                if (name != null && !name.isEmpty()) {
                    lVar.f308238b.put(name, jVar);
                    oj.j.c("Matrix.FrameTracer", "register success. unspecifiedSceneMap.size=%d, specifiedSceneMap.size=%d", java.lang.Integer.valueOf(lVar.f308239c.size()), java.lang.Integer.valueOf(lVar.f308238b.size()));
                    return;
                }
                lVar.f308239c.put(eVar, jVar);
                oj.j.c("Matrix.FrameTracer", "register success. unspecifiedSceneMap.size=%d, specifiedSceneMap.size=%d", java.lang.Integer.valueOf(lVar.f308239c.size()), java.lang.Integer.valueOf(lVar.f308238b.size()));
                return;
            }
            oj.j.b("Matrix.FrameTracer", "Illegal value, intervalMs=%d, threshold=%d, activity=%s", java.lang.Integer.valueOf(eVar.c()), java.lang.Integer.valueOf(eVar.d()), eVar.getClass().getName());
        }
    }

    public void l(jj.e eVar, boolean z17) {
        kj.j jVar;
        kj.l lVar = this.f308255t;
        synchronized (lVar) {
            java.lang.String name = eVar.getName();
            if (name != null && !name.isEmpty()) {
                jVar = (kj.j) lVar.f308238b.remove(name);
                if (jVar != null && z17) {
                    jVar.b();
                }
                oj.j.c("Matrix.FrameTracer", "unregister success. unspecifiedSceneMap.size=%d, specifiedSceneMap.size=%d", java.lang.Integer.valueOf(lVar.f308239c.size()), java.lang.Integer.valueOf(lVar.f308238b.size()));
            }
            jVar = (kj.j) lVar.f308239c.remove(eVar);
            if (jVar != null) {
                jVar.b();
            }
            oj.j.c("Matrix.FrameTracer", "unregister success. unspecifiedSceneMap.size=%d, specifiedSceneMap.size=%d", java.lang.Integer.valueOf(lVar.f308239c.size()), java.lang.Integer.valueOf(lVar.f308238b.size()));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        try {
            activity.getWindow().removeOnFrameMetricsAvailableListener((android.view.Window.OnFrameMetricsAvailableListener) this.f308257v.remove(java.lang.Integer.valueOf(activity.hashCode())));
        } catch (java.lang.Throwable th6) {
            oj.j.b("Matrix.FrameTracer", "removeOnFrameMetricsAvailableListener error : " + th6.getMessage(), new java.lang.Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        kj.l lVar = this.f308255t;
        synchronized (lVar) {
            java.util.Iterator it = lVar.f308239c.values().iterator();
            while (it.hasNext()) {
                ((kj.j) it.next()).b();
            }
            java.util.Iterator it6 = lVar.f308238b.values().iterator();
            while (it6.hasNext()) {
                ((kj.j) it6.next()).b();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(activity.hashCode());
        java.util.Map map = this.f308257v;
        if (map.containsKey(valueOf)) {
            return;
        }
        float j17 = j(activity.getWindow());
        f308242x = j17;
        oj.j.c("Matrix.FrameTracer", "default refresh rate is %dHz", java.lang.Integer.valueOf((int) j17));
        kj.f fVar = new kj.f(this);
        map.put(java.lang.Integer.valueOf(activity.hashCode()), fVar);
        activity.getWindow().addOnFrameMetricsAvailableListener(fVar, oj.g.a());
        oj.j.c("Matrix.FrameTracer", "onActivityResumed addOnFrameMetricsAvailableListener", new java.lang.Object[0]);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
    }

    public m(android.app.Application application, int i17, int i18, int i19, int i27) {
        this.f308243e = 0.0d;
        this.f308244f = new java.util.HashSet();
        this.f308245g = new kj.e(this);
        this.f308247i = 0;
        this.f308248m = new java.util.HashSet();
        this.f308255t = new kj.l(this, null);
        this.f308257v = new java.util.concurrent.ConcurrentHashMap();
        this.f308253r = true;
        this.f308254s = application;
        long j17 = gj.o.f272367n.f272370f;
        this.f308249n = i17;
        this.f308250o = i18;
        this.f308252q = i27;
        this.f308251p = i19;
    }
}
