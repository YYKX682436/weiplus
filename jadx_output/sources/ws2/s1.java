package ws2;

/* loaded from: classes3.dex */
public final class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.replay.FinderLiveReplayViewCallback f449138d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f449139e;

    public s1(com.tencent.mm.plugin.finder.replay.FinderLiveReplayViewCallback finderLiveReplayViewCallback, int i17) {
        this.f449138d = finderLiveReplayViewCallback;
        this.f449139e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.view.FinderLiveRecyclerView finderLiveRecyclerView = this.f449138d.f124882h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(this.f449139e));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(finderLiveRecyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/replay/FinderLiveReplayViewCallback$onLoadMoreResult$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        finderLiveRecyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(finderLiveRecyclerView, "com/tencent/mm/plugin/finder/replay/FinderLiveReplayViewCallback$onLoadMoreResult$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
