package wd4;

/* loaded from: classes4.dex */
public final class y1 implements com.tencent.mm.plugin.sns.ui.b3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f445066a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f445067b;

    public y1(java.lang.String str, kotlin.jvm.internal.h0 h0Var) {
        this.f445066a = str;
        this.f445067b = h0Var;
    }

    @Override // com.tencent.mm.plugin.sns.ui.b3
    public final void r(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadFinish", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4$isGranted$2$downloadListener$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOpenMaterials_SnsGalleryUI", "onDownloadFinish, mediaPath: " + str + ", success: " + z17);
        if (!kotlin.jvm.internal.o.b(str, this.f445066a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadFinish", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4$isGranted$2$downloadListener$1");
        } else {
            ((yz5.l) this.f445067b.f310123d).invoke(java.lang.Boolean.valueOf(z17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadFinish", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4$isGranted$2$downloadListener$1");
        }
    }
}
