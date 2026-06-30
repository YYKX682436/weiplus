package ra5;

/* loaded from: classes3.dex */
public final class a implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.Drawable f393554d;

    public a(android.graphics.drawable.Drawable drawable) {
        this.f393554d = drawable;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this.f393554d.setAlpha(255 - ((java.lang.Integer) animatedValue).intValue());
    }
}
