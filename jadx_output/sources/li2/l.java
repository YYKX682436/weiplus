package li2;

/* loaded from: classes10.dex */
public final class l implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ li2.o f318768d;

    public l(li2.o oVar) {
        this.f318768d = oVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        li2.o oVar = this.f318768d;
        android.view.ViewGroup giftRootView = oVar.getGiftRootView();
        if (giftRootView != null) {
            giftRootView.setAlpha(floatValue);
        }
        android.view.ViewGroup giftRootView2 = oVar.getGiftRootView();
        if (giftRootView2 == null) {
            return;
        }
        giftRootView2.setTranslationX(i65.a.b(oVar.getContext(), 12) * floatValue);
    }
}
