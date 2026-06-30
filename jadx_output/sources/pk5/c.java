package pk5;

/* loaded from: classes14.dex */
public final class c extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk5.e f356546d;

    public c(pk5.e eVar) {
        this.f356546d = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        animator.removeListener(this);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        ((jz5.n) this.f356546d.f356551g).getValue();
    }
}
