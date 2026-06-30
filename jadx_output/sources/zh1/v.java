package zh1;

/* loaded from: classes8.dex */
public abstract class v implements zh1.z0 {

    /* renamed from: n, reason: collision with root package name */
    public static final zh1.u f472945n = new zh1.u(null);

    /* renamed from: d, reason: collision with root package name */
    public final long f472946d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f472947e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.dialog.k0 f472948f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection f472949g;

    /* renamed from: h, reason: collision with root package name */
    public zh1.v0 f472950h;

    /* renamed from: i, reason: collision with root package name */
    public final zh1.c1 f472951i;

    /* renamed from: m, reason: collision with root package name */
    public final di1.f f472952m;

    public v(long j17, bi1.g openMaterialScene, android.content.Context context, com.tencent.mm.ui.widget.dialog.k0 bottomSheet, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection openMaterialCollection, zh1.v0 v0Var, zh1.c1 launchAppBrandExecutor) {
        kotlin.jvm.internal.o.g(openMaterialScene, "openMaterialScene");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        kotlin.jvm.internal.o.g(openMaterialCollection, "openMaterialCollection");
        kotlin.jvm.internal.o.g(launchAppBrandExecutor, "launchAppBrandExecutor");
        this.f472946d = j17;
        this.f472947e = context;
        this.f472948f = bottomSheet;
        this.f472949g = openMaterialCollection;
        this.f472950h = v0Var;
        this.f472951i = launchAppBrandExecutor;
        this.f472952m = di1.g.a(j17, openMaterialScene, openMaterialCollection);
        if (context instanceof com.tencent.mm.ui.MMFragmentActivity) {
            ((com.tencent.mm.ui.MMFragmentActivity) context).keep(this);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.BottomSheetEnhanceLogic", "<init>, context is not lifecycle keeper");
        }
    }

    @Override // im5.a
    public void dead() {
        zh1.v0 v0Var = this.f472950h;
        if (v0Var != null) {
            v0Var.hide();
        }
        zh1.v0 v0Var2 = this.f472950h;
        if (v0Var2 != null) {
            v0Var2.dead();
        }
    }
}
