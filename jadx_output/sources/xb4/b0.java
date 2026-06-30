package xb4;

/* loaded from: classes4.dex */
public class b0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xb4.d0 f452916d;

    public b0(xb4.d0 d0Var) {
        this.f452916d = d0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdBackAnimation$3");
        xb4.d0.b(this.f452916d).F0.setAlpha(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdBackAnimation$3");
    }
}
