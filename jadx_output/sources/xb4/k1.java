package xb4;

/* loaded from: classes4.dex */
public class k1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xb4.n1 f452957d;

    public k1(xb4.n1 n1Var) {
        this.f452957d = n1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdClickAnimation$2");
        if (!xb4.n1.b(this.f452957d).f169303w0) {
            xb4.n1.b(this.f452957d).f169303w0 = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdClickAnimation$2");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SphereCardAdClickAnimation", "holder is busy");
        xb4.n1 n1Var = this.f452957d;
        n1Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("endAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdClickAnimation");
        android.animation.AnimatorSet animatorSet = n1Var.f452969d;
        if (animatorSet != null) {
            animatorSet.end();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("endAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdClickAnimation");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdClickAnimation$2");
    }
}
