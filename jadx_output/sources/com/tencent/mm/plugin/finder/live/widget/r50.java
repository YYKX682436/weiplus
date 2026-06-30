package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes2.dex */
public final class r50 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f119577d;

    public r50(android.widget.TextView textView) {
        this.f119577d = textView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this.f119577d.setTextColor(((java.lang.Integer) animatedValue).intValue());
    }
}
