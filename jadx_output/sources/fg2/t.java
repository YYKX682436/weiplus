package fg2;

/* loaded from: classes10.dex */
public final class t implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.constraintlayout.widget.ConstraintLayout f262305a;

    /* renamed from: b, reason: collision with root package name */
    public final fg2.c0 f262306b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.FinderFixedTextView f262307c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.FrameLayout f262308d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f262309e;

    /* renamed from: f, reason: collision with root package name */
    public final fg2.h0 f262310f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.FinderFixedTextView f262311g;

    /* renamed from: h, reason: collision with root package name */
    public final fg2.h1 f262312h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f262313i;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView f262314j;

    public t(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, fg2.c0 c0Var, com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView, android.widget.FrameLayout frameLayout, com.tencent.mm.ui.widget.imageview.WeImageView weImageView, fg2.h0 h0Var, com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView2, androidx.constraintlayout.widget.ConstraintLayout constraintLayout2, fg2.h1 h1Var, android.widget.ImageView imageView, android.widget.LinearLayout linearLayout, com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView) {
        this.f262305a = constraintLayout;
        this.f262306b = c0Var;
        this.f262307c = finderFixedTextView;
        this.f262308d = frameLayout;
        this.f262309e = weImageView;
        this.f262310f = h0Var;
        this.f262311g = finderFixedTextView2;
        this.f262312h = h1Var;
        this.f262313i = imageView;
        this.f262314j = ripperAnimateView;
    }

    public static fg2.t a(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, boolean z17) {
        android.view.View inflate = layoutInflater.inflate(com.tencent.mm.R.layout.drn, viewGroup, false);
        if (z17) {
            viewGroup.addView(inflate);
        }
        int i17 = com.tencent.mm.R.id.f8q;
        android.view.View a17 = x4.b.a(inflate, com.tencent.mm.R.id.f8q);
        if (a17 != null) {
            fg2.c0 a18 = fg2.c0.a(a17);
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
                        android.view.View a19 = x4.b.a(inflate, com.tencent.mm.R.id.fak);
                        if (a19 != null) {
                            fg2.h0 a27 = fg2.h0.a(a19);
                            i17 = com.tencent.mm.R.id.qrk;
                            com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView2 = (com.tencent.mm.plugin.finder.live.view.FinderFixedTextView) x4.b.a(inflate, com.tencent.mm.R.id.qrk);
                            if (finderFixedTextView2 != null) {
                                androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) inflate;
                                i17 = com.tencent.mm.R.id.qrl;
                                android.view.View a28 = x4.b.a(inflate, com.tencent.mm.R.id.qrl);
                                if (a28 != null) {
                                    fg2.h1 a29 = fg2.h1.a(a28);
                                    i17 = com.tencent.mm.R.id.qrn;
                                    android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.qrn);
                                    if (imageView != null) {
                                        i17 = com.tencent.mm.R.id.r78;
                                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(inflate, com.tencent.mm.R.id.r78);
                                        if (linearLayout != null) {
                                            i17 = com.tencent.mm.R.id.qxy;
                                            com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView = (com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView) x4.b.a(inflate, com.tencent.mm.R.id.qxy);
                                            if (ripperAnimateView != null) {
                                                return new fg2.t(constraintLayout, a18, finderFixedTextView, frameLayout, weImageView, a27, finderFixedTextView2, constraintLayout, a29, imageView, linearLayout, ripperAnimateView);
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
        return this.f262305a;
    }
}
