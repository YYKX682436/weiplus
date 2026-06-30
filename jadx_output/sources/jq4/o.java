package jq4;

/* loaded from: classes3.dex */
public final class o implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f301176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jq4.y f301177e;

    public o(android.view.View view, jq4.y yVar) {
        this.f301176d = view;
        this.f301177e = yVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        android.view.View view = this.f301176d;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.WindowManager.LayoutParams layoutParams2 = layoutParams instanceof android.view.WindowManager.LayoutParams ? (android.view.WindowManager.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            java.lang.Object animatedValue = animator.getAnimatedValue();
            kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams2.y = ((java.lang.Integer) animatedValue).intValue();
            android.view.ViewManager viewManager = this.f301177e.f301235d;
            if (viewManager != null) {
                viewManager.updateViewLayout(view, layoutParams2);
            }
        }
    }
}
