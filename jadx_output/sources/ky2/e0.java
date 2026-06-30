package ky2;

/* loaded from: classes3.dex */
public final class e0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ky2.d0 f313529d;

    public e0(ky2.d0 d0Var) {
        this.f313529d = d0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        ky2.d0 d0Var = this.f313529d;
        android.view.ViewGroup.LayoutParams layoutParams = d0Var.f313526g.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams).N = ((java.lang.Float) animatedValue).floatValue();
        d0Var.f313526g.requestLayout();
    }
}
