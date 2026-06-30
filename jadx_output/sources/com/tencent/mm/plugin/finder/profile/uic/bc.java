package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class bc implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ic f123566a;

    public bc(com.tencent.mm.plugin.finder.profile.uic.ic icVar) {
        this.f123566a = icVar;
    }

    @Override // qn5.c
    public void a(boolean z17) {
        this.f123566a.O6().requestRefresh();
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        return com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(this.f123566a.O6(), false, 1, null);
    }
}
