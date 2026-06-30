package rs;

/* loaded from: classes3.dex */
public class f extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f399250d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f399251e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f399252f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f399253g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f399254h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ rs.k f399255i;

    public f(rs.k kVar, androidx.recyclerview.widget.k3 k3Var, int i17, android.view.View view, int i18, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f399255i = kVar;
        this.f399250d = k3Var;
        this.f399251e = i17;
        this.f399252f = view;
        this.f399253g = i18;
        this.f399254h = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        int i17 = this.f399251e;
        android.view.View view = this.f399252f;
        if (i17 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f399253g != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f399254h.setListener(null);
        rs.k kVar = this.f399255i;
        androidx.recyclerview.widget.k3 k3Var = this.f399250d;
        kVar.x(k3Var);
        kVar.f399284p.remove(k3Var);
        kVar.G();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f399255i.A(this.f399250d);
    }
}
