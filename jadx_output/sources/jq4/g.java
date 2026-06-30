package jq4;

/* loaded from: classes2.dex */
public final class g implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f301147d;

    public g(com.tencent.mm.ui.widget.imageview.WeImageView weImageView) {
        this.f301147d = weImageView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f301147d;
        java.lang.Object layoutParams = weImageView != null ? weImageView.getLayoutParams() : null;
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams ? (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            java.lang.Object animatedValue = animator.getAnimatedValue();
            kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin = ((java.lang.Integer) animatedValue).intValue();
            weImageView.setLayoutParams(layoutParams2);
        }
    }
}
