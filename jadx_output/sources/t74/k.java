package t74;

/* loaded from: classes4.dex */
public final class k extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t74.w1 f416172d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f416173e;

    public k(t74.w1 w1Var, int i17) {
        this.f416172d = w1Var;
        this.f416173e = i17;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doFlipCardAnim$o1$1$1$onAnimationEnd$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        t74.w1 w1Var = this.f416172d;
        t74.w1.j0(w1Var, false);
        t74.w1.f0(w1Var);
        if (this.f416173e == 1) {
            t74.w1.z(w1Var);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doFlipCardAnim$o1$1$1$onAnimationEnd$1");
    }
}
