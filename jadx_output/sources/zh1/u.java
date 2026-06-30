package zh1;

/* loaded from: classes8.dex */
public final class u {
    public u(kotlin.jvm.internal.i iVar) {
    }

    public final zh1.z0 a(long j17, bi1.g openMaterialScene, android.content.Context context, com.tencent.mm.ui.widget.dialog.k0 bottomSheet, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection openMaterialCollection, zh1.v0 v0Var, zh1.c1 c1Var) {
        zh1.z0 e1Var;
        kotlin.jvm.internal.o.g(openMaterialScene, "openMaterialScene");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        kotlin.jvm.internal.o.g(openMaterialCollection, "openMaterialCollection");
        boolean a17 = zh1.w.a(context);
        zh1.z0 z0Var = zh1.z0.f472959t1;
        if (!a17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.BottomSheetEnhanceLogic", "create, context is invalid, use dummy");
            return z0Var;
        }
        zh1.c1 c1Var2 = zh1.c1.f472869a;
        boolean z17 = true;
        java.util.List appBrandOpenMaterialDetailModels = openMaterialCollection.f86252g;
        if (bottomSheet.R1 == 0) {
            java.util.List appBrandOpenMaterialModels = openMaterialCollection.f86251f;
            kotlin.jvm.internal.o.f(appBrandOpenMaterialModels, "appBrandOpenMaterialModels");
            if (!(!appBrandOpenMaterialModels.isEmpty())) {
                kotlin.jvm.internal.o.f(appBrandOpenMaterialDetailModels, "appBrandOpenMaterialDetailModels");
                if (!(!appBrandOpenMaterialDetailModels.isEmpty())) {
                    z17 = false;
                }
            }
            if (!z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.BottomSheetEnhanceLogic", "create, can not enhance, use dummy");
                return z0Var;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.BottomSheetEnhanceLogic", "create, create GridBottomSheetEnhanceLogic");
            e1Var = new zh1.r0(j17, openMaterialScene, context, bottomSheet, openMaterialCollection, v0Var, c1Var == null ? c1Var2 : c1Var);
        } else {
            kotlin.jvm.internal.o.f(appBrandOpenMaterialDetailModels, "appBrandOpenMaterialDetailModels");
            if (!(true ^ appBrandOpenMaterialDetailModels.isEmpty())) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.BottomSheetEnhanceLogic", "create, can not enhance, use dummy");
                return z0Var;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.BottomSheetEnhanceLogic", "create, create ListBottomSheetEnhanceLogic");
            e1Var = new zh1.e1(j17, openMaterialScene, context, bottomSheet, openMaterialCollection, v0Var, c1Var == null ? c1Var2 : c1Var);
        }
        return e1Var;
    }
}
