package xb4;

/* loaded from: classes4.dex */
public class z implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xb4.d0 f453003d;

    public z(xb4.d0 d0Var) {
        this.f453003d = d0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdBackAnimation$1");
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue != 0.0f) {
            xb4.d0 d0Var = this.f453003d;
            xb4.d0.b(d0Var).E0.setScaleX(floatValue);
            xb4.d0.b(d0Var).E0.setScaleY(floatValue);
            xb4.d0.b(d0Var).E0.setAlpha(floatValue);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdBackAnimation$1");
    }
}
