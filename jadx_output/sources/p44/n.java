package p44;

/* loaded from: classes4.dex */
public final class n extends c84.f {
    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder$startIntroImgAnim$5$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        if (!this.f39706d) {
            animation.start();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder$startIntroImgAnim$5$1");
    }
}
