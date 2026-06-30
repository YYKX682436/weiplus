package nx2;

/* loaded from: classes2.dex */
public final class g implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.indictor.FinderPageIndicatorView f341343d;

    public g(com.tencent.mm.plugin.finder.view.indictor.FinderPageIndicatorView finderPageIndicatorView) {
        this.f341343d = finderPageIndicatorView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.tencent.mm.plugin.finder.view.indictor.FinderPageIndicatorView finderPageIndicatorView = this.f341343d;
        finderPageIndicatorView.f132364h = floatValue;
        finderPageIndicatorView.invalidate();
    }
}
