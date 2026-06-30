package ws2;

/* loaded from: classes3.dex */
public final class o1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.replay.FinderLiveReplayViewCallback f449114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f449115e;

    public o1(com.tencent.mm.plugin.finder.replay.FinderLiveReplayViewCallback finderLiveReplayViewCallback, long j17) {
        this.f449114d = finderLiveReplayViewCallback;
        this.f449115e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.replay.FinderLiveReplayViewCallback finderLiveReplayViewCallback = this.f449114d;
        androidx.recyclerview.widget.f2 adapter = finderLiveReplayViewCallback.f124882h.getAdapter();
        ws2.j jVar = adapter instanceof ws2.j ? (ws2.j) adapter : null;
        if (jVar != null) {
            java.util.ArrayList arrayList = jVar.f449056d;
            int i17 = -1;
            long j17 = this.f449115e;
            if (arrayList != null) {
                java.util.Iterator it = arrayList.iterator();
                int i18 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((km2.m) it.next()).f309129d.f68537e == j17) {
                        i17 = i18;
                        break;
                    }
                    i18++;
                }
            }
            java.util.ArrayList arrayList2 = jVar.f449056d;
            com.tencent.mars.xlog.Log.i("FinderLiveReplayViewCallback", "delete deletePos:" + i17 + "(liveId:" + j17 + "),size:" + (arrayList2 != null ? arrayList2.size() : 0) + '!');
            mm2.c1 c1Var = (mm2.c1) ws2.k1.f449066r.a().e(mm2.c1.class);
            if (c1Var != null) {
                c1Var.O1 = false;
            }
            finderLiveReplayViewCallback.f124878d.finish();
        }
    }
}
