package com.tencent.mm.plugin.finder.member.preview;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/member/preview/FinderPreviewFeedListLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "com/tencent/mm/plugin/finder/member/preview/p0", "com/tencent/mm/plugin/finder/member/preview/q0", "com/tencent/mm/plugin/finder/member/preview/r0", "com/tencent/mm/plugin/finder/member/preview/s0", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderPreviewFeedListLoader extends com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f121160d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f121161e;

    /* renamed from: f, reason: collision with root package name */
    public final int f121162f;

    /* renamed from: g, reason: collision with root package name */
    public final long f121163g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f121164h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderPreviewFeedListLoader(r45.qt2 qt2Var, java.lang.String memberTicket, java.lang.String authorFinderUsername, int i17, long j17) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(memberTicket, "memberTicket");
        kotlin.jvm.internal.o.g(authorFinderUsername, "authorFinderUsername");
        this.f121160d = memberTicket;
        this.f121161e = authorFinderUsername;
        this.f121162f = i17;
        this.f121163g = j17;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        int i17 = this.f121162f;
        return i17 != 6 ? i17 != 7 ? new com.tencent.mm.plugin.finder.member.preview.s0(this) : new com.tencent.mm.plugin.finder.member.preview.r0(this) : new com.tencent.mm.plugin.finder.member.preview.q0(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public com.tencent.mm.plugin.finder.feed.model.internal.a0 createDataMerger() {
        return new com.tencent.mm.plugin.finder.member.preview.u0(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        yz5.l lVar;
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchDone(response);
        if (isInitOperation(response) || (lVar = this.f121164h) == null) {
            return;
        }
        lVar.invoke(response);
    }
}
