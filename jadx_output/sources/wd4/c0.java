package wd4;

/* loaded from: classes4.dex */
public final class c0 implements wd4.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.FlipView f444880a;

    public c0(com.tencent.mm.plugin.sns.ui.FlipView flipView) {
        this.f444880a = flipView;
    }

    @Override // wd4.c
    public java.lang.Boolean a(com.tencent.mm.plugin.appbrand.service.k5 openMaterialService, wd4.h params) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isGrantedOrNull", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3");
        kotlin.jvm.internal.o.g(openMaterialService, "openMaterialService");
        kotlin.jvm.internal.o.g(params, "params");
        if (params.b().b() != bi1.g.SNS_IMAGE) {
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isGrantedOrNull", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3");
            return bool;
        }
        java.util.List k17 = this.f444880a.k(params.b().a().f86271f);
        if (k17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isGrantedOrNull", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3");
            return null;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((zh1.p) openMaterialService).wi(k17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isGrantedOrNull", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3");
        return valueOf;
    }

    @Override // wd4.c
    public java.lang.Object b(com.tencent.mm.plugin.appbrand.service.k5 k5Var, wd4.h hVar, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3");
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        if (hVar.b().b() != bi1.g.SNS_IMAGE) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            nVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
        } else {
            java.lang.String materialPath = hVar.b().a().f86271f;
            kotlin.jvm.internal.o.f(materialPath, "materialPath");
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            wd4.a0 a0Var = new wd4.a0(materialPath, h0Var);
            wd4.b0 b0Var = new wd4.b0(materialPath, h0Var, k5Var);
            com.tencent.mm.plugin.sns.ui.FlipView flipView = this.f444880a;
            h0Var.f310123d = new wd4.z(flipView, a0Var, b0Var, nVar);
            flipView.e(a0Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addScanCodeListener", "com.tencent.mm.plugin.sns.ui.FlipView");
            if (flipView.R == null) {
                flipView.R = new java.util.ArrayList();
            }
            ((java.util.ArrayList) flipView.R).add(b0Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addScanCodeListener", "com.tencent.mm.plugin.sns.ui.FlipView");
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3");
        return a17;
    }

    @Override // wd4.e
    public java.lang.String getName() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3");
        return "FlipView$Fetch";
    }
}
