package wd4;

/* loaded from: classes4.dex */
public final class m1 implements wd4.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fc4.j0 f444974a;

    public m1(fc4.j0 j0Var) {
        this.f444974a = j0Var;
    }

    @Override // wd4.b
    public final com.tencent.mm.ui.widget.dialog.k0 provide() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("provide", "com.tencent.mm.plugin.sns.ui.sheet.SnsFlexibleVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2$1");
        fc4.j0 j0Var = this.f444974a;
        j0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getShareSheet", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
        wd4.l1 l1Var = j0Var.f261176i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getShareSheet", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
        com.tencent.mm.ui.widget.dialog.k0 d17 = l1Var != null ? l1Var.d() : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("provide", "com.tencent.mm.plugin.sns.ui.sheet.SnsFlexibleVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2$1");
        return d17;
    }
}
