package fg2;

/* loaded from: classes10.dex */
public final class j implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.constraintlayout.widget.ConstraintLayout f262087a;

    /* renamed from: b, reason: collision with root package name */
    public final fg2.r1 f262088b;

    /* renamed from: c, reason: collision with root package name */
    public final fg2.c0 f262089c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.FinderFixedTextView f262090d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.FrameLayout f262091e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f262092f;

    /* renamed from: g, reason: collision with root package name */
    public final fg2.h0 f262093g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.FinderFixedTextView f262094h;

    /* renamed from: i, reason: collision with root package name */
    public final fg2.h1 f262095i;

    /* renamed from: j, reason: collision with root package name */
    public final android.widget.ImageView f262096j;

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView f262097k;

    public j(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, fg2.r1 r1Var, fg2.c0 c0Var, com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView, android.widget.FrameLayout frameLayout, com.tencent.mm.ui.widget.imageview.WeImageView weImageView, fg2.h0 h0Var, com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView2, androidx.constraintlayout.widget.ConstraintLayout constraintLayout2, fg2.h1 h1Var, android.widget.ImageView imageView, com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView) {
        this.f262087a = constraintLayout;
        this.f262088b = r1Var;
        this.f262089c = c0Var;
        this.f262090d = finderFixedTextView;
        this.f262091e = frameLayout;
        this.f262092f = weImageView;
        this.f262093g = h0Var;
        this.f262094h = finderFixedTextView2;
        this.f262095i = h1Var;
        this.f262096j = imageView;
        this.f262097k = ripperAnimateView;
    }

    public static fg2.j a(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, boolean z17) {
        android.view.View inflate = layoutInflater.inflate(com.tencent.mm.R.layout.d6g, viewGroup, false);
        if (z17) {
            viewGroup.addView(inflate);
        }
        int i17 = com.tencent.mm.R.id.eop;
        android.view.View a17 = x4.b.a(inflate, com.tencent.mm.R.id.eop);
        if (a17 != null) {
            fg2.r1 a18 = fg2.r1.a(a17);
            i17 = com.tencent.mm.R.id.f8q;
            android.view.View a19 = x4.b.a(inflate, com.tencent.mm.R.id.f8q);
            if (a19 != null) {
                fg2.c0 a27 = fg2.c0.a(a19);
                i17 = com.tencent.mm.R.id.fa_;
                com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView = (com.tencent.mm.plugin.finder.live.view.FinderFixedTextView) x4.b.a(inflate, com.tencent.mm.R.id.fa_);
                if (finderFixedTextView != null) {
                    i17 = com.tencent.mm.R.id.fag;
                    android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(inflate, com.tencent.mm.R.id.fag);
                    if (frameLayout != null) {
                        i17 = com.tencent.mm.R.id.fah;
                        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(inflate, com.tencent.mm.R.id.fah);
                        if (weImageView != null) {
                            i17 = com.tencent.mm.R.id.fak;
                            android.view.View a28 = x4.b.a(inflate, com.tencent.mm.R.id.fak);
                            if (a28 != null) {
                                fg2.h0 a29 = fg2.h0.a(a28);
                                i17 = com.tencent.mm.R.id.qrk;
                                com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView2 = (com.tencent.mm.plugin.finder.live.view.FinderFixedTextView) x4.b.a(inflate, com.tencent.mm.R.id.qrk);
                                if (finderFixedTextView2 != null) {
                                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) inflate;
                                    i17 = com.tencent.mm.R.id.qrl;
                                    android.view.View a37 = x4.b.a(inflate, com.tencent.mm.R.id.qrl);
                                    if (a37 != null) {
                                        fg2.h1 a38 = fg2.h1.a(a37);
                                        i17 = com.tencent.mm.R.id.qrn;
                                        android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.qrn);
                                        if (imageView != null) {
                                            i17 = com.tencent.mm.R.id.qxy;
                                            com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView = (com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView) x4.b.a(inflate, com.tencent.mm.R.id.qxy);
                                            if (ripperAnimateView != null) {
                                                return new fg2.j(constraintLayout, a18, a27, finderFixedTextView, frameLayout, weImageView, a29, finderFixedTextView2, constraintLayout, a38, imageView, ripperAnimateView);
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
        return this.f262087a;
    }
}
