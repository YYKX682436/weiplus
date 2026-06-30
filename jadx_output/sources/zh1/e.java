package zh1;

/* loaded from: classes8.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zh1.n f472875d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(zh1.n nVar) {
        super(3);
        this.f472875d = nVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.Object obj4;
        java.lang.String appId = (java.lang.String) obj;
        ((java.lang.Number) obj2).intValue();
        java.lang.String enterPath = (java.lang.String) obj3;
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(enterPath, "enterPath");
        java.util.List appBrandOpenMaterialDetailModels = this.f472875d.f472914f.f86252g;
        kotlin.jvm.internal.o.f(appBrandOpenMaterialDetailModels, "appBrandOpenMaterialDetailModels");
        java.util.Iterator it = appBrandOpenMaterialDetailModels.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj4 = null;
                break;
            }
            obj4 = it.next();
            com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel appBrandOpenMaterialDetailModel = (com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel) obj4;
            if (kotlin.jvm.internal.o.b(appId, appBrandOpenMaterialDetailModel.f86255d.f86262d) && kotlin.jvm.internal.o.b(enterPath, appBrandOpenMaterialDetailModel.f86255d.f86264f)) {
                break;
            }
        }
        return (com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel) obj4;
    }
}
