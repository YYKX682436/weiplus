package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class z4 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainerV2 f116852d;

    public z4(com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainerV2 finderLiveFloatContainerV2) {
        this.f116852d = finderLiveFloatContainerV2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        this.f116852d.setAlpha(f17 != null ? f17.floatValue() : 0.0f);
    }
}
