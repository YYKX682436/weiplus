package zh1;

/* loaded from: classes8.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zh1.n f472858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.q f472859e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f472860f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f472861g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f472862h;

    public b(zh1.n nVar, yz5.q qVar, java.lang.String str, int i17, java.lang.String str2) {
        this.f472858d = nVar;
        this.f472859e = qVar;
        this.f472860f = str;
        this.f472861g = i17;
        this.f472862h = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zh1.n nVar = this.f472858d;
        ei1.b bVar = nVar.f472917i;
        if (bVar != null) {
            ((fi1.d) bVar).hide();
        }
        com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel appBrandOpenMaterialDetailModel = (com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel) this.f472859e.invoke(this.f472860f, java.lang.Integer.valueOf(this.f472861g), this.f472862h);
        if (appBrandOpenMaterialDetailModel == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "launch#buildHybridBottomSheet, openMaterialModel is null");
        } else {
            ((di1.f) nVar.f472916h).f(appBrandOpenMaterialDetailModel);
        }
        java.lang.String str = this.f472860f;
        int i17 = this.f472861g;
        java.lang.String str2 = this.f472862h;
        nVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "tryLaunchAppBrand, appId: " + str + ", versionType: " + i17 + ", enterPath: " + str2);
        com.tencent.mm.plugin.appbrand.service.h6 h6Var = (com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class);
        if (h6Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "tryLaunchAppBrand, appBrandLauncher is null");
        } else {
            nVar.f472915g.a(new zh1.m(h6Var, nVar, str, i17, str2));
        }
    }
}
