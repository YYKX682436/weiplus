package jn5;

/* loaded from: classes3.dex */
public final class c extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn5.i f300834d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f300835e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f300836f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f300837g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f300838h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f300839i;

    public c(jn5.i iVar, androidx.recyclerview.widget.k3 k3Var, int i17, android.view.View view, int i18, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f300834d = iVar;
        this.f300835e = k3Var;
        this.f300836f = i17;
        this.f300837g = view;
        this.f300838h = i18;
        this.f300839i = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        super.onAnimationCancel(animator);
        int i17 = this.f300836f;
        android.view.View view = this.f300837g;
        if (i17 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f300838h != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        android.view.ViewPropertyAnimator viewPropertyAnimator = this.f300839i;
        viewPropertyAnimator.setUpdateListener(null);
        viewPropertyAnimator.setListener(null);
        this.f300834d.x(this.f300835e);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        super.onAnimationStart(animator);
        this.f300834d.A(this.f300835e);
    }
}
