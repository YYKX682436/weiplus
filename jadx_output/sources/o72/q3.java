package o72;

/* loaded from: classes12.dex */
public class q3 implements com.tencent.mm.modelbase.x0, com.tencent.mm.modelbase.y0, com.tencent.mm.sdk.platformtools.q7 {

    /* renamed from: p, reason: collision with root package name */
    public static com.tencent.mm.sdk.platformtools.SensorController f343446p;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.c1 f343447d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f343448e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f343449f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f343450g;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.s7 f343452i;

    /* renamed from: n, reason: collision with root package name */
    public int f343454n;

    /* renamed from: h, reason: collision with root package name */
    public boolean f343451h = false;

    /* renamed from: m, reason: collision with root package name */
    public long f343453m = -1;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f343455o = new java.util.LinkedList();

    public q3() {
        this.f343449f = true;
        ((com.tencent.mm.app.o7) ((com.tencent.mm.modelbase.d1) i95.n0.c(com.tencent.mm.modelbase.d1.class))).getClass();
        sl.j jVar = new sl.j(com.tencent.mm.sdk.platformtools.x2.f193071a, 0);
        this.f343447d = jVar;
        java.lang.Boolean bool = (java.lang.Boolean) gm0.j1.u().c().l(26, java.lang.Boolean.FALSE);
        this.f343450g = bool.booleanValue();
        boolean booleanValue = true ^ bool.booleanValue();
        this.f343449f = booleanValue;
        jVar.f409043p = this;
        jVar.f409042o = this;
        jVar.f(booleanValue);
        if (f343446p == null) {
            f343446p = new com.tencent.mm.sdk.platformtools.SensorController(com.tencent.mm.sdk.platformtools.x2.f193071a);
        }
        if (this.f343452i == null) {
            this.f343452i = new com.tencent.mm.sdk.platformtools.s7(com.tencent.mm.sdk.platformtools.x2.f193071a);
        }
    }

    @Override // com.tencent.mm.modelbase.y0
    public void a() {
        f();
        java.util.Iterator it = this.f343455o.iterator();
        while (it.hasNext()) {
            ((z30.a0) it.next()).onFinish();
        }
    }

    public boolean b() {
        com.tencent.mm.modelbase.c1 c1Var = this.f343447d;
        if (c1Var != null) {
            return ((sl.j) c1Var).c();
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.FavVoiceLogic", "check is play, but player is null");
        return false;
    }

    public void c() {
        com.tencent.mm.modelbase.c1 c1Var = this.f343447d;
        if (c1Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavVoiceLogic", "do pause, but player is null");
            return;
        }
        if (((sl.j) c1Var).c()) {
            d();
        }
        java.util.Iterator it = this.f343455o.iterator();
        while (it.hasNext()) {
            ((z30.a0) it.next()).onPause();
        }
    }

    public boolean d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FavVoiceLogic", "pause play");
        com.tencent.mm.sdk.platformtools.c3.b("keep_app_silent");
        com.tencent.mm.modelbase.c1 c1Var = this.f343447d;
        if (c1Var != null) {
            return ((sl.j) c1Var).d(true);
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.FavVoiceLogic", "pause play error, player is null");
        return false;
    }

    public boolean e(java.lang.String str, int i17) {
        com.tencent.mm.modelbase.c1 c1Var = this.f343447d;
        if (c1Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavVoiceLogic", "start play error, path %s, voiceType %d, player is null", str, java.lang.Integer.valueOf(i17));
            return false;
        }
        ((sl.j) c1Var).h(false);
        java.util.Iterator it = this.f343455o.iterator();
        while (it.hasNext()) {
            ((z30.a0) it.next()).a(str, 0);
        }
        com.tencent.mm.sdk.platformtools.SensorController sensorController = f343446p;
        if (sensorController != null && !sensorController.f192433h) {
            sensorController.b(this);
            if (this.f343452i.a(new o72.p3(this))) {
                this.f343453m = 0L;
            } else {
                this.f343453m = -1L;
            }
        }
        this.f343448e = str;
        this.f343454n = i17;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            if (((sl.j) c1Var).g(str, this.f343449f, true, i17)) {
                com.tencent.mm.sdk.platformtools.c3.a("keep_app_silent");
                return true;
            }
        }
        return false;
    }

    public void f() {
        com.tencent.mm.sdk.platformtools.c3.b("keep_app_silent");
        com.tencent.mm.modelbase.c1 c1Var = this.f343447d;
        if (c1Var != null) {
            ((sl.j) c1Var).h(false);
        }
        com.tencent.mm.sdk.platformtools.SensorController sensorController = f343446p;
        if (sensorController != null) {
            sensorController.a();
        }
        com.tencent.mm.sdk.platformtools.s7 s7Var = this.f343452i;
        if (s7Var != null) {
            s7Var.b();
        }
    }

    @Override // com.tencent.mm.sdk.platformtools.q7
    public void f1(boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f343448e)) {
            return;
        }
        if (this.f343451h) {
            this.f343451h = !z17;
            return;
        }
        if (!z17) {
            long j17 = this.f343453m;
            if (j17 != -1 && android.os.SystemClock.elapsedRealtime() - j17 > 400) {
                this.f343451h = true;
                return;
            }
        }
        this.f343451h = false;
        com.tencent.mm.modelbase.c1 c1Var = this.f343447d;
        if (c1Var != null) {
            c1Var.getClass();
        }
        cv.y0 wi6 = ((bv.a) ((cv.s0) i95.n0.c(cv.s0.class))).wi();
        if (this.f343450g) {
            if (c1Var != null) {
                ((sl.j) c1Var).f(false);
            }
            wi6.a(false);
            this.f343449f = false;
            return;
        }
        if (c1Var != null && !((sl.j) c1Var).c()) {
            ((sl.j) c1Var).f(true);
            this.f343449f = true;
        } else {
            if (((xm1.h) wi6).j()) {
                return;
            }
            if (c1Var != null) {
                ((sl.j) c1Var).f(z17);
            }
            this.f343449f = z17;
            if (z17) {
                return;
            }
            e(this.f343448e, this.f343454n);
        }
    }

    @Override // com.tencent.mm.modelbase.x0
    public void onCompletion() {
        f();
        java.util.Iterator it = this.f343455o.iterator();
        while (it.hasNext()) {
            ((z30.a0) it.next()).onFinish();
        }
    }
}
