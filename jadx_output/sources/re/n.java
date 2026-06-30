package re;

/* loaded from: classes7.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime f394278a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f394279b;

    /* renamed from: c, reason: collision with root package name */
    public int f394280c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f394281d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f394282e;

    /* renamed from: f, reason: collision with root package name */
    public final int f394283f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f394284g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f394285h;

    public n(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        this.f394278a = runtime;
        re.g gVar = new re.g(this);
        java.lang.String str = runtime.f74803n;
        kotlin.jvm.internal.o.f(str, "getAppId(...)");
        cf.m mVar = new cf.m(str);
        gVar.invoke(mVar);
        runtime.N.a(mVar);
        this.f394279b = runtime.f74803n;
        this.f394280c = 2;
        this.f394281d = true;
        this.f394282e = true;
        this.f394283f = 1;
        this.f394284g = jz5.h.b(new re.h(this));
        this.f394285h = jz5.h.b(new re.j(this));
    }

    public static final void a(re.n nVar, com.tencent.mm.plugin.appbrand.page.w2 w2Var) {
        ni1.f fVar;
        ni1.f fVar2;
        nVar.getClass();
        if (!(w2Var instanceof com.tencent.mm.plugin.appbrand.page.y1)) {
            com.tencent.mm.plugin.appbrand.page.v5 currentPageView = w2Var.getCurrentPageView();
            if (currentPageView == null || (fVar = (ni1.f) currentPageView.B1(ni1.f.class)) == null) {
                return;
            }
            fVar.V();
            return;
        }
        com.tencent.mm.plugin.appbrand.page.y1 y1Var = (com.tencent.mm.plugin.appbrand.page.y1) w2Var;
        y1Var.getClass();
        for (com.tencent.mm.plugin.appbrand.page.v5 v5Var : ((java.util.HashMap) y1Var.f87270x1).values()) {
            if (v5Var != null && (fVar2 = (ni1.f) v5Var.B1(ni1.f.class)) != null) {
                fVar2.V();
            }
        }
    }

    public static final void b(re.n nVar, com.tencent.mm.plugin.appbrand.page.wd wdVar) {
        com.tencent.mm.plugin.appbrand.page.w2 r17;
        se.a aVar;
        java.lang.String str = nVar.f394279b;
        try {
            com.tencent.mm.plugin.appbrand.page.i3 x07 = nVar.f394278a.x0();
            if (x07 == null || (r17 = x07.r(x07.getCurrentPage())) == null || (aVar = (se.a) r17.getCurrentPageView().B1(se.a.class)) == null) {
                return;
            }
            com.tencent.mars.xlog.Log.i("Luggage.WXA.AppBrandPageViewMemoryRecycleStrategy", "[wxa_reload]tryReloadNearestInvisiblePage appId[" + str + "] reload[" + aVar.m() + "] type[" + wdVar + ']');
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Luggage.WXA.AppBrandPageViewMemoryRecycleStrategy", th6, "[wxa_reload]tryReloadNearestInvisiblePage appId[" + str + "] type[" + wdVar + ']', new java.lang.Object[0]);
        }
    }

    public final void c(com.tencent.mm.plugin.appbrand.page.w2 w2Var) {
        ni1.f fVar;
        ni1.f fVar2;
        if (!(w2Var instanceof com.tencent.mm.plugin.appbrand.page.y1)) {
            com.tencent.mm.plugin.appbrand.page.v5 currentPageView = w2Var.getCurrentPageView();
            if (currentPageView == null || (fVar = (ni1.f) currentPageView.B1(ni1.f.class)) == null) {
                return;
            }
            fVar.P();
            return;
        }
        com.tencent.mm.plugin.appbrand.page.y1 y1Var = (com.tencent.mm.plugin.appbrand.page.y1) w2Var;
        y1Var.getClass();
        for (com.tencent.mm.plugin.appbrand.page.v5 v5Var : y1Var.f87270x1.values()) {
            if (v5Var != null && (fVar2 = (ni1.f) v5Var.B1(ni1.f.class)) != null) {
                fVar2.P();
            }
        }
    }

    public final void d(com.tencent.mm.plugin.appbrand.page.wd wdVar) {
        com.tencent.mm.plugin.appbrand.page.w2 r17;
        try {
            com.tencent.mm.plugin.appbrand.page.i3 x07 = this.f394278a.x0();
            if (x07 == null || (r17 = x07.r(x07.getCurrentPage())) == null) {
                return;
            }
            c(r17);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Luggage.WXA.AppBrandPageViewMemoryRecycleStrategy", th6, "[wxa_reload]tryRestoreRenderingOfNearestInvisiblePage appId[" + this.f394279b + "] type[" + wdVar + ']', new java.lang.Object[0]);
        }
    }
}
