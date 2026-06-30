package tk4;

/* loaded from: classes5.dex */
public final class r implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.WindowManager.LayoutParams f420006d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tk4.c0 f420007e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f420008f;

    public r(android.view.WindowManager.LayoutParams layoutParams, tk4.c0 c0Var, android.view.View view) {
        this.f420006d = layoutParams;
        this.f420007e = c0Var;
        this.f420008f = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        android.view.WindowManager.LayoutParams layoutParams = this.f420006d;
        layoutParams.y = intValue;
        android.view.ViewManager viewManager = this.f420007e.f419963a;
        if (viewManager != null) {
            viewManager.updateViewLayout(this.f420008f, layoutParams);
        }
    }
}
