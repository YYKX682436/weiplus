package u4;

/* loaded from: classes13.dex */
public class x0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.transition.Transition f424578d;

    public x0(androidx.transition.Transition transition) {
        this.f424578d = transition;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f424578d.p();
        animator.removeListener(this);
    }
}
