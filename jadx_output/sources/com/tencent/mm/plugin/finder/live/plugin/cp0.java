package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes2.dex */
public final class cp0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f112184d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f112185e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f112186f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f112187g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f112188h;

    public cp0(android.view.View view, android.graphics.Rect rect, android.view.View view2, float f17, android.view.View view3) {
        this.f112184d = view;
        this.f112185e = rect;
        this.f112186f = view2;
        this.f112187g = f17;
        this.f112188h = view3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        android.graphics.Rect rect;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        float f17 = floatValue / 0.3f;
        android.view.View view = this.f112184d;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        android.graphics.Rect rect2 = this.f112185e;
        if (marginLayoutParams != null) {
            float f18 = 1 - f17;
            marginLayoutParams.bottomMargin = -((int) (rect2.top + (this.f112187g * f18) + (((f18 * this.f112188h.getHeight()) * 0.3d) / 2)));
            rect = rect2;
        } else {
            rect = rect2;
        }
        view.setTranslationX((float) (rect.left + ((((1 - f17) * this.f112186f.getWidth()) * 0.3d) / 2)));
        view.setScaleX(floatValue);
        view.setScaleY(floatValue);
        view.requestLayout();
    }
}
