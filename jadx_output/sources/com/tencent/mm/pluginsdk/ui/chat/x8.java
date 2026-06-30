package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes3.dex */
public final class x8 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.PaintDrawable f190748d;

    public x8(android.graphics.drawable.PaintDrawable paintDrawable) {
        this.f190748d = paintDrawable;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this.f190748d.setAlpha(((java.lang.Integer) animatedValue).intValue());
    }
}
