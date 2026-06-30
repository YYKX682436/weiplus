package k23;

/* loaded from: classes12.dex */
public final class j0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k23.p2 f303594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f303595e;

    public j0(k23.p2 p2Var, android.animation.ValueAnimator valueAnimator) {
        this.f303594d = p2Var;
        this.f303595e = valueAnimator;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = this.f303595e.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this.f303594d.setMarginBottomPx(((java.lang.Integer) animatedValue).intValue());
    }
}
