package tk3;

/* loaded from: classes8.dex */
public final class c extends qn5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tk3.d f419911d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f419912e;

    public c(tk3.d dVar, float f17) {
        this.f419911d = dVar;
        this.f419912e = f17;
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f419911d.b(this.f419912e);
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f419911d.b(this.f419912e);
    }
}
