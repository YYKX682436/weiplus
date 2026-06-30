package e04;

/* loaded from: classes3.dex */
public abstract class i3 {
    public static final void a(android.view.View view, float f17, float f18, long j17, android.animation.Animator.AnimatorListener animatorListener) {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator interpolator;
        android.view.ViewPropertyAnimator listener;
        android.view.ViewPropertyAnimator animate2;
        android.view.ViewPropertyAnimator listener2;
        android.view.ViewPropertyAnimator updateListener;
        if (view != null && (animate2 = view.animate()) != null && (listener2 = animate2.setListener(null)) != null && (updateListener = listener2.setUpdateListener(null)) != null) {
            updateListener.cancel();
        }
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(f17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/util/ScanViewUtils", "animateAlpha", "(Landroid/view/View;FFJLandroid/animation/Animator$AnimatorListener;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/scanner/util/ScanViewUtils", "animateAlpha", "(Landroid/view/View;FFJLandroid/animation/Animator$AnimatorListener;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        if (view == null || (animate = view.animate()) == null || (alpha = animate.alpha(f18)) == null || (duration = alpha.setDuration(j17)) == null || (interpolator = duration.setInterpolator(new android.view.animation.LinearInterpolator())) == null || (listener = interpolator.setListener(animatorListener)) == null) {
            return;
        }
        listener.start();
    }

    public static final void b(android.view.View view, boolean z17, android.animation.Animator.AnimatorListener animatorListener) {
        if (view == null) {
            return;
        }
        if (z17) {
            if (!(view.getAlpha() == 0.0f)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ScanViewUtils", "animateAlpha show ignore, view: %s", view);
                return;
            }
        }
        if (!z17) {
            if (!(view.getAlpha() == 1.0f)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ScanViewUtils", "animateAlpha hide ignore, view: %s", view);
                return;
            }
        }
        e04.f3 f3Var = new e04.f3(animatorListener, view, z17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/util/ScanViewUtils", "animateAlpha", "(Landroid/view/View;ZLandroid/animation/Animator$AnimatorListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/scanner/util/ScanViewUtils", "animateAlpha", "(Landroid/view/View;ZLandroid/animation/Animator$AnimatorListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        a(view, z17 ? 0.0f : 1.0f, z17 ? 1.0f : 0.0f, 200L, f3Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final android.graphics.PointF c(android.view.View view, float f17, float f18) {
        android.graphics.PointF pointF = new android.graphics.PointF(f17, f18);
        if (view instanceof db5.f0) {
            return ((db5.f0) view).m(pointF);
        }
        return null;
    }
}
