package xb4;

/* loaded from: classes4.dex */
public class f0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xb4.i0 f452934d;

    public f0(xb4.i0 i0Var) {
        this.f452934d = i0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation$2");
        if (!xb4.i0.b(this.f452934d).f169303w0) {
            xb4.i0.b(this.f452934d).f169303w0 = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation$2");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CardAdClickAnimation", "holder is busy");
        xb4.i0 i0Var = this.f452934d;
        i0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("endAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation");
        i0Var.f452945d.end();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("endAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation$2");
    }
}
