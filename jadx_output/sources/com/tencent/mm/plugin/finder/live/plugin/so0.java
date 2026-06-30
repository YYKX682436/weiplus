package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes2.dex */
public final class so0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f114293d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f114294e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f114295f;

    public so0(android.view.View view, android.graphics.Rect rect, android.view.View view2) {
        this.f114293d = view;
        this.f114294e = rect;
        this.f114295f = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        float f17 = (0.3f - floatValue) / 0.3f;
        android.view.View view = this.f114293d;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        android.view.View view2 = this.f114295f;
        android.graphics.Rect rect = this.f114294e;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = (int) (-(rect.top + (((view2.getHeight() * f17) * 0.3d) / 2)));
        }
        view.setTranslationX((float) (rect.left + (((f17 * view2.getWidth()) * 0.3d) / 2)));
        view.setScaleX(floatValue);
        view.setScaleY(floatValue);
        view.requestLayout();
    }
}
