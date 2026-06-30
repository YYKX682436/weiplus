package cw2;

/* loaded from: classes10.dex */
public final class k3 implements ne2.d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f223802a;

    public k3(java.lang.ref.WeakReference rFinderLivePlayView) {
        kotlin.jvm.internal.o.g(rFinderLivePlayView, "rFinderLivePlayView");
        this.f223802a = rFinderLivePlayView;
    }

    @Override // ne2.d
    public void a(r45.q84 info) {
        kotlin.jvm.internal.o.g(info, "info");
        if (info.getInteger(1) <= 0) {
            com.tencent.mm.plugin.finder.video.FinderLivePlayView finderLivePlayView = (com.tencent.mm.plugin.finder.video.FinderLivePlayView) this.f223802a.get();
            if (finderLivePlayView == null) {
                com.tencent.mars.xlog.Log.i("Finder.FinderLivePlayView", "timer finish bug reference is null!");
            } else {
                int i17 = com.tencent.mm.plugin.finder.video.FinderLivePlayView.f130597p1;
                finderLivePlayView.q(true);
            }
        }
    }
}
