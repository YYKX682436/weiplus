package cw2;

/* loaded from: classes10.dex */
public final class ia extends mn0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.LiveFeedPlayerView f223775d;

    public ia(com.tencent.mm.plugin.finder.video.LiveFeedPlayerView liveFeedPlayerView) {
        this.f223775d = liveFeedPlayerView;
    }

    @Override // com.tencent.rtmp.ITXLivePlayListener
    public void onNetStatus(android.os.Bundle bundle) {
        com.tencent.mm.plugin.finder.video.LiveFeedPlayerView liveFeedPlayerView = this.f223775d;
        int netType = com.tencent.mars.comm.NetStatusUtil.getNetType(liveFeedPlayerView.getContext());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onNetStatus curPlayStatus:");
        sb6.append(liveFeedPlayerView.f130742h);
        sb6.append(", netQuality:");
        sb6.append(netType);
        sb6.append(", isPlaying:");
        mn0.b0 player = liveFeedPlayerView.getPlayer();
        boolean z17 = false;
        sb6.append(player != null && ((mn0.y) player).b(false));
        liveFeedPlayerView.Z(sb6.toString());
        mn0.b0 player2 = liveFeedPlayerView.getPlayer();
        if (player2 != null && ((mn0.y) player2).b(false)) {
            z17 = true;
        }
        if (z17 && netType != -1 && liveFeedPlayerView.f130742h == -2301) {
            liveFeedPlayerView.Z("restart");
            mn0.b0 b0Var = liveFeedPlayerView.player;
            if (b0Var != null) {
                mn0.b0.C(b0Var, false, false, false, 6, null);
            }
            zy2.g5.u(liveFeedPlayerView, null, 1, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x02c5  */
    @Override // mn0.a, com.tencent.rtmp.ITXLivePlayListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPlayEvent(int r27, android.os.Bundle r28) {
        /*
            Method dump skipped, instructions count: 1362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cw2.ia.onPlayEvent(int, android.os.Bundle):void");
    }
}
