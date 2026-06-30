package lg2;

/* loaded from: classes10.dex */
public abstract class d extends lg2.a implements kg2.b {

    /* renamed from: p, reason: collision with root package name */
    public ig2.n f318569p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f318570q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f318571r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.FrameLayout f318572s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.widget.RoundedCornerFrameLayout f318573t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.ViewGroup f318574u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public ig2.g b() {
        return (ig2.g) z();
    }

    public ig2.j d() {
        return (ig2.j) z();
    }

    @Override // kg2.b
    public void e(ig2.n switchLiveParams) {
        kotlin.jvm.internal.o.g(switchLiveParams, "switchLiveParams");
        this.f318569p = switchLiveParams;
        this.f318570q = switchLiveParams.f291405d;
        l();
    }

    @Override // ez2.b
    public void g(yz5.a onAnimationEndCallback) {
        kotlin.jvm.internal.o.g(onAnimationEndCallback, "onAnimationEndCallback");
        u(onAnimationEndCallback);
    }

    @Override // ez2.b
    public void h() {
        android.animation.AnimatorSet animatorSet = this.f318564o;
        if (animatorSet != null) {
            animatorSet.pause();
        }
        p();
    }

    @Override // kg2.b
    public boolean i() {
        return this.f318571r;
    }

    @Override // lg2.a
    public void k() {
        android.view.View view = this.f318570q;
        android.view.View rootView = view != null ? view.getRootView() : null;
        this.f318574u = rootView instanceof android.view.ViewGroup ? (android.view.ViewGroup) rootView : null;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(this.f318558f, this.f318559g);
        android.view.ViewGroup viewGroup = this.f318574u;
        if (viewGroup != null) {
            viewGroup.addView(this.f318572s, layoutParams);
        }
        this.f318571r = false;
    }

    @Override // lg2.a
    public android.graphics.Rect n() {
        return qg2.d.c(qg2.d.f362793a, z(), null, 2, null);
    }

    @Override // lg2.a
    public android.view.View o() {
        android.content.Context context = this.f318556d;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        this.f318572s = frameLayout;
        frameLayout.setTag("fluent_view_tag");
        android.widget.FrameLayout frameLayout2 = this.f318572s;
        if (frameLayout2 != null) {
            ((zy2.c8) i95.n0.c(zy2.c8.class)).getClass();
            frameLayout2.setTag(com.tencent.mm.R.id.fo8, java.lang.Long.valueOf(z().f291403b));
        }
        android.widget.FrameLayout frameLayout3 = this.f318572s;
        if (frameLayout3 != null) {
            frameLayout3.setBackground(context.getResources().getDrawable(w()));
        }
        android.widget.FrameLayout frameLayout4 = this.f318572s;
        if (frameLayout4 != null) {
            frameLayout4.setOnTouchListener(new lg2.c(this));
        }
        this.f318573t = new com.tencent.mm.ui.widget.RoundedCornerFrameLayout(context);
        v();
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(q().width(), q().height());
        layoutParams.leftMargin = q().left;
        layoutParams.topMargin = q().top;
        android.widget.FrameLayout frameLayout5 = this.f318572s;
        if (frameLayout5 != null) {
            frameLayout5.addView(this.f318573t, layoutParams);
        }
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = this.f318573t;
        kotlin.jvm.internal.o.d(roundedCornerFrameLayout);
        return roundedCornerFrameLayout;
    }

    public abstract void v();

    public int w() {
        return c92.g.f39738a.b() ? com.tencent.mm.R.color.UN_BW_0_Alpha_0_3 : com.tencent.mm.R.color.BW_100_Alpha_0_3;
    }

    public final ig2.n z() {
        ig2.n nVar = this.f318569p;
        if (nVar != null) {
            return nVar;
        }
        kotlin.jvm.internal.o.o("transitionParams");
        throw null;
    }
}
