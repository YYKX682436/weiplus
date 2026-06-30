package kj2;

/* loaded from: classes5.dex */
public final class q implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kj2.s f308433d;

    public q(kj2.s sVar) {
        this.f308433d = sVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        kj2.s sVar = this.f308433d;
        android.view.ViewGroup giftRootView = sVar.getGiftRootView();
        if (giftRootView != null) {
            giftRootView.setAlpha(floatValue);
        }
        android.view.ViewGroup giftRootView2 = sVar.getGiftRootView();
        if (giftRootView2 == null) {
            return;
        }
        giftRootView2.setTranslationX(i65.a.b(sVar.getContext(), 12) * floatValue);
    }
}
