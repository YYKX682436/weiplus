package dr4;

/* loaded from: classes14.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public int f242598a;

    /* renamed from: b, reason: collision with root package name */
    public int f242599b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.p f242600c;

    /* renamed from: d, reason: collision with root package name */
    public rs0.h f242601d;

    /* renamed from: e, reason: collision with root package name */
    public dr4.q1 f242602e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.SurfaceTexture f242603f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.Surface f242604g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f242605h;

    /* renamed from: i, reason: collision with root package name */
    public is0.c f242606i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f242607j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f242608k;

    /* renamed from: l, reason: collision with root package name */
    public yz5.l f242609l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f242610m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f242611n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f242612o;

    /* renamed from: p, reason: collision with root package name */
    public yz5.a f242613p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f242614q;

    /* renamed from: r, reason: collision with root package name */
    public int f242615r;

    public c0(int i17, int i18, yz5.p queueScope) {
        kotlin.jvm.internal.o.g(queueScope, "queueScope");
        this.f242598a = i17;
        this.f242599b = i18;
        this.f242600c = queueScope;
        this.f242610m = new java.util.ArrayList();
        this.f242611n = new java.util.ArrayList();
        this.f242614q = vq4.b0.f439270a.a();
        this.f242605h = false;
    }

    public static final void a(dr4.c0 c0Var) {
        if (!c0Var.f242612o) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PboSurfaceRender", "onPreviewTextureFrameAvailable, looper:" + android.os.Looper.myLooper());
            c0Var.f242612o = true;
        }
        c0Var.b(new dr4.u(c0Var));
    }

    public static void c(dr4.c0 c0Var, dr4.q glSurface, yz5.l lVar, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            lVar = null;
        }
        c0Var.getClass();
        kotlin.jvm.internal.o.g(glSurface, "glSurface");
        c0Var.b(new dr4.v(c0Var, glSurface, lVar));
    }

    public final void b(final yz5.a callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f242600c.invoke("CAMERA", new java.lang.Runnable(callback) { // from class: dr4.w

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f242755d;

            {
                kotlin.jvm.internal.o.g(callback, "function");
                this.f242755d = callback;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f242755d.invoke();
            }
        });
    }

    public final void d(android.util.Size cameraSize) {
        kotlin.jvm.internal.o.g(cameraSize, "cameraSize");
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.PboSurfaceRender", "updatePboAndWindowsSize is " + cameraSize.getWidth() + " and " + cameraSize.getHeight(), new java.lang.Object[0]);
        dr4.q1 q1Var = this.f242602e;
        if (q1Var != null) {
            q1Var.w(cameraSize.getWidth(), cameraSize.getHeight());
        }
        cameraSize.getWidth();
        cameraSize.getHeight();
    }
}
