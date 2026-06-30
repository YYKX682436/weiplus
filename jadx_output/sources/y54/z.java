package y54;

/* loaded from: classes4.dex */
public final class z implements n3.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI f459576a;

    public z(com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI halfScreenVangoghPageUI) {
        this.f459576a = halfScreenVangoghPageUI;
    }

    @Override // n3.k0
    public final n3.g3 a(android.view.View v17, n3.g3 insets) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onApplyWindowInsets", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$applyWindowInsetsWatch$1$1");
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(insets, "insets");
        int i17 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI.f163179n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getContentHasShown$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
        com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI halfScreenVangoghPageUI = this.f459576a;
        boolean z17 = halfScreenVangoghPageUI.f163184h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getContentHasShown$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
        if (z17) {
            y54.y U6 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI.U6(halfScreenVangoghPageUI);
            U6.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNavigationBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$ContentSizeAttr");
            int i18 = U6.f459573d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNavigationBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$ContentSizeAttr");
            if (i18 != insets.b()) {
                y54.y U62 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI.U6(halfScreenVangoghPageUI);
                int b17 = insets.b();
                U62.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNavigationBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$ContentSizeAttr");
                U62.f459573d = b17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNavigationBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$ContentSizeAttr");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$onNavigationBarVisibleChanged", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
                halfScreenVangoghPageUI.Z6(true);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$onNavigationBarVisibleChanged", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
                com.tencent.mars.xlog.Log.i("SnsAd.HalfScreenVangogh", "doWindowInsetsWatch contentSizeAttr is " + com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI.U6(halfScreenVangoghPageUI));
                com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI.T6(halfScreenVangoghPageUI);
            }
        }
        n3.g3 i19 = n3.l1.i(v17, insets);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onApplyWindowInsets", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$applyWindowInsetsWatch$1$1");
        return i19;
    }
}
