package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class r4 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer f116628d;

    public r4(com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer finderLiveFloatContainer) {
        this.f116628d = finderLiveFloatContainer;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer finderLiveFloatContainer = this.f116628d;
        android.view.ViewGroup.LayoutParams layoutParams = finderLiveFloatContainer.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(((java.lang.Integer) animatedValue).intValue());
        yz5.a onAnimCallback = finderLiveFloatContainer.getOnAnimCallback();
        if (onAnimCallback != null) {
            onAnimCallback.invoke();
        }
        finderLiveFloatContainer.requestLayout();
    }
}
