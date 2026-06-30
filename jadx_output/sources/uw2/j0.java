package uw2;

/* loaded from: classes3.dex */
public final class j0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw2.k0 f431683d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f431684e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f431685f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f431686g;

    public j0(uw2.k0 k0Var, androidx.recyclerview.widget.k3 k3Var, android.view.View view, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f431683d = k0Var;
        this.f431684e = k3Var;
        this.f431685f = view;
        this.f431686g = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        onAnimationEnd(animation);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        rs.l.a(this.f431685f);
        this.f431686g.setListener(null);
        uw2.k0 k0Var = this.f431683d;
        androidx.recyclerview.widget.k3 k3Var = this.f431684e;
        k0Var.y(k3Var);
        k0Var.f399285q.remove(k3Var);
        k0Var.G();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        this.f431683d.C(this.f431684e);
    }
}
