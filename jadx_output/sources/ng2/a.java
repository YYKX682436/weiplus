package ng2;

/* loaded from: classes5.dex */
public final class a implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ng2.c f336951d;

    public a(ng2.c cVar) {
        this.f336951d = cVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        android.widget.FrameLayout frameLayout = this.f336951d.f336957s;
        if (frameLayout != null) {
            java.lang.Object animatedValue = it.getAnimatedValue();
            kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            frameLayout.setBackgroundColor(((java.lang.Integer) animatedValue).intValue());
        }
    }
}
