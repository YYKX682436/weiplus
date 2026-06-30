package rh4;

/* loaded from: classes3.dex */
public class w extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f395794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f395795e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f395796f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f395797g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f395798h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ rh4.b0 f395799i;

    public w(rh4.b0 b0Var, androidx.recyclerview.widget.k3 k3Var, int i17, android.view.View view, int i18, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f395799i = b0Var;
        this.f395794d = k3Var;
        this.f395795e = i17;
        this.f395796f = view;
        this.f395797g = i18;
        this.f395798h = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        int i17 = this.f395795e;
        android.view.View view = this.f395796f;
        if (i17 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f395797g != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f395798h.setListener(null);
        rh4.b0 b0Var = this.f395799i;
        androidx.recyclerview.widget.k3 k3Var = this.f395794d;
        b0Var.x(k3Var);
        b0Var.f395701p.remove(k3Var);
        b0Var.E();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f395799i.A(this.f395794d);
    }
}
