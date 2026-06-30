package qh2;

/* loaded from: classes5.dex */
public final class b implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qh2.d f363437d;

    public b(qh2.d dVar) {
        this.f363437d = dVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        qh2.d dVar = this.f363437d;
        android.view.ViewGroup giftRootView = dVar.getGiftRootView();
        if (giftRootView != null) {
            giftRootView.setAlpha(floatValue);
        }
        android.view.ViewGroup giftRootView2 = dVar.getGiftRootView();
        if (giftRootView2 == null) {
            return;
        }
        giftRootView2.setTranslationX(i65.a.b(dVar.getContext(), 32) * floatValue);
    }
}
