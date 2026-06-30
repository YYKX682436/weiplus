package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes2.dex */
public final class p6 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.GradientDrawable f116583d;

    public p6(android.graphics.drawable.GradientDrawable gradientDrawable) {
        this.f116583d = gradientDrawable;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this.f116583d.setColor(((java.lang.Integer) animatedValue).intValue());
    }
}
