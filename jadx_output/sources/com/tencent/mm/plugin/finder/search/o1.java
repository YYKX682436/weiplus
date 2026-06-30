package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class o1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderFeedSearchUI f125796d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f125797e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f125798f;

    public o1(com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var) {
        this.f125796d = finderFeedSearchUI;
        this.f125797e = baseFinderFeed;
        this.f125798f = s0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 99) {
            com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI = this.f125796d;
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer = finderFeedSearchUI.C;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f125797e;
            int indexOf = dataBuffer.indexOf(baseFinderFeed);
            if (indexOf < 0) {
                com.tencent.mars.xlog.Log.i("Finder.FinderFeedSearchUI", "[UNINTEREST] pos error " + indexOf);
                return;
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = finderFeedSearchUI.P;
            if (recyclerView == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            androidx.recyclerview.widget.n2 itemAnimator = recyclerView.getItemAnimator();
            androidx.recyclerview.widget.z zVar = new androidx.recyclerview.widget.z();
            zVar.f12169d = 2000L;
            androidx.recyclerview.widget.RecyclerView recyclerView2 = finderFeedSearchUI.P;
            if (recyclerView2 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            recyclerView2.setItemAnimator(zVar);
            androidx.recyclerview.widget.RecyclerView recyclerView3 = finderFeedSearchUI.P;
            if (recyclerView3 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            recyclerView3.postDelayed(new com.tencent.mm.plugin.finder.search.n1(finderFeedSearchUI, itemAnimator), zVar.f12169d);
            com.tencent.mars.xlog.Log.i("Finder.FinderFeedSearchUI", "defaultItemAnimator.removeDuration =" + zVar.f12169d);
            bd2.r rVar = bd2.r.f19284a;
            androidx.appcompat.app.AppCompatActivity context = finderFeedSearchUI.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            rVar.e(context, baseFinderFeed.getFeedObject().getId(), baseFinderFeed.w(), baseFinderFeed.getFeedObject().getObjectNonceId(), (r17 & 16) != 0 ? false : false, (r17 & 32) != 0 ? null : this.f125798f);
        }
    }
}
