package k23;

/* loaded from: classes12.dex */
public final class g implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k23.q f303572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f303573e;

    public g(k23.q qVar, android.animation.ValueAnimator valueAnimator) {
        this.f303572d = qVar;
        this.f303573e = valueAnimator;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.transvoice.ui.SoundWaveView e17 = this.f303572d.getVb().e();
        java.lang.Object animatedValue = this.f303573e.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        e17.setAlpha(((java.lang.Float) animatedValue).floatValue());
    }
}
