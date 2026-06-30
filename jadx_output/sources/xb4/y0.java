package xb4;

/* loaded from: classes4.dex */
public class y0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xb4.z0 f453002d;

    public y0(xb4.z0 z0Var) {
        this.f453002d = z0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdBackAnimation$3");
        com.tencent.mars.xlog.Log.i("MicroMsg.SlideFullCardItemAdBackAnimation", "onAnimation end");
        xb4.z0.b(this.f453002d).F0.setScaleX(1.0f);
        xb4.z0.b(this.f453002d).F0.setScaleY(1.0f);
        xb4.z0.b(this.f453002d).F0.setAlpha(1.0f);
        xb4.x xVar = this.f453002d.f452997a;
        if (xVar != null) {
            xVar.onAnimationEnd();
        }
        xb4.z0.b(this.f453002d).f169303w0 = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdBackAnimation$3");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdBackAnimation$3");
        com.tencent.mars.xlog.Log.i("MicroMsg.SlideFullCardItemAdBackAnimation", "onAnimation start");
        xb4.x xVar = this.f453002d.f452997a;
        if (xVar != null) {
            xVar.onAnimationStart();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdBackAnimation$3");
    }
}
