package vo1;

/* loaded from: classes2.dex */
public final class a implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f438494d;

    public a(android.view.View view) {
        this.f438494d = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        android.view.View view = this.f438494d;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.height = ((java.lang.Integer) animatedValue).intValue();
        view.requestLayout();
    }
}
