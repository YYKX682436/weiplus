package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class uj implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.dk f124272a;

    public uj(com.tencent.mm.plugin.finder.profile.uic.dk dkVar) {
        this.f124272a = dkVar;
    }

    @Override // qn5.c
    public void a(boolean z17) {
        this.f124272a.getFeedLoader().tryPullTopLoadMore();
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        return com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(this.f124272a.getFeedLoader(), false, 1, null);
    }
}
