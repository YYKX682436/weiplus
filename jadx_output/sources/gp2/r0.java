package gp2;

/* loaded from: classes10.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp2.v0 f274310d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(gp2.v0 v0Var) {
        super(0);
        this.f274310d = v0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Iterator it = this.f274310d.f274329e.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView = (com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView) ((java.lang.ref.WeakReference) it.next()).get();
            if (nearbyLivePreviewView != null) {
                com.tencent.mars.xlog.Log.i("NearbyLivePlayerViewRecycler", "checkStopAllView stop view:" + nearbyLivePreviewView + " isPlaying:" + nearbyLivePreviewView.isPlaying());
                if (nearbyLivePreviewView.isPlaying()) {
                    if (nearbyLivePreviewView.isPauseToRemovePlayer) {
                        nearbyLivePreviewView.pause();
                    } else {
                        nearbyLivePreviewView.stop();
                        nearbyLivePreviewView.release();
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
