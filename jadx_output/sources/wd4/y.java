package wd4;

/* loaded from: classes4.dex */
public final class y implements wd4.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.FlipView f445061a;

    public y(com.tencent.mm.plugin.sns.ui.FlipView flipView) {
        this.f445061a = flipView;
    }

    @Override // wd4.f
    public final java.lang.String provide() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("provide", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$2");
        java.lang.String currentMaterialPath = this.f445061a.getCurrentMaterialPath();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("provide", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$2");
        return currentMaterialPath;
    }
}
