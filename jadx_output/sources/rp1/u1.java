package rp1;

/* loaded from: classes14.dex */
public class u1 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.Animator.AnimatorListener f398532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f398533e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rp1.v1 f398534f;

    public u1(rp1.v1 v1Var, android.animation.Animator.AnimatorListener animatorListener, androidx.recyclerview.widget.k3 k3Var) {
        this.f398534f = v1Var;
        this.f398532d = animatorListener;
        this.f398533e = k3Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        android.animation.Animator.AnimatorListener animatorListener = this.f398532d;
        if (animatorListener != null) {
            animatorListener.onAnimationCancel(animator);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        android.animation.Animator.AnimatorListener animatorListener = this.f398532d;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(animator);
        }
        long j17 = !qp1.w.a(this.f398534f.f398542a.f93585p) ? 0L : 200L;
        ku5.u0 u0Var = ku5.t0.f312615d;
        rp1.t1 t1Var = new rp1.t1(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(t1Var, j17, false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
        android.animation.Animator.AnimatorListener animatorListener = this.f398532d;
        if (animatorListener != null) {
            animatorListener.onAnimationRepeat(animator);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        android.animation.Animator.AnimatorListener animatorListener = this.f398532d;
        if (animatorListener != null) {
            animatorListener.onAnimationStart(animator);
        }
    }
}
