package tk4;

/* loaded from: classes5.dex */
public final class y implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f420018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tk4.c0 f420019e;

    public y(android.view.View view, tk4.c0 c0Var) {
        this.f420018d = view;
        this.f420019e = c0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        android.view.View view = this.f420018d;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.WindowManager.LayoutParams layoutParams2 = layoutParams instanceof android.view.WindowManager.LayoutParams ? (android.view.WindowManager.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            java.lang.Object animatedValue = animator.getAnimatedValue();
            kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams2.y = ((java.lang.Integer) animatedValue).intValue();
            android.view.ViewManager viewManager = this.f420019e.f419963a;
            if (viewManager != null) {
                viewManager.updateViewLayout(view, layoutParams2);
            }
        }
    }
}
