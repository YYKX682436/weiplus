package xb4;

/* loaded from: classes4.dex */
public class p0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u74.d f452975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xb4.s0 f452976e;

    public p0(xb4.s0 s0Var, u74.d dVar) {
        this.f452976e = s0Var;
        this.f452975d = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdClickAnimationNew$2");
        if (!this.f452975d.T.f425134d) {
            this.f452975d.T.f425134d = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdClickAnimationNew$2");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FullCardAnim.click", "holder is busy");
        xb4.s0 s0Var = this.f452976e;
        s0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("endAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdClickAnimationNew");
        android.animation.AnimatorSet animatorSet = s0Var.f452984c;
        if (animatorSet != null) {
            animatorSet.end();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("endAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdClickAnimationNew");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdClickAnimationNew$2");
    }
}
