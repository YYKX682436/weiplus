package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public class i5 implements com.tencent.mm.pluginsdk.ui.tools.e5 {
    public i5(com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI.AnonymousClass1 anonymousClass1) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.e5
    public void a(com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI miniQBReaderUI, com.tencent.mm.plugin.appbrand.service.k5 k5Var, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection openMaterialCollection) {
        k5Var.getClass();
        kotlin.jvm.internal.o.g(openMaterialCollection, "openMaterialCollection");
        java.util.List appBrandOpenMaterialDetailModels = openMaterialCollection.f86252g;
        kotlin.jvm.internal.o.f(appBrandOpenMaterialDetailModels, "appBrandOpenMaterialDetailModels");
        miniQBReaderUI.f191407y = !appBrandOpenMaterialDetailModels.isEmpty();
    }
}
