package uz4;

/* loaded from: classes12.dex */
public class d implements com.tencent.mm.modelbase.x0, com.tencent.mm.modelbase.y0, com.tencent.mm.modelbase.z0, com.tencent.mm.modelbase.b1, com.tencent.mm.sdk.platformtools.q7 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f432166d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f432168f;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.s7 f432170h;

    /* renamed from: m, reason: collision with root package name */
    public int f432172m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.SensorController f432173n;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.modelbase.c1 f432175p;

    /* renamed from: e, reason: collision with root package name */
    public boolean f432167e = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f432169g = false;

    /* renamed from: i, reason: collision with root package name */
    public long f432171i = -1;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f432174o = new java.util.LinkedList();

    public d() {
        if (this.f432173n == null) {
            this.f432173n = new com.tencent.mm.sdk.platformtools.SensorController(com.tencent.mm.sdk.platformtools.x2.f193071a);
        }
        if (this.f432170h == null) {
            this.f432170h = new com.tencent.mm.sdk.platformtools.s7(com.tencent.mm.sdk.platformtools.x2.f193071a);
        }
    }

    @Override // com.tencent.mm.modelbase.y0
    public void a() {
        h();
    }

    public void b(uz4.c cVar) {
        if (cVar == null) {
            return;
        }
        java.util.List list = this.f432174o;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (cVar == ((uz4.c) it.next())) {
                return;
            }
        }
        ((java.util.LinkedList) list).add(cVar);
    }

    @Override // com.tencent.mm.modelbase.z0
    public void c(boolean z17) {
    }

    public void d() {
        h();
        this.f432173n = null;
        this.f432170h = null;
        ((java.util.LinkedList) this.f432174o).clear();
        com.tencent.mm.modelbase.c1 c1Var = this.f432175p;
        if (c1Var != null) {
            ((sl.j) c1Var).f409043p = null;
            ((sl.j) c1Var).f409042o = null;
            ((sl.j) c1Var).i();
            this.f432175p = null;
        }
    }

    public final com.tencent.mm.modelbase.c1 e() {
        if (this.f432175p == null) {
            ((com.tencent.mm.app.o7) ((com.tencent.mm.modelbase.d1) i95.n0.c(com.tencent.mm.modelbase.d1.class))).getClass();
            this.f432175p = new sl.j(com.tencent.mm.sdk.platformtools.x2.f193071a, 0);
            java.lang.Boolean bool = (java.lang.Boolean) c01.d9.b().p().l(26, java.lang.Boolean.FALSE);
            this.f432168f = bool.booleanValue();
            boolean z17 = !bool.booleanValue();
            this.f432167e = z17;
            com.tencent.mm.modelbase.c1 c1Var = this.f432175p;
            if (c1Var != null) {
                sl.j jVar = (sl.j) c1Var;
                jVar.f409043p = this;
                jVar.f409042o = this;
                jVar.f409032e = this;
                jVar.f409033f = this;
                jVar.f(z17);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.NoteEditorVoiceHelper", "get voice player fail, it is null");
            }
        }
        return this.f432175p;
    }

    public boolean f() {
        return this.f432175p != null && ((sl.j) e()).c();
    }

    @Override // com.tencent.mm.sdk.platformtools.q7
    public void f1(boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f432166d)) {
            return;
        }
        if (this.f432169g) {
            this.f432169g = !z17;
            return;
        }
        if (!z17) {
            long j17 = this.f432171i;
            if (j17 != -1 && android.os.SystemClock.elapsedRealtime() - j17 > 400) {
                this.f432169g = true;
                return;
            }
        }
        this.f432169g = false;
        com.tencent.mm.modelbase.c1 c1Var = this.f432175p;
        if (c1Var != null) {
            c1Var.getClass();
        }
        e().getClass();
        if (this.f432168f) {
            ((sl.j) e()).f(false);
            this.f432167e = false;
        } else {
            if (!((sl.j) e()).c()) {
                ((sl.j) e()).f(true);
                this.f432167e = true;
                return;
            }
            ((sl.j) e()).f(z17);
            this.f432167e = z17;
            if (z17) {
                return;
            }
            g(this.f432166d, this.f432172m);
        }
    }

    public boolean g(java.lang.String str, int i17) {
        ((sl.j) e()).h(false);
        com.tencent.mm.sdk.platformtools.SensorController sensorController = this.f432173n;
        if (sensorController != null && !sensorController.f192433h) {
            sensorController.b(this);
            if (this.f432170h.a(new uz4.b(this))) {
                this.f432171i = 0L;
            } else {
                this.f432171i = -1L;
            }
        }
        this.f432166d = str;
        this.f432172m = i17;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            if (((sl.j) e()).g(str, this.f432167e, true, i17)) {
                com.tencent.mm.sdk.platformtools.c3.a("keep_app_silent");
                for (uz4.c cVar : this.f432174o) {
                    if (cVar != null) {
                        cVar.d(str);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public void h() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NoteEditorVoiceHelper", "stop play");
        com.tencent.mm.sdk.platformtools.c3.b("keep_app_silent");
        if (this.f432175p != null) {
            ((sl.j) e()).h(false);
        }
        for (uz4.c cVar : this.f432174o) {
            if (cVar != null) {
                cVar.c();
            }
        }
        com.tencent.mm.sdk.platformtools.SensorController sensorController = this.f432173n;
        if (sensorController != null) {
            sensorController.a();
        }
        com.tencent.mm.sdk.platformtools.s7 s7Var = this.f432170h;
        if (s7Var != null) {
            s7Var.b();
        }
    }

    @Override // com.tencent.mm.modelbase.x0
    public void onCompletion() {
        if (this.f432175p != null) {
            h();
        }
    }

    @Override // com.tencent.mm.modelbase.b1
    public void onStop() {
        for (uz4.c cVar : this.f432174o) {
            if (cVar != null) {
                cVar.c();
            }
        }
        com.tencent.mm.sdk.platformtools.SensorController sensorController = this.f432173n;
        if (sensorController != null) {
            sensorController.a();
        }
        com.tencent.mm.sdk.platformtools.s7 s7Var = this.f432170h;
        if (s7Var != null) {
            s7Var.b();
        }
    }
}
