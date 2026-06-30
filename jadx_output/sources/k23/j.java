package k23;

/* loaded from: classes12.dex */
public final class j implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f303592d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k23.q f303593e;

    public j(android.animation.ValueAnimator valueAnimator, k23.q qVar) {
        this.f303592d = valueAnimator;
        this.f303593e = qVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = this.f303592d.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        k23.q qVar = this.f303593e;
        float height = qVar.getVb().a().getHeight() * 0.39999998f * (1 - floatValue);
        qVar.getVb().a().setTranslationY(height);
        qVar.getVb().b().setTranslationY(height);
    }
}
