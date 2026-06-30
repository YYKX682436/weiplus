package qh2;

/* loaded from: classes5.dex */
public final class f implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qh2.i f363441d;

    public f(qh2.i iVar) {
        this.f363441d = iVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        qh2.i iVar = this.f363441d;
        android.view.ViewGroup giftRootView = iVar.getGiftRootView();
        if (giftRootView != null) {
            giftRootView.setAlpha(floatValue);
        }
        android.view.ViewGroup giftRootView2 = iVar.getGiftRootView();
        if (giftRootView2 == null) {
            return;
        }
        giftRootView2.setTranslationX(i65.a.b(iVar.getContext(), 32) * floatValue);
    }
}
