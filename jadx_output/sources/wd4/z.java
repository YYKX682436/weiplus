package wd4;

/* loaded from: classes4.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.FlipView f445071d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.c3 f445072e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.d3 f445073f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f445074g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.plugin.sns.ui.FlipView flipView, com.tencent.mm.plugin.sns.ui.c3 c3Var, com.tencent.mm.plugin.sns.ui.d3 d3Var, kotlin.coroutines.Continuation continuation) {
        super(1);
        this.f445071d = flipView;
        this.f445072e = c3Var;
        this.f445073f = d3Var;
        this.f445074g = continuation;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$1");
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$1");
        com.tencent.mm.plugin.sns.ui.FlipView flipView = this.f445071d;
        flipView.v(this.f445072e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeScanCodeListener", "com.tencent.mm.plugin.sns.ui.FlipView");
        java.util.List list = flipView.R;
        if (list == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeScanCodeListener", "com.tencent.mm.plugin.sns.ui.FlipView");
        } else {
            ((java.util.ArrayList) list).remove(this.f445073f);
            if (((java.util.ArrayList) flipView.R).isEmpty()) {
                flipView.R = null;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeScanCodeListener", "com.tencent.mm.plugin.sns.ui.FlipView");
        }
        this.f445074g.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(booleanValue)));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$1");
        return f0Var;
    }
}
