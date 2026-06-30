package fc3;

/* loaded from: classes5.dex */
public final class q implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f261072d;

    public q(java.util.List list) {
        this.f261072d = list;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        for (fc3.k kVar : this.f261072d) {
            android.widget.TextView textView = kVar.f261054e;
            if (textView != null) {
                kotlin.jvm.internal.o.d(textView);
                java.lang.Object animatedValue = it.getAnimatedValue();
                kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                textView.setAlpha(kVar.f261053d * ((java.lang.Float) animatedValue).floatValue());
            }
        }
    }
}
