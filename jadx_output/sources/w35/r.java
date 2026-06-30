package w35;

/* loaded from: classes8.dex */
public final class r implements zh1.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f442763a;

    public r(java.lang.ref.WeakReference openWayControllerMiniProgram) {
        kotlin.jvm.internal.o.g(openWayControllerMiniProgram, "openWayControllerMiniProgram");
        this.f442763a = openWayControllerMiniProgram;
    }

    @Override // zh1.a1
    public void a(boolean z17, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection openMaterialCollection) {
        kotlin.jvm.internal.o.g(openMaterialCollection, "openMaterialCollection");
        w35.t tVar = (w35.t) this.f442763a.get();
        if (tVar != null) {
            java.lang.String str = tVar.f442768e;
            if (!z17) {
                com.tencent.mars.xlog.Log.e(str, "onOpenMaterialsGot: failed, mimeType: " + tVar.f442725c + ", path: " + tVar.f442726d);
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List<com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel> appBrandOpenMaterialDetailModels = openMaterialCollection.f86252g;
            kotlin.jvm.internal.o.f(appBrandOpenMaterialDetailModels, "appBrandOpenMaterialDetailModels");
            if (!appBrandOpenMaterialDetailModels.isEmpty()) {
                for (com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel appBrandOpenMaterialDetailModel : appBrandOpenMaterialDetailModels) {
                    com.tencent.mm.pluginsdk.ui.otherway.w wVar = new com.tencent.mm.pluginsdk.ui.otherway.w();
                    wVar.f191015e = appBrandOpenMaterialDetailModel;
                    arrayList.add(wVar);
                }
            } else {
                java.util.List<com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel> appBrandOpenMaterialModels = openMaterialCollection.f86251f;
                kotlin.jvm.internal.o.f(appBrandOpenMaterialModels, "appBrandOpenMaterialModels");
                if (!appBrandOpenMaterialModels.isEmpty()) {
                    for (com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel appBrandOpenMaterialModel : appBrandOpenMaterialModels) {
                        com.tencent.mm.pluginsdk.ui.otherway.w wVar2 = new com.tencent.mm.pluginsdk.ui.otherway.w();
                        java.lang.String str2 = appBrandOpenMaterialModel.f86262d;
                        int i17 = appBrandOpenMaterialModel.f86263e;
                        java.lang.String str3 = appBrandOpenMaterialModel.f86264f;
                        java.lang.String str4 = appBrandOpenMaterialModel.f86265g;
                        java.lang.String str5 = appBrandOpenMaterialModel.f86266h;
                        kz5.p0 p0Var = kz5.p0.f313996d;
                        wVar2.f191015e = new com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel(str2, i17, str3, str4, str5, p0Var, 0.0f, "", false, "", p0Var);
                        arrayList.add(wVar2);
                    }
                }
            }
            com.tencent.mars.xlog.Log.i(str, "get openway count: " + arrayList.size());
            w35.a aVar = tVar.f442724b;
            if (aVar != null) {
                aVar.a(arrayList);
            }
        }
    }
}
