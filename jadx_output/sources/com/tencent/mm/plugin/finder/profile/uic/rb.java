package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class rb implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.yb f124181a;

    public rb(com.tencent.mm.plugin.finder.profile.uic.yb ybVar) {
        this.f124181a = ybVar;
    }

    @Override // qn5.c
    public void a(boolean z17) {
        this.f124181a.O6().requestRefresh();
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        return com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(this.f124181a.O6(), false, 1, null);
    }
}
