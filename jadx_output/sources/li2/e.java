package li2;

/* loaded from: classes5.dex */
public final class e implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ li2.g f318763d;

    public e(li2.g gVar) {
        this.f318763d = gVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        li2.g gVar = this.f318763d;
        android.view.ViewGroup giftRootView = gVar.getGiftRootView();
        if (giftRootView != null) {
            giftRootView.setAlpha(floatValue);
        }
        android.view.ViewGroup giftRootView2 = gVar.getGiftRootView();
        if (giftRootView2 == null) {
            return;
        }
        giftRootView2.setTranslationX(i65.a.b(gVar.getContext(), 12) * floatValue);
    }
}
