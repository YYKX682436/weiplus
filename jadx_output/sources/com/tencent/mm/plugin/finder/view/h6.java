package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class h6 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f132212d;

    public h6(android.view.View view) {
        this.f132212d = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this.f132212d.setScaleX((1.8f - ((java.lang.Float) animatedValue).floatValue()) * 1.1111112f);
    }
}
