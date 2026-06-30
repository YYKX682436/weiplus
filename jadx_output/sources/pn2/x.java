package pn2;

/* loaded from: classes3.dex */
public final class x implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pn2.c0 f357033d;

    public x(pn2.c0 c0Var) {
        this.f357033d = c0Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        pn2.c0 c0Var = this.f357033d;
        android.widget.TextView B = c0Var.B();
        if (B != null) {
            B.setVisibility(0);
        }
        c0Var.f356982r = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
