package t74;

/* loaded from: classes4.dex */
public final class j extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t74.w1 f416169d;

    public j(t74.w1 w1Var) {
        this.f416169d = w1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doFlipCardAnim$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        t74.w1.j0(this.f416169d, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doFlipCardAnim$1");
    }
}
