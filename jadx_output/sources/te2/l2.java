package te2;

/* loaded from: classes14.dex */
public final class l2 implements te2.b2, x91.a {

    /* renamed from: d, reason: collision with root package name */
    public final gk2.e f418191d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f418192e;

    /* renamed from: f, reason: collision with root package name */
    public final int f418193f;

    /* renamed from: g, reason: collision with root package name */
    public final int f418194g;

    /* renamed from: h, reason: collision with root package name */
    public int f418195h;

    /* renamed from: i, reason: collision with root package name */
    public te2.c2 f418196i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f418197m;

    /* renamed from: n, reason: collision with root package name */
    public final x91.i f418198n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f418199o;

    public l2(gk2.e liveData, qo0.c statusMonitor) {
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f418191d = liveData;
        this.f418192e = "Finder.FinderLiveCastScreenPresenter";
        this.f418193f = 7;
        this.f418194g = 10;
        this.f418197m = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper(), new te2.f2(this));
        this.f418198n = new te2.k2(this);
        this.f418199o = new com.tencent.mm.sdk.platformtools.b4("finder_live_device_search", (com.tencent.mm.sdk.platformtools.a4) new te2.e2(this), true);
    }

    @Override // x91.a
    public void C2(x91.h hVar) {
        com.tencent.mars.xlog.Log.i(this.f418192e, "onAddDevice " + hVar);
        te2.c2 c2Var = this.f418196i;
        if (c2Var != null) {
            pm0.v.X(new te2.r2(hVar, (te2.a3) c2Var));
        }
    }

    @Override // x91.a
    public void K4(x91.h hVar) {
        com.tencent.mars.xlog.Log.i(this.f418192e, "onUpdateDevice " + hVar);
        te2.c2 c2Var = this.f418196i;
        if (c2Var != null) {
            pm0.v.X(new te2.x2(hVar, (te2.a3) c2Var));
        }
    }

    public void c() {
        x91.h hVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("breakDevice: ");
        gk2.e eVar = this.f418191d;
        sb6.append(eVar);
        sb6.append(".business(LiveCastScreenSlice::class.java).selectedDevice");
        com.tencent.mars.xlog.Log.i(this.f418192e, sb6.toString());
        if (((je2.i) eVar.a(je2.i.class)).f299235f == null || (hVar = ((je2.i) eVar.a(je2.i.class)).f299235f) == null) {
            return;
        }
        hVar.e(new te2.j2(this));
    }

    public void f() {
        java.lang.String str = this.f418192e;
        com.tencent.mars.xlog.Log.i(str, "cleanUp");
        try {
            this.f418199o.d();
            x91.b b17 = x91.b.b();
            b17.f452630a = true;
            for (x91.h hVar : ((java.util.HashMap) b17.f452631b).values()) {
                hVar.h();
                hVar.i();
                hVar.f452654h = null;
            }
            b17.e(this);
            b17.a();
            try {
                int i17 = y91.i0.f460281h;
                y91.h0.f460277a.a();
            } catch (ba1.a unused) {
            }
            y91.n.f460302a.a();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(str, "Error happen while cleaning up " + e17.getMessage());
        }
    }

    public void g() {
        java.lang.String str = this.f418192e;
        com.tencent.mars.xlog.Log.i(str, "prepare");
        try {
            int i17 = y91.i0.f460281h;
            y91.h0.f460277a.b();
            y91.n.f460302a.b();
            x91.b.b().c(this);
        } catch (ba1.a e17) {
            com.tencent.mars.xlog.Log.w(str, "RouterException: " + e17.getMessage());
        }
    }

    @Override // fs2.a
    public void onAttach(java.lang.Object obj) {
        te2.c2 callback = (te2.c2) obj;
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i(this.f418192e, "onAttach");
        this.f418196i = callback;
    }

    @Override // fs2.a
    public void onDetach() {
        com.tencent.mars.xlog.Log.i(this.f418192e, "onDetach");
        f();
        this.f418196i = null;
    }

    @Override // x91.a
    public void q2(x91.h hVar) {
        com.tencent.mars.xlog.Log.i(this.f418192e, "onRemoveDevice " + hVar);
        te2.c2 c2Var = this.f418196i;
        if (c2Var != null) {
            pm0.v.X(new te2.v2(hVar, (te2.a3) c2Var));
        }
    }
}
