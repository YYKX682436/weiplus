package xb4;

/* loaded from: classes4.dex */
public class w0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xb4.z0 f452998d;

    public w0(xb4.z0 z0Var) {
        this.f452998d = z0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdBackAnimation$1");
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue != 0.0f) {
            xb4.z0 z0Var = this.f452998d;
            xb4.z0.b(z0Var).F0.setScaleX(floatValue);
            xb4.z0.b(z0Var).F0.setScaleY(floatValue);
            xb4.z0.b(z0Var).F0.setAlpha(floatValue);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdBackAnimation$1");
    }
}
