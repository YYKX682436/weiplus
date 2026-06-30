package y54;

/* loaded from: classes15.dex */
public final class q implements vb4.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f459554a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI f459555b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f459556c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y54.c f459557d;

    public q(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI adHalfScreenPageUI, android.view.View view, y54.c cVar) {
        this.f459554a = viewGroup;
        this.f459555b = adHalfScreenPageUI;
        this.f459556c = view;
        this.f459557d = cVar;
    }

    @Override // vb4.c
    public void b(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$tryPlayEnterAnimation$1");
        com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI adHalfScreenPageUI = this.f459555b;
        android.view.View b76 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.b7(adHalfScreenPageUI);
        if (b76 != null) {
            b76.setBackgroundColor(e3.b.c(adHalfScreenPageUI.getResources().getColor(com.tencent.mm.R.color.a9e), adHalfScreenPageUI.getResources().getColor(com.tencent.mm.R.color.f478712f3), 1.0f - f17));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$tryPlayEnterAnimation$1");
    }

    @Override // vb4.c
    public void onAnimationEnd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$tryPlayEnterAnimation$1");
        android.view.View view = this.f459556c;
        a84.y0.i(view);
        com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI adHalfScreenPageUI = this.f459555b;
        android.widget.FrameLayout W6 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.W6(adHalfScreenPageUI);
        if (W6 != null) {
            W6.setVisibility(8);
        }
        android.view.ViewGroup viewGroup = this.f459554a;
        a84.y0.b(viewGroup, view, 0);
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            y54.c cVar = this.f459557d;
            marginLayoutParams.width = cVar.d();
            marginLayoutParams.height = cVar.a();
            marginLayoutParams.topMargin = cVar.c();
            marginLayoutParams.leftMargin = cVar.b();
            marginLayoutParams.bottomMargin = (viewGroup.getHeight() - cVar.a()) - cVar.c();
            marginLayoutParams.rightMargin = (viewGroup.getWidth() - cVar.d()) - cVar.b();
        }
        viewGroup.setAlpha(1.0f);
        if (com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.a7(adHalfScreenPageUI).g() == n44.h1.f334945e) {
            android.widget.FrameLayout c76 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.c7(adHalfScreenPageUI);
            if (c76 != null) {
                c76.setAlpha(1.0f);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getViewPagerContainer$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
            android.widget.FrameLayout frameLayout = adHalfScreenPageUI.f163162g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getViewPagerContainer$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
            if (frameLayout != null) {
                frameLayout.setAlpha(1.0f);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getViewPager$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
            com.tencent.mm.ui.base.MMViewPager mMViewPager = adHalfScreenPageUI.f163163h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getViewPager$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
            if (mMViewPager != null) {
                mMViewPager.setAlpha(1.0f);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getHalfScreenContainerHeader$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        android.widget.FrameLayout frameLayout2 = adHalfScreenPageUI.f163166n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getHalfScreenContainerHeader$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
        android.view.View b76 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.b7(adHalfScreenPageUI);
        if (b76 != null) {
            b76.setBackgroundColor(adHalfScreenPageUI.getResources().getColor(com.tencent.mm.R.color.f478712f3));
        }
        com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.e7(adHalfScreenPageUI, false);
        n44.m0 V6 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.V6(adHalfScreenPageUI);
        V6.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initPlay", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper");
        i64.z zVar = V6.f334983a;
        n44.h1 g17 = zVar != null ? zVar.g() : null;
        n44.h1 h1Var = n44.h1.f334946f;
        if (g17 == h1Var) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMute", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper");
            i64.z zVar2 = V6.f334983a;
            if ((zVar2 != null ? zVar2.g() : null) == h1Var) {
                n44.u0 h17 = V6.h();
                h17.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMute", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenVideoHelper");
                com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper adLandingGeneralVideoWrapper = h17.f335061d;
                if (adLandingGeneralVideoWrapper != null) {
                    adLandingGeneralVideoWrapper.setMute(false);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMute", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenVideoHelper");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMute", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper");
            if (!V6.f334998p) {
                com.tencent.mars.xlog.Log.i("AdHalfScreenPageHelper", "initPlay");
                V6.p();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initPlay", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper");
        com.tencent.mars.xlog.Log.i("AdHalfScreenPageUI", "sns enter anim end");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$tryPlayEnterAnimation$1");
    }

    @Override // vb4.c
    public void onAnimationStart() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$tryPlayEnterAnimation$1");
        this.f459554a.setAlpha(0.0f);
        com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI adHalfScreenPageUI = this.f459555b;
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
        android.widget.FrameLayout W6 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.W6(adHalfScreenPageUI);
        if (W6 != null) {
            W6.setVisibility(0);
        }
        android.view.View view = this.f459556c;
        a84.y0.i(view);
        a84.y0.b(com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.W6(adHalfScreenPageUI), view, 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getHalfScreenContainerHeader$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        android.widget.FrameLayout frameLayout2 = adHalfScreenPageUI.f163166n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getHalfScreenContainerHeader$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        android.view.View b76 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.b7(adHalfScreenPageUI);
        if (b76 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(b76, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/ui/activity/AdHalfScreenPageUI$tryPlayEnterAnimation$1", "onAnimationStart", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            b76.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(b76, "com/tencent/mm/plugin/sns/ad/landingpage/ui/activity/AdHalfScreenPageUI$tryPlayEnterAnimation$1", "onAnimationStart", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View b77 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.b7(adHalfScreenPageUI);
        if (b77 != null) {
            b77.setBackgroundColor(adHalfScreenPageUI.getResources().getColor(com.tencent.mm.R.color.a9e));
        }
        com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.e7(adHalfScreenPageUI, true);
        com.tencent.mars.xlog.Log.i("AdHalfScreenPageUI", "sns enter anim start");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$tryPlayEnterAnimation$1");
    }
}
