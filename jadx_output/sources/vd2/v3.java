package vd2;

/* loaded from: classes3.dex */
public final class v3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f435948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.FinderLiveViewCallback f435949e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f435950f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FinderLiveSwipeToNextEvent f435951g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f435952h;

    public v3(java.util.ArrayList arrayList, com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback, int i17, com.tencent.mm.autogen.events.FinderLiveSwipeToNextEvent finderLiveSwipeToNextEvent, long j17) {
        this.f435948d = arrayList;
        this.f435949e = finderLiveViewCallback;
        this.f435950f = i17;
        this.f435951g = finderLiveSwipeToNextEvent;
        this.f435952h = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList = this.f435948d;
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            com.tencent.mm.live.api.LiveConfig b17 = ((km2.t) it.next()).b();
            if (b17 != null && b17.f68549s == this.f435952h) {
                break;
            } else {
                i17++;
            }
        }
        com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback = this.f435949e;
        if (i17 >= 0) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                km2.m mVar = ((km2.t) it6.next()).f309222d;
                if (mVar != null) {
                    arrayList2.add(mVar);
                }
            }
            com.tencent.mm.plugin.finder.live.FinderLiveViewCallback.j(finderLiveViewCallback, i17, new java.util.ArrayList(arrayList2));
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "LiveSwipeToNextListener: newCurIndex=" + i17 + ", curIndex=" + this.f435950f);
        java.lang.String str = this.f435951g.f54298g.f6347b;
        kotlin.jvm.internal.o.d(str);
        if (!(!r26.n0.N(str))) {
            str = null;
        }
        if (str != null) {
            db5.t7.g(finderLiveViewCallback.f111492q.getContext(), str);
        }
    }
}
