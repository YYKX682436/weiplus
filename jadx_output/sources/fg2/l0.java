package fg2;

/* loaded from: classes10.dex */
public final class l0 implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.RelativeLayout f262117a;

    /* renamed from: b, reason: collision with root package name */
    public final fg2.r1 f262118b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f262119c;

    /* renamed from: d, reason: collision with root package name */
    public final fg2.a0 f262120d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f262121e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.FrameLayout f262122f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f262123g;

    /* renamed from: h, reason: collision with root package name */
    public final fg2.r0 f262124h;

    /* renamed from: i, reason: collision with root package name */
    public final fg2.c1 f262125i;

    /* renamed from: j, reason: collision with root package name */
    public final fg2.s0 f262126j;

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.FinderFixedTextView f262127k;

    public l0(android.widget.RelativeLayout relativeLayout, androidx.constraintlayout.widget.ConstraintLayout constraintLayout, fg2.r1 r1Var, com.tencent.mm.ui.widget.imageview.WeImageView weImageView, com.tencent.mm.plugin.finder.live.view.FinderLiveLikeContainer finderLiveLikeContainer, fg2.a0 a0Var, android.widget.TextView textView, android.widget.FrameLayout frameLayout, com.tencent.mm.ui.widget.imageview.WeImageView weImageView2, fg2.r0 r0Var, fg2.c1 c1Var, fg2.s0 s0Var, com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView, android.widget.RelativeLayout relativeLayout2) {
        this.f262117a = relativeLayout;
        this.f262118b = r1Var;
        this.f262119c = weImageView;
        this.f262120d = a0Var;
        this.f262121e = textView;
        this.f262122f = frameLayout;
        this.f262123g = weImageView2;
        this.f262124h = r0Var;
        this.f262125i = c1Var;
        this.f262126j = s0Var;
        this.f262127k = finderFixedTextView;
    }

    public static fg2.l0 a(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, boolean z17) {
        android.view.View inflate = layoutInflater.inflate(com.tencent.mm.R.layout.auq, viewGroup, false);
        if (z17) {
            viewGroup.addView(inflate);
        }
        int i17 = com.tencent.mm.R.id.che;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(inflate, com.tencent.mm.R.id.che);
        if (constraintLayout != null) {
            i17 = com.tencent.mm.R.id.eop;
            android.view.View a17 = x4.b.a(inflate, com.tencent.mm.R.id.eop);
            if (a17 != null) {
                fg2.r1 a18 = fg2.r1.a(a17);
                i17 = com.tencent.mm.R.id.tig;
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(inflate, com.tencent.mm.R.id.tig);
                if (weImageView != null) {
                    i17 = com.tencent.mm.R.id.tka;
                    com.tencent.mm.plugin.finder.live.view.FinderLiveLikeContainer finderLiveLikeContainer = (com.tencent.mm.plugin.finder.live.view.FinderLiveLikeContainer) x4.b.a(inflate, com.tencent.mm.R.id.tka);
                    if (finderLiveLikeContainer != null) {
                        i17 = com.tencent.mm.R.id.f8q;
                        android.view.View a19 = x4.b.a(inflate, com.tencent.mm.R.id.f8q);
                        if (a19 != null) {
                            fg2.a0 a27 = fg2.a0.a(a19);
                            i17 = com.tencent.mm.R.id.fa_;
                            android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.fa_);
                            if (textView != null) {
                                i17 = com.tencent.mm.R.id.fag;
                                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(inflate, com.tencent.mm.R.id.fag);
                                if (frameLayout != null) {
                                    i17 = com.tencent.mm.R.id.fah;
                                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(inflate, com.tencent.mm.R.id.fah);
                                    if (weImageView2 != null) {
                                        i17 = com.tencent.mm.R.id.fak;
                                        android.view.View a28 = x4.b.a(inflate, com.tencent.mm.R.id.fak);
                                        if (a28 != null) {
                                            fg2.r0 a29 = fg2.r0.a(a28);
                                            i17 = com.tencent.mm.R.id.fal;
                                            android.view.View a37 = x4.b.a(inflate, com.tencent.mm.R.id.fal);
                                            if (a37 != null) {
                                                fg2.c1 a38 = fg2.c1.a(a37);
                                                i17 = com.tencent.mm.R.id.qrl;
                                                android.view.View a39 = x4.b.a(inflate, com.tencent.mm.R.id.qrl);
                                                if (a39 != null) {
                                                    fg2.s0 a47 = fg2.s0.a(a39);
                                                    i17 = com.tencent.mm.R.id.f484836fo0;
                                                    com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView = (com.tencent.mm.plugin.finder.live.view.FinderFixedTextView) x4.b.a(inflate, com.tencent.mm.R.id.f484836fo0);
                                                    if (finderFixedTextView != null) {
                                                        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) inflate;
                                                        return new fg2.l0(relativeLayout, constraintLayout, a18, weImageView, finderLiveLikeContainer, a27, textView, frameLayout, weImageView2, a29, a38, a47, finderFixedTextView, relativeLayout);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f262117a;
    }
}
