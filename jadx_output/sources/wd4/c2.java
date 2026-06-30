package wd4;

/* loaded from: classes4.dex */
public final class c2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsGalleryUI f444885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f444886e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(com.tencent.mm.plugin.sns.ui.SnsGalleryUI snsGalleryUI, int i17) {
        super(1);
        this.f444885d = snsGalleryUI;
        this.f444886e = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$markTokenDone", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markTokenDone", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("markTokenDone, token: ");
        int i17 = this.f444886e;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOpenMaterials_SnsGalleryUI", sb6.toString());
        java.util.WeakHashMap weakHashMap = wd4.d2.f444892a;
        if (weakHashMap == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markTokenDone", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials");
        } else {
            com.tencent.mm.plugin.sns.ui.SnsGalleryUI snsGalleryUI = this.f444885d;
            java.util.HashSet hashSet = (java.util.HashSet) weakHashMap.get(snsGalleryUI);
            if (hashSet == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markTokenDone", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials");
            } else {
                if (hashSet.remove(java.lang.Integer.valueOf(i17)) && hashSet.isEmpty() && weakHashMap.remove(snsGalleryUI) != null && weakHashMap.isEmpty()) {
                    wd4.d2.f444892a = null;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markTokenDone", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$markTokenDone", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2");
        return f0Var;
    }
}
