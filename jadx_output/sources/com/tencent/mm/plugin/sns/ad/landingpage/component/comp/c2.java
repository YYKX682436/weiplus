package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public final class c2 extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f162777e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2 f162778f;

    public c2(boolean z17, com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2 f2Var) {
        this.f162777e = z17;
        this.f162778f = f2Var;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        java.lang.Boolean bool;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$startReqCardAnim$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startReqCardAnim-onAnimationEnd, needDoSelect=");
        boolean z17 = this.f162777e;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.AdLandingComponent", sb6.toString());
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2 f2Var = this.f162778f;
        f2Var.V().a().setAlpha(0.0f);
        f2Var.V().a().setVisibility(4);
        if (z17) {
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2.P(f2Var);
        }
        c54.b O = com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2.O(f2Var);
        if (O != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isCardAutoJumpH5", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
            boolean z18 = O.f38671i;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isCardAutoJumpH5", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
            bool = java.lang.Boolean.valueOf(z18);
        } else {
            bool = null;
        }
        if (kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$showH5Content", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            f2Var.Z(false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$showH5Content", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            ab4.n0 u17 = f2Var.u();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMCurrentShowCardId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            java.lang.String str = f2Var.f162813y;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMCurrentShowCardId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            f2Var.W(u17, str, 2);
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$showCardContent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            f2Var.Y(false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$showCardContent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$startReqCardAnim$1");
    }
}
