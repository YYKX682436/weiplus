package wd4;

/* loaded from: classes4.dex */
public final class w1 implements wd4.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsGalleryUI f445053a;

    public w1(com.tencent.mm.plugin.sns.ui.SnsGalleryUI snsGalleryUI) {
        this.f445053a = snsGalleryUI;
    }

    @Override // wd4.c
    public java.lang.Boolean a(com.tencent.mm.plugin.appbrand.service.k5 openMaterialService, wd4.h params) {
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isGrantedOrNull", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3");
        kotlin.jvm.internal.o.g(openMaterialService, "openMaterialService");
        kotlin.jvm.internal.o.g(params, "params");
        if (params.b().b() != bi1.g.SNS_IMAGE) {
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isGrantedOrNull", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3");
            return bool;
        }
        java.lang.String str = params.b().a().f86271f;
        com.tencent.mm.plugin.sns.ui.SnsGalleryUI snsGalleryUI = this.f445053a;
        snsGalleryUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCodeScanResult", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        com.tencent.mm.plugin.sns.ui.c4 f76 = snsGalleryUI.f7();
        if (f76 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCodeScanResult", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            arrayList = null;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCodeScanResult", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            java.lang.String i17 = f76.i();
            if (!str.equals(i17)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GalleryTitleManager", "getCodeScanResult, mediaPath: %s, curMediaPath: %s", str, i17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCodeScanResult", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            } else if (f76.f168092i != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GalleryTitleManager", "getCodeScanResult, recognizingFilePath not null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCodeScanResult", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            } else {
                arrayList = f76.f168102v;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCodeScanResult", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCodeScanResult", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            }
            arrayList = null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCodeScanResult", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        }
        if (arrayList == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isGrantedOrNull", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3");
            return null;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((zh1.p) openMaterialService).wi(arrayList));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isGrantedOrNull", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3");
        return valueOf;
    }

    @Override // wd4.c
    public java.lang.Object b(com.tencent.mm.plugin.appbrand.service.k5 k5Var, wd4.h hVar, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3");
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        if (hVar.b().b() != bi1.g.SNS_IMAGE) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            nVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
        } else {
            java.lang.String materialPath = hVar.b().a().f86271f;
            kotlin.jvm.internal.o.f(materialPath, "materialPath");
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            wd4.u1 u1Var = new wd4.u1(materialPath, h0Var);
            wd4.v1 v1Var = new wd4.v1(materialPath, h0Var, k5Var);
            com.tencent.mm.plugin.sns.ui.SnsGalleryUI snsGalleryUI = this.f445053a;
            h0Var.f310123d = new wd4.t1(snsGalleryUI, u1Var, v1Var, nVar);
            snsGalleryUI.w7(u1Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addScanCodeListener", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            if (snsGalleryUI.H1 == null) {
                snsGalleryUI.H1 = new java.util.ArrayList();
            }
            ((java.util.ArrayList) snsGalleryUI.H1).add(v1Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addScanCodeListener", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3");
        return a17;
    }

    @Override // wd4.e
    public java.lang.String getName() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3");
        return "SnsGalleryUI$Fetch";
    }
}
