package wa2;

/* loaded from: classes3.dex */
public final class l0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wa2.n0 f444139d;

    public l0(wa2.n0 n0Var) {
        this.f444139d = n0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        wa2.n0 n0Var = this.f444139d;
        android.view.View bgView = n0Var.getBgView();
        float max = java.lang.Math.max(n0Var.getBgView().getAlpha(), it.getAnimatedFraction());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(max));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(bgView, arrayList.toArray(), "com/tencent/mm/plugin/finder/animation/GestureFrameLayout$onTouchCancel$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        bgView.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(bgView, "com/tencent/mm/plugin/finder/animation/GestureFrameLayout$onTouchCancel$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
