package oh2;

/* loaded from: classes10.dex */
public final class c implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oh2.d f345342d;

    public c(oh2.d dVar) {
        this.f345342d = dVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this.f345342d.f345359q = ((java.lang.Float) animatedValue).floatValue();
    }
}
