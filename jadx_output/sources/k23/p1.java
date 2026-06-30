package k23;

/* loaded from: classes12.dex */
public final class p1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k23.j2 f303650d;

    public p1(k23.j2 j2Var) {
        this.f303650d = j2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this.f303650d.getStartBtn().setBackgroundColor(((java.lang.Integer) animatedValue).intValue());
    }
}
