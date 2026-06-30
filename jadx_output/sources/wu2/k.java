package wu2;

/* loaded from: classes2.dex */
public final class k implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.fragment.FinderFavFeedFragment f449686d;

    public k(com.tencent.mm.plugin.finder.ui.fragment.FinderFavFeedFragment finderFavFeedFragment) {
        this.f449686d = finderFavFeedFragment;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.ui.fragment.FinderFavFeedFragment finderFavFeedFragment = this.f449686d;
        com.tencent.mm.plugin.finder.feed.i7 i7Var = finderFavFeedFragment.f129255u;
        if (i7Var == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = i7Var.f107156e;
        com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader finderFavFeedLoader = baseFeedLoader instanceof com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader ? (com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader) baseFeedLoader : null;
        if (finderFavFeedLoader == null || (arrayList = finderFavFeedLoader.f107415n) == null) {
            arrayList = new java.util.ArrayList();
        }
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, finderFavFeedFragment.y0(), intent, 0L, null, 0, 0, false, 0, null, 508, null);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Cj(finderFavFeedFragment.y0(), intent, 2, arrayList);
        return true;
    }
}
