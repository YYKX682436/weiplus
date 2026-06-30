package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class el implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f132019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f132020e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f132021f;

    public el(android.view.View view, float f17, float f18) {
        this.f132019d = view;
        this.f132020e = f17;
        this.f132021f = f18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        android.view.View view = this.f132019d;
        float f17 = this.f132021f;
        float f18 = this.f132020e;
        float f19 = f18 + ((f17 - f18) * animatedFraction);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(f19));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderSpeedIndicatorView$createAlphaAnimator$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/FinderSpeedIndicatorView$createAlphaAnimator$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
