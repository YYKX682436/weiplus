package com.tencent.mm.plugin.finder.ui.fav;

/* loaded from: classes2.dex */
public class p extends com.tencent.mm.plugin.finder.ui.fav.a {

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.y9 f129196g = new com.tencent.mm.plugin.finder.feed.model.y9();

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f129197h = jz5.h.b(new com.tencent.mm.plugin.finder.ui.fav.h(this));

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f129198i = jz5.h.b(new com.tencent.mm.plugin.finder.ui.fav.m(this));

    /* renamed from: m, reason: collision with root package name */
    public final int f129199m = 1;

    /* renamed from: n, reason: collision with root package name */
    public final int f129200n = 1;

    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader A(r45.qt2 qt2Var) {
        com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavLoader finderGlobalFavLoader = new com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavLoader(qt2Var, false);
        finderGlobalFavLoader.f129136e = new com.tencent.mm.plugin.finder.ui.fav.i(this, finderGlobalFavLoader);
        return finderGlobalFavLoader;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fav.a
    public boolean g() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fav.a
    public void i(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, in5.s0 holder) {
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mars.xlog.Log.i("FinderGlobalFavPresenter", "[onItemLongClick] position = " + i17);
        rl5.r rVar = new rl5.r(view.getContext(), view);
        rVar.C = true;
        rVar.f397355y = new com.tencent.mm.plugin.finder.ui.fav.n(this, view);
        rVar.f397354x = new com.tencent.mm.plugin.finder.ui.fav.o(this, view, i17);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i18 = iArr[0];
        if ((i17 + 1) % 2 == 0) {
            i18 += v(view);
        }
        rVar.n((i18 + view.getWidth()) / 2, iArr[1]);
    }

    @Override // com.tencent.mm.plugin.finder.ui.fav.a
    public void m() {
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestInit$default(z(), false, 1, null);
    }

    @Override // com.tencent.mm.plugin.finder.ui.fav.a
    public void p() {
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(z(), false, 1, null);
    }

    @Override // com.tencent.mm.plugin.finder.ui.fav.a
    public void q() {
        z().requestRefresh();
    }

    public int v(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        return view.getWidth();
    }

    public java.lang.String y(so2.j5 feed, long j17) {
        kotlin.jvm.internal.o.g(feed, "feed");
        return "FavSourceId" + j17;
    }

    public final com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader z() {
        return (com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader) ((jz5.n) this.f129198i).getValue();
    }
}
