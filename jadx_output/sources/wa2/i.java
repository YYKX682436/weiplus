package wa2;

/* loaded from: classes3.dex */
public final class i implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wa2.n0 f444126d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f444127e;

    public i(wa2.n0 n0Var, float f17) {
        this.f444126d = n0Var;
        this.f444127e = f17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        android.view.View bgView = this.f444126d.getBgView();
        float min = java.lang.Math.min(this.f444127e, 1.0f - it.getAnimatedFraction());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(min));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(bgView, arrayList.toArray(), "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$exitAnimation$1$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        bgView.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(bgView, "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$exitAnimation$1$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
