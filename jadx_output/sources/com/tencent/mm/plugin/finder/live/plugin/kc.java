package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class kc implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.nc f113213d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f113214e;

    public kc(com.tencent.mm.plugin.finder.live.plugin.nc ncVar, android.view.View view) {
        this.f113213d = ncVar;
        this.f113214e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this.f113213d.d(this.f113214e, ((java.lang.Integer) animatedValue).intValue());
    }
}
