package n3;

/* loaded from: classes15.dex */
public class a2 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n3.c2 f334322d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f334323e;

    public a2(n3.z1 z1Var, n3.c2 c2Var, android.view.View view) {
        this.f334322d = c2Var;
        this.f334323e = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f334322d.a(this.f334323e);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f334322d.b(this.f334323e);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f334322d.c(this.f334323e);
    }
}
