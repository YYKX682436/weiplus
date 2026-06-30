package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class l implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.k0 f116447d;

    public l(com.tencent.mm.plugin.finder.live.view.k0 k0Var) {
        this.f116447d = k0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this.f116447d.m(((java.lang.Float) animatedValue).floatValue(), true);
    }
}
