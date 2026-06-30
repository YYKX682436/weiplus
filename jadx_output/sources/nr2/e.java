package nr2;

/* loaded from: classes2.dex */
public final class e implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nr2.l f339177a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderRefreshLayout f339178b;

    public e(nr2.l lVar, com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout) {
        this.f339177a = lVar;
        this.f339178b = finderRefreshLayout;
    }

    @Override // qn5.c
    public void a(boolean z17) {
        nr2.l lVar = this.f339177a;
        lVar.getClass();
        com.tencent.mars.xlog.Log.i("Finder.FinderCoursePreviewItemUIC", "requestInit CgiFinderGetTopicFeed");
        so2.q6 q6Var = new so2.q6(null, 0, 0L, null, 0L, 0, null, null, 255, null);
        q6Var.f410556b = 16;
        nr2.m mVar = lVar.f339257m;
        q6Var.f410559e = mVar != null ? mVar.l() : 0L;
        kotlinx.coroutines.l.d(lVar.f339253f, null, null, new nr2.h(lVar, q6Var, this.f339178b, null), 3, null);
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        nr2.l lVar = this.f339177a;
        lVar.getClass();
        com.tencent.mars.xlog.Log.i("Finder.FinderCoursePreviewItemUIC", "requestLoadMore CgiFinderGetTopicFeed");
        so2.q6 q6Var = new so2.q6(null, 0, 0L, null, 0L, 0, null, null, 255, null);
        q6Var.f410556b = 16;
        nr2.m mVar = lVar.f339257m;
        q6Var.f410559e = mVar != null ? mVar.l() : 0L;
        q6Var.f410555a = lVar.f339258n;
        kotlinx.coroutines.l.d(lVar.f339253f, null, null, new nr2.k(lVar, q6Var, this.f339178b, null), 3, null);
        return true;
    }
}
