package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public final class w1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2 f162971d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f162972e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f162973f;

    public w1(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2 f2Var, boolean z17, boolean z18) {
        this.f162971d = f2Var;
        this.f162972e = z17;
        this.f162973f = z18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$showCardContent$anim$1$1");
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2 f2Var = this.f162971d;
        f2Var.V().m().setAlpha(floatValue);
        f2Var.V().l().setAlpha(floatValue);
        f2Var.V().g().setAlpha(floatValue);
        f2Var.V().c().setAlpha(floatValue);
        android.widget.FrameLayout d17 = f2Var.V().d();
        if (d17 != null) {
            d17.setAlpha(floatValue);
        }
        if (!this.f162972e) {
            f2Var.V().e().setAlpha(floatValue);
        }
        if (this.f162973f) {
            f2Var.V().b().setAlpha(floatValue);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$showCardContent$anim$1$1");
    }
}
