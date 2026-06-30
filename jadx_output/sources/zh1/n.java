package zh1;

/* loaded from: classes8.dex */
public final class n implements zh1.v0 {

    /* renamed from: o, reason: collision with root package name */
    public static final zh1.a f472909o = new zh1.a(null);

    /* renamed from: p, reason: collision with root package name */
    public static bi1.g f472910p = null;

    /* renamed from: q, reason: collision with root package name */
    public static long f472911q = 2;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f472912d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.dialog.k0 f472913e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection f472914f;

    /* renamed from: g, reason: collision with root package name */
    public final zh1.c1 f472915g;

    /* renamed from: h, reason: collision with root package name */
    public final zh1.w0 f472916h;

    /* renamed from: i, reason: collision with root package name */
    public ei1.b f472917i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.OpenMaterialJsBridge f472918m;

    /* renamed from: n, reason: collision with root package name */
    public zh1.u0 f472919n;

    public n(android.content.Context context, com.tencent.mm.ui.widget.dialog.k0 k0Var, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection openMaterialCollection, zh1.c1 launchAppBrandExecutor, zh1.w0 openMaterialReporter) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(openMaterialCollection, "openMaterialCollection");
        kotlin.jvm.internal.o.g(launchAppBrandExecutor, "launchAppBrandExecutor");
        kotlin.jvm.internal.o.g(openMaterialReporter, "openMaterialReporter");
        this.f472912d = context;
        this.f472913e = k0Var;
        this.f472914f = openMaterialCollection;
        this.f472915g = launchAppBrandExecutor;
        this.f472916h = openMaterialReporter;
        if (context instanceof com.tencent.mm.ui.MMFragmentActivity) {
            ((com.tencent.mm.ui.MMFragmentActivity) context).keep(this);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "<init>, context is not lifecycle keeper");
        }
    }

    @Override // im5.a
    public void dead() {
        ei1.b bVar = this.f472917i;
        if (bVar != null) {
            ((fi1.d) bVar).dead();
        }
    }

    @Override // zh1.v0
    public void e(zh1.u0 u0Var) {
        this.f472919n = u0Var;
    }

    @Override // zh1.v0
    public void hide() {
        ei1.b bVar = this.f472917i;
        if (bVar != null) {
            ((fi1.d) bVar).hide();
        }
    }

    @Override // zh1.v0
    public void r() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "showDirectly");
        di1.f fVar = (di1.f) this.f472916h;
        com.tencent.mars.xlog.Log.i(fVar.f232641m, "onLaunchListPageDirectly");
        com.tencent.mm.autogen.mmdata.rpt.WeChat_use_weapp_openStruct c17 = fVar.c();
        c17.p(fVar.f232640l);
        c17.f62904k = fVar.f232629a;
        c17.f62898e = 4L;
        c17.f62899f = fVar.a();
        c17.f62900g = fVar.b();
        c17.f62901h = 0L;
        c17.k();
        fb0.k kVar = (fb0.k) i95.n0.c(fb0.k.class);
        ((gb0.n) kVar).wi(this.f472912d, new zh1.l(this));
    }

    @Override // zh1.v0
    public void show() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "show");
        ((di1.f) this.f472916h).e();
        fb0.k kVar = (fb0.k) i95.n0.c(fb0.k.class);
        ((gb0.n) kVar).wi(this.f472912d, new zh1.l(this));
    }
}
