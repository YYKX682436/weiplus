package uf;

/* loaded from: classes7.dex */
public final class o1 extends xi1.c implements uf.f, uf.j {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f427071u = {kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(uf.o1.class, "_castState", "get_castState()Lcom/tencent/luggage/xweb_ext/extendplugin/component/cast/CastState;", 0))};

    /* renamed from: d, reason: collision with root package name */
    public final int f427072d;

    /* renamed from: e, reason: collision with root package name */
    public final sf.f f427073e;

    /* renamed from: f, reason: collision with root package name */
    public final uf.d2 f427074f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime f427075g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f427076h;

    /* renamed from: i, reason: collision with root package name */
    public final b06.d f427077i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f427078m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f427079n;

    /* renamed from: o, reason: collision with root package name */
    public final uf.h f427080o;

    /* renamed from: p, reason: collision with root package name */
    public final uf.l f427081p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f427082q;

    /* renamed from: r, reason: collision with root package name */
    public final uf.l1 f427083r;

    /* renamed from: s, reason: collision with root package name */
    public final uf.n1 f427084s;

    /* renamed from: t, reason: collision with root package name */
    public final uf.f1 f427085t;

    public o1(int i17, sf.f invokeContext, uf.d2 mediaType, uf.g eventHandlerFactory, uf.k reportHandlerFactory) {
        kotlin.jvm.internal.o.g(invokeContext, "invokeContext");
        kotlin.jvm.internal.o.g(mediaType, "mediaType");
        kotlin.jvm.internal.o.g(eventHandlerFactory, "eventHandlerFactory");
        kotlin.jvm.internal.o.g(reportHandlerFactory, "reportHandlerFactory");
        this.f427072d = i17;
        this.f427073e = invokeContext;
        this.f427074f = mediaType;
        kotlin.jvm.internal.o.f(invokeContext.c().optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA), "optString(...)");
        com.tencent.mm.plugin.appbrand.jsapi.l m17 = invokeContext.m();
        com.tencent.mm.plugin.appbrand.y yVar = m17 instanceof com.tencent.mm.plugin.appbrand.y ? (com.tencent.mm.plugin.appbrand.y) m17 : null;
        this.f427075g = yVar != null ? yVar.t3() : null;
        this.f427076h = "";
        this.f427077i = new uf.j1(uf.b.f426971d, this);
        this.f427079n = jz5.h.b(new uf.h1(this));
        this.f427080o = new zf1.h(this, null);
        this.f427081p = reportHandlerFactory.a(this);
        this.f427083r = new uf.l1(this);
        this.f427084s = new uf.n1(this);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f427085t = new uf.f1(context, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastHandler", "<init>");
        com.tencent.mm.plugin.appbrand.jsapi.l m18 = invokeContext.m();
        com.tencent.mm.plugin.appbrand.jsapi.t tVar = m18 instanceof com.tencent.mm.plugin.appbrand.jsapi.t ? (com.tencent.mm.plugin.appbrand.jsapi.t) m18 : null;
        if (tVar != null) {
            tVar.U(new uf.d1(this));
            tVar.R(new uf.e1(this));
        }
    }

    @Override // uf.j
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastHandler", "onError");
        ((zf1.h) this.f427080o).a();
    }

    @Override // uf.j
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastHandler", "onEnd");
        ((zf1.h) this.f427080o).b();
    }

    @Override // uf.j
    public void c(int i17) {
        this.f427080o.getClass();
    }

    @Override // uf.j
    public void f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastHandler", "onPlay");
        ((zf1.h) this.f427080o).f();
    }

    @Override // uf.j
    public void g(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastHandler", "onCastStartResult, success: " + z17);
        ((zf1.h) this.f427080o).g(z17);
    }

    @Override // uf.j
    public void i() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastHandler", "onCastInterruptUnexpectedly");
        ((zf1.h) this.f427080o).i();
    }

    @Override // uf.j
    public void j(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastHandler", "onCastDeviceSelectResult, success: " + z17);
        ((zf1.h) this.f427080o).j(z17);
        if (z17) {
            s(uf.b.f426973f);
        }
    }

    @Override // uf.j
    public void l(int i17, int i18) {
        this.f427080o.getClass();
    }

    @Override // uf.j
    public void m() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastHandler", "onWaiting");
        ((zf1.h) this.f427080o).m();
    }

    @Override // xi1.c
    public void o() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastHandler", "onEnterFullscreen");
        this.f427078m = true;
    }

    @Override // uf.j
    public void onPause() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastHandler", "onPause");
        ((zf1.h) this.f427080o).onPause();
    }

    @Override // xi1.c
    public void p() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastHandler", "onExitFullscreen");
        this.f427078m = false;
    }

    public final uf.o0 q() {
        return (uf.o0) ((jz5.n) this.f427079n).getValue();
    }

    public final uf.b r() {
        return (uf.b) ((b06.b) this.f427077i).b(this, f427071u[0]);
    }

    public final void s(uf.b bVar) {
        ((b06.b) this.f427077i).a(this, f427071u[0], bVar);
    }
}
