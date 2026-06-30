package y54;

/* loaded from: classes4.dex */
public final class g0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout f459541d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI f459542e;

    public g0(com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout scrollableFrameLayout, com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI halfScreenVangoghPageUI) {
        this.f459541d = scrollableFrameLayout;
        this.f459542e = halfScreenVangoghPageUI;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout scrollableFrameLayout = this.f459541d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGlobalLayout", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$requestLayoutSpaceHeightIfNeed$1");
        try {
            android.view.ViewTreeObserver viewTreeObserver = scrollableFrameLayout.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        } catch (java.lang.IllegalStateException e17) {
            com.tencent.mars.xlog.Log.e("SnsAd.HalfScreenVangogh", "remove an OnGlobalLayoutListener exception, message is " + e17.getMessage() + ' ');
        }
        com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI halfScreenVangoghPageUI = this.f459542e;
        int c17 = com.tencent.mm.ui.bl.c(halfScreenVangoghPageUI);
        com.tencent.mars.xlog.Log.i("SnsAd.HalfScreenVangogh", "OnGlobalLayoutListener:: the new naviHeight is " + c17);
        y54.y U6 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI.U6(halfScreenVangoghPageUI);
        U6.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNavigationBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$ContentSizeAttr");
        int i17 = U6.f459573d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNavigationBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$ContentSizeAttr");
        if (i17 != c17) {
            y54.y U62 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI.U6(halfScreenVangoghPageUI);
            U62.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNavigationBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$ContentSizeAttr");
            U62.f459573d = c17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNavigationBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$ContentSizeAttr");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onNavigationBarVisibleChanged$default", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
            halfScreenVangoghPageUI.Z6(false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNavigationBarVisibleChanged$default", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
        }
        y54.y U63 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI.U6(halfScreenVangoghPageUI);
        U63.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVisibleContentHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$ContentSizeAttr");
        int i18 = U63.f459574e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVisibleContentHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$ContentSizeAttr");
        scrollableFrameLayout.l(i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setContentHasShown$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
        halfScreenVangoghPageUI.f163184h = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setContentHasShown$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGlobalLayout", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$requestLayoutSpaceHeightIfNeed$1");
    }
}
