package zh1;

/* loaded from: classes8.dex */
public final class d implements fi1.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.q f472870a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zh1.n f472871b;

    public d(yz5.q qVar, zh1.n nVar) {
        this.f472870a = qVar;
        this.f472871b = nVar;
    }

    public void a(java.lang.String appId, int i17, java.lang.String enterPath) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(enterPath, "enterPath");
        com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel appBrandOpenMaterialDetailModel = (com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel) this.f472870a.invoke(appId, java.lang.Integer.valueOf(i17), enterPath);
        if (appBrandOpenMaterialDetailModel == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "onWeAppExposure#buildHybridBottomSheet, openMaterialModel is null");
            return;
        }
        ((di1.f) this.f472871b.f472916h).g(appBrandOpenMaterialDetailModel.f86255d);
    }
}
