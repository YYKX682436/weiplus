package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes14.dex */
public final class h2 implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.p2 f122320a;

    public h2(com.tencent.mm.plugin.finder.playlist.p2 p2Var) {
        this.f122320a = p2Var;
    }

    @Override // qn5.c
    public void a(boolean z17) {
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        com.tencent.mm.plugin.finder.playlist.p2 p2Var = this.f122320a;
        p2Var.getClass();
        com.tencent.mars.xlog.Log.i("Finder.FinderPlayListPresenter", "requestLoadMore CgiFinderGetTopicFeed");
        kotlinx.coroutines.l.d(p2Var.f122399e, null, null, new com.tencent.mm.plugin.finder.playlist.o2(p2Var, null), 3, null);
        return true;
    }
}
