package fg2;

/* loaded from: classes3.dex */
public final class z1 implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.RelativeLayout f262419a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.ImageView f262420b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.ImageView f262421c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.FinderFixedTextView f262422d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.FinderFixedTextView f262423e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.HorizontalScrollView f262424f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.FinderFixedTextView f262425g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.FinderFixedTextView f262426h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.FinderFixedTextView f262427i;

    public z1(android.widget.RelativeLayout relativeLayout, android.widget.RelativeLayout relativeLayout2, android.widget.ImageView imageView, android.widget.FrameLayout frameLayout, android.widget.ImageView imageView2, com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView, com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView2, android.widget.HorizontalScrollView horizontalScrollView, com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView3, com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView4, com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView5) {
        this.f262419a = relativeLayout;
        this.f262420b = imageView;
        this.f262421c = imageView2;
        this.f262422d = finderFixedTextView;
        this.f262423e = finderFixedTextView2;
        this.f262424f = horizontalScrollView;
        this.f262425g = finderFixedTextView3;
        this.f262426h = finderFixedTextView4;
        this.f262427i = finderFixedTextView5;
    }

    public static fg2.z1 a(android.view.View view) {
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) view;
        int i17 = com.tencent.mm.R.id.u5e;
        android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(view, com.tencent.mm.R.id.u5e);
        if (imageView != null) {
            i17 = com.tencent.mm.R.id.i0_;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(view, com.tencent.mm.R.id.i0_);
            if (frameLayout != null) {
                i17 = com.tencent.mm.R.id.f487740pn5;
                android.widget.ImageView imageView2 = (android.widget.ImageView) x4.b.a(view, com.tencent.mm.R.id.f487740pn5);
                if (imageView2 != null) {
                    i17 = com.tencent.mm.R.id.pn6;
                    com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView = (com.tencent.mm.plugin.finder.live.view.FinderFixedTextView) x4.b.a(view, com.tencent.mm.R.id.pn6);
                    if (finderFixedTextView != null) {
                        i17 = com.tencent.mm.R.id.pn9;
                        com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView2 = (com.tencent.mm.plugin.finder.live.view.FinderFixedTextView) x4.b.a(view, com.tencent.mm.R.id.pn9);
                        if (finderFixedTextView2 != null) {
                            i17 = com.tencent.mm.R.id.pn_;
                            android.widget.HorizontalScrollView horizontalScrollView = (android.widget.HorizontalScrollView) x4.b.a(view, com.tencent.mm.R.id.pn_);
                            if (horizontalScrollView != null) {
                                i17 = com.tencent.mm.R.id.pna;
                                com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView3 = (com.tencent.mm.plugin.finder.live.view.FinderFixedTextView) x4.b.a(view, com.tencent.mm.R.id.pna);
                                if (finderFixedTextView3 != null) {
                                    i17 = com.tencent.mm.R.id.vpc;
                                    com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView4 = (com.tencent.mm.plugin.finder.live.view.FinderFixedTextView) x4.b.a(view, com.tencent.mm.R.id.vpc);
                                    if (finderFixedTextView4 != null) {
                                        i17 = com.tencent.mm.R.id.pnb;
                                        com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView5 = (com.tencent.mm.plugin.finder.live.view.FinderFixedTextView) x4.b.a(view, com.tencent.mm.R.id.pnb);
                                        if (finderFixedTextView5 != null) {
                                            return new fg2.z1(relativeLayout, relativeLayout, imageView, frameLayout, imageView2, finderFixedTextView, finderFixedTextView2, horizontalScrollView, finderFixedTextView3, finderFixedTextView4, finderFixedTextView5);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f262419a;
    }
}
