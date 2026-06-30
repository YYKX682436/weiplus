package wd4;

/* loaded from: classes4.dex */
public final class e2 implements com.tencent.mm.plugin.sns.ui.c3 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.SnsGalleryUI f444896a;

    /* renamed from: b, reason: collision with root package name */
    public final zh1.z0 f444897b;

    public e2(com.tencent.mm.plugin.sns.ui.SnsGalleryUI snsGalleryUI, zh1.z0 enhanceController) {
        kotlin.jvm.internal.o.g(snsGalleryUI, "snsGalleryUI");
        kotlin.jvm.internal.o.g(enhanceController, "enhanceController");
        this.f444896a = snsGalleryUI;
        this.f444897b = enhanceController;
        snsGalleryUI.w7(this);
    }

    @Override // com.tencent.mm.plugin.sns.ui.c3
    public void a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMediaChange", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIRevokeOpenMaterialsEnableLogic");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOpenMaterials_SnsGalleryUI", "onMediaChange, do revoke");
        this.f444897b.o(zh1.y0.HIDE);
        this.f444896a.y7(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMediaChange", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIRevokeOpenMaterialsEnableLogic");
    }
}
