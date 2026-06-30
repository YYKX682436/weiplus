package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes14.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.n0 f135104d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.tencent.mm.plugin.finder.viewmodel.component.n0 n0Var) {
        super(0);
        this.f135104d = n0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f135104d.findViewById(com.tencent.mm.R.id.che);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById;
        int i17 = com.tencent.mm.R.id.dft;
        android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.dft);
        if (textView != null) {
            i17 = com.tencent.mm.R.id.f484229dg3;
            android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) x4.b.a(findViewById, com.tencent.mm.R.id.f484229dg3);
            if (frameLayout2 != null) {
                i17 = com.tencent.mm.R.id.e7w;
                com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) x4.b.a(findViewById, com.tencent.mm.R.id.e7w);
                if (wxRecyclerView != null) {
                    i17 = com.tencent.mm.R.id.ilt;
                    android.widget.ProgressBar progressBar = (android.widget.ProgressBar) x4.b.a(findViewById, com.tencent.mm.R.id.ilt);
                    if (progressBar != null) {
                        i17 = com.tencent.mm.R.id.lr8;
                        com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout = (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) x4.b.a(findViewById, com.tencent.mm.R.id.lr8);
                        if (finderRefreshLayout != null) {
                            i17 = com.tencent.mm.R.id.m2g;
                            android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.m2g);
                            if (textView2 != null) {
                                return new vb2.b(frameLayout, frameLayout, textView, frameLayout2, wxRecyclerView, progressBar, finderRefreshLayout, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i17)));
    }
}
