package rp2;

/* loaded from: classes10.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView f398591d;

    public o(com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView) {
        this.f398591d = nearbyLivePreviewView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ig2.m mVar = ig2.m.f291393a;
        com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView = this.f398591d;
        ig2.r f17 = mVar.f(nearbyLivePreviewView.f121522J);
        if (f17 instanceof ig2.i) {
            ((ig2.i) f17).a();
        }
        nearbyLivePreviewView.p();
    }
}
