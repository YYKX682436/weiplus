package wd4;

/* loaded from: classes4.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsGalleryUI f445030d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.c3 f445031e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.pi f445032f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f445033g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(com.tencent.mm.plugin.sns.ui.SnsGalleryUI snsGalleryUI, com.tencent.mm.plugin.sns.ui.c3 c3Var, com.tencent.mm.plugin.sns.ui.pi piVar, kotlin.coroutines.Continuation continuation) {
        super(1);
        this.f445030d = snsGalleryUI;
        this.f445031e = c3Var;
        this.f445032f = piVar;
        this.f445033g = continuation;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$1");
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$1");
        com.tencent.mm.plugin.sns.ui.SnsGalleryUI snsGalleryUI = this.f445030d;
        snsGalleryUI.y7(this.f445031e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeScanCodeListener", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        java.util.List list = snsGalleryUI.H1;
        if (list == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeScanCodeListener", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        } else {
            ((java.util.ArrayList) list).remove(this.f445032f);
            if (((java.util.ArrayList) snsGalleryUI.H1).isEmpty()) {
                snsGalleryUI.H1 = null;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeScanCodeListener", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        }
        this.f445033g.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(booleanValue)));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$1");
        return f0Var;
    }
}
