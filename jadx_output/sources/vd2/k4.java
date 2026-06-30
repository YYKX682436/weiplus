package vd2;

/* loaded from: classes3.dex */
public final class k4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f435787d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.FinderLiveViewCallback f435788e;

    public k4(int i17, com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback) {
        this.f435787d = i17;
        this.f435788e = finderLiveViewCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("lxltest onSelectLive step2 pos:");
        int i17 = this.f435787d;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", sb6.toString());
        this.f435788e.z(i17, -1);
    }
}
