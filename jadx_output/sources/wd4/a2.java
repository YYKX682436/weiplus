package wd4;

/* loaded from: classes4.dex */
public final class a2 implements wd4.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsGalleryUI f444863a;

    public a2(com.tencent.mm.plugin.sns.ui.SnsGalleryUI snsGalleryUI) {
        this.f444863a = snsGalleryUI;
    }

    @Override // wd4.c
    public java.lang.Boolean a(com.tencent.mm.plugin.appbrand.service.k5 openMaterialService, wd4.h params) {
        boolean l17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isGrantedOrNull", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4");
        kotlin.jvm.internal.o.g(openMaterialService, "openMaterialService");
        kotlin.jvm.internal.o.g(params, "params");
        java.lang.String str = params.b().a().f86271f;
        com.tencent.mm.plugin.sns.ui.SnsGalleryUI snsGalleryUI = this.f444863a;
        snsGalleryUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = snsGalleryUI.f166810o;
        if (snsInfoFlip == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsGalleryUI", "getDownloadResult, flipView is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            l17 = false;
        } else {
            l17 = snsInfoFlip.l(str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        }
        java.lang.Boolean bool = l17 ? java.lang.Boolean.TRUE : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isGrantedOrNull", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4");
        return bool;
    }

    @Override // wd4.c
    public java.lang.Object b(com.tencent.mm.plugin.appbrand.service.k5 k5Var, wd4.h hVar, kotlin.coroutines.Continuation continuation) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4");
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        java.lang.String materialPath = hVar.b().a().f86271f;
        kotlin.jvm.internal.o.f(materialPath, "materialPath");
        bi1.g b17 = hVar.b().b();
        bi1.g gVar = bi1.g.SNS_VIDEO;
        com.tencent.mm.plugin.sns.ui.SnsGalleryUI snsGalleryUI = this.f444863a;
        if (b17 == gVar) {
            snsGalleryUI.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startDownloadVideo", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = snsGalleryUI.f166810o;
            if (snsInfoFlip == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SnsGalleryUI", "startDownloadVideo, flipView is null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startDownloadVideo", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                z17 = false;
            } else {
                boolean y17 = snsInfoFlip.y(materialPath);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startDownloadVideo", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                z17 = y17;
            }
            if (!z17) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                nVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
            }
        }
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        wd4.z1 z1Var = new wd4.z1(materialPath, h0Var);
        wd4.y1 y1Var = new wd4.y1(materialPath, h0Var);
        h0Var.f310123d = new wd4.x1(snsGalleryUI, z1Var, y1Var, nVar);
        snsGalleryUI.w7(z1Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addDownloadListener", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip2 = snsGalleryUI.f166810o;
        if (snsInfoFlip2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addDownloadListener", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addDownloadListener", "com.tencent.mm.plugin.sns.ui.FlipView");
            if (snsInfoFlip2.S == null) {
                snsInfoFlip2.S = new java.util.ArrayList();
            }
            ((java.util.ArrayList) snsInfoFlip2.S).add(y1Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addDownloadListener", "com.tencent.mm.plugin.sns.ui.FlipView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addDownloadListener", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4");
        return a17;
    }

    @Override // wd4.e
    public java.lang.String getName() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4");
        return "SnsGalleryUI$Open";
    }
}
