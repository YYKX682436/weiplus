package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class b8 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveOverScrollRecyclerView f116209d;

    public b8(com.tencent.mm.plugin.finder.live.view.FinderLiveOverScrollRecyclerView finderLiveOverScrollRecyclerView) {
        this.f116209d = finderLiveOverScrollRecyclerView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this.f116209d.setTranslationY(((java.lang.Float) animatedValue).floatValue());
    }
}
