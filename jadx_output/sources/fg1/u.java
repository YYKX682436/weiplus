package fg1;

/* loaded from: classes7.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final sf.f f261895a;

    /* renamed from: b, reason: collision with root package name */
    public final fg1.x0 f261896b;

    /* renamed from: c, reason: collision with root package name */
    public final gg1.g f261897c;

    /* renamed from: d, reason: collision with root package name */
    public final b06.d f261898d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f261899e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f261900f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f261901g;

    /* renamed from: h, reason: collision with root package name */
    public final b06.d f261902h;

    /* renamed from: i, reason: collision with root package name */
    public final fg1.r f261903i;

    /* renamed from: j, reason: collision with root package name */
    public final fg1.t f261904j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f261905k;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f261894m = {kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(fg1.u.class, "isForeground", "isForeground()Z", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(fg1.u.class, "isCastMediaPresent", "isCastMediaPresent()Z", 0))};

    /* renamed from: l, reason: collision with root package name */
    public static final fg1.j f261893l = new fg1.j(null);

    public u(dg.a eventHandler, sf.f invokeContext) {
        com.tencent.mm.plugin.appbrand.page.v5 pageView;
        kotlin.jvm.internal.o.g(eventHandler, "eventHandler");
        kotlin.jvm.internal.o.g(invokeContext, "invokeContext");
        this.f261895a = invokeContext;
        com.tencent.mm.plugin.appbrand.jsapi.l m17 = invokeContext.m();
        kotlin.jvm.internal.o.f(m17, "getComponent(...)");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String str = null;
        this.f261896b = new fg1.x0(context, null);
        jz5.h.b(fg1.k.f261872d);
        gg1.g gVar = (gg1.g) i95.n0.c(gg1.g.class);
        this.f261897c = gVar;
        this.f261898d = new fg1.m(java.lang.Boolean.TRUE, this);
        com.tencent.mm.plugin.appbrand.AppBrandRuntime a17 = gg1.h.a(invokeContext);
        if (gVar != null) {
            java.lang.String str2 = a17.f74803n;
            kotlin.jvm.internal.o.f(str2, "getAppId(...)");
            com.tencent.mm.plugin.appbrand.report.j1 j1Var = (com.tencent.mm.plugin.appbrand.report.j1) gVar;
            j1Var.f87887f = str2;
            com.tencent.mm.plugin.appbrand.page.i3 x07 = a17.x0();
            if (x07 != null && (pageView = x07.getPageView()) != null) {
                str = pageView.X1();
            }
            j1Var.f87888g = str == null ? "" : str;
        }
        if (m17 instanceof com.tencent.mm.plugin.appbrand.jsapi.t) {
            com.tencent.mm.plugin.appbrand.jsapi.t tVar = (com.tencent.mm.plugin.appbrand.jsapi.t) m17;
            tVar.U(new fg1.h(this));
            tVar.R(new fg1.i(this));
        }
        this.f261899e = "";
        this.f261902h = new fg1.n(java.lang.Boolean.FALSE, this);
        this.f261903i = new fg1.r(this);
        this.f261904j = new fg1.t(this);
        this.f261905k = jz5.h.b(new fg1.p(this, eventHandler));
    }

    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime a() {
        sf.f fVar = this.f261895a;
        if (!(fVar instanceof com.tencent.mm.plugin.appbrand.extendplugin.b)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.appbrand.jsapi.l m17 = ((com.tencent.mm.plugin.appbrand.extendplugin.b) fVar).m();
        if (m17 == null) {
            return null;
        }
        if (m17 instanceof com.tencent.mm.plugin.appbrand.y) {
            return ((com.tencent.mm.plugin.appbrand.y) m17).t3();
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }

    public final gg1.c1 b() {
        return (gg1.c1) ((jz5.n) this.f261905k).getValue();
    }

    public final void c(boolean z17) {
        ((b06.b) this.f261902h).a(this, f261894m[1], java.lang.Boolean.valueOf(z17));
    }
}
