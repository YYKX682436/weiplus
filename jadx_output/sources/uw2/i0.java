package uw2;

/* loaded from: classes3.dex */
public final class i0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw2.k0 f431678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f431679e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f431680f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f431681g;

    public i0(uw2.k0 k0Var, androidx.recyclerview.widget.k3 k3Var, android.view.View view, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f431678d = k0Var;
        this.f431679e = k3Var;
        this.f431680f = view;
        this.f431681g = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        onAnimationEnd(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        rs.l.a(this.f431680f);
        this.f431681g.setListener(null);
        uw2.k0 k0Var = this.f431678d;
        androidx.recyclerview.widget.k3 k3Var = this.f431679e;
        k0Var.h(k3Var);
        k0Var.f399283o.remove(k3Var);
        k0Var.G();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        this.f431678d.getClass();
    }
}
