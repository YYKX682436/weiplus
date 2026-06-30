package cw2;

/* loaded from: classes2.dex */
public final class w0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout f224074d;

    public w0(com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout finderFeedNewSeekBarLayout) {
        this.f224074d = finderFeedNewSeekBarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout finderFeedNewSeekBarLayout = this.f224074d;
        android.view.ViewGroup.LayoutParams layoutParams = finderFeedNewSeekBarLayout.getLoadingView().getLayoutParams();
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.width = ((java.lang.Integer) animatedValue).intValue();
        finderFeedNewSeekBarLayout.getLoadingView().requestLayout();
    }
}
