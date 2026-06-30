package t03;

/* loaded from: classes11.dex */
public final class k0 implements um5.e, t03.a {
    public static final /* synthetic */ int B = 0;
    public yz5.p A;

    /* renamed from: d, reason: collision with root package name */
    public final io.flutter.view.TextureRegistry.SurfaceProducer f414462d;

    /* renamed from: e, reason: collision with root package name */
    public final t03.g f414463e;

    /* renamed from: f, reason: collision with root package name */
    public final s03.f f414464f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f414465g;

    /* renamed from: h, reason: collision with root package name */
    public final long f414466h;

    /* renamed from: i, reason: collision with root package name */
    public final um5.p f414467i;

    /* renamed from: m, reason: collision with root package name */
    public t03.r0 f414468m;

    /* renamed from: n, reason: collision with root package name */
    public t03.e f414469n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f414470o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.Surface f414471p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f414472q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.HashMap f414473r;

    /* renamed from: s, reason: collision with root package name */
    public yz5.a f414474s;

    /* renamed from: t, reason: collision with root package name */
    public nk4.s f414475t;

    /* renamed from: u, reason: collision with root package name */
    public f25.l0 f414476u;

    /* renamed from: v, reason: collision with root package name */
    public yz5.a f414477v;

    /* renamed from: w, reason: collision with root package name */
    public yz5.a f414478w;

    /* renamed from: x, reason: collision with root package name */
    public yz5.a f414479x;

    /* renamed from: y, reason: collision with root package name */
    public yz5.a f414480y;

    /* renamed from: z, reason: collision with root package name */
    public yz5.a f414481z;

    static {
        ((cf0.z) ((df0.s) i95.n0.c(df0.s.class))).getClass();
        com.tencent.tav.decoder.logger.Logger.setLogProxy(new p05.f2());
        com.tencent.tav.decoder.logger.Logger.setLevel(2);
        xm5.b.f455398a = new p05.g2();
    }

    public k0(io.flutter.view.TextureRegistry.SurfaceProducer surface, t03.g eventSinkProvider, s03.f fVar) {
        kotlin.jvm.internal.o.g(surface, "surface");
        kotlin.jvm.internal.o.g(eventSinkProvider, "eventSinkProvider");
        this.f414462d = surface;
        this.f414463e = eventSinkProvider;
        this.f414464f = fVar;
        java.lang.String str = "MicroMsg.FlutterTPEffectPlayer@" + hashCode();
        this.f414465g = str;
        long id6 = surface.id();
        this.f414466h = id6;
        this.f414467i = new um5.p();
        this.f414473r = new java.util.HashMap();
        com.tencent.mars.xlog.Log.i(str, "create FlutterTPEffectPlayer,textureId:" + id6);
    }

    @Override // um5.e
    public void a(android.graphics.SurfaceTexture surfaceTexture) {
        com.tencent.mars.xlog.Log.i(this.f414465g, "onSurfaceDestroy");
        this.f414471p = null;
        t03.r0 r0Var = this.f414468m;
        if (r0Var != null) {
            r0Var.stop();
        }
    }

    @Override // um5.e
    public void b(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.tencent.mars.xlog.Log.i(this.f414465g, "onSurfaceAvailable size:[" + i17 + ", " + i18 + ']');
        android.view.Surface surface = new android.view.Surface(surfaceTexture);
        this.f414471p = surface;
        t03.r0 r0Var = this.f414468m;
        if (r0Var != null) {
            r0Var.J(surface, this.f414472q);
        }
    }

    @Override // um5.e
    public void c(android.graphics.SurfaceTexture surfaceTexture) {
    }

    public final void d() {
        t03.r0 r0Var = this.f414468m;
        if (r0Var != null) {
            r0Var.R();
        }
        t03.r0 r0Var2 = this.f414468m;
        if (r0Var2 != null) {
            kk4.b.e(r0Var2, null, 1, null);
        }
        t03.r0 r0Var3 = this.f414468m;
        if (r0Var3 != null) {
            r0Var3.P();
        }
        t03.r0 r0Var4 = this.f414468m;
        if (r0Var4 != null) {
            r0Var4.recycle();
        }
        this.f414468m = null;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        t03.r0 r0Var5 = new t03.r0(context);
        this.f414468m = r0Var5;
        r0Var5.E(new t03.h(this));
        t03.r0 r0Var6 = this.f414468m;
        if (r0Var6 != null) {
            r0Var6.f308595t = new t03.i(this);
        }
        if (r0Var6 != null) {
            r0Var6.f308575J = new t03.j(this);
        }
        if (r0Var6 != null) {
            r0Var6.K = new t03.k(this);
        }
        if (r0Var6 != null) {
            r0Var6.f308596u = new t03.l(this);
        }
        if (r0Var6 != null) {
            r0Var6.f308597v = new t03.m(this);
        }
        t03.r0 r0Var7 = r0Var6 instanceof kk4.v ? r0Var6 : null;
        if (r0Var7 == null) {
            return;
        }
        r0Var7.f308588m = this.f414475t;
    }

    public final void e() {
        com.tencent.mars.xlog.Log.i(this.f414465g, "release");
        this.f414472q = false;
        t03.r0 r0Var = this.f414468m;
        if (r0Var != null) {
            r0Var.R();
        }
        t03.r0 r0Var2 = this.f414468m;
        if (r0Var2 != null) {
            kk4.b.e(r0Var2, null, 1, null);
        }
        t03.r0 r0Var3 = this.f414468m;
        if (r0Var3 != null) {
            r0Var3.stop();
        }
        t03.r0 r0Var4 = this.f414468m;
        if (r0Var4 != null) {
            r0Var4.recycle();
        }
        this.f414468m = null;
        this.f414462d.release();
        um5.p pVar = this.f414467i;
        pVar.g();
        pVar.b();
        t03.e eVar = this.f414469n;
        if (eVar != null) {
            pm0.v.X(new t03.b(eVar));
        }
    }

    public void f(boolean z17, boolean z18) {
        if (!z18) {
            if (z17) {
                t03.e eVar = this.f414469n;
                if (eVar != null) {
                    pm0.v.X(new t03.b(eVar));
                }
            } else {
                t03.e eVar2 = this.f414469n;
                if (eVar2 != null) {
                    pm0.v.X(new t03.d(eVar2));
                }
            }
        }
        this.f414470o = z17;
        t03.r0 r0Var = this.f414468m;
        if (r0Var != null) {
            r0Var.C(z17);
        }
    }
}
