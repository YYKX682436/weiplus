package y54;

/* loaded from: classes15.dex */
public final class t implements vb4.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f459562a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI f459563b;

    public t(android.widget.FrameLayout frameLayout, com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI adHalfScreenPageUI) {
        this.f459562a = frameLayout;
        this.f459563b = adHalfScreenPageUI;
    }

    @Override // vb4.c
    public void b(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$tryPlayExpandOrShrinkAnimation$1");
        com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI adHalfScreenPageUI = this.f459563b;
        com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout Z6 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.Z6(adHalfScreenPageUI);
        if (Z6 != null) {
            Z6.setAlpha(f17);
        }
        n44.m0 V6 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.V6(adHalfScreenPageUI);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doMultipleMaterialExpandAnimation$default", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper");
        V6.c(f17, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doMultipleMaterialExpandAnimation$default", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$tryPlayExpandOrShrinkAnimation$1");
    }

    @Override // vb4.c
    public void onAnimationEnd() {
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$tryPlayExpandOrShrinkAnimation$1");
        com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI adHalfScreenPageUI = this.f459563b;
        n44.m0 V6 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.V6(adHalfScreenPageUI);
        androidx.appcompat.app.AppCompatActivity context = adHalfScreenPageUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.graphics.drawable.Drawable d17 = V6.d(context, false);
        if (d17 != null) {
            adHalfScreenPageUI.updateBackBtn(d17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setAlreadyExpend$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        adHalfScreenPageUI.C = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setAlreadyExpend$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.e7(adHalfScreenPageUI, false);
        if (adHalfScreenPageUI.getF65848t() && (swipeBackLayout = adHalfScreenPageUI.getSwipeBackLayout()) != null) {
            swipeBackLayout.setEnableGesture(true);
        }
        com.tencent.mars.xlog.Log.i("AdHalfScreenPageUI", "sns expand anim end");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$tryPlayExpandOrShrinkAnimation$1");
    }

    @Override // vb4.c
    public void onAnimationStart() {
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$tryPlayExpandOrShrinkAnimation$1");
        android.widget.FrameLayout frameLayout = this.f459562a;
        a84.y0.i(frameLayout);
        com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI adHalfScreenPageUI = this.f459563b;
        a84.y0.b(com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.W6(adHalfScreenPageUI), frameLayout, 0);
        android.widget.FrameLayout W6 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.W6(adHalfScreenPageUI);
        if (W6 != null) {
            W6.setVisibility(0);
        }
        com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.e7(adHalfScreenPageUI, true);
        if (adHalfScreenPageUI.getF65848t() && (swipeBackLayout = adHalfScreenPageUI.getSwipeBackLayout()) != null) {
            swipeBackLayout.setEnableGesture(false);
        }
        com.tencent.mars.xlog.Log.i("AdHalfScreenPageUI", "sns expand anim start");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$tryPlayExpandOrShrinkAnimation$1");
    }
}
