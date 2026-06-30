package fn2;

/* loaded from: classes10.dex */
public final class a implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn2.c f264205d;

    public a(fn2.c cVar) {
        this.f264205d = cVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        fn2.c cVar = this.f264205d;
        if (cVar.f264231d) {
            return;
        }
        android.view.View view = cVar.f264228a;
        java.lang.Object animatedValue = animator.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        view.setBackgroundColor(((java.lang.Integer) animatedValue).intValue());
    }
}
