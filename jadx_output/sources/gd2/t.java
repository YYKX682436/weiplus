package gd2;

/* loaded from: classes3.dex */
public final class t implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gd2.x f270558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f270559e;

    public t(gd2.x xVar, int i17) {
        this.f270558d = xVar;
        this.f270559e = i17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        kotlin.jvm.internal.o.g(valueAnimator, "valueAnimator");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        gd2.x xVar = this.f270558d;
        if (floatValue <= 0.1f) {
            android.widget.ImageView imageView = xVar.f270573j;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("scanLine");
                throw null;
            }
            imageView.setAlpha(10 * floatValue);
        } else if (floatValue >= 0.9f) {
            android.widget.ImageView imageView2 = xVar.f270573j;
            if (imageView2 == null) {
                kotlin.jvm.internal.o.o("scanLine");
                throw null;
            }
            imageView2.setAlpha((1.0f - floatValue) * 10);
        }
        android.widget.ImageView imageView3 = xVar.f270573j;
        if (imageView3 == null) {
            kotlin.jvm.internal.o.o("scanLine");
            throw null;
        }
        if (imageView3 == null) {
            kotlin.jvm.internal.o.o("scanLine");
            throw null;
        }
        imageView3.setTranslationY(floatValue * (this.f270559e - imageView3.getHeight()));
    }
}
