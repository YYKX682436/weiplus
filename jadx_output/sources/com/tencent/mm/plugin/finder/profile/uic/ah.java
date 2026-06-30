package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class ah extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTemplateUIC f123541d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTemplateUIC finderProfileTemplateUIC) {
        super(0);
        this.f123541d = finderProfileTemplateUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f123541d.findViewById(com.tencent.mm.R.id.j8p);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById;
        int i17 = com.tencent.mm.R.id.l9h;
        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) x4.b.a(findViewById, com.tencent.mm.R.id.l9h);
        if (frameLayout2 != null) {
            i17 = com.tencent.mm.R.id.l9m;
            androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = (androidx.coordinatorlayout.widget.CoordinatorLayout) x4.b.a(findViewById, com.tencent.mm.R.id.l9m);
            if (coordinatorLayout != null) {
                i17 = com.tencent.mm.R.id.f486458la3;
                com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) x4.b.a(findViewById, com.tencent.mm.R.id.f486458la3);
                if (wxRecyclerView != null) {
                    i17 = com.tencent.mm.R.id.m6e;
                    com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) x4.b.a(findViewById, com.tencent.mm.R.id.m6e);
                    if (refreshLoadMoreLayout != null) {
                        i17 = com.tencent.mm.R.id.oai;
                        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) x4.b.a(findViewById, com.tencent.mm.R.id.oai);
                        if (progressBar != null) {
                            i17 = com.tencent.mm.R.id.oao;
                            android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.oao);
                            if (textView != null) {
                                i17 = com.tencent.mm.R.id.oav;
                                android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.oav);
                                if (textView2 != null) {
                                    return new vb2.c0(frameLayout, frameLayout, frameLayout2, coordinatorLayout, wxRecyclerView, refreshLoadMoreLayout, progressBar, textView, textView2);
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
