package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public final class p3 extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.q3 f162914e;

    public p3(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.q3 q3Var) {
        this.f162914e = q3Var;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp$setVisibility$animator$1$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.o3 o3Var = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.o3(this.f162914e);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(o3Var, 750L, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardComp$setVisibility$animator$1$1");
    }
}
