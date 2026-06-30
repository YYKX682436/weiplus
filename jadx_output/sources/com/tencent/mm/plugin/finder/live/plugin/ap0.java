package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes2.dex */
public final class ap0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f111926d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f111927e;

    public ap0(android.view.View view, android.graphics.Rect rect) {
        this.f111926d = view;
        this.f111927e = rect;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        float f17 = (floatValue - 0.3f) / 0.7f;
        android.view.View view = this.f111926d;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        android.graphics.Rect rect = this.f111927e;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = (int) (-((1 - f17) * rect.top));
        }
        view.setTranslationX((1 - f17) * rect.left);
        view.setScaleX(floatValue);
        view.setScaleY(floatValue);
        view.requestLayout();
    }
}
