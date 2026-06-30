package fa;

/* loaded from: classes15.dex */
public class y extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fa.a0 f260651d;

    public y(fa.a0 a0Var) {
        this.f260651d = a0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        fa.a0 a0Var = this.f260651d;
        if (a0Var.f260576b == animator) {
            a0Var.f260576b = null;
        }
    }
}
