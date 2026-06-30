package ws2;

/* loaded from: classes3.dex */
public final class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.replay.FinderLiveReplayViewCallback f449143d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f449144e;

    public t1(com.tencent.mm.plugin.finder.replay.FinderLiveReplayViewCallback finderLiveReplayViewCallback, long j17) {
        this.f449143d = finderLiveReplayViewCallback;
        this.f449144e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager finderLiveLayoutManager;
        com.tencent.mm.plugin.finder.replay.FinderLiveReplayViewCallback finderLiveReplayViewCallback = this.f449143d;
        int i17 = finderLiveReplayViewCallback.f124885n.f449150b;
        androidx.recyclerview.widget.f2 adapter = finderLiveReplayViewCallback.f124882h.getAdapter();
        kotlin.jvm.internal.o.e(adapter, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.replay.FinderLiveReplayAdapter");
        java.util.ArrayList arrayList = ((ws2.j) adapter).f449056d;
        boolean z17 = false;
        int size = arrayList != null ? arrayList.size() : 0;
        com.tencent.mars.xlog.Log.i("FinderLiveReplayViewCallback", "restart curPos:" + i17 + "(liveId:" + this.f449144e + "),size:" + size + '!');
        if (i17 >= 0 && i17 < size) {
            z17 = true;
        }
        if (!z17 || (finderLiveLayoutManager = finderLiveReplayViewCallback.f124883i) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager.Y(finderLiveLayoutManager, false, true, null, 5, null);
    }
}
