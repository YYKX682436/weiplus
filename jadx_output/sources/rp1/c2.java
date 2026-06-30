package rp1;

/* loaded from: classes3.dex */
public class c2 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f398366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f398367e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f398368f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rp1.k2 f398369g;

    public c2(rp1.k2 k2Var, androidx.recyclerview.widget.k3 k3Var, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view) {
        this.f398369g = k2Var;
        this.f398366d = k3Var;
        this.f398367e = viewPropertyAnimator;
        this.f398368f = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f398367e.setListener(null);
        android.view.View view = this.f398368f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        rp1.k2 k2Var = this.f398369g;
        androidx.recyclerview.widget.k3 k3Var = this.f398366d;
        k2Var.y(k3Var);
        k2Var.f398463q.remove(k3Var);
        k2Var.E();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f398369g.C(this.f398366d);
    }
}
