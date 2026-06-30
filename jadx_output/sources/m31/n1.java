package m31;

/* loaded from: classes9.dex */
public final class n1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m31.p1 f323171d;

    public n1(m31.p1 p1Var) {
        this.f323171d = p1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        zk1.a.a(this.f323171d.f323193t);
    }
}
