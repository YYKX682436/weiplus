package r50;

/* loaded from: classes5.dex */
public final class n implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r50.j0 f392605d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f392606e;

    public n(r50.j0 j0Var, int i17) {
        this.f392605d = j0Var;
        this.f392606e = i17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        ((gl5.d1) ((jz5.n) this.f392605d.f392586e).getValue()).h(this.f392606e);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
