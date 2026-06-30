package vo1;

/* loaded from: classes3.dex */
public final class i implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f438521d;

    public i(android.view.View view) {
        this.f438521d = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        android.view.View view = this.f438521d;
        int width = view.getWidth();
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        view.setClipBounds(new android.graphics.Rect(0, 0, width, ((java.lang.Integer) animatedValue).intValue()));
    }
}
