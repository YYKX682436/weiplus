package cw2;

/* loaded from: classes10.dex */
public final class ga implements s40.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f223734a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.LiveFeedPlayerView f223735b;

    public ga(long j17, com.tencent.mm.plugin.finder.video.LiveFeedPlayerView liveFeedPlayerView) {
        this.f223734a = j17;
        this.f223735b = liveFeedPlayerView;
    }

    @Override // s40.t0
    public void onLiveStatusCallback(long j17, int i17, java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryToNotifyLiveEnd liveStatus:");
        sb6.append(i17);
        sb6.append(", local liveId:");
        long j18 = this.f223734a;
        sb6.append(j18);
        sb6.append(" resp live id ");
        sb6.append(j17);
        sb6.append('!');
        com.tencent.mars.xlog.Log.i("AbsTXLivePlayListener", sb6.toString());
        if (j18 == j17 && i17 == 2) {
            com.tencent.mm.plugin.finder.video.LiveFeedPlayerView liveFeedPlayerView = this.f223735b;
            mn0.b0 player = liveFeedPlayerView.getPlayer();
            if (player != null) {
                mn0.b0.C(player, true, false, false, 6, null);
            }
            liveFeedPlayerView.Y();
        }
    }
}
