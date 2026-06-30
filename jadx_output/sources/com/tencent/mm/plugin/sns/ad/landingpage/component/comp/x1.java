package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public final class x1 extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2 f162980e;

    public x1(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2 f2Var) {
        this.f162980e = f2Var;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$showCardContent$anim$1$2");
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showCardContent-onAnimationEnd, triggerCardAppear, cardId=");
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2 f2Var = this.f162980e;
        sb6.append(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2.O(f2Var));
        com.tencent.mars.xlog.Log.w("SnsAd.HalfEggCard.AdLandingComponent", sb6.toString());
        c54.b O = com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2.O(f2Var);
        if (O != null) {
            O.h(false);
        }
        if (O != null) {
            O.g(false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMUIHandler$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        android.os.Handler handler = f2Var.f162811w;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMUIHandler$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMVideoPlayTask$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        java.lang.Runnable runnable = f2Var.C;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMVideoPlayTask$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        handler.postDelayed(runnable, 30L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$showCardContent$anim$1$2");
    }
}
