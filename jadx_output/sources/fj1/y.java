package fj1;

/* loaded from: classes7.dex */
public final class y extends ej1.f {

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameLaunchParams f263143c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f263144d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f263145e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f263146f;

    /* renamed from: g, reason: collision with root package name */
    public final int f263147g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC f263148h;

    /* renamed from: i, reason: collision with root package name */
    public ej1.c f263149i;

    /* renamed from: j, reason: collision with root package name */
    public fj1.h f263150j;

    /* renamed from: k, reason: collision with root package name */
    public fj1.b0 f263151k;

    /* renamed from: l, reason: collision with root package name */
    public fj1.t f263152l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.u5 f263153m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f263154n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f263155o;

    /* renamed from: p, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f263156p;

    public y(com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameLaunchParams launchParams) {
        kotlin.jvm.internal.o.g(launchParams, "launchParams");
        this.f263143c = launchParams;
        java.lang.String str = "MicroMsg.WAMagicBrushFrameRuntime(" + launchParams.f84254i + ':' + hashCode() + ')';
        this.f263144d = str;
        this.f263147g = launchParams.f84244f;
        this.f263154n = jz5.h.b(new fj1.u(this));
        this.f263155o = jz5.h.b(new fj1.x(this));
        java.lang.String str2 = launchParams.f84242d;
        if (!(str2 == null || str2.length() == 0)) {
            java.lang.String username = launchParams.f84242d;
            kotlin.jvm.internal.o.f(username, "username");
            this.f263145e = username;
        }
        java.lang.String str3 = launchParams.f84243e;
        if (!(str3 == null || str3.length() == 0)) {
            java.lang.String appId = launchParams.f84243e;
            kotlin.jvm.internal.o.f(appId, "appId");
            this.f263146f = appId;
        }
        com.tencent.mars.xlog.Log.i(str, "<init>");
        this.f263156p = kotlinx.coroutines.z0.b();
    }

    public static final void a(fj1.y yVar, ej1.g to6) {
        yVar.getClass();
        kotlin.jvm.internal.o.g(to6, "to");
        if (yVar.f253278a == to6) {
            return;
        }
        ej1.g gVar = yVar.f253278a;
        gVar.getClass();
        ej1.g gVar2 = ej1.g.DESTROYED;
        if (!((gVar2 == gVar || ej1.g.CREATED == to6 || (to6.ordinal() < gVar.ordinal() && (ej1.g.PAUSED != gVar || ej1.g.RESUMED != to6))) ? false : true)) {
            throw new java.lang.IllegalStateException(yVar.f253278a + " can't transit to " + to6);
        }
        ej1.g from = yVar.f253278a;
        yVar.f253278a = to6;
        java.util.Iterator it = yVar.f253279b.iterator();
        kotlin.jvm.internal.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            ej1.d dVar = (ej1.d) it.next();
            ej1.g ev6 = yVar.f253278a;
            com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.g0 g0Var = (com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.g0) dVar;
            g0Var.getClass();
            kotlin.jvm.internal.o.g(ev6, "ev");
            if (ev6 == ej1.g.INITIALIZED) {
                g0Var.f84284a.invoke();
                fj1.y yVar2 = g0Var.f84285b;
                yVar2.getClass();
                yVar2.f253279b.remove(g0Var);
            }
        }
        kotlin.jvm.internal.o.g(from, "from");
        com.tencent.mars.xlog.Log.i(yVar.f263144d, "handleLifecycleEventChanged " + from + " -> " + to6);
        if (gVar2 == to6) {
            fj1.t tVar = yVar.f263152l;
            if (tVar != null) {
                if (tVar == null) {
                    kotlin.jvm.internal.o.o("pkgReader");
                    throw null;
                }
                tVar.f263138b.close();
            }
            if (yVar.f263150j != null) {
                uh1.t tVar2 = uh1.s.f427900a;
                fj1.h d17 = yVar.d();
                uh1.z zVar = (uh1.z) tVar2.f427903a;
                zVar.getClass();
                uh1.w wVar = (uh1.w) zVar.f427946b.remove(uh1.a0.a(d17));
                if (wVar != null) {
                    wVar.release();
                }
            }
        }
        if (gVar2 == yVar.f253278a) {
            yVar.f253279b.clear();
        }
    }

    public void b() {
        com.tencent.mars.xlog.Log.i(this.f263144d, "finish " + android.util.Log.getStackTraceString(new java.lang.Throwable()));
        pm0.v.X(new fj1.v(this));
        kotlinx.coroutines.z0.e(this.f263156p, null, 1, null);
    }

    public java.lang.String c() {
        java.lang.String str = this.f263146f;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.o.o("appId");
        throw null;
    }

    public final fj1.h d() {
        fj1.h hVar = this.f263150j;
        if (hVar != null) {
            return hVar;
        }
        kotlin.jvm.internal.o.o("jsapiInvokeComponent");
        throw null;
    }

    public final com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC e() {
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC appBrandSysConfigWC = this.f263148h;
        if (appBrandSysConfigWC != null) {
            return appBrandSysConfigWC;
        }
        kotlin.jvm.internal.o.o("sysConfig");
        throw null;
    }
}
