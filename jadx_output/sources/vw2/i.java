package vw2;

/* loaded from: classes2.dex */
public final class i implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f440850d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f440851e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f440852f;

    public i(android.view.View view, int i17, android.widget.TextView textView) {
        this.f440850d = view;
        this.f440851e = i17;
        this.f440852f = textView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        android.view.View view = this.f440850d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f - floatValue));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/animation/btncarousel/ToolbarButtonCarouselAnimationHelper$getSingleButtonEduAnimator$appearAnimator$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/animation/btncarousel/ToolbarButtonCarouselAnimationHelper$getSingleButtonEduAnimator$appearAnimator$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        int i17 = this.f440851e;
        this.f440850d.setTranslationY((-i17) * floatValue);
        android.widget.TextView textView = this.f440852f;
        textView.setAlpha(floatValue);
        textView.setTranslationY(floatValue * (-i17));
    }
}
