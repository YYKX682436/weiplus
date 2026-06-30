package vd2;

/* loaded from: classes3.dex */
public final class p4 extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f435855a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.FinderLiveViewCallback f435856b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f435857c;

    public p4(boolean z17, com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback, boolean z18) {
        this.f435855a = z17;
        this.f435856b = finderLiveViewCallback;
        this.f435857c = z18;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0155  */
    @Override // ym5.q3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(int r22) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vd2.p4.b(int):void");
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "onLoadMoreEnd");
        com.tencent.mm.plugin.finder.live.util.m0 m0Var = com.tencent.mm.plugin.finder.live.util.m0.f115607a;
        com.tencent.mars.xlog.Log.i("FinderLiveSlideStatusReport", "onLoadMoreEnd beginLoadMoreTimeMs=" + com.tencent.mm.plugin.finder.live.util.m0.f115609c);
        if (!com.tencent.mm.plugin.finder.live.util.m0.f115611e || com.tencent.mm.plugin.finder.live.util.m0.f115609c == -1) {
            com.tencent.mm.plugin.finder.live.util.m0.f115611e = false;
            com.tencent.mm.plugin.finder.live.util.m0.f115609c = -1L;
            com.tencent.mars.xlog.Log.i("FinderLiveSlideStatusReport", "onLoadMoreEnd fail, status invalid");
            return;
        }
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() - com.tencent.mm.plugin.finder.live.util.m0.f115609c);
        com.tencent.mm.plugin.finder.live.util.m0.f115610d = currentTimeMillis;
        com.tencent.mm.plugin.finder.live.util.m0.f115611e = false;
        com.tencent.mm.plugin.finder.live.util.m0.f115609c = -1L;
        if (currentTimeMillis > 20000 || currentTimeMillis <= 0) {
            com.tencent.mars.xlog.Log.e("FinderLiveSlideStatusReport", "addLoadingTime loadingMs invalid ");
            return;
        }
        java.util.ArrayList arrayList = com.tencent.mm.plugin.finder.live.util.m0.f115616j;
        synchronized (arrayList) {
            arrayList.add(java.lang.Integer.valueOf(currentTimeMillis));
        }
        com.tencent.mars.xlog.Log.i("FinderLiveSlideStatusReport", "addLoadingTime timeMs=" + currentTimeMillis + " size=" + arrayList.size());
    }

    @Override // ym5.q3
    public void d(int i17, rn5.a aVar, boolean z17) {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "onRefreshBegin");
        com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback = this.f435856b;
        finderLiveViewCallback.f111482d.post(new vd2.o4(finderLiveViewCallback));
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((ml2.r0) c17).Zj(ml2.y1.f328248e, -1L, -1L, -1);
    }

    @Override // ym5.q3
    public void e(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "onRefreshEnd");
    }
}
