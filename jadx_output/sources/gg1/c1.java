package gg1;

/* loaded from: classes7.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final sf.f f271535a;

    /* renamed from: b, reason: collision with root package name */
    public final dg.a f271536b;

    /* renamed from: c, reason: collision with root package name */
    public final fg1.u f271537c;

    /* renamed from: d, reason: collision with root package name */
    public int f271538d;

    /* renamed from: e, reason: collision with root package name */
    public final gg1.k1 f271539e;

    /* renamed from: f, reason: collision with root package name */
    public gg1.w f271540f;

    /* renamed from: g, reason: collision with root package name */
    public final gg1.g f271541g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f271542h;

    /* renamed from: i, reason: collision with root package name */
    public int f271543i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f271544j;

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f271545k;

    /* renamed from: l, reason: collision with root package name */
    public yz5.a f271546l;

    /* renamed from: m, reason: collision with root package name */
    public final gg1.b1 f271547m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f271548n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f271549o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f271550p;

    public c1(sf.f invokeContext, dg.a eventHandler, fg1.u videoCastHandler) {
        kotlin.jvm.internal.o.g(invokeContext, "invokeContext");
        kotlin.jvm.internal.o.g(eventHandler, "eventHandler");
        kotlin.jvm.internal.o.g(videoCastHandler, "videoCastHandler");
        this.f271535a = invokeContext;
        this.f271536b = eventHandler;
        this.f271537c = videoCastHandler;
        this.f271538d = -1;
        this.f271539e = new gg1.k1();
        this.f271541g = (gg1.g) i95.n0.c(gg1.g.class);
        this.f271545k = new com.tencent.mm.sdk.platformtools.b4(new gg1.l0(this), false);
        this.f271547m = new gg1.b1(this);
        this.f271548n = new com.tencent.mm.sdk.platformtools.b4(new gg1.m0(this), true);
        this.f271550p = new com.tencent.mm.sdk.platformtools.b4(new gg1.d0(this), true);
    }

    public static final void a(gg1.c1 c1Var, gg1.x xVar) {
        c1Var.getClass();
        synchronized (gg1.c1.class) {
            p56.l c17 = s56.f.f403207d.c(ca1.a.a());
            gg1.x0 x0Var = new gg1.x0(c1Var, xVar);
            r56.c cVar = r56.d.f392742a;
            p56.l.b(new s56.k(c17.f352094d, new s56.s(new u56.a(cVar, cVar, x0Var)))).d();
        }
    }

    public final void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCast.VideoCastController", "onDestroy");
        com.tencent.mm.sdk.platformtools.u3.h(new gg1.z(this));
        gg1.k1 k1Var = this.f271539e;
        k1Var.b().h();
        k1Var.b().i();
        k1Var.b().f452654h = null;
        this.f271548n.d();
        k1Var.a();
        f();
        this.f271545k.d();
    }

    public final void c(int i17, int i18) {
        this.f271538d = i18;
        this.f271544j = false;
        gg1.k1 k1Var = this.f271539e;
        x91.j jVar = k1Var.b().f452651e.f452663a;
        x91.j jVar2 = x91.j.Paused;
        dg.a aVar = this.f271536b;
        if (jVar == jVar2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoCast.VideoCastController", "play: continue");
            k1Var.b().c(new gg1.g0(this, i17, i18));
            ((fg1.g) aVar).c();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoCast.VideoCastController", "play: playNew");
            k1Var.b().e(new gg1.j0(this, i17, i18));
            ((fg1.g) aVar).c();
        }
    }

    public final void d(boolean z17, boolean z18) {
        android.net.NetworkInfo networkInfo;
        com.tencent.mm.sdk.platformtools.u3.h(new gg1.s0(this, z18, z17));
        if (!z18) {
            this.f271539e.a();
        }
        this.f271539e.f271593f = new gg1.u0(this);
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("connectivity");
        if (!((connectivityManager == null || (networkInfo = connectivityManager.getNetworkInfo(1)) == null) ? false : networkInfo.isConnected())) {
            ((ku5.t0) ku5.t0.f312615d).B(new gg1.v0(this));
            com.tencent.mars.xlog.Log.w("MicroMsg.VideoCast.VideoCastController", "searchDevice: wifi is not connected");
        }
        gg1.k1 k1Var = this.f271539e;
        k1Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCast.VideoCastDeviceManager", "prepare");
        if (k1Var.d()) {
            x91.b.b().c(k1Var.f271597j);
            k1Var.c();
            k1Var.f271594g.a(p56.l.b(new s56.o(10L, java.util.concurrent.TimeUnit.SECONDS, rx.schedulers.Schedulers.computation())).f(new gg1.g1(k1Var)));
        }
    }

    public final void e(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCast.VideoCastController", "setVolume: " + i17);
        x91.h b17 = this.f271539e.b();
        gg1.y0 y0Var = new gg1.y0(this);
        x91.l lVar = b17.f452650d;
        if (lVar != null) {
            b17.f452648b.g(new w91.l(b17.a(lVar), b17.f452650d.f452664a, i17), y0Var);
        }
    }

    public final void f() {
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f271550p;
        if (b4Var.e()) {
            return;
        }
        b4Var.d();
        this.f271549o = true;
    }
}
