package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes2.dex */
public final class qo0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f114034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f114035e;

    public qo0(android.view.View view, android.graphics.Rect rect) {
        this.f114034d = view;
        this.f114035e = rect;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        float f17 = (1.0f - floatValue) / 0.7f;
        android.view.View view = this.f114034d;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        android.graphics.Rect rect = this.f114035e;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = (int) (-(rect.top * f17));
        }
        view.setTranslationX(f17 * rect.left);
        view.setScaleX(floatValue);
        view.setScaleY(floatValue);
        view.requestLayout();
    }
}
