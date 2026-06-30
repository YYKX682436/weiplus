package hg5;

/* loaded from: classes8.dex */
public final class f implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hg5.j f281408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f281409e;

    public f(hg5.j jVar, float f17) {
        this.f281408d = jVar;
        this.f281409e = f17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f281408d.f281426f = this.f281409e;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }
}
