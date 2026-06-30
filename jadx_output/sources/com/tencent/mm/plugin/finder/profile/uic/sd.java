package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class sd implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC f124214a;

    public sd(com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC finderProfileReplayLiveUIC) {
        this.f124214a = finderProfileReplayLiveUIC;
    }

    @Override // qn5.c
    public void a(boolean z17) {
        this.f124214a.O6().requestRefresh();
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        return com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(this.f124214a.O6(), false, 1, null);
    }
}
