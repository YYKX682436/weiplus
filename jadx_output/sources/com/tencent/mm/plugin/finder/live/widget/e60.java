package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class e60 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.z60 f118230d;

    public e60(com.tencent.mm.plugin.finder.live.widget.z60 z60Var) {
        this.f118230d = z60Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        com.tencent.mm.plugin.finder.live.widget.z60 z60Var = this.f118230d;
        android.widget.LinearLayout linearLayout = z60Var.f120539m;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("contentContainer");
            throw null;
        }
        linearLayout.getLayoutParams().height = intValue;
        android.widget.LinearLayout linearLayout2 = z60Var.f120539m;
        if (linearLayout2 == null) {
            kotlin.jvm.internal.o.o("contentContainer");
            throw null;
        }
        linearLayout2.requestLayout();
        float animatedFraction = 1 - animation.getAnimatedFraction();
        android.view.View view = z60Var.f120541o;
        if (view == null) {
            kotlin.jvm.internal.o.o("tabRecyclerSeparator");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(animatedFraction));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget$animateContentDisappearance$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget$animateContentDisappearance$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
