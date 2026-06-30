package pa5;

/* loaded from: classes3.dex */
public final class e implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f353102d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f353103e;

    public e(android.view.View view, float f17) {
        this.f353102d = view;
        this.f353103e = f17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        android.view.View view = this.f353102d;
        float alpha = view.getAlpha() + ((this.f353103e - view.getAlpha()) * animatedFraction);
        android.graphics.drawable.Drawable background = view.getBackground();
        if (background == null) {
            return;
        }
        background.setAlpha((int) (255 * alpha));
    }
}
