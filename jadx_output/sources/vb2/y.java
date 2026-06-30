package vb2;

/* loaded from: classes2.dex */
public final class y implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.FrameLayout f434776a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.FrameLayout f434777b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.core.widget.NestedScrollView f434778c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.FinderRefreshLayout f434779d;

    public y(android.widget.FrameLayout frameLayout, android.widget.LinearLayout linearLayout, com.tencent.mm.ui.widget.imageview.WeImageView weImageView, android.widget.TextView textView, android.widget.FrameLayout frameLayout2, androidx.core.widget.NestedScrollView nestedScrollView, com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView, com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout, android.widget.LinearLayout linearLayout2, android.widget.TextView textView2, android.widget.ProgressBar progressBar, android.widget.TextView textView3, android.widget.RelativeLayout relativeLayout, com.tencent.mm.ui.widget.imageview.WeImageView weImageView2, android.widget.TextView textView4, android.widget.TextView textView5) {
        this.f434776a = frameLayout;
        this.f434777b = frameLayout2;
        this.f434778c = nestedScrollView;
        this.f434779d = finderRefreshLayout;
    }

    public static vb2.y a(android.view.View view) {
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
                        i17 = com.tencent.mm.R.id.lqa;
                        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) x4.b.a(view, com.tencent.mm.R.id.lqa);
                        if (wxRecyclerView != null) {
                            i17 = com.tencent.mm.R.id.m6e;
                            com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout = (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) x4.b.a(view, com.tencent.mm.R.id.m6e);
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
                                                                return new vb2.y(frameLayout, linearLayout, weImageView, textView, frameLayout, nestedScrollView, wxRecyclerView, finderRefreshLayout, linearLayout2, textView2, progressBar, textView3, relativeLayout, weImageView2, textView4, textView5);
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
        return this.f434776a;
    }
}
