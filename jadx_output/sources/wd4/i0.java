package wd4;

/* loaded from: classes4.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.FlipView f444927d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f444928e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.tencent.mm.plugin.sns.ui.FlipView flipView, int i17) {
        super(1);
        this.f444927d = flipView;
        this.f444928e = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$markTokenDone", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markTokenDone", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("markTokenDone, token: ");
        int i17 = this.f444928e;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOpenMaterials_FlipView", sb6.toString());
        java.util.WeakHashMap weakHashMap = wd4.j0.f444936a;
        if (weakHashMap == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markTokenDone", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
        } else {
            com.tencent.mm.plugin.sns.ui.FlipView flipView = this.f444927d;
            java.util.HashSet hashSet = (java.util.HashSet) weakHashMap.get(flipView);
            if (hashSet == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markTokenDone", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
            } else {
                if (hashSet.remove(java.lang.Integer.valueOf(i17)) && hashSet.isEmpty() && weakHashMap.remove(flipView) != null && weakHashMap.isEmpty()) {
                    wd4.j0.f444936a = null;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markTokenDone", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$markTokenDone", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2");
        return f0Var;
    }
}
