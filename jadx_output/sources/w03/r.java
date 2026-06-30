package w03;

/* loaded from: classes10.dex */
public final class r extends qn5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w03.u f441900d;

    public r(w03.u uVar) {
        this.f441900d = uVar;
    }

    @Override // qn5.a
    public void a(android.animation.Animator animator) {
        super.a(animator);
        w03.u uVar = this.f441900d;
        uVar.f441904e = false;
        if (uVar.f441908i && uVar.f441907h) {
            uVar.Q6();
        }
        ((ku5.t0) ku5.t0.f312615d).B(new w03.t(uVar));
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        b(animation);
        w03.u uVar = this.f441900d;
        uVar.f441904e = false;
        if (uVar.f441908i && uVar.f441907h) {
            uVar.Q6();
        }
        ((ku5.t0) ku5.t0.f312615d).B(new w03.t(uVar));
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationStart(animation);
        w03.u uVar = this.f441900d;
        uVar.f441904e = true;
        uVar.O6().Z6();
    }
}
