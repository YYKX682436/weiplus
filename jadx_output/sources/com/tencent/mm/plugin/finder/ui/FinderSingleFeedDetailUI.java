package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderSingleFeedDetailUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "Lcom/tencent/mm/plugin/finder/ui/sm;", "Lcom/tencent/mm/plugin/finder/ui/rm;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderSingleFeedDetailUI extends com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI<com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.ui.sm, com.tencent.mm.plugin.finder.ui.rm> {
    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader A;

    /* renamed from: x, reason: collision with root package name */
    public final int f128792x = 1;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.ui.rm f128793y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.ui.sm f128794z;

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader d7() {
        com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader = this.A;
        if (baseFinderFeedLoader != null) {
            return baseFinderFeedLoader;
        }
        kotlin.jvm.internal.o.o("feedLoader");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.dj e7() {
        com.tencent.mm.plugin.finder.ui.rm rmVar = this.f128793y;
        if (rmVar != null) {
            return rmVar;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.gj g7() {
        com.tencent.mm.plugin.finder.ui.sm smVar = this.f128794z;
        if (smVar != null) {
            return smVar;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489093b91;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public void h7() {
        com.tencent.mm.plugin.finder.ui.rm rmVar = new com.tencent.mm.plugin.finder.ui.rm(this, 1);
        this.f128793y = rmVar;
        this.f128794z = new com.tencent.mm.plugin.finder.ui.sm(this, rmVar, this.f128792x, 0);
        com.tencent.mm.plugin.finder.ui.SingleFeedLoader singleFeedLoader = new com.tencent.mm.plugin.finder.ui.SingleFeedLoader(this);
        this.A = singleFeedLoader;
        com.tencent.mm.plugin.finder.ui.rm rmVar2 = this.f128793y;
        if (rmVar2 == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.ui.sm smVar = this.f128794z;
        if (smVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        rmVar2.X(singleFeedLoader, smVar);
        long longExtra = getIntent().getLongExtra("feed_object_id", 0L);
        com.tencent.mm.plugin.finder.storage.FinderItem f17 = getIntent().getBooleanExtra("feed_is_local", false) ? cu2.u.f222441a.f(longExtra) : bu2.j.f24534a.h(longExtra);
        if (f17 != null) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed p17 = cu2.u.f222441a.p(f17);
            com.tencent.mm.plugin.finder.ui.rm rmVar3 = this.f128793y;
            if (rmVar3 == null) {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
            java.util.ArrayList f18 = rmVar3.f();
            if (f18 != null) {
                f18.add(p17);
            }
        }
    }
}
