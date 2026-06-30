package wd4;

/* loaded from: classes4.dex */
public final class g0 implements wd4.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.FlipView f444905a;

    public g0(com.tencent.mm.plugin.sns.ui.FlipView flipView) {
        this.f444905a = flipView;
    }

    @Override // wd4.c
    public java.lang.Boolean a(com.tencent.mm.plugin.appbrand.service.k5 openMaterialService, wd4.h params) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isGrantedOrNull", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4");
        kotlin.jvm.internal.o.g(openMaterialService, "openMaterialService");
        kotlin.jvm.internal.o.g(params, "params");
        java.lang.Boolean bool = this.f444905a.l(params.b().a().f86271f) ? java.lang.Boolean.TRUE : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isGrantedOrNull", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4");
        return bool;
    }

    @Override // wd4.c
    public java.lang.Object b(com.tencent.mm.plugin.appbrand.service.k5 k5Var, wd4.h hVar, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4");
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        java.lang.String materialPath = hVar.b().a().f86271f;
        kotlin.jvm.internal.o.f(materialPath, "materialPath");
        bi1.g b17 = hVar.b().b();
        bi1.g gVar = bi1.g.SNS_VIDEO;
        com.tencent.mm.plugin.sns.ui.FlipView flipView = this.f444905a;
        if (b17 == gVar && !flipView.y(materialPath)) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            nVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
        }
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        wd4.f0 f0Var = new wd4.f0(materialPath, h0Var);
        wd4.e0 e0Var = new wd4.e0(materialPath, h0Var);
        h0Var.f310123d = new wd4.d0(flipView, f0Var, e0Var, nVar);
        flipView.e(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addDownloadListener", "com.tencent.mm.plugin.sns.ui.FlipView");
        if (flipView.S == null) {
            flipView.S = new java.util.ArrayList();
        }
        ((java.util.ArrayList) flipView.S).add(e0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addDownloadListener", "com.tencent.mm.plugin.sns.ui.FlipView");
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4");
        return a17;
    }

    @Override // wd4.e
    public java.lang.String getName() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4");
        return "FlipView$Open";
    }
}
