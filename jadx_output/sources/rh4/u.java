package rh4;

/* loaded from: classes3.dex */
public class u extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f395786d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f395787e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f395788f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rh4.b0 f395789g;

    public u(rh4.b0 b0Var, androidx.recyclerview.widget.k3 k3Var, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view) {
        this.f395789g = b0Var;
        this.f395786d = k3Var;
        this.f395787e = viewPropertyAnimator;
        this.f395788f = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f395787e.setListener(null);
        android.view.View view = this.f395788f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppItemAnimator$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppItemAnimator$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        rh4.b0 b0Var = this.f395789g;
        androidx.recyclerview.widget.k3 k3Var = this.f395786d;
        b0Var.y(k3Var);
        b0Var.f395702q.remove(k3Var);
        b0Var.E();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f395789g.C(this.f395786d);
    }
}
