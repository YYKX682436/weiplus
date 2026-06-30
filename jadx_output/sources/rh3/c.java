package rh3;

/* loaded from: classes15.dex */
public abstract class c implements rh3.o {

    /* renamed from: e, reason: collision with root package name */
    public rh3.k f395664e;

    /* renamed from: f, reason: collision with root package name */
    public rh3.h f395665f;

    /* renamed from: g, reason: collision with root package name */
    public rh3.e f395666g;

    /* renamed from: h, reason: collision with root package name */
    public rh3.d f395667h;

    /* renamed from: i, reason: collision with root package name */
    public rh3.l f395668i;

    /* renamed from: m, reason: collision with root package name */
    public rh3.n f395669m;

    /* renamed from: n, reason: collision with root package name */
    public rh3.g f395670n;

    /* renamed from: o, reason: collision with root package name */
    public rh3.m f395671o;

    /* renamed from: p, reason: collision with root package name */
    public rh3.i f395672p;

    /* renamed from: q, reason: collision with root package name */
    public rh3.j f395673q;

    /* renamed from: r, reason: collision with root package name */
    public rh3.f f395674r;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f395676t;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f395675s = "MMPlayer." + hashCode();

    /* renamed from: d, reason: collision with root package name */
    public rh3.p f395663d = new rh3.q();

    /* renamed from: u, reason: collision with root package name */
    public int f395677u = 1;

    private final java.lang.String r() {
        rh3.p pVar = this.f395663d;
        if (pVar != null) {
            return ((rh3.q) pVar).f(this.f395675s);
        }
        kotlin.jvm.internal.o.o("onePlayContext");
        throw null;
    }

    public final void A(int i17, int i18) {
        com.tencent.mars.xlog.Log.i(r(), "notifyOnVideoSizeChanged width:" + i17 + " height:" + i18);
        rh3.n nVar = this.f395669m;
        if (nVar != null) {
            nVar.m(this, i17, i18);
        }
    }

    public final void a(int i17, java.lang.String invokeSource) {
        kotlin.jvm.internal.o.g(invokeSource, "invokeSource");
        if (i17 == 4 && this.f395677u != 3) {
            com.tencent.mars.xlog.Log.w(r(), "changePlayerState from:" + this.f395677u + " to:" + i17 + " return for error state.");
            return;
        }
        com.tencent.mars.xlog.Log.i(r(), invokeSource + " changeState from " + this.f395677u + " to " + i17);
        int i18 = this.f395677u;
        this.f395677u = i17;
        rh3.p pVar = this.f395663d;
        if (pVar == null) {
            kotlin.jvm.internal.o.o("onePlayContext");
            throw null;
        }
        ((rh3.q) pVar).f395680c = i17;
        if (i18 != i17) {
            com.tencent.mars.xlog.Log.i(r(), "notifyOnStateChange mp:" + this + " preState:" + i18 + " curState:" + i17);
            rh3.m mVar = this.f395671o;
            if (mVar != null) {
                mVar.h(this, i18, i17);
            }
        }
    }

    @Override // rh3.o
    public void d(rh3.p onePlayContext) {
        kotlin.jvm.internal.o.g(onePlayContext, "onePlayContext");
        this.f395663d = onePlayContext;
    }

    @Override // rh3.o
    public void e(rh3.f listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        com.tencent.mars.xlog.Log.i(r(), "setOnDownloaderListener listener:" + listener);
        this.f395674r = listener;
    }

    @Override // rh3.o
    public void f(rh3.e listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        com.tencent.mars.xlog.Log.i(r(), "setOnCompletionListener listener:" + listener);
        this.f395666g = listener;
    }

    @Override // rh3.o
    public void g(rh3.d listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        com.tencent.mars.xlog.Log.i(r(), "setOnBufferingListener listener:" + listener);
        this.f395667h = listener;
    }

    @Override // rh3.o
    public int getState() {
        return this.f395677u;
    }

    @Override // rh3.o
    public java.lang.String getTag() {
        return r();
    }

    @Override // rh3.o
    public void h(rh3.m listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        com.tencent.mars.xlog.Log.i(r(), "setOnStateChangeListener listener:" + listener);
        this.f395671o = listener;
    }

    @Override // rh3.o
    public void i(rh3.h listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        com.tencent.mars.xlog.Log.i(r(), "setOnFirstFrameRenderStartListener listener:" + listener);
        this.f395665f = listener;
    }

    @Override // rh3.o
    public void j(rh3.k listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        com.tencent.mars.xlog.Log.i(r(), "setOnPreparedListener listener:" + listener);
        this.f395664e = listener;
    }

    @Override // rh3.o
    public void k(rh3.n listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        com.tencent.mars.xlog.Log.i(r(), "setOnVideoSizeChangedListener listener:" + listener);
        this.f395669m = listener;
    }

    @Override // rh3.o
    public void l(rh3.i listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        com.tencent.mars.xlog.Log.i(r(), "setOnInfoListener listener:" + listener);
        this.f395672p = listener;
    }

    @Override // rh3.o
    public void o(rh3.j listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        com.tencent.mars.xlog.Log.i(r(), "setOnPlayProgressMsListener listener:" + listener);
        this.f395673q = listener;
    }

    @Override // rh3.o
    public void p(rh3.l listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        com.tencent.mars.xlog.Log.i(r(), "setOnSeekCompleteListener listener:" + listener);
        this.f395668i = listener;
    }

    @Override // rh3.o
    public void pause() {
        com.tencent.mars.xlog.Log.i(r(), "pause");
        a(6, "pause");
    }

    @Override // rh3.o
    public void prepareAsync() {
        com.tencent.mars.xlog.Log.i(r(), "prepareAsync");
        a(3, "prepareAsync");
    }

    @Override // rh3.o
    public void q(rh3.g listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        com.tencent.mars.xlog.Log.i(r(), "setOnErrorListener listener:" + listener);
        this.f395670n = listener;
    }

    @Override // rh3.o
    public void release() {
        com.tencent.mars.xlog.Log.i(r(), "release");
        a(11, "release");
    }

    @Override // rh3.o
    public void reset() {
        com.tencent.mars.xlog.Log.i(r(), "reset");
        a(1, "reset");
    }

    public final void s() {
        com.tencent.mars.xlog.Log.i(r(), "notifyOnBufferingEnd");
        rh3.d dVar = this.f395667h;
        if (dVar != null) {
            dVar.p(this);
        }
    }

    @Override // rh3.o
    public void seekTo(long j17) {
        com.tencent.mars.xlog.Log.i(r(), "seekTo msec:" + j17);
    }

    @Override // rh3.o
    public void setSurface(android.view.Surface surface) {
        com.tencent.mars.xlog.Log.i(r(), "setSurface surface:" + surface);
    }

    @Override // rh3.o
    public void start() {
        com.tencent.mm.sdk.platformtools.b4 b4Var;
        com.tencent.mars.xlog.Log.i(r(), "start");
        com.tencent.mars.xlog.Log.i(r(), "startProgressTimer");
        boolean z17 = false;
        if (this.f395676t == null) {
            com.tencent.mm.sdk.platformtools.b4 b4Var2 = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new rh3.a(this), true);
            this.f395676t = b4Var2;
            b4Var2.setLogging(false);
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var3 = this.f395676t;
        if (b4Var3 != null && b4Var3.e()) {
            z17 = true;
        }
        if (z17 && (b4Var = this.f395676t) != null) {
            b4Var.c(0L, 20L);
        }
        a(5, "start");
    }

    @Override // rh3.o
    public void stop() {
        com.tencent.mars.xlog.Log.i(r(), "stop");
        com.tencent.mars.xlog.Log.i(r(), "stopProgressTimer :" + this.f395676t);
        sh3.a aVar = (sh3.a) this;
        pm0.v.X(new rh3.b(this, aVar.getCurrentPositionMs(), aVar.getDurationMs()));
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f395676t;
        if (b4Var != null) {
            b4Var.d();
        }
        this.f395676t = null;
        a(8, "stop");
    }

    public final void t() {
        com.tencent.mars.xlog.Log.i(r(), "notifyOnBufferingStart");
        rh3.d dVar = this.f395667h;
        if (dVar != null) {
            dVar.q(this);
        }
    }

    public final void u() {
        com.tencent.mars.xlog.Log.i(r(), "notifyOnCompletion");
        a(7, "notifyOnCompletion");
        rh3.e eVar = this.f395666g;
        if (eVar != null) {
            eVar.c(this);
        }
    }

    public final void v(int i17, int i18) {
        com.tencent.mars.xlog.Log.i(r(), "notifyOnError errorType:" + i17 + " errorCode:" + i18);
        a(10, "notifyOnError");
        rh3.g gVar = this.f395670n;
        kotlin.jvm.internal.o.d(gVar);
        gVar.r(this, i17, i18);
    }

    public final void w() {
        com.tencent.mars.xlog.Log.i(r(), "notifyOnFirstFrameRenderStartListener");
        rh3.h hVar = this.f395665f;
        if (hVar != null) {
            hVar.i(this);
        }
    }

    public final void x(rh3.o mp6, int i17, long j17, long j18, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(mp6, "mp");
        com.tencent.mars.xlog.Log.i(r(), "notifyOnInfo mp:" + mp6 + " what:" + i17 + " arg1:" + j17 + " arg2:" + j18 + " extraObject:" + obj);
        rh3.i iVar = this.f395672p;
        if (iVar != null) {
            iVar.j(mp6, i17, j17, j18, obj);
        }
    }

    public final void y(rh3.s mediaInfo) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        com.tencent.mars.xlog.Log.i(r(), "notifyOnPrepared");
        a(4, "notifyOnPrepared");
        rh3.k kVar = this.f395664e;
        if (kVar != null) {
            kVar.b(this, mediaInfo);
        }
    }

    public final void z() {
        com.tencent.mars.xlog.Log.i(r(), "notifyOnSeekComplete");
        rh3.l lVar = this.f395668i;
        if (lVar != null) {
            lVar.d(this);
        }
    }
}
