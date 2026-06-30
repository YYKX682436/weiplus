package e45;

/* loaded from: classes3.dex */
public final class m implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e45.r f249412d;

    public m(e45.r rVar) {
        this.f249412d = rVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        e45.r.O6(this.f249412d, ((java.lang.Integer) animatedValue).intValue());
    }
}
