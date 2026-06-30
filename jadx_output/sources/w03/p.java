package w03;

/* loaded from: classes10.dex */
public final class p extends qn5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w03.u f441898d;

    public p(w03.u uVar) {
        this.f441898d = uVar;
    }

    @Override // qn5.a
    public void a(android.animation.Animator animator) {
        super.a(animator);
        w03.u uVar = this.f441898d;
        uVar.f441905f = false;
        uVar.O6().a7(true);
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        b(animation);
        w03.u uVar = this.f441898d;
        uVar.f441905f = false;
        uVar.O6().a7(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationStart(animation);
        w03.u uVar = this.f441898d;
        uVar.O6().Z6();
        uVar.f441905f = true;
    }
}
