package vb2;

/* loaded from: classes2.dex */
public final class w implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.FrameLayout f434752a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.view.recyclerview.WxRecyclerView f434753b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.FinderRefreshLayout f434754c;

    public w(android.widget.FrameLayout frameLayout, android.widget.FrameLayout frameLayout2, com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView, com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout) {
        this.f434752a = frameLayout;
        this.f434753b = wxRecyclerView;
        this.f434754c = finderRefreshLayout;
    }

    public static vb2.w a(android.view.View view) {
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view;
        int i17 = com.tencent.mm.R.id.f486458la3;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) x4.b.a(view, com.tencent.mm.R.id.f486458la3);
        if (wxRecyclerView != null) {
            i17 = com.tencent.mm.R.id.lr8;
            com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout = (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) x4.b.a(view, com.tencent.mm.R.id.lr8);
            if (finderRefreshLayout != null) {
                return new vb2.w(frameLayout, frameLayout, wxRecyclerView, finderRefreshLayout);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f434752a;
    }
}
