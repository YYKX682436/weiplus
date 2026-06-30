package xb4;

/* loaded from: classes4.dex */
public class a0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xb4.d0 f452912d;

    public a0(xb4.d0 d0Var) {
        this.f452912d = d0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdBackAnimation$2");
        if (!xb4.d0.b(this.f452912d).f169303w0) {
            xb4.d0.b(this.f452912d).f169303w0 = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdBackAnimation$2");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CardAdBackAnimation", "holder is busy");
        xb4.d0 d0Var = this.f452912d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdBackAnimation");
        android.animation.AnimatorSet animatorSet = d0Var.f452926c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdBackAnimation");
        java.util.Iterator<android.animation.Animator> it = animatorSet.getChildAnimations().iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdBackAnimation$2");
    }
}
