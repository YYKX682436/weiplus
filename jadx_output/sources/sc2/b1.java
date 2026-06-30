package sc2;

/* loaded from: classes2.dex */
public final class b1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f405774d;

    public b1(sc2.h1 h1Var) {
        this.f405774d = h1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        sc2.h1 h1Var = this.f405774d;
        android.view.View view = h1Var.X;
        android.view.ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        if (layoutParams != null) {
            java.lang.Object animatedValue = it.getAnimatedValue();
            kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.width = ((java.lang.Integer) animatedValue).intValue();
        }
        android.view.View view2 = h1Var.X;
        if (view2 != null) {
            view2.requestLayout();
        }
    }
}
