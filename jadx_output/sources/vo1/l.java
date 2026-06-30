package vo1;

/* loaded from: classes3.dex */
public final class l extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vo1.q f438528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f438529e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f438530f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f438531g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f438532h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f438533i;

    public l(vo1.q qVar, androidx.recyclerview.widget.k3 k3Var, int i17, android.view.View view, int i18, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f438528d = qVar;
        this.f438529e = k3Var;
        this.f438530f = i17;
        this.f438531g = view;
        this.f438532h = i18;
        this.f438533i = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        int i17 = this.f438530f;
        android.view.View view = this.f438531g;
        if (i17 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f438532h != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        this.f438533i.setListener(null);
        vo1.q qVar = this.f438528d;
        androidx.recyclerview.widget.k3 k3Var = this.f438529e;
        qVar.x(k3Var);
        qVar.f438554p.remove(k3Var);
        qVar.E();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        this.f438528d.A(this.f438529e);
    }
}
