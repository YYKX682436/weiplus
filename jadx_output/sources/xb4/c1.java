package xb4;

/* loaded from: classes4.dex */
public class c1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xb4.d1 f452920d;

    public c1(xb4.d1 d1Var) {
        this.f452920d = d1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdClickAnimation$3");
        com.tencent.mars.xlog.Log.i("MicroMsg.SlideFullCardItemAdClickAnimation", "onAnimation end");
        xb4.d1.b(this.f452920d).F0.setScaleX(1.0f);
        xb4.d1.b(this.f452920d).F0.setScaleY(1.0f);
        xb4.d1.b(this.f452920d).F0.setAlpha(1.0f);
        xb4.x xVar = this.f452920d.f453001b;
        if (xVar != null) {
            xVar.onAnimationEnd();
        }
        xb4.d1.b(this.f452920d).f169303w0 = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdClickAnimation$3");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdClickAnimation$3");
        com.tencent.mars.xlog.Log.i("MicroMsg.SlideFullCardItemAdClickAnimation", "onAnimation start");
        xb4.x xVar = this.f452920d.f453001b;
        if (xVar != null) {
            xVar.onAnimationStart();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdClickAnimation$3");
    }
}
