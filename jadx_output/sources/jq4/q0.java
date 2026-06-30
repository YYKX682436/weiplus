package jq4;

/* loaded from: classes3.dex */
public final class q0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jq4.z0 f301187d;

    public q0(jq4.z0 z0Var) {
        this.f301187d = z0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        jq4.z0 z0Var = this.f301187d;
        android.view.View view = z0Var.f301236e;
        if (view != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            android.view.WindowManager.LayoutParams layoutParams2 = layoutParams instanceof android.view.WindowManager.LayoutParams ? (android.view.WindowManager.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                java.lang.Object animatedValue = animator.getAnimatedValue();
                kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                layoutParams2.y = ((java.lang.Integer) animatedValue).intValue();
                android.view.ViewManager viewManager = z0Var.f301235d;
                if (viewManager != null) {
                    viewManager.updateViewLayout(view, layoutParams2);
                }
            }
        }
    }
}
