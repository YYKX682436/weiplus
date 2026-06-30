package wa2;

/* loaded from: classes3.dex */
public final class a0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewPropertyAnimator f444102d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f444103e;

    public a0(android.view.ViewPropertyAnimator animator, yz5.l callback) {
        kotlin.jvm.internal.o.g(animator, "animator");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f444102d = animator;
        this.f444103e = callback;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        this.f444103e.invoke(p07);
        this.f444102d.setListener(null);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }
}
