package cp2;

/* loaded from: classes2.dex */
public final class i1 implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cp2.q1 f220822a;

    public i1(cp2.q1 q1Var) {
        this.f220822a = q1Var;
    }

    @Override // qn5.c
    public void a(boolean z17) {
        ((cp2.v0) this.f220822a.f220884f).onRefresh();
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        cp2.v0 v0Var = (cp2.v0) this.f220822a.f220884f;
        qq2.b bVar = v0Var.f220938r;
        if (bVar != null && bVar.f365937h) {
            com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", "onLoadMore return for is preloading.");
        } else {
            com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", "onLoadMore.");
            com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader nearbyLiveFeedLoader = v0Var.f220943w;
            if (nearbyLiveFeedLoader != null) {
                nearbyLiveFeedLoader.requestLoadMore(v0Var.f220934n);
            }
        }
        return true;
    }
}
