package k84;

/* loaded from: classes4.dex */
public final class m1 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.q1 f305117d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f305118e;

    public m1(k84.q1 q1Var, android.widget.ImageView imageView) {
        this.f305117d = q1Var;
        this.f305118e = imageView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerBarAnim$1$invokeSuspend$$inlined$addListener$default$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerBarAnim$1$invokeSuspend$$inlined$addListener$default$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerBarAnim$1$invokeSuspend$$inlined$addListener$default$1");
        k84.q1 q1Var = this.f305117d;
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView K = q1Var.K();
        if (K != null) {
            K.removeView(this.f305118e);
        }
        k84.q1.B(q1Var, k84.q1.A(q1Var) - 1);
        com.tencent.mars.xlog.Log.i(q1Var.j(), "triggerNumAnim remove view " + k84.q1.A(q1Var));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerBarAnim$1$invokeSuspend$$inlined$addListener$default$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerBarAnim$1$invokeSuspend$$inlined$addListener$default$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerBarAnim$1$invokeSuspend$$inlined$addListener$default$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerBarAnim$1$invokeSuspend$$inlined$addListener$default$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerBarAnim$1$invokeSuspend$$inlined$addListener$default$1");
    }
}
