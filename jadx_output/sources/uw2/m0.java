package uw2;

/* loaded from: classes3.dex */
public final class m0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw2.n0 f431695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f431696e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f431697f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f431698g;

    public m0(uw2.n0 n0Var, androidx.recyclerview.widget.k3 k3Var, android.view.View view, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f431695d = n0Var;
        this.f431696e = k3Var;
        this.f431697f = view;
        this.f431698g = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        onAnimationEnd(animation);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        rs.l.a(this.f431697f);
        this.f431698g.setListener(null);
        uw2.n0 n0Var = this.f431695d;
        androidx.recyclerview.widget.k3 k3Var = this.f431696e;
        n0Var.y(k3Var);
        n0Var.f399285q.remove(k3Var);
        n0Var.G();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        this.f431695d.C(this.f431696e);
    }
}
