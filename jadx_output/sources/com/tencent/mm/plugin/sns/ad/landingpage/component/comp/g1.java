package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public class g1 extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f162825e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent f162826f;

    public g1(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent adLandingHBCardComponent, android.view.View view) {
        this.f162826f = adLandingHBCardComponent;
        this.f162825e = view;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$1");
        android.view.View view = this.f162825e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f162825e.setTranslationX(0.0f);
        android.view.View view2 = this.f162825e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent adLandingHBCardComponent = this.f162826f;
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent.O(adLandingHBCardComponent).d();
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent.O(adLandingHBCardComponent).c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$1");
    }
}
