package uw2;

/* loaded from: classes2.dex */
public final class f implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PathMeasure f431662d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float[] f431663e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f431664f;

    public f(android.graphics.PathMeasure pathMeasure, float[] fArr, android.view.View view) {
        this.f431662d = pathMeasure;
        this.f431663e = fArr;
        this.f431664f = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        android.graphics.PathMeasure pathMeasure = this.f431662d;
        float[] fArr = this.f431663e;
        pathMeasure.getPosTan(floatValue, fArr, null);
        float f17 = fArr[0];
        android.view.View view = this.f431664f;
        view.setTranslationX(f17);
        view.setTranslationY(fArr[1]);
    }
}
