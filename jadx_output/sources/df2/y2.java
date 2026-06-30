package df2;

/* loaded from: classes.dex */
public final class y2 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public boolean f231844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f231845e;

    public y2(yz5.a aVar) {
        this.f231845e = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator a17) {
        kotlin.jvm.internal.o.g(a17, "a");
        this.f231844d = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator a17) {
        kotlin.jvm.internal.o.g(a17, "a");
        if (this.f231844d) {
            return;
        }
        this.f231845e.invoke();
    }
}
