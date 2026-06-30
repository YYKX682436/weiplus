package com.tencent.mm.plugin.sns.ad.landingpage.helper.anim;

/* loaded from: classes4.dex */
public class y extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.z f163149e;

    public y(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.z zVar) {
        this.f163149e = zVar;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$3$2");
        com.tencent.mars.xlog.Log.i("AdLandingPageEggCardHelper", "tryPlayLongPressAnim, onAnimationEnd, loadLandingPages");
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.z zVar = this.f163149e;
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI a17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(zVar.f163150d);
        a17.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIsPlayingAnimation", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        a17.W1 = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIsPlayingAnimation", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var = zVar.f163150d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        android.view.View view = i0Var.f163116p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$3$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$3$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(zVar.f163150d).b8();
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(zVar.f163150d).e8();
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI a18 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(zVar.f163150d);
        a18.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isForbiddenSwipe", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        boolean z17 = a18.f166742r2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isForbiddenSwipe", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        if (!z17 && com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(zVar.f163150d).getF65848t()) {
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.a(zVar.f163150d).getSwipeBackLayout().setEnableGesture(true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$3$2");
    }
}
