package hr3;

/* loaded from: classes3.dex */
public final class pd implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup.LayoutParams f283885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hr3.rd f283886e;

    public pd(android.view.ViewGroup.LayoutParams layoutParams, hr3.rd rdVar) {
        this.f283885d = layoutParams;
        this.f283886e = rdVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        android.view.ViewGroup.LayoutParams layoutParams = this.f283885d;
        layoutParams.height = intValue;
        ((android.widget.LinearLayout) ((jz5.n) this.f283886e.f283950d).getValue()).setLayoutParams(layoutParams);
    }
}
