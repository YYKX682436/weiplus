package eg3;

/* loaded from: classes2.dex */
public final class e implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f252657d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f252658e;

    public e(android.widget.ImageView imageView, int i17) {
        this.f252657d = imageView;
        this.f252658e = i17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        kotlin.jvm.internal.o.g(valueAnimator, "valueAnimator");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        android.widget.ImageView imageView = this.f252657d;
        if (floatValue <= 0.1f) {
            imageView.setAlpha(10 * floatValue);
        } else if (floatValue >= 0.9f) {
            imageView.setAlpha((1.0f - floatValue) * 10);
        }
        imageView.setTranslationY(floatValue * (this.f252658e - imageView.getHeight()));
    }
}
