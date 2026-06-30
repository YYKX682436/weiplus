package ym5;

/* loaded from: classes3.dex */
public final class j5 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.SmoothFrameLayout f463409d;

    public j5(com.tencent.mm.view.SmoothFrameLayout smoothFrameLayout) {
        this.f463409d = smoothFrameLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        com.tencent.mm.view.SmoothFrameLayout smoothFrameLayout = this.f463409d;
        smoothFrameLayout.f213484f = intValue;
        smoothFrameLayout.requestLayout();
    }
}
