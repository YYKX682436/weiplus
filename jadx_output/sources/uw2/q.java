package uw2;

/* loaded from: classes2.dex */
public final class q implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f431705d;

    public q(android.view.View view) {
        this.f431705d = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue("scale");
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        java.lang.Object animatedValue2 = it.getAnimatedValue("alpha");
        kotlin.jvm.internal.o.e(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        float floatValue2 = ((java.lang.Float) animatedValue2).floatValue();
        android.view.View view = this.f431705d;
        view.setScaleX(floatValue);
        view.setScaleY(floatValue);
        android.view.View view2 = this.f431705d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(floatValue2));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/animation/FinderViewAnimationLogic$getLikeIconAppearAnimator$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/view/animation/FinderViewAnimationLogic$getLikeIconAppearAnimator$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
