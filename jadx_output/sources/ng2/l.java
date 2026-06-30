package ng2;

/* loaded from: classes10.dex */
public final class l implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ng2.s f336972d;

    public l(ng2.s sVar) {
        this.f336972d = sVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        android.widget.FrameLayout frameLayout = this.f336972d.f318572s;
        if (frameLayout != null) {
            java.lang.Object animatedValue = it.getAnimatedValue();
            kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            frameLayout.setBackgroundColor(((java.lang.Integer) animatedValue).intValue());
        }
    }
}
