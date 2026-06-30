package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class l4 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.BitmapDrawable f199397d;

    public l4(android.graphics.drawable.BitmapDrawable bitmapDrawable) {
        this.f199397d = bitmapDrawable;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this.f199397d.setAlpha(((java.lang.Integer) animatedValue).intValue());
    }
}
