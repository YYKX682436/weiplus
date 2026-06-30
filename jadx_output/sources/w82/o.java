package w82;

/* loaded from: classes2.dex */
public final class o implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.RoundCornerFrameLayout f443916d;

    public o(com.tencent.mm.ui.widget.RoundCornerFrameLayout roundCornerFrameLayout) {
        this.f443916d = roundCornerFrameLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        com.tencent.mm.ui.widget.RoundCornerFrameLayout roundCornerFrameLayout = this.f443916d;
        roundCornerFrameLayout.getLayoutParams().height = intValue;
        roundCornerFrameLayout.requestLayout();
    }
}
