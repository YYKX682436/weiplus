package ym5;

/* loaded from: classes11.dex */
public final class l5 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.SmoothLinearLayout f463433d;

    public l5(com.tencent.mm.view.SmoothLinearLayout smoothLinearLayout) {
        this.f463433d = smoothLinearLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        ym5.k5 onSmoothHeightChangeListener;
        kotlin.jvm.internal.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        com.tencent.mm.view.SmoothLinearLayout v17 = this.f463433d;
        int i17 = intValue - v17.f213491g;
        v17.f213491g = intValue;
        if (i17 > 0 && (onSmoothHeightChangeListener = v17.getOnSmoothHeightChangeListener()) != null) {
            kotlin.jvm.internal.o.g(v17, "v");
            ((af5.x0) onSmoothHeightChangeListener).f4655a.invoke(v17, java.lang.Integer.valueOf(i17));
        }
        v17.requestLayout();
    }
}
