package s74;

/* loaded from: classes4.dex */
public final class c0 implements w64.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f404222a;

    public c0(android.view.View view) {
        this.f404222a = view;
    }

    @Override // w64.m
    public final w64.x a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetJumpAnimInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$processClickableViews$1$1$2");
        int i17 = w64.x.f443338a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryGetIAdLandingPageJumpAnimInfoFromView", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.IAdLandingPageJumpAnimInfo$Companion");
        android.view.View view = this.f404222a;
        java.lang.Object tag = view != null ? view.getTag(com.tencent.mm.R.id.ptl) : null;
        w64.x xVar = tag instanceof w64.x ? (w64.x) tag : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryGetIAdLandingPageJumpAnimInfoFromView", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.IAdLandingPageJumpAnimInfo$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetJumpAnimInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$processClickableViews$1$1$2");
        return xVar;
    }
}
