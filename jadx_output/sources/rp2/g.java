package rp2;

/* loaded from: classes10.dex */
public final class g extends mn0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView f398582d;

    public g(com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView) {
        this.f398582d = nearbyLivePreviewView;
    }

    @Override // com.tencent.rtmp.ITXLivePlayListener
    public void onNetStatus(android.os.Bundle bundle) {
        com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView = this.f398582d;
        int netType = com.tencent.mars.comm.NetStatusUtil.getNetType(nearbyLivePreviewView.getContext());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onNetStatus curPlayStatus:");
        sb6.append(nearbyLivePreviewView.f121530n);
        sb6.append(", netQuality:");
        sb6.append(netType);
        sb6.append(", isPlaying:");
        mn0.b0 player = nearbyLivePreviewView.getPlayer();
        sb6.append(player != null && ((mn0.y) player).b(false));
        nearbyLivePreviewView.r(sb6.toString());
        mn0.b0 player2 = nearbyLivePreviewView.getPlayer();
        if ((player2 != null && ((mn0.y) player2).b(false)) && netType != -1 && nearbyLivePreviewView.f121530n == -2301) {
            nearbyLivePreviewView.t();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0272  */
    @Override // mn0.a, com.tencent.rtmp.ITXLivePlayListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPlayEvent(int r27, android.os.Bundle r28) {
        /*
            Method dump skipped, instructions count: 1212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rp2.g.onPlayEvent(int, android.os.Bundle):void");
    }
}
