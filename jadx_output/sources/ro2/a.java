package ro2;

/* loaded from: classes2.dex */
public final class a implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f398016d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f398017e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f398018f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f398019g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f398020h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f398021i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f398022m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f398023n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.view.View f398024o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.view.View f398025p;

    public a(com.tencent.mm.plugin.finder.convert.qe qeVar, android.view.View view, in5.s0 s0Var, android.widget.FrameLayout frameLayout, com.tencent.mm.plugin.finder.convert.qe qeVar2, android.view.View view2, com.tencent.mm.view.MMPAGView mMPAGView, boolean z17, android.view.View view3, android.view.View view4) {
        this.f398016d = qeVar;
        this.f398017e = view;
        this.f398018f = s0Var;
        this.f398019g = frameLayout;
        this.f398020h = qeVar2;
        this.f398021i = view2;
        this.f398022m = mMPAGView;
        this.f398023n = z17;
        this.f398024o = view3;
        this.f398025p = view4;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f398016d.K1(this.f398017e, 8);
        ro2.r.g(this.f398018f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f398019g.setVisibility(0);
        this.f398020h.K1(this.f398021i, 0);
        this.f398022m.g();
        if (this.f398023n) {
            i95.m c17 = i95.n0.c(zy2.s6.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((ht2.y0) ((zy2.s6) c17)).Ai(this.f398024o, this.f398025p);
        }
    }
}
