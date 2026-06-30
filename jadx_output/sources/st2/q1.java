package st2;

/* loaded from: classes3.dex */
public final class q1 extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ st2.s1 f412427e;

    public q1(st2.s1 s1Var) {
        this.f412427e = s1Var;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        st2.s1 s1Var = this.f412427e;
        s1Var.f412448h.requestFocus();
        st2.s1.a(s1Var);
    }
}
