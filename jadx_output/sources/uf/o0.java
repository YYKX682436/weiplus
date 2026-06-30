package uf;

/* loaded from: classes7.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final uf.f f427058a;

    /* renamed from: b, reason: collision with root package name */
    public final uf.j f427059b;

    /* renamed from: c, reason: collision with root package name */
    public final uf.l f427060c;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f427061d;

    /* renamed from: e, reason: collision with root package name */
    public final uf.c1 f427062e;

    /* renamed from: f, reason: collision with root package name */
    public uf.c2 f427063f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f427064g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f427065h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f427066i;

    /* renamed from: j, reason: collision with root package name */
    public final uf.q f427067j;

    /* renamed from: k, reason: collision with root package name */
    public uf.a f427068k;

    /* renamed from: l, reason: collision with root package name */
    public yz5.a f427069l;

    /* renamed from: m, reason: collision with root package name */
    public int f427070m;

    public o0(uf.f castContext, uf.j castListener, uf.l castReportHandler) {
        kotlin.jvm.internal.o.g(castContext, "castContext");
        kotlin.jvm.internal.o.g(castListener, "castListener");
        kotlin.jvm.internal.o.g(castReportHandler, "castReportHandler");
        this.f427058a = castContext;
        this.f427059b = castListener;
        this.f427060c = castReportHandler;
        this.f427061d = ((uf.o1) castContext).f427073e.getContext();
        this.f427062e = new uf.c1(null, 1, null);
        this.f427065h = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new uf.u(this), true);
        this.f427066i = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new uf.c0(this), true);
        this.f427067j = new uf.q(this);
    }

    public static final void a(uf.o0 o0Var, uf.m mVar) {
        o0Var.getClass();
        synchronized (uf.o0.class) {
            p56.l c17 = s56.f.f403207d.c(ca1.a.a());
            uf.k0 k0Var = new uf.k0(o0Var, mVar);
            r56.c cVar = r56.d.f392742a;
            p56.l.b(new s56.k(c17.f352094d, new s56.s(new u56.a(cVar, cVar, k0Var)))).d();
        }
    }

    public final void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastController", "onDestroy");
        ((ku5.t0) ku5.t0.f312615d).B(new uf.p(this));
        f();
        this.f427066i.d();
        this.f427065h.d();
        this.f427062e.a();
    }

    public final void c(int i17, uf.a aVar) {
        this.f427068k = aVar;
        uf.c1 c1Var = this.f427062e;
        if (c1Var.c().f452651e.f452663a == x91.j.Paused) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastController", "play: continue");
            c1Var.c().c(new uf.x(this, i17));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastController", "play: playNew");
            c1Var.c().e(new uf.a0(this, i17));
        }
        this.f427059b.m();
    }

    public final void d(boolean z17, boolean z18) {
        android.net.NetworkInfo networkInfo;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
        if (!((connectivityManager == null || (networkInfo = connectivityManager.getNetworkInfo(1)) == null) ? false : networkInfo.isConnected())) {
            ((ku5.t0) ku5.t0.f312615d).B(new uf.e0(context));
            com.tencent.mars.xlog.Log.w("MicroMsg.MediaCastController", "searchDevice: wifi is not connected");
        }
        if (!z18) {
            this.f427062e.a();
        }
        uf.c1 c1Var = this.f427062e;
        c1Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastDeviceManager", "prepareAndSearchDevice");
        if (c1Var.f()) {
            x91.b.b().c(c1Var.f426990i);
            c1Var.e();
            c1Var.f426988g.a(p56.l.b(new s56.o(10L, java.util.concurrent.TimeUnit.SECONDS, rx.schedulers.Schedulers.computation())).f(new uf.z0(c1Var)));
        }
        ((ku5.t0) ku5.t0.f312615d).B(new uf.i0(this, z18, z17));
    }

    public final void e(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastController", "setVolume: " + i17);
        x91.h c17 = this.f427062e.c();
        uf.l0 l0Var = new uf.l0();
        x91.l lVar = c17.f452650d;
        if (lVar != null) {
            c17.f452648b.g(new w91.l(c17.a(lVar), c17.f452650d.f452664a, i17), l0Var);
        }
    }

    public final void f() {
        uf.c1 c1Var = this.f427062e;
        c1Var.c().h();
        c1Var.c().i();
        c1Var.c().f452654h = null;
    }
}
