package uf;

/* loaded from: classes7.dex */
public final class c1 {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f426981m = {kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(uf.c1.class, "currentSelectedDevice", "getCurrentSelectedDevice()Lcom/tencent/mm/plugin/appbrand/dlna/device/MRDevice;", 0))};

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f426982a;

    /* renamed from: b, reason: collision with root package name */
    public final b06.d f426983b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f426984c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f426985d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.a f426986e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f426987f;

    /* renamed from: g, reason: collision with root package name */
    public final a66.c f426988g;

    /* renamed from: h, reason: collision with root package name */
    public final uf.v0 f426989h;

    /* renamed from: i, reason: collision with root package name */
    public final uf.q0 f426990i;

    /* renamed from: j, reason: collision with root package name */
    public r56.e f426991j;

    /* renamed from: k, reason: collision with root package name */
    public final ku5.f f426992k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f426993l;

    public c1(java.lang.String category, int i17, kotlin.jvm.internal.i iVar) {
        category = (i17 & 1) != 0 ? "" : category;
        kotlin.jvm.internal.o.g(category, "category");
        this.f426982a = category;
        this.f426983b = new uf.a1(new x91.h(null), this);
        this.f426984c = new java.util.ArrayList();
        this.f426985d = new java.util.ArrayList();
        this.f426988g = new a66.c();
        this.f426989h = new uf.v0(this);
        this.f426990i = new uf.q0(this);
        this.f426992k = ((ku5.t0) ku5.t0.f312615d).p("MicroMsg.MediaCastDeviceManager");
        this.f426993l = jz5.h.b(uf.s0.f427099d);
    }

    public final void a() {
        try {
            this.f426988g.d();
            b();
            this.f426985d.clear();
            this.f426984c.clear();
            if (kotlin.jvm.internal.o.b(x56.m.f452133f, this.f426991j)) {
                x56.m.f452133f = null;
                this.f426991j = null;
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.MediaCastDeviceManager", "clear, clearRxIOScheduler fail: scheduler instance is changed");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MediaCastDeviceManager", "clear, Error happen while cleaning up " + e17.getMessage());
        }
    }

    public final void b() {
        x91.b b17 = x91.b.b();
        b17.f452630a = true;
        for (x91.h hVar : ((java.util.HashMap) b17.f452631b).values()) {
            hVar.h();
            hVar.i();
            hVar.f452654h = null;
        }
        b17.e(this.f426990i);
        b17.e(this.f426989h);
        b17.a();
        try {
            int i17 = y91.i0.f460281h;
            y91.h0.f460277a.a();
        } catch (ba1.a e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCastDeviceManager", e17, "deinitDlna, RouterException = " + e17.getMessage(), new java.lang.Object[0]);
        }
        y91.n.f460302a.a();
    }

    public final x91.h c() {
        return (x91.h) ((b06.b) this.f426983b).b(this, f426981m[0]);
    }

    public final com.tencent.mm.sdk.platformtools.o4 d() {
        return (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) this.f426993l).getValue();
    }

    public final void e() {
        java.lang.String a17 = nf.s.a();
        java.lang.String b17 = nf.s.b();
        boolean z17 = com.tencent.mm.sdk.platformtools.a2.b(a17) && com.tencent.mm.sdk.platformtools.a2.b(b17);
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastDeviceManager", "search, selfIp = [%s], wifiIp = [%s], ipv6 = [%b]", a17, b17, java.lang.Boolean.valueOf(z17));
        this.f426988g.a(p56.l.b(new s56.k(p56.l.b(new s56.q(0L, 1000L, java.util.concurrent.TimeUnit.MILLISECONDS, rx.schedulers.Schedulers.computation())).f352094d, new s56.g0(10))).c(ca1.a.a()).f(new uf.y0(z17)));
    }

    public final boolean f() {
        boolean z17;
        if (x56.m.f452133f == null) {
            uf.b1 b1Var = new uf.b1(this);
            this.f426991j = b1Var;
            x56.m.f452133f = b1Var;
        }
        try {
            uf.r0 r0Var = new uf.r0();
            v91.b.f434151b = "MicroMsg.MediaCazt.";
            v91.b.f434150a = r0Var;
            int i17 = y91.i0.f460281h;
            y91.h0.f460277a.b();
            y91.n.f460302a.b();
            z17 = false;
        } catch (ba1.a e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCastDeviceManager", e17, "initDlna, RouterException = " + e17.getMessage(), new java.lang.Object[0]);
            z17 = true;
        }
        return !z17;
    }
}
