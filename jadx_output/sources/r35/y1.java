package r35;

/* loaded from: classes11.dex */
public class y1 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r35.e2 f369327d;

    public y1(r35.z1 z1Var, r35.e2 e2Var) {
        this.f369327d = e2Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        r35.e2 e2Var = this.f369327d;
        if (e2Var != null) {
            e2Var.a();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        r35.e2 e2Var = this.f369327d;
        if (e2Var != null) {
            e2Var.a();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
