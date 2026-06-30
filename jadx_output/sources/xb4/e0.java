package xb4;

/* loaded from: classes4.dex */
public class e0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xb4.i0 f452930d;

    public e0(xb4.i0 i0Var) {
        this.f452930d = i0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation$1");
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue != 1.0f) {
            xb4.i0 i0Var = this.f452930d;
            xb4.i0.b(i0Var).E0.setScaleX(floatValue);
            xb4.i0.b(i0Var).E0.setScaleY(floatValue);
            xb4.i0.b(i0Var).E0.setAlpha(floatValue);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation$1");
    }
}
