package rp1;

/* loaded from: classes3.dex */
public class d2 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f398380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f398381e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f398382f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rp1.k2 f398383g;

    public d2(rp1.k2 k2Var, androidx.recyclerview.widget.k3 k3Var, android.view.View view, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f398383g = k2Var;
        this.f398380d = k3Var;
        this.f398381e = view;
        this.f398382f = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        android.view.View view = this.f398381e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator$5", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator$5", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f398382f.setListener(null);
        rp1.k2 k2Var = this.f398383g;
        androidx.recyclerview.widget.k3 k3Var = this.f398380d;
        k2Var.h(k3Var);
        k2Var.f398461o.remove(k3Var);
        k2Var.E();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f398383g.getClass();
    }
}
