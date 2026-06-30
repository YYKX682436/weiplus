package wd4;

/* loaded from: classes4.dex */
public final class k0 implements com.tencent.mm.plugin.sns.ui.c3 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.FlipView f444942a;

    /* renamed from: b, reason: collision with root package name */
    public final zh1.z0 f444943b;

    public k0(com.tencent.mm.plugin.sns.ui.FlipView flipView, zh1.z0 enhanceController) {
        kotlin.jvm.internal.o.g(flipView, "flipView");
        kotlin.jvm.internal.o.g(enhanceController, "enhanceController");
        this.f444942a = flipView;
        this.f444943b = enhanceController;
        flipView.e(this);
    }

    @Override // com.tencent.mm.plugin.sns.ui.c3
    public void a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMediaChange", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewRevokeOpenMaterialsEnableLogic");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOpenMaterials_FlipView", "onMediaChange, do revoke");
        this.f444943b.o(zh1.y0.HIDE);
        this.f444942a.v(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMediaChange", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewRevokeOpenMaterialsEnableLogic");
    }
}
