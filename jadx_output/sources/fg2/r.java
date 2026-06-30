package fg2;

/* loaded from: classes10.dex */
public final class r implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.constraintlayout.widget.ConstraintLayout f262269a;

    /* renamed from: b, reason: collision with root package name */
    public final fg2.r1 f262270b;

    /* renamed from: c, reason: collision with root package name */
    public final fg2.a0 f262271c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f262272d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.FrameLayout f262273e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f262274f;

    /* renamed from: g, reason: collision with root package name */
    public final fg2.r0 f262275g;

    /* renamed from: h, reason: collision with root package name */
    public final fg2.c1 f262276h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f262277i;

    /* renamed from: j, reason: collision with root package name */
    public final android.widget.ImageView f262278j;

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.FinderFixedTextView f262279k;

    /* renamed from: l, reason: collision with root package name */
    public final com.tencent.mm.view.MMPAGView f262280l;

    /* renamed from: m, reason: collision with root package name */
    public final fg2.s0 f262281m;

    public r(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, fg2.r1 r1Var, androidx.constraintlayout.widget.ConstraintLayout constraintLayout2, com.tencent.mm.plugin.finder.live.view.FinderLiveLikeContainer finderLiveLikeContainer, fg2.a0 a0Var, android.widget.TextView textView, android.widget.FrameLayout frameLayout, com.tencent.mm.ui.widget.imageview.WeImageView weImageView, fg2.r0 r0Var, fg2.c1 c1Var, android.widget.ImageView imageView, android.widget.ImageView imageView2, com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView, androidx.constraintlayout.widget.ConstraintLayout constraintLayout3, com.tencent.mm.view.MMPAGView mMPAGView, fg2.s0 s0Var) {
        this.f262269a = constraintLayout;
        this.f262270b = r1Var;
        this.f262271c = a0Var;
        this.f262272d = textView;
        this.f262273e = frameLayout;
        this.f262274f = weImageView;
        this.f262275g = r0Var;
        this.f262276h = c1Var;
        this.f262277i = imageView;
        this.f262278j = imageView2;
        this.f262279k = finderFixedTextView;
        this.f262280l = mMPAGView;
        this.f262281m = s0Var;
    }

    public static fg2.r a(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, boolean z17) {
        android.view.View inflate = layoutInflater.inflate(com.tencent.mm.R.layout.asi, viewGroup, false);
        if (z17) {
            viewGroup.addView(inflate);
        }
        int i17 = com.tencent.mm.R.id.eop;
        android.view.View a17 = x4.b.a(inflate, com.tencent.mm.R.id.eop);
        if (a17 != null) {
            fg2.r1 a18 = fg2.r1.a(a17);
            i17 = com.tencent.mm.R.id.thz;
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(inflate, com.tencent.mm.R.id.thz);
            if (constraintLayout != null) {
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
                                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(inflate, com.tencent.mm.R.id.fah);
                                if (weImageView != null) {
                                    i17 = com.tencent.mm.R.id.fak;
                                    android.view.View a28 = x4.b.a(inflate, com.tencent.mm.R.id.fak);
                                    if (a28 != null) {
                                        fg2.r0 a29 = fg2.r0.a(a28);
                                        i17 = com.tencent.mm.R.id.fal;
                                        android.view.View a37 = x4.b.a(inflate, com.tencent.mm.R.id.fal);
                                        if (a37 != null) {
                                            fg2.c1 a38 = fg2.c1.a(a37);
                                            i17 = com.tencent.mm.R.id.faq;
                                            android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.faq);
                                            if (imageView != null) {
                                                i17 = com.tencent.mm.R.id.far;
                                                android.widget.ImageView imageView2 = (android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.far);
                                                if (imageView2 != null) {
                                                    i17 = com.tencent.mm.R.id.fay;
                                                    com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView = (com.tencent.mm.plugin.finder.live.view.FinderFixedTextView) x4.b.a(inflate, com.tencent.mm.R.id.fay);
                                                    if (finderFixedTextView != null) {
                                                        androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = (androidx.constraintlayout.widget.ConstraintLayout) inflate;
                                                        i17 = com.tencent.mm.R.id.f484730fb0;
                                                        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) x4.b.a(inflate, com.tencent.mm.R.id.f484730fb0);
                                                        if (mMPAGView != null) {
                                                            i17 = com.tencent.mm.R.id.qrl;
                                                            android.view.View a39 = x4.b.a(inflate, com.tencent.mm.R.id.qrl);
                                                            if (a39 != null) {
                                                                return new fg2.r(constraintLayout2, a18, constraintLayout, finderLiveLikeContainer, a27, textView, frameLayout, weImageView, a29, a38, imageView, imageView2, finderFixedTextView, constraintLayout2, mMPAGView, fg2.s0.a(a39));
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
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f262269a;
    }
}
