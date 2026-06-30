package wd4;

/* loaded from: classes4.dex */
public final class o1 implements wd4.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fc4.j0 f444990a;

    public o1(fc4.j0 j0Var) {
        this.f444990a = j0Var;
    }

    @Override // wd4.c
    public java.lang.Boolean a(com.tencent.mm.plugin.appbrand.service.k5 openMaterialService, wd4.h params) {
        boolean j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isGrantedOrNull", "com.tencent.mm.plugin.sns.ui.sheet.SnsFlexibleVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2$3");
        kotlin.jvm.internal.o.g(openMaterialService, "openMaterialService");
        kotlin.jvm.internal.o.g(params, "params");
        fc4.j0 j0Var = this.f444990a;
        j0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasDownload", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
        xc4.p pVar = j0Var.f261174g;
        if (pVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasDownload", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
            j17 = false;
        } else {
            j17 = com.tencent.mm.vfs.w6.j(com.tencent.mm.plugin.sns.model.y6.o(pVar.W0(), pVar.R0()));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasDownload", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
        }
        java.lang.Boolean bool = j17 ? java.lang.Boolean.TRUE : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isGrantedOrNull", "com.tencent.mm.plugin.sns.ui.sheet.SnsFlexibleVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2$3");
        return bool;
    }

    @Override // wd4.c
    public java.lang.Object b(com.tencent.mm.plugin.appbrand.service.k5 k5Var, wd4.h hVar, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.SnsFlexibleVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2$3");
        java.lang.String materialPath = hVar.b().a().f86271f;
        kotlin.jvm.internal.o.f(materialPath, "materialPath");
        java.lang.Object R6 = this.f444990a.R6(materialPath, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.SnsFlexibleVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2$3");
        return R6;
    }

    @Override // wd4.e
    public java.lang.String getName() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ui.sheet.SnsFlexibleVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ui.sheet.SnsFlexibleVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2$3");
        return "SnsOnlineVideoActivity$Open";
    }
}
