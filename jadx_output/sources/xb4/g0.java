package xb4;

/* loaded from: classes4.dex */
public class g0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xb4.i0 f452937d;

    public g0(xb4.i0 i0Var) {
        this.f452937d = i0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation$3");
        xb4.i0.b(this.f452937d).F0.setAlpha(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation$3");
    }
}
