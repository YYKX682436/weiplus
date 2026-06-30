package st2;

/* loaded from: classes3.dex */
public final class q extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f412425d;

    public q(st2.h1 h1Var) {
        this.f412425d = h1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f412425d.N = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        st2.h1 h1Var = this.f412425d;
        h1Var.p().setVisibility(8);
        h1Var.N = false;
    }
}
