package ox2;

/* loaded from: classes2.dex */
public final class i0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.r6 f349671d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f349672e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f349673f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f349674g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f349675h;

    public i0(zy2.r6 r6Var, android.view.ViewGroup viewGroup, android.view.View view, com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 s0Var) {
        this.f349671d = r6Var;
        this.f349672e = viewGroup;
        this.f349673f = view;
        this.f349674g = qeVar;
        this.f349675h = s0Var;
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
        this.f349671d.getClass();
        android.view.ViewGroup viewGroup = this.f349672e;
        android.view.View view = this.f349673f;
        viewGroup.addView(view);
        view.post(new ox2.n0(view, this.f349674g, this.f349675h));
        if (view instanceof com.tencent.mm.view.MMPAGView) {
            ((com.tencent.mm.view.MMPAGView) view).g();
        }
    }
}
