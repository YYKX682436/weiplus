package wo4;

/* loaded from: classes10.dex */
public final class y implements ot3.g {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.vlog.model.m1 f448294a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.vlog.model.l1 f448295b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.sight.base.h f448296c;

    /* renamed from: d, reason: collision with root package name */
    public gs0.b f448297d;

    /* renamed from: e, reason: collision with root package name */
    public wo4.l f448298e;

    /* renamed from: f, reason: collision with root package name */
    public final es0.d f448299f;

    /* renamed from: g, reason: collision with root package name */
    public int f448300g;

    /* renamed from: h, reason: collision with root package name */
    public hs0.a f448301h;

    /* renamed from: i, reason: collision with root package name */
    public ds0.d0 f448302i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f448303j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f448304k;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f448305l;

    /* renamed from: m, reason: collision with root package name */
    public float f448306m;

    /* renamed from: n, reason: collision with root package name */
    public float f448307n;

    /* renamed from: o, reason: collision with root package name */
    public android.os.HandlerThread f448308o;

    /* renamed from: p, reason: collision with root package name */
    public android.os.HandlerThread f448309p;

    /* renamed from: q, reason: collision with root package name */
    public long f448310q;

    /* renamed from: r, reason: collision with root package name */
    public final ls0.b1 f448311r;

    /* renamed from: s, reason: collision with root package name */
    public yz5.r f448312s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f448313t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f448314u;

    public y(com.tencent.mm.plugin.vlog.model.m1 scriptModel, com.tencent.mm.plugin.vlog.model.l1 remuxModel) {
        kotlin.jvm.internal.o.g(scriptModel, "scriptModel");
        kotlin.jvm.internal.o.g(remuxModel, "remuxModel");
        this.f448294a = scriptModel;
        this.f448295b = remuxModel;
        this.f448296c = com.tencent.mm.plugin.sight.base.h.f162413b.a(false);
        es0.d dVar = new es0.d(false, 1, null);
        this.f448299f = dVar;
        this.f448306m = 1.0f;
        this.f448307n = 1.0f;
        dw3.c0 c0Var = dw3.c0.f244182a;
        java.lang.String videoPath = remuxModel.f175658c;
        kotlin.jvm.internal.o.g(videoPath, "videoPath");
        java.lang.String m17 = ai3.d.m(videoPath);
        kotlin.jvm.internal.o.f(m17, "getThumbName(...)");
        this.f448314u = m17;
        dVar.f256314d = remuxModel.f175661f;
        dVar.f256315e = remuxModel.f175663h;
        dVar.f256313c = remuxModel.f175660e;
        dVar.f256312b = remuxModel.f175659d;
        this.f448311r = new ls0.b1(0L, ((com.tencent.mm.plugin.vlog.model.p0) kz5.n0.i0(scriptModel.f175674b)).f175709b, remuxModel.f175661f, false, false, null, 48, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogRemuxer", "encodeConfig: " + dVar + ' ');
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogRemuxer", "remuxModel: " + remuxModel + ' ');
    }

    @Override // ot3.g
    public void a(yz5.r rVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogRemuxer", "start");
        this.f448312s = rVar;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f448310q = android.os.SystemClock.elapsedRealtime();
        android.os.HandlerThread handlerThread = this.f448309p;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        this.f448309p = pm0.v.m("VLogRemuxer_remuxVideo", false, new wo4.w(this));
        android.os.HandlerThread handlerThread2 = this.f448308o;
        if (handlerThread2 != null) {
            handlerThread2.quit();
        }
        this.f448308o = pm0.v.m("VLogRemuxer_remuxMusic", false, new wo4.x(this));
    }

    public final void b() {
        wo4.l lVar = this.f448298e;
        if (lVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogDecoder", "release");
            vo4.i iVar = lVar.f448275d;
            iVar.getClass();
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.VLogDirector", "VLogRelease into VLogDirector#release 1", new java.lang.Object[0]);
            vo4.t tVar = iVar.f438636g;
            if (tVar != null) {
                tVar.b(new vo4.d(iVar));
            }
            vo4.t tVar2 = iVar.f438636g;
            if (tVar2 != null) {
                vo4.p pVar = (vo4.p) tVar2;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[OpenGL] VLogRelease release egl environment, surface: ");
                sb6.append(pVar.f438690d);
                sb6.append(", eglEnv: ");
                rs0.h hVar = pVar.f438665e;
                sb6.append(hVar != null ? hVar.f399294c : null);
                com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.VLog.VLogRemuxSurface", sb6.toString(), new java.lang.Object[0]);
                pVar.b(new vo4.n(pVar));
            }
            vo4.k kVar = vo4.k.f438649a;
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogMaterialsInfoCache", "clearCache");
            vo4.k.f438650b.clear();
            zv3.g gVar = lVar.f448279h;
            if (gVar == null) {
                kotlin.jvm.internal.o.o("frameRetriever");
                throw null;
            }
            gVar.c();
        }
        gs0.b bVar = this.f448297d;
        if (bVar != null) {
            bVar.f();
        }
        android.os.HandlerThread handlerThread = this.f448309p;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        android.os.HandlerThread handlerThread2 = this.f448308o;
        if (handlerThread2 != null) {
            handlerThread2.quitSafely();
        }
    }

    public final void c() {
        if (this.f448304k && this.f448305l) {
            ls0.b1 b1Var = this.f448311r;
            com.tencent.mm.plugin.vlog.model.l1 l1Var = this.f448295b;
            int a17 = b1Var.a(null, l1Var.f175658c, l1Var.f175665j, l1Var.f175666k, false);
            boolean z17 = a17 >= 0;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mux finish, cost:");
            long j17 = this.f448310q;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(android.os.SystemClock.elapsedRealtime() - j17);
            sb6.append(",succ:");
            sb6.append(z17);
            sb6.append("  result:");
            sb6.append(a17);
            sb6.append(", path:");
            sb6.append(this.f448295b);
            sb6.append(".outputPath");
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogRemuxer", sb6.toString());
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogRemuxer", "release");
            b();
            this.f448311r.b();
            if (z17) {
                com.tencent.mm.plugin.sight.base.SightVideoJNI.optimizeMP4VFS(this.f448295b.f175658c);
                dw3.c0.f244182a.C(this.f448295b.f175658c, this.f448314u, -1);
            }
            yz5.r rVar = this.f448312s;
            if (rVar != null) {
                rVar.C(this.f448295b.f175658c, this.f448314u, java.lang.Boolean.valueOf(z17), -1);
            }
        }
    }
}
