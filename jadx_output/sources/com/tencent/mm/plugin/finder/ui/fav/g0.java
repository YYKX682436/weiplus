package com.tencent.mm.plugin.finder.ui.fav;

/* loaded from: classes2.dex */
public final class g0 extends com.tencent.mm.plugin.finder.ui.fav.p {

    /* renamed from: o, reason: collision with root package name */
    public final int f129169o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f129170p = "FinderGlobalMixFavPresenter";

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f129171q = jz5.h.b(new com.tencent.mm.plugin.finder.ui.fav.f0(this));

    public g0(int i17) {
        this.f129169o = i17;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fav.p
    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader A(r45.qt2 qt2Var) {
        com.tencent.mm.plugin.finder.feed.model.FinderMixAllFeedLoader finderMixAllFeedLoader = new com.tencent.mm.plugin.finder.feed.model.FinderMixAllFeedLoader(false, qt2Var, 4, this.f129169o);
        finderMixAllFeedLoader.f107529h = new com.tencent.mm.plugin.finder.ui.fav.d0(finderMixAllFeedLoader, this);
        return finderMixAllFeedLoader;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fav.a
    public java.util.ArrayList c() {
        return z().getDataList();
    }

    @Override // com.tencent.mm.plugin.finder.ui.fav.a
    public void h(com.tencent.mm.plugin.finder.ui.fav.x callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f129149e = callback;
        f().g();
        com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher.register$default(z(), (com.tencent.mm.plugin.finder.ui.fav.e0) ((jz5.n) this.f129171q).getValue(), false, 2, null);
        m();
        f().j();
        q();
    }

    @Override // com.tencent.mm.plugin.finder.ui.fav.a, fs2.a
    public void onDetach() {
        super.onDetach();
        z().unregister((com.tencent.mm.plugin.finder.ui.fav.e0) ((jz5.n) this.f129171q).getValue());
    }

    @Override // com.tencent.mm.plugin.finder.ui.fav.p
    public int v(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        return 0;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fav.p
    public java.lang.String y(so2.j5 feed, long j17) {
        kotlin.jvm.internal.o.g(feed, "feed");
        if (!(feed instanceof so2.a0)) {
            return super.y(feed, j17);
        }
        bu2.e0.f24498a.d(35, "", new com.tencent.mm.plugin.finder.ui.fav.c0(feed.getItemId()), true);
        return pm0.v.u(feed.getItemId());
    }
}
