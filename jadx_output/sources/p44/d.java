package p44;

/* loaded from: classes4.dex */
public final class d extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView f351785e;

    public d(com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView adLandingPageRandomPickCardView) {
        this.f351785e = adLandingPageRandomPickCardView;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView$setSelectWithAnim$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f351785e.setEnabled(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView$setSelectWithAnim$1");
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView$setSelectWithAnim$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f39706d = false;
        this.f351785e.setEnabled(false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView$setSelectWithAnim$1");
    }
}
