package zm5;

/* loaded from: classes3.dex */
public final class x implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zm5.f0 f474284d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f474285e;

    public x(zm5.f0 f0Var, int i17) {
        this.f474284d = f0Var;
        this.f474285e = i17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        kotlin.jvm.internal.o.g(valueAnimator, "valueAnimator");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        zm5.f0 f0Var = this.f474284d;
        if (floatValue <= 0.1f) {
            f0Var.Q6().setAlpha(10 * floatValue);
        } else if (floatValue >= 0.9f) {
            f0Var.Q6().setAlpha((1.0f - floatValue) * 10);
        }
        f0Var.Q6().setTranslationY(floatValue * (this.f474285e - f0Var.Q6().getHeight()));
    }
}
