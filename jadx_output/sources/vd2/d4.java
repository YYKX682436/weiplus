package vd2;

/* loaded from: classes3.dex */
public final class d4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.FinderLiveViewCallback f435704d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback) {
        super(0);
        this.f435704d = finderLiveViewCallback;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        km2.m E;
        com.tencent.mm.live.api.LiveConfig liveConfig;
        com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback = this.f435704d;
        if (!finderLiveViewCallback.L) {
            com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager finderLiveLayoutManager = finderLiveViewCallback.f111493r;
            int w17 = finderLiveLayoutManager != null ? finderLiveLayoutManager.w() : -1;
            com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager finderLiveLayoutManager2 = finderLiveViewCallback.f111493r;
            int y17 = finderLiveLayoutManager2 != null ? finderLiveLayoutManager2.y() : -1;
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "firstVisiblePos:" + w17 + " lastVisiblePos:" + y17);
            if (w17 == y17) {
                androidx.recyclerview.widget.f2 adapter = finderLiveViewCallback.f111492q.getAdapter();
                vd2.s1 s1Var = adapter instanceof vd2.s1 ? (vd2.s1) adapter : null;
                long j17 = (s1Var == null || (E = s1Var.E(w17)) == null || (liveConfig = E.f309129d) == null) ? 0L : liveConfig.f68537e;
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "onItemChecked curLiveId:" + j17 + " selectedLiveId:" + finderLiveViewCallback.K);
                if (j17 != 0 && j17 != finderLiveViewCallback.K) {
                    finderLiveViewCallback.K = j17;
                    z17 = true;
                    return java.lang.Boolean.valueOf(z17);
                }
            }
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
