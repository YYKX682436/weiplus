package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes15.dex */
public final class bb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC f133863d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb(com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC finderEmojiListUIC) {
        super(0);
        this.f133863d = finderEmojiListUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f133863d.findViewById(com.tencent.mm.R.id.j8p);
        int i17 = com.tencent.mm.R.id.dbv;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(findViewById, com.tencent.mm.R.id.dbv);
        if (frameLayout != null) {
            android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) findViewById;
            i17 = com.tencent.mm.R.id.f486458la3;
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) x4.b.a(findViewById, com.tencent.mm.R.id.f486458la3);
            if (wxRecyclerView != null) {
                i17 = com.tencent.mm.R.id.m6g;
                com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout = (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) x4.b.a(findViewById, com.tencent.mm.R.id.m6g);
                if (finderRefreshLayout != null) {
                    i17 = com.tencent.mm.R.id.oai;
                    android.widget.ProgressBar progressBar = (android.widget.ProgressBar) x4.b.a(findViewById, com.tencent.mm.R.id.oai);
                    if (progressBar != null) {
                        i17 = com.tencent.mm.R.id.oao;
                        android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.oao);
                        if (textView != null) {
                            i17 = com.tencent.mm.R.id.oav;
                            android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.oav);
                            if (textView2 != null) {
                                return new vb2.k(frameLayout2, frameLayout, frameLayout2, wxRecyclerView, finderRefreshLayout, progressBar, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i17)));
    }
}
