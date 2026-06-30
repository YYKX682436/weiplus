package mi1;

/* loaded from: classes7.dex */
public final class k1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi1.q1 f326603d;

    public k1(mi1.q1 q1Var) {
        this.f326603d = q1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        mi1.q1.b(this.f326603d);
    }
}
