package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class d2 implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.j2 f123608a;

    public d2(com.tencent.mm.plugin.finder.profile.uic.j2 j2Var) {
        this.f123608a = j2Var;
    }

    @Override // qn5.c
    public void a(boolean z17) {
        this.f123608a.O6().requestRefresh();
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        return com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(this.f123608a.O6(), false, 1, null);
    }
}
