package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public final class z1 extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2 f162993e;

    public z1(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2 f2Var) {
        this.f162993e = f2Var;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$showH5Content$anim$1$2");
        kotlin.jvm.internal.o.g(animation, "animation");
        c54.b O = com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2.O(this.f162993e);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showH5Content-onAnimationEnd, triggerCardAppear, cardId=");
        sb6.append(O != null ? O.c() : null);
        com.tencent.mars.xlog.Log.w("SnsAd.HalfEggCard.AdLandingComponent", sb6.toString());
        if (O != null) {
            O.h(false);
        }
        if (O != null) {
            O.g(false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$showH5Content$anim$1$2");
    }
}
