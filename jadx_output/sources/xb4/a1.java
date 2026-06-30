package xb4;

/* loaded from: classes4.dex */
public class a1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xb4.d1 f452913d;

    public a1(xb4.d1 d1Var) {
        this.f452913d = d1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdClickAnimation$1");
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue != 1.0f) {
            xb4.d1 d1Var = this.f452913d;
            xb4.d1.b(d1Var).F0.setScaleX(floatValue);
            xb4.d1.b(d1Var).F0.setScaleY(floatValue);
            xb4.d1.b(d1Var).F0.setAlpha(floatValue);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdClickAnimation$1");
    }
}
