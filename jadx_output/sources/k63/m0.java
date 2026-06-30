package k63;

/* loaded from: classes14.dex */
public final class m0 implements et0.r {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.HandlerThread f304553d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f304554e;

    /* renamed from: f, reason: collision with root package name */
    public rs0.h f304555f;

    /* renamed from: g, reason: collision with root package name */
    public final k63.n0 f304556g;

    /* renamed from: h, reason: collision with root package name */
    public final ft0.h f304557h;

    /* renamed from: i, reason: collision with root package name */
    public int f304558i;

    /* renamed from: m, reason: collision with root package name */
    public int f304559m;

    /* renamed from: n, reason: collision with root package name */
    public android.opengl.EGLSurface f304560n;

    /* renamed from: o, reason: collision with root package name */
    public k63.w f304561o;

    /* renamed from: p, reason: collision with root package name */
    public long f304562p;

    /* renamed from: q, reason: collision with root package name */
    public long f304563q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.Surface f304564r;

    /* renamed from: s, reason: collision with root package name */
    public yz5.a f304565s;

    /* renamed from: t, reason: collision with root package name */
    public final k63.h0 f304566t;

    public m0() {
        int i17 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a("GameLiveRenderThread", 10);
        this.f304553d = a17;
        this.f304556g = new k63.n0();
        this.f304557h = new ft0.h(this);
        a17.start();
        this.f304554e = new com.tencent.mm.sdk.platformtools.n3(a17.getLooper());
        l(new k63.d0(this));
        com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveRenderManager", "resume");
        l(new k63.k0(this));
        this.f304566t = new k63.h0(this);
    }

    public static final void a(k63.m0 m0Var) {
        if (m0Var.f304560n != null) {
            android.opengl.EGLDisplay eGLDisplay = m0Var.c().f399292a;
            android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
            android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, android.opengl.EGL14.EGL_NO_CONTEXT);
            android.opengl.EGL14.eglDestroySurface(m0Var.c().f399292a, m0Var.f304560n);
        }
    }

    public static final void b(k63.m0 m0Var, int i17) {
        m0Var.getClass();
        int myTid = android.os.Process.myTid();
        if (myTid > 0) {
            try {
                android.os.Process.setThreadPriority(myTid, i17);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GameLiveRenderManager", e17, "setThreadPriority priority=%d tid=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(myTid));
            }
        }
    }

    public final rs0.h c() {
        rs0.h hVar = this.f304555f;
        if (hVar != null) {
            return hVar;
        }
        kotlin.jvm.internal.o.o("eglEnvironment");
        throw null;
    }

    @Override // et0.r
    public void l(final yz5.a r17) {
        kotlin.jvm.internal.o.g(r17, "r");
        this.f304554e.post(new java.lang.Runnable(r17) { // from class: k63.l0

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f304552d;

            {
                kotlin.jvm.internal.o.g(r17, "function");
                this.f304552d = r17;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f304552d.invoke();
            }
        });
    }

    @Override // et0.r
    public void requestRender() {
        l(new k63.j0(this));
    }
}
