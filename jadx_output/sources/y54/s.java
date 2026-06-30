package y54;

/* loaded from: classes15.dex */
public final class s implements vb4.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f459559a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI f459560b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f459561c;

    public s(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI adHalfScreenPageUI, android.view.View view) {
        this.f459559a = viewGroup;
        this.f459560b = adHalfScreenPageUI;
        this.f459561c = view;
    }

    @Override // vb4.c
    public void b(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$tryPlayExitAnimation$1");
        com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI adHalfScreenPageUI = this.f459560b;
        android.view.View b76 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.b7(adHalfScreenPageUI);
        if (b76 != null) {
            b76.setBackgroundColor(e3.b.c(adHalfScreenPageUI.getResources().getColor(com.tencent.mm.R.color.f478712f3), adHalfScreenPageUI.getResources().getColor(com.tencent.mm.R.color.a9e), f17));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$tryPlayExitAnimation$1");
    }

    @Override // vb4.c
    public void onAnimationEnd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$tryPlayExitAnimation$1");
        com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI adHalfScreenPageUI = this.f459560b;
        com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.e7(adHalfScreenPageUI, false);
        com.tencent.mars.xlog.Log.i("AdHalfScreenPageUI", "sns exit anim end");
        adHalfScreenPageUI.finish();
        adHalfScreenPageUI.overridePendingTransition(0, 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$tryPlayExitAnimation$1");
    }

    @Override // vb4.c
    public void onAnimationStart() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$tryPlayExitAnimation$1");
        this.f459559a.setAlpha(0.0f);
        com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI adHalfScreenPageUI = this.f459560b;
        if (com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.a7(adHalfScreenPageUI).g() == n44.h1.f334945e) {
            android.widget.FrameLayout c76 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.c7(adHalfScreenPageUI);
            if (c76 != null) {
                c76.setAlpha(0.0f);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getViewPagerContainer$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
            android.widget.FrameLayout frameLayout = adHalfScreenPageUI.f163162g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getViewPagerContainer$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
            if (frameLayout != null) {
                frameLayout.setAlpha(0.0f);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getViewPager$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
            com.tencent.mm.ui.base.MMViewPager mMViewPager = adHalfScreenPageUI.f163163h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getViewPager$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
            if (mMViewPager != null) {
                mMViewPager.setAlpha(0.0f);
            }
        }
        android.view.View view = this.f459561c;
        a84.y0.i(view);
        a84.y0.b(com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.W6(adHalfScreenPageUI), view, 0);
        android.widget.FrameLayout W6 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.W6(adHalfScreenPageUI);
        if (W6 != null) {
            W6.setVisibility(0);
        }
        com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout Z6 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.Z6(adHalfScreenPageUI);
        if (Z6 != null) {
            Z6.setAlpha(0.0f);
        }
        com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.e7(adHalfScreenPageUI, true);
        com.tencent.mars.xlog.Log.i("AdHalfScreenPageUI", "sns exit anim start");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$tryPlayExitAnimation$1");
    }
}
