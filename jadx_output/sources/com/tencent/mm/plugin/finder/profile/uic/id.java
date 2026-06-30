package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class id extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.jd f123801d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public id(com.tencent.mm.plugin.finder.profile.uic.jd jdVar) {
        super(0);
        this.f123801d = jdVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f123801d.findViewById(com.tencent.mm.R.id.j8p);
        int i17 = com.tencent.mm.R.id.gcg;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.gcg);
        if (linearLayout != null) {
            i17 = com.tencent.mm.R.id.gch;
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(findViewById, com.tencent.mm.R.id.gch);
            if (weImageView != null) {
                i17 = com.tencent.mm.R.id.gci;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.gci);
                if (textView != null) {
                    android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById;
                    i17 = com.tencent.mm.R.id.l9h;
                    android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) x4.b.a(findViewById, com.tencent.mm.R.id.l9h);
                    if (frameLayout2 != null) {
                        i17 = com.tencent.mm.R.id.f486458la3;
                        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) x4.b.a(findViewById, com.tencent.mm.R.id.f486458la3);
                        if (wxRecyclerView != null) {
                            i17 = com.tencent.mm.R.id.m6e;
                            com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout = (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) x4.b.a(findViewById, com.tencent.mm.R.id.m6e);
                            if (finderRefreshLayout != null) {
                                i17 = com.tencent.mm.R.id.f487324oa1;
                                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.f487324oa1);
                                if (linearLayout2 != null) {
                                    i17 = com.tencent.mm.R.id.f487325oa2;
                                    android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.f487325oa2);
                                    if (textView2 != null) {
                                        i17 = com.tencent.mm.R.id.oai;
                                        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) x4.b.a(findViewById, com.tencent.mm.R.id.oai);
                                        if (progressBar != null) {
                                            i17 = com.tencent.mm.R.id.oao;
                                            android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.oao);
                                            if (textView3 != null) {
                                                i17 = com.tencent.mm.R.id.oav;
                                                android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.oav);
                                                if (textView4 != null) {
                                                    return new vb2.b0(frameLayout, linearLayout, weImageView, textView, frameLayout, frameLayout2, wxRecyclerView, finderRefreshLayout, linearLayout2, textView2, progressBar, textView3, textView4);
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
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i17)));
    }
}
