package uw2;

/* loaded from: classes3.dex */
public final class l0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw2.n0 f431690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f431691e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f431692f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f431693g;

    public l0(uw2.n0 n0Var, androidx.recyclerview.widget.k3 k3Var, android.view.View view, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f431690d = n0Var;
        this.f431691e = k3Var;
        this.f431692f = view;
        this.f431693g = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        onAnimationEnd(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        rs.l.a(this.f431692f);
        this.f431693g.setListener(null);
        uw2.n0 n0Var = this.f431690d;
        androidx.recyclerview.widget.k3 k3Var = this.f431691e;
        n0Var.h(k3Var);
        n0Var.f399283o.remove(k3Var);
        n0Var.G();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        this.f431690d.getClass();
    }
}
