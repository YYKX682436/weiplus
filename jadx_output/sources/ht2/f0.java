package ht2;

/* loaded from: classes2.dex */
public final class f0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ht2.y0 f284826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f284827e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f284828f;

    public f0(ht2.y0 y0Var, android.view.View view, android.view.View view2) {
        this.f284826d = y0Var;
        this.f284827e = view;
        this.f284828f = view2;
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
        this.f284826d.Ai(this.f284827e, this.f284828f);
    }
}
