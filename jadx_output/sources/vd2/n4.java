package vd2;

/* loaded from: classes3.dex */
public final class n4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.FinderLiveViewCallback f435826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f435827e;

    public n4(com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback, int i17) {
        this.f435826d = finderLiveViewCallback;
        this.f435827e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f435826d.z(this.f435827e, -1);
    }
}
