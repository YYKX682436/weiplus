package rp1;

/* loaded from: classes3.dex */
public class g2 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rp1.h2 f398404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f398405e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f398406f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rp1.k2 f398407g;

    public g2(rp1.k2 k2Var, rp1.h2 h2Var, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view) {
        this.f398407g = k2Var;
        this.f398404d = h2Var;
        this.f398405e = viewPropertyAnimator;
        this.f398406f = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f398405e.setListener(null);
        android.view.View view = this.f398406f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator$8", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator$8", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = this.f398406f;
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        rp1.h2 h2Var = this.f398404d;
        androidx.recyclerview.widget.k3 k3Var = h2Var.f398412b;
        rp1.k2 k2Var = this.f398407g;
        k2Var.h(k3Var);
        k2Var.f398464r.remove(h2Var.f398412b);
        k2Var.E();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        androidx.recyclerview.widget.k3 k3Var = this.f398404d.f398412b;
        this.f398407g.getClass();
    }
}
