package rp1;

/* loaded from: classes3.dex */
public class e2 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f398387d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f398388e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f398389f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f398390g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f398391h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ rp1.k2 f398392i;

    public e2(rp1.k2 k2Var, androidx.recyclerview.widget.k3 k3Var, int i17, android.view.View view, int i18, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f398392i = k2Var;
        this.f398387d = k3Var;
        this.f398388e = i17;
        this.f398389f = view;
        this.f398390g = i18;
        this.f398391h = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        int i17 = this.f398388e;
        android.view.View view = this.f398389f;
        if (i17 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f398390g != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f398391h.setListener(null);
        rp1.k2 k2Var = this.f398392i;
        androidx.recyclerview.widget.k3 k3Var = this.f398387d;
        k2Var.x(k3Var);
        k2Var.f398462p.remove(k3Var);
        k2Var.E();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f398392i.A(this.f398387d);
    }
}
