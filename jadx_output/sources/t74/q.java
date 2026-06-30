package t74;

/* loaded from: classes4.dex */
public final class q extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t74.w1 f416226d;

    public q(t74.w1 w1Var) {
        this.f416226d = w1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doFlipCardTurnedAnim$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        t74.w1 w1Var = this.f416226d;
        t74.w1.j0(w1Var, false);
        t74.w1.f0(w1Var);
        if (t74.w1.N(w1Var) == 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMIsResetBackCardUI$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
            boolean z17 = w1Var.f416271l0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMIsResetBackCardUI$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
            if (z17) {
                t74.w1.z(w1Var);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doFlipCardTurnedAnim$1");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doFlipCardTurnedAnim$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        t74.w1.j0(this.f416226d, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doFlipCardTurnedAnim$1");
    }
}
