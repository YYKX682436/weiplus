package ym5;

/* loaded from: classes5.dex */
public final class a5 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RingProgressView f463197d;

    public a5(com.tencent.mm.view.RingProgressView ringProgressView) {
        this.f463197d = ringProgressView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        float intValue = ((java.lang.Integer) animatedValue).intValue();
        com.tencent.mm.view.RingProgressView ringProgressView = this.f463197d;
        ringProgressView.f213459o = intValue;
        ringProgressView.invalidate();
    }
}
