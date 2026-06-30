package ht2;

/* loaded from: classes2.dex */
public final class q implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f284892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f284893e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f284894f;

    public q(yz5.a aVar, yz5.a aVar2, android.widget.TextView textView) {
        this.f284892d = aVar;
        this.f284893e = aVar2;
        this.f284894f = textView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f284893e.invoke();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f284892d.invoke();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.widget.TextView textView = this.f284894f;
        if (textView != null) {
            textView.setVisibility(0);
        }
        if (textView == null || (animate = textView.animate()) == null || (alpha = animate.alpha(1.0f)) == null) {
            return;
        }
        alpha.start();
    }
}
