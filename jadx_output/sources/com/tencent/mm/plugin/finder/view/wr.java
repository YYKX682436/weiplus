package com.tencent.mm.plugin.finder.view;

/* loaded from: classes13.dex */
public final class wr implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.PageIndicatorView f133310d;

    public wr(com.tencent.mm.plugin.finder.view.PageIndicatorView pageIndicatorView) {
        this.f133310d = pageIndicatorView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.tencent.mm.plugin.finder.view.PageIndicatorView pageIndicatorView = this.f133310d;
        pageIndicatorView.f131558o = floatValue;
        pageIndicatorView.invalidate();
    }
}
