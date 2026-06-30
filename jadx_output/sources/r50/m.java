package r50;

/* loaded from: classes5.dex */
public final class m implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup.LayoutParams f392603d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r50.j0 f392604e;

    public m(android.view.ViewGroup.LayoutParams layoutParams, r50.j0 j0Var) {
        this.f392603d = layoutParams;
        this.f392604e = j0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        android.view.ViewGroup.LayoutParams layoutParams = this.f392603d;
        layoutParams.width = intValue;
        r50.j0 j0Var = this.f392604e;
        j0Var.W6().i().setLayoutParams(layoutParams);
        j0Var.W6().i().setAlpha(intValue / ((java.lang.Number) ((jz5.n) j0Var.f392595q).getValue()).intValue());
        j0Var.W6().i().setVisibility(intValue == 0 ? 8 : 0);
    }
}
