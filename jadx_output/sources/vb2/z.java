package vb2;

/* loaded from: classes2.dex */
public final class z implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.FrameLayout f434780a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.LinearLayout f434781b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f434782c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.FrameLayout f434783d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.core.widget.NestedScrollView f434784e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.view.recyclerview.WxRecyclerView f434785f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.FinderRefreshLayout f434786g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ProgressBar f434787h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f434788i;

    /* renamed from: j, reason: collision with root package name */
    public final android.widget.RelativeLayout f434789j;

    /* renamed from: k, reason: collision with root package name */
    public final android.widget.TextView f434790k;

    public z(android.widget.FrameLayout frameLayout, android.widget.LinearLayout linearLayout, com.tencent.mm.ui.widget.imageview.WeImageView weImageView, android.widget.TextView textView, android.widget.FrameLayout frameLayout2, androidx.core.widget.NestedScrollView nestedScrollView, com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView, com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout, android.widget.LinearLayout linearLayout2, android.widget.TextView textView2, android.widget.ProgressBar progressBar, android.widget.TextView textView3, android.widget.RelativeLayout relativeLayout, com.tencent.mm.ui.widget.imageview.WeImageView weImageView2, android.widget.TextView textView4, android.widget.TextView textView5) {
        this.f434780a = frameLayout;
        this.f434781b = linearLayout;
        this.f434782c = textView;
        this.f434783d = frameLayout2;
        this.f434784e = nestedScrollView;
        this.f434785f = wxRecyclerView;
        this.f434786g = finderRefreshLayout;
        this.f434787h = progressBar;
        this.f434788i = textView3;
        this.f434789j = relativeLayout;
        this.f434790k = textView5;
    }

    public static vb2.z a(android.view.View view) {
        int i17 = com.tencent.mm.R.id.gcg;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(view, com.tencent.mm.R.id.gcg);
        if (linearLayout != null) {
            i17 = com.tencent.mm.R.id.gch;
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(view, com.tencent.mm.R.id.gch);
            if (weImageView != null) {
                i17 = com.tencent.mm.R.id.gci;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(view, com.tencent.mm.R.id.gci);
                if (textView != null) {
                    android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view;
                    i17 = com.tencent.mm.R.id.l9h;
                    androidx.core.widget.NestedScrollView nestedScrollView = (androidx.core.widget.NestedScrollView) x4.b.a(view, com.tencent.mm.R.id.l9h);
                    if (nestedScrollView != null) {
                        i17 = com.tencent.mm.R.id.f486458la3;
                        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) x4.b.a(view, com.tencent.mm.R.id.f486458la3);
                        if (wxRecyclerView != null) {
                            i17 = com.tencent.mm.R.id.m6g;
                            com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout = (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) x4.b.a(view, com.tencent.mm.R.id.m6g);
                            if (finderRefreshLayout != null) {
                                i17 = com.tencent.mm.R.id.f487324oa1;
                                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(view, com.tencent.mm.R.id.f487324oa1);
                                if (linearLayout2 != null) {
                                    i17 = com.tencent.mm.R.id.f487325oa2;
                                    android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(view, com.tencent.mm.R.id.f487325oa2);
                                    if (textView2 != null) {
                                        i17 = com.tencent.mm.R.id.oai;
                                        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) x4.b.a(view, com.tencent.mm.R.id.oai);
                                        if (progressBar != null) {
                                            i17 = com.tencent.mm.R.id.oao;
                                            android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(view, com.tencent.mm.R.id.oao);
                                            if (textView3 != null) {
                                                i17 = com.tencent.mm.R.id.oaq;
                                                android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) x4.b.a(view, com.tencent.mm.R.id.oaq);
                                                if (relativeLayout != null) {
                                                    i17 = com.tencent.mm.R.id.oar;
                                                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(view, com.tencent.mm.R.id.oar);
                                                    if (weImageView2 != null) {
                                                        i17 = com.tencent.mm.R.id.oat;
                                                        android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(view, com.tencent.mm.R.id.oat);
                                                        if (textView4 != null) {
                                                            i17 = com.tencent.mm.R.id.oav;
                                                            android.widget.TextView textView5 = (android.widget.TextView) x4.b.a(view, com.tencent.mm.R.id.oav);
                                                            if (textView5 != null) {
                                                                return new vb2.z(frameLayout, linearLayout, weImageView, textView, frameLayout, nestedScrollView, wxRecyclerView, finderRefreshLayout, linearLayout2, textView2, progressBar, textView3, relativeLayout, weImageView2, textView4, textView5);
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
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f434780a;
    }
}
