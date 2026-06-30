package jq4;

/* loaded from: classes3.dex */
public final class i0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.WindowManager.LayoutParams f301155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jq4.z0 f301156e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f301157f;

    public i0(android.view.WindowManager.LayoutParams layoutParams, jq4.z0 z0Var, android.view.View view) {
        this.f301155d = layoutParams;
        this.f301156e = z0Var;
        this.f301157f = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        android.view.WindowManager.LayoutParams layoutParams = this.f301155d;
        layoutParams.y = intValue;
        android.view.ViewManager viewManager = this.f301156e.f301235d;
        if (viewManager != null) {
            viewManager.updateViewLayout(this.f301157f, layoutParams);
        }
    }
}
