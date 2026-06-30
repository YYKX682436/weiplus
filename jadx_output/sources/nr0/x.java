package nr0;

/* loaded from: classes14.dex */
public abstract class x implements nr0.b0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f339115d;

    /* renamed from: e, reason: collision with root package name */
    public android.os.HandlerThread f339116e;

    /* renamed from: f, reason: collision with root package name */
    public android.os.Handler f339117f;

    /* renamed from: g, reason: collision with root package name */
    public is0.c f339118g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.SurfaceTexture f339119h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.Surface f339120i;

    /* renamed from: m, reason: collision with root package name */
    public final xr0.k f339121m;

    /* renamed from: n, reason: collision with root package name */
    public final zr0.p f339122n;

    /* renamed from: o, reason: collision with root package name */
    public rs0.h f339123o;

    /* renamed from: p, reason: collision with root package name */
    public kotlinx.coroutines.y0 f339124p;

    /* renamed from: q, reason: collision with root package name */
    public kotlin.coroutines.Continuation f339125q;

    /* renamed from: r, reason: collision with root package name */
    public final nr0.c0 f339126r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f339127s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f339128t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f339129u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f339130v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f339131w;

    /* renamed from: x, reason: collision with root package name */
    public kotlinx.coroutines.flow.j2 f339132x;

    /* renamed from: y, reason: collision with root package name */
    public int f339133y;

    /* renamed from: z, reason: collision with root package name */
    public final yz5.l f339134z;

    public x(int i17) {
        this.f339115d = i17;
        xr0.k kVar = new xr0.k(null, null, null, 0, false, 31, null);
        this.f339121m = kVar;
        this.f339122n = new zr0.p(i17, kVar);
        this.f339126r = new nr0.c0(nr0.m.f339093d);
        this.f339131w = true;
        this.f339133y = 3;
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.GLEnvBuilder", "setUpGLEnv hash:" + hashCode());
        int i18 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a("CameraKit-GLThread", 10);
        this.f339116e = a17;
        a17.start();
        android.os.Handler handler = new android.os.Handler(a17.getLooper());
        this.f339117f = handler;
        this.f339124p = kotlinx.coroutines.z0.a(t26.e.b(handler, null, 1, null));
        l(new nr0.r(this, null));
        this.f339134z = new nr0.e(this);
    }

    public java.lang.Object i(kotlin.coroutines.Continuation continuation) {
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.GLEnvBuilder", "jumpNextFrame");
        l(new nr0.l(this, nVar, null));
        java.lang.Object a17 = nVar.a();
        return a17 == pz5.a.f359186d ? a17 : jz5.f0.f302826a;
    }

    public java.lang.Object j(kotlin.coroutines.Continuation continuation) {
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("makeSureEnvSetup valid:");
        sb6.append(this.f339123o != null);
        sb6.append(" screenSize:");
        sb6.append(this.f339121m.f456175a);
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.GLEnvBuilder", sb6.toString());
        boolean z17 = this.f339123o != null;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!z17 || this.f339121m.f456175a.f456173a <= 0) {
            this.f339125q = nVar;
        } else {
            nVar.resumeWith(kotlin.Result.m521constructorimpl(f0Var));
        }
        java.lang.Object a17 = nVar.a();
        return a17 == pz5.a.f359186d ? a17 : f0Var;
    }

    public java.lang.Object k(kotlin.coroutines.Continuation continuation) {
        return m("camera-render", new nr0.n(this, null), continuation);
    }

    public final void l(yz5.p block) {
        kotlin.jvm.internal.o.g(block, "block");
        kotlinx.coroutines.y0 y0Var = this.f339124p;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, block, 3, null);
        }
    }

    public final java.lang.Object m(java.lang.String str, yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        android.os.Handler handler = this.f339117f;
        if (handler != null) {
            int i17 = t26.e.f415354a;
            return kotlinx.coroutines.l.g(new t26.a(handler, str, false), pVar, continuation);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.GLEnvBuilder", "renderHandler already release,name:" + str + " will not execute");
        return null;
    }

    public java.lang.Object n(kotlin.coroutines.Continuation continuation) {
        return m("camera-render", new nr0.o(this, null), continuation);
    }

    @Override // nr0.b0
    public void setCustomRender(nr0.c cVar) {
        l(new nr0.q(this, cVar, null));
    }
}
