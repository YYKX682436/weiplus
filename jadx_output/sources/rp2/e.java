package rp2;

/* loaded from: classes10.dex */
public final class e implements s40.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f398579a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView f398580b;

    public e(long j17, com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView) {
        this.f398579a = j17;
        this.f398580b = nearbyLivePreviewView;
    }

    @Override // s40.t0
    public void onLiveStatusCallback(long j17, int i17, java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryToNotifyLiveEnd liveStatus:");
        sb6.append(i17);
        sb6.append(", local liveId:");
        long j18 = this.f398579a;
        sb6.append(j18);
        sb6.append(" resp live id ");
        sb6.append(j17);
        sb6.append('!');
        com.tencent.mars.xlog.Log.i("AbsTXLivePlayListener", sb6.toString());
        if (j18 == j17 && i17 == 2) {
            com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView = this.f398580b;
            mn0.b0 player = nearbyLivePreviewView.getPlayer();
            if (player != null) {
                mn0.b0.C(player, true, false, false, 6, null);
            }
            com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView.b(nearbyLivePreviewView);
        }
    }
}
