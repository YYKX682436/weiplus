package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class u implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.k0 f116702d;

    public u(com.tencent.mm.plugin.finder.live.view.k0 k0Var) {
        this.f116702d = k0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        com.tencent.mm.plugin.finder.live.view.k0.dispatchValueAnimator$default(this.f116702d, ((java.lang.Float) animatedValue).floatValue(), false, 2, null);
    }
}
