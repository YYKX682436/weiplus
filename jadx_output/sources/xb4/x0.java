package xb4;

/* loaded from: classes4.dex */
public class x0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xb4.z0 f452999d;

    public x0(xb4.z0 z0Var) {
        this.f452999d = z0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdBackAnimation$2");
        if (!xb4.z0.b(this.f452999d).f169303w0) {
            xb4.z0.b(this.f452999d).f169303w0 = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdBackAnimation$2");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SlideFullCardItemAdBackAnimation", "holder is busy");
        xb4.z0 z0Var = this.f452999d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdBackAnimation");
        android.animation.AnimatorSet animatorSet = z0Var.f453005c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdBackAnimation");
        java.util.Iterator<android.animation.Animator> it = animatorSet.getChildAnimations().iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdBackAnimation$2");
    }
}
