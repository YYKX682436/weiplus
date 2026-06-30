package p44;

/* loaded from: classes4.dex */
public final class c extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView f351773e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f351774f;

    public c(com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView adLandingPageRandomPickCardView, kotlin.jvm.internal.h0 h0Var) {
        this.f351773e = adLandingPageRandomPickCardView;
        this.f351774f = h0Var;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView$checkStartFlipToGoneToVisibleAnim$1$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        int i17 = com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView.f162705v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMSelectCardId$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView");
        com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView adLandingPageRandomPickCardView = this.f351773e;
        adLandingPageRandomPickCardView.f162706q = "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMSelectCardId$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView");
        if (!this.f39706d) {
            java.util.List list = (java.util.List) this.f351774f.f310123d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$startUnPickedAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView");
            android.animation.Animator n17 = adLandingPageRandomPickCardView.n(list);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$startUnPickedAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMUnPickedCardAnim$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView");
            adLandingPageRandomPickCardView.f162708s = n17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMUnPickedCardAnim$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView$checkStartFlipToGoneToVisibleAnim$1$1");
    }
}
