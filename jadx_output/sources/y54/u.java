package y54;

/* loaded from: classes15.dex */
public final class u implements vb4.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI f459564a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f459565b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f459566c;

    public u(com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI adHalfScreenPageUI, android.widget.FrameLayout frameLayout, android.widget.FrameLayout frameLayout2) {
        this.f459564a = adHalfScreenPageUI;
        this.f459565b = frameLayout;
        this.f459566c = frameLayout2;
    }

    @Override // vb4.c
    public void b(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$tryPlayExpandOrShrinkAnimation$2");
        com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI adHalfScreenPageUI = this.f459564a;
        com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout Z6 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.Z6(adHalfScreenPageUI);
        if (Z6 != null) {
            Z6.setAlpha(f17);
        }
        n44.m0 V6 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.V6(adHalfScreenPageUI);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doMultipleMaterialExpandAnimation$default", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper");
        V6.c(f17, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doMultipleMaterialExpandAnimation$default", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$tryPlayExpandOrShrinkAnimation$2");
    }

    @Override // vb4.c
    public void onAnimationEnd() {
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$tryPlayExpandOrShrinkAnimation$2");
        int i17 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.S;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setAlreadyExpend$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI adHalfScreenPageUI = this.f459564a;
        adHalfScreenPageUI.C = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setAlreadyExpend$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        android.widget.FrameLayout frameLayout = this.f459565b;
        frameLayout.setAlpha(1.0f);
        a84.y0.i(frameLayout);
        android.widget.FrameLayout W6 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.W6(adHalfScreenPageUI);
        if (W6 != null) {
            W6.setVisibility(8);
        }
        n44.h1 g17 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.a7(adHalfScreenPageUI).g();
        n44.h1 h1Var = n44.h1.f334945e;
        android.widget.FrameLayout frameLayout2 = this.f459566c;
        if (g17 == h1Var) {
            a84.y0.b(frameLayout2, frameLayout, 1);
        } else {
            a84.y0.b(frameLayout2, frameLayout, 0);
        }
        n44.m0 V6 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.V6(adHalfScreenPageUI);
        androidx.appcompat.app.AppCompatActivity context = adHalfScreenPageUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.graphics.drawable.Drawable d17 = V6.d(context, true);
        if (d17 != null) {
            adHalfScreenPageUI.updateBackBtn(d17);
        }
        com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.e7(adHalfScreenPageUI, false);
        if (adHalfScreenPageUI.getF65848t() && (swipeBackLayout = adHalfScreenPageUI.getSwipeBackLayout()) != null) {
            swipeBackLayout.setEnableGesture(true);
        }
        com.tencent.mars.xlog.Log.i("AdHalfScreenPageUI", "sns shrink anim end");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$tryPlayExpandOrShrinkAnimation$2");
    }

    @Override // vb4.c
    public void onAnimationStart() {
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$tryPlayExpandOrShrinkAnimation$2");
        com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI adHalfScreenPageUI = this.f459564a;
        com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.e7(adHalfScreenPageUI, true);
        if (adHalfScreenPageUI.getF65848t() && (swipeBackLayout = adHalfScreenPageUI.getSwipeBackLayout()) != null) {
            swipeBackLayout.setEnableGesture(false);
        }
        com.tencent.mars.xlog.Log.i("AdHalfScreenPageUI", "sns shrink anim start");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$tryPlayExpandOrShrinkAnimation$2");
    }
}
