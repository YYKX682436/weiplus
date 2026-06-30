package wd4;

/* loaded from: classes4.dex */
public final class q implements wd4.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f445003a;

    public q(java.lang.String str) {
        this.f445003a = str;
    }

    public boolean c(com.tencent.mm.plugin.appbrand.service.k5 openMaterialService, wd4.h params) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$conditionAfterLongTimesWork$1");
        kotlin.jvm.internal.o.g(openMaterialService, "openMaterialService");
        kotlin.jvm.internal.o.g(params, "params");
        com.tencent.mm.ui.widget.dialog.k0 provide = params.a().provide();
        java.lang.String str = this.f445003a;
        if (provide == null) {
            com.tencent.mars.xlog.Log.i(str, "tryEnable, bottomSheet is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$conditionAfterLongTimesWork$1");
            return false;
        }
        java.lang.String str2 = params.b().a().f86271f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurMaterialPathProvider", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$Params");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurMaterialPathProvider", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$Params");
        if (kotlin.jvm.internal.o.b(str2, params.f444915e.provide())) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$conditionAfterLongTimesWork$1");
            return true;
        }
        com.tencent.mars.xlog.Log.i(str, "tryEnable, materialPath changed");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$conditionAfterLongTimesWork$1");
        return false;
    }

    @Override // wd4.e
    public java.lang.String getName() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$conditionAfterLongTimesWork$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$conditionAfterLongTimesWork$1");
        return "OpenMaterials$Check";
    }
}
