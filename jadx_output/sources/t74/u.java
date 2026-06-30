package t74;

/* loaded from: classes4.dex */
public final class u extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t74.w1 f416248d;

    public u(t74.w1 w1Var) {
        this.f416248d = w1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doInitAnim$a4$1$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        t74.w1 w1Var = this.f416248d;
        android.widget.FrameLayout T = t74.w1.T(w1Var);
        if (T != null) {
            T.setVisibility(4);
        }
        if (t74.w1.Z(w1Var)) {
            t74.i2 R = t74.w1.R(w1Var);
            if (R != null) {
                R.e(0);
            }
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView W = t74.w1.W(w1Var);
            if (W != null) {
                W.M(0, false);
            }
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView W2 = t74.w1.W(w1Var);
            if (W2 != null) {
                W2.setTag(com.tencent.mm.R.id.f486984n33, 1);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doInitAnim$a4$1$1");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doInitAnim$a4$1$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        t74.w1 w1Var = this.f416248d;
        android.widget.FrameLayout T = t74.w1.T(w1Var);
        if (T != null) {
            T.setVisibility(0);
        }
        t74.w1.i0(w1Var, 0);
        com.tencent.mm.ui.base.MMDotView O = t74.w1.O(w1Var);
        if (O != null) {
            O.setSelectedDot(t74.w1.N(w1Var));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doInitAnim$a4$1$1");
    }
}
