package rh4;

/* loaded from: classes3.dex */
public class f extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f395716d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f395717e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f395718f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f395719g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f395720h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ rh4.k f395721i;

    public f(rh4.k kVar, androidx.recyclerview.widget.k3 k3Var, int i17, android.view.View view, int i18, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f395721i = kVar;
        this.f395716d = k3Var;
        this.f395717e = i17;
        this.f395718f = view;
        this.f395719g = i18;
        this.f395720h = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        int i17 = this.f395717e;
        android.view.View view = this.f395718f;
        if (i17 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f395719g != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f395720h.setListener(null);
        rh4.k kVar = this.f395721i;
        androidx.recyclerview.widget.k3 k3Var = this.f395716d;
        kVar.x(k3Var);
        kVar.f395756p.remove(k3Var);
        kVar.E();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f395721i.A(this.f395716d);
    }
}
