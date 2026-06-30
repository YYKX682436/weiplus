package rh4;

/* loaded from: classes3.dex */
public class v extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f395790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f395791e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f395792f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rh4.b0 f395793g;

    public v(rh4.b0 b0Var, androidx.recyclerview.widget.k3 k3Var, android.view.View view, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f395793g = b0Var;
        this.f395790d = k3Var;
        this.f395791e = view;
        this.f395792f = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        android.view.View view = this.f395791e;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f395792f.setListener(null);
        rh4.b0 b0Var = this.f395793g;
        androidx.recyclerview.widget.k3 k3Var = this.f395790d;
        b0Var.h(k3Var);
        b0Var.f395700o.remove(k3Var);
        b0Var.E();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f395793g.getClass();
    }
}
