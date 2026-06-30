package fl1;

/* loaded from: classes7.dex */
public class l0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fl1.c1 f263801d;

    public l0(fl1.c1 c1Var) {
        this.f263801d = c1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f263801d.f263738j.setVisibility(8);
    }
}
