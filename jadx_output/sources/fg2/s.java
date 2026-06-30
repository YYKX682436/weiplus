package fg2;

/* loaded from: classes10.dex */
public final class s implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.constraintlayout.widget.ConstraintLayout f262285a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.FinderFixedTextView f262286b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.FrameLayout f262287c;

    /* renamed from: d, reason: collision with root package name */
    public final fg2.h0 f262288d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.FinderFixedTextView f262289e;

    /* renamed from: f, reason: collision with root package name */
    public final fg2.h1 f262290f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f262291g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView f262292h;

    public s(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView, android.widget.FrameLayout frameLayout, com.tencent.mm.ui.widget.imageview.WeImageView weImageView, fg2.h0 h0Var, com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView2, androidx.constraintlayout.widget.ConstraintLayout constraintLayout2, fg2.h1 h1Var, android.widget.ImageView imageView, com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView) {
        this.f262285a = constraintLayout;
        this.f262286b = finderFixedTextView;
        this.f262287c = frameLayout;
        this.f262288d = h0Var;
        this.f262289e = finderFixedTextView2;
        this.f262290f = h1Var;
        this.f262291g = imageView;
        this.f262292h = ripperAnimateView;
    }

    public static fg2.s a(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, boolean z17) {
        android.view.View inflate = layoutInflater.inflate(com.tencent.mm.R.layout.drk, viewGroup, false);
        if (z17) {
            viewGroup.addView(inflate);
        }
        int i17 = com.tencent.mm.R.id.fa_;
        com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView = (com.tencent.mm.plugin.finder.live.view.FinderFixedTextView) x4.b.a(inflate, com.tencent.mm.R.id.fa_);
        if (finderFixedTextView != null) {
            i17 = com.tencent.mm.R.id.fag;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(inflate, com.tencent.mm.R.id.fag);
            if (frameLayout != null) {
                i17 = com.tencent.mm.R.id.fah;
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(inflate, com.tencent.mm.R.id.fah);
                if (weImageView != null) {
                    i17 = com.tencent.mm.R.id.fak;
                    android.view.View a17 = x4.b.a(inflate, com.tencent.mm.R.id.fak);
                    if (a17 != null) {
                        fg2.h0 a18 = fg2.h0.a(a17);
                        i17 = com.tencent.mm.R.id.qrk;
                        com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView2 = (com.tencent.mm.plugin.finder.live.view.FinderFixedTextView) x4.b.a(inflate, com.tencent.mm.R.id.qrk);
                        if (finderFixedTextView2 != null) {
                            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) inflate;
                            i17 = com.tencent.mm.R.id.qrl;
                            android.view.View a19 = x4.b.a(inflate, com.tencent.mm.R.id.qrl);
                            if (a19 != null) {
                                fg2.h1 a27 = fg2.h1.a(a19);
                                i17 = com.tencent.mm.R.id.qrn;
                                android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.qrn);
                                if (imageView != null) {
                                    i17 = com.tencent.mm.R.id.qxy;
                                    com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView = (com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView) x4.b.a(inflate, com.tencent.mm.R.id.qxy);
                                    if (ripperAnimateView != null) {
                                        return new fg2.s(constraintLayout, finderFixedTextView, frameLayout, weImageView, a18, finderFixedTextView2, constraintLayout, a27, imageView, ripperAnimateView);
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
        return this.f262285a;
    }
}
