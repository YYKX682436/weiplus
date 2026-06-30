package vw2;

/* loaded from: classes2.dex */
public final class j implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f440853d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f440854e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f440855f;

    public j(android.view.View view, int i17, android.widget.TextView textView) {
        this.f440853d = view;
        this.f440854e = i17;
        this.f440855f = textView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        android.view.View view = this.f440853d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(floatValue));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/animation/btncarousel/ToolbarButtonCarouselAnimationHelper$getSingleButtonEduAnimator$disappearAnimator$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/animation/btncarousel/ToolbarButtonCarouselAnimationHelper$getSingleButtonEduAnimator$disappearAnimator$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        float f17 = 1.0f - floatValue;
        int i17 = this.f440854e;
        this.f440853d.setTranslationY((-i17) * f17);
        android.widget.TextView textView = this.f440855f;
        textView.setAlpha(f17);
        textView.setTranslationY(f17 * (-i17));
    }
}
