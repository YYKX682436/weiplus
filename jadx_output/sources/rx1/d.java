package rx1;

/* loaded from: classes12.dex */
public class d implements com.tencent.mm.modelbase.x0, com.tencent.mm.modelbase.y0, com.tencent.mm.sdk.platformtools.q7 {

    /* renamed from: q, reason: collision with root package name */
    public static volatile rx1.d f400944q;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.c1 f400945d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f400946e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f400947f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f400948g;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.s7 f400950i;

    /* renamed from: n, reason: collision with root package name */
    public int f400952n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.SensorController f400953o;

    /* renamed from: h, reason: collision with root package name */
    public boolean f400949h = false;

    /* renamed from: m, reason: collision with root package name */
    public long f400951m = -1;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f400954p = new java.util.LinkedList();

    public d() {
        this.f400947f = true;
        ((com.tencent.mm.app.o7) ((com.tencent.mm.modelbase.d1) i95.n0.c(com.tencent.mm.modelbase.d1.class))).getClass();
        sl.j jVar = new sl.j(com.tencent.mm.sdk.platformtools.x2.f193071a, 0);
        this.f400945d = jVar;
        java.lang.Boolean bool = (java.lang.Boolean) gm0.j1.u().c().l(26, java.lang.Boolean.FALSE);
        this.f400948g = bool.booleanValue();
        boolean booleanValue = true ^ bool.booleanValue();
        this.f400947f = booleanValue;
        jVar.f409043p = this;
        jVar.f409042o = this;
        jVar.f(booleanValue);
        if (this.f400953o == null) {
            this.f400953o = new com.tencent.mm.sdk.platformtools.SensorController(com.tencent.mm.sdk.platformtools.x2.f193071a);
        }
        if (this.f400950i == null) {
            this.f400950i = new com.tencent.mm.sdk.platformtools.s7(com.tencent.mm.sdk.platformtools.x2.f193071a);
        }
    }

    public static rx1.d b() {
        if (f400944q == null) {
            synchronized (rx1.d.class) {
                if (f400944q == null) {
                    f400944q = new rx1.d();
                }
            }
        }
        return f400944q;
    }

    @Override // com.tencent.mm.modelbase.y0
    public void a() {
        e();
    }

    public boolean c() {
        com.tencent.mm.modelbase.c1 c1Var = this.f400945d;
        if (c1Var != null) {
            return ((sl.j) c1Var).c();
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.RecordVoiceHelper", "check is play, but player is null");
        return false;
    }

    public boolean d(java.lang.String str, int i17) {
        com.tencent.mm.modelbase.c1 c1Var = this.f400945d;
        if (c1Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RecordVoiceHelper", "start play error, path %s, voiceType %d, player is null", str, java.lang.Integer.valueOf(i17));
            return false;
        }
        ((sl.j) c1Var).h(false);
        com.tencent.mm.sdk.platformtools.SensorController sensorController = this.f400953o;
        if (sensorController != null && !sensorController.f192433h) {
            sensorController.b(this);
            if (this.f400950i.a(new rx1.b(this))) {
                this.f400951m = 0L;
            } else {
                this.f400951m = -1L;
            }
        }
        this.f400946e = str;
        this.f400952n = i17;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            if (((sl.j) c1Var).g(str, this.f400947f, true, i17)) {
                com.tencent.mm.sdk.platformtools.c3.a("keep_app_silent");
                for (rx1.c cVar : this.f400954p) {
                    if (cVar != null) {
                        cVar.d(str);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordVoiceHelper", "stop play");
        com.tencent.mm.sdk.platformtools.c3.b("keep_app_silent");
        com.tencent.mm.modelbase.c1 c1Var = this.f400945d;
        if (c1Var != null) {
            ((sl.j) c1Var).h(false);
            for (rx1.c cVar : this.f400954p) {
                if (cVar != null) {
                    cVar.c();
                }
            }
        }
        com.tencent.mm.sdk.platformtools.SensorController sensorController = this.f400953o;
        if (sensorController != null) {
            sensorController.a();
        }
        com.tencent.mm.sdk.platformtools.s7 s7Var = this.f400950i;
        if (s7Var != null) {
            s7Var.b();
        }
    }

    @Override // com.tencent.mm.sdk.platformtools.q7
    public void f1(boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f400946e)) {
            return;
        }
        if (this.f400949h) {
            this.f400949h = !z17;
            return;
        }
        if (!z17) {
            long j17 = this.f400951m;
            if (j17 != -1 && android.os.SystemClock.elapsedRealtime() - j17 > 400) {
                this.f400949h = true;
                return;
            }
        }
        this.f400949h = false;
        com.tencent.mm.modelbase.c1 c1Var = this.f400945d;
        if (c1Var != null) {
            c1Var.getClass();
        }
        if (this.f400948g) {
            if (c1Var != null) {
                ((sl.j) c1Var).f(false);
            }
            this.f400947f = false;
        } else {
            if (c1Var != null && !((sl.j) c1Var).c()) {
                ((sl.j) c1Var).f(true);
                this.f400947f = true;
                return;
            }
            if (c1Var != null) {
                ((sl.j) c1Var).f(z17);
            }
            this.f400947f = z17;
            if (z17) {
                return;
            }
            d(this.f400946e, this.f400952n);
        }
    }

    @Override // com.tencent.mm.modelbase.x0
    public void onCompletion() {
        e();
    }
}
