package fl1;

/* loaded from: classes14.dex */
public class s1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f263865d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fl1.u1 f263866e;

    public s1(fl1.u1 u1Var, java.lang.Runnable runnable) {
        this.f263866e = u1Var;
        this.f263865d = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f263866e.f263877c = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        java.lang.Runnable runnable = this.f263865d;
        if (runnable != null) {
            runnable.run();
        }
        this.f263866e.f263877c = null;
    }
}
