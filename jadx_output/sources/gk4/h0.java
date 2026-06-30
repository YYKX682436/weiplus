package gk4;

/* loaded from: classes10.dex */
public final class h0 implements gk4.b {
    public boolean B;
    public yz5.l D;
    public volatile boolean E;
    public volatile boolean F;
    public yz5.l G;

    /* renamed from: b, reason: collision with root package name */
    public gk4.a f272557b;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.SurfaceTexture f272559d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f272560e;

    /* renamed from: f, reason: collision with root package name */
    public android.os.HandlerThread f272561f;

    /* renamed from: g, reason: collision with root package name */
    public rs0.h f272562g;

    /* renamed from: h, reason: collision with root package name */
    public volatile int f272563h;

    /* renamed from: i, reason: collision with root package name */
    public volatile int f272564i;

    /* renamed from: j, reason: collision with root package name */
    public volatile int f272565j;

    /* renamed from: k, reason: collision with root package name */
    public volatile int f272566k;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.xeffect.effect.EffectManager f272568m;

    /* renamed from: n, reason: collision with root package name */
    public is0.c f272569n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.SurfaceTexture f272570o;

    /* renamed from: p, reason: collision with root package name */
    public os0.e f272571p;

    /* renamed from: q, reason: collision with root package name */
    public is0.c f272572q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f272573r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f272574s;

    /* renamed from: t, reason: collision with root package name */
    public int f272575t;

    /* renamed from: u, reason: collision with root package name */
    public int f272576u;

    /* renamed from: w, reason: collision with root package name */
    public uq5.m f272578w;

    /* renamed from: y, reason: collision with root package name */
    public dk4.a f272580y;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f272556a = "MicroMsg.TPPlayerEffector@" + hashCode();

    /* renamed from: c, reason: collision with root package name */
    public final jk4.b f272558c = new jk4.b();

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.xeffect.VLogDirector f272567l = new com.tencent.mm.xeffect.VLogDirector();

    /* renamed from: v, reason: collision with root package name */
    public final int f272577v = 1;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.ArrayList f272579x = new java.util.ArrayList();

    /* renamed from: z, reason: collision with root package name */
    public int f272581z = -1;
    public long A = -1;
    public float C = -1.0f;

    static {
        android.graphics.Color.parseColor("#4c4c4c");
        p05.l4.R.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(gk4.h0 r25, long r26) {
        /*
            Method dump skipped, instructions count: 1047
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gk4.h0.b(gk4.h0, long):void");
    }

    public void c(android.graphics.SurfaceTexture surface) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(surface, "surface");
        java.lang.String str = "attachSurface:" + surface.hashCode();
        java.lang.String str2 = this.f272556a;
        com.tencent.mars.xlog.Log.i(str2, str);
        rs0.h hVar = this.f272562g;
        if (hVar != null) {
            e(new gk4.v(this, surface, hVar));
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i(str2, "attach surface current not create GLEnvironment now");
            this.f272559d = surface;
        }
    }

    public void d(yz5.a aVar) {
        java.lang.String str = this.f272556a;
        com.tencent.mars.xlog.Log.i(str, "init without surfaceTexture");
        if (this.f272562g == null) {
            com.tencent.mars.xlog.Log.i(str, "createEGLThread");
            int i17 = pu5.i.f358473b;
            android.os.HandlerThread a17 = pu5.f.a("TPPlayerEffector", -4);
            a17.start();
            this.f272560e = new com.tencent.mm.sdk.platformtools.n3(a17.getLooper());
            this.f272561f = a17;
            e(new gk4.x(null, this));
            e(new gk4.d0(this, aVar));
        }
    }

    public void e(final yz5.a r17) {
        kotlin.jvm.internal.o.g(r17, "r");
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f272560e;
        if (n3Var != null) {
            n3Var.post(new java.lang.Runnable(r17) { // from class: gk4.g0

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ yz5.a f272553d;

                {
                    kotlin.jvm.internal.o.g(r17, "function");
                    this.f272553d = r17;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f272553d.invoke();
                }
            });
        }
    }

    public void f(int i17, int i18) {
        if (i17 != this.f272563h || i18 != this.f272564i) {
            this.f272574s = true;
        }
        this.f272563h = i17;
        this.f272564i = i18;
        com.tencent.mars.xlog.Log.i(this.f272556a, "updateSize:[" + i17 + ',' + i18 + "], outputSizeChanged:" + this.f272574s + ", surface:" + this.f272559d);
        if (this.f272574s) {
            if (this.f272563h > this.f272564i && this.f272563h > 1080) {
                this.f272575t = 1080;
                this.f272576u = (int) (1080 * ((this.f272564i * 1.0f) / this.f272563h));
            } else if (this.f272564i <= this.f272563h || this.f272564i <= 1920) {
                this.f272575t = this.f272563h;
                this.f272576u = this.f272564i;
            } else {
                this.f272576u = 1920;
                this.f272575t = (int) (1920 * ((this.f272563h * 1.0f) / this.f272564i));
            }
            com.tencent.mars.xlog.Log.i(this.f272556a, "calcOutputTexSize:[" + this.f272575t + ',' + this.f272576u + ']');
        }
    }
}
