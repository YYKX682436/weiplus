package t74;

/* loaded from: classes4.dex */
public final class t extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public boolean f416244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t74.w1 f416245e;

    public t(t74.w1 w1Var) {
        this.f416245e = w1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doInitAnim$1$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f416244d = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doInitAnim$1$1");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doInitAnim$1$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        if (this.f416244d) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doInitAnim$1$1");
            return;
        }
        t74.w1 w1Var = this.f416245e;
        t74.i2 R = t74.w1.R(w1Var);
        if (R != null) {
            R.c(1);
        }
        t74.w1.z(w1Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doInitAnim$1$1");
    }
}
