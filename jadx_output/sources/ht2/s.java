package ht2;

/* loaded from: classes2.dex */
public final class s implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ht2.y0 f284899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f284900e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f284901f;

    public s(ht2.y0 y0Var, android.view.View view, android.view.View view2) {
        this.f284899d = y0Var;
        this.f284900e = view;
        this.f284901f = view2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f284899d.Ai(this.f284900e, this.f284901f);
    }
}
