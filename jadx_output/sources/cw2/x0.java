package cw2;

/* loaded from: classes2.dex */
public final class x0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout f224101d;

    public x0(com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout finderFeedNewSeekBarLayout) {
        this.f224101d = finderFeedNewSeekBarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout finderFeedNewSeekBarLayout = this.f224101d;
        android.view.View loadingView = finderFeedNewSeekBarLayout.getLoadingView();
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(floatValue));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(loadingView, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/FinderFeedNewSeekBarLayout$showLoading$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        loadingView.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(loadingView, "com/tencent/mm/plugin/finder/video/FinderFeedNewSeekBarLayout$showLoading$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        finderFeedNewSeekBarLayout.getLoadingView().requestLayout();
    }
}
