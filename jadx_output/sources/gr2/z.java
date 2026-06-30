package gr2;

/* loaded from: classes10.dex */
public final class z extends mn0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.ui.special.view.PlayTogetherVoiceRoomLinkMicView f274837d;

    public z(com.tencent.mm.plugin.finder.nearby.ui.special.view.PlayTogetherVoiceRoomLinkMicView playTogetherVoiceRoomLinkMicView) {
        this.f274837d = playTogetherVoiceRoomLinkMicView;
    }

    @Override // com.tencent.rtmp.ITXLivePlayListener
    public void onNetStatus(android.os.Bundle bundle) {
        nn0.c player;
        nn0.c player2;
        com.tencent.mm.plugin.finder.nearby.ui.special.view.PlayTogetherVoiceRoomLinkMicView playTogetherVoiceRoomLinkMicView = this.f274837d;
        int netType = com.tencent.mars.comm.NetStatusUtil.getNetType(playTogetherVoiceRoomLinkMicView.getContext());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onNetStatus curPlayStatus:");
        sb6.append(playTogetherVoiceRoomLinkMicView.f122155t);
        sb6.append(", netQuality:");
        sb6.append(netType);
        sb6.append(", isPlaying:");
        player = playTogetherVoiceRoomLinkMicView.getPlayer();
        sb6.append(player != null && player.b(false));
        com.tencent.mm.plugin.finder.nearby.ui.special.view.PlayTogetherVoiceRoomLinkMicView.s(playTogetherVoiceRoomLinkMicView, sb6.toString(), 0, 2, null);
        player2 = playTogetherVoiceRoomLinkMicView.getPlayer();
        if ((player2 != null && player2.b(false)) && netType != -1 && playTogetherVoiceRoomLinkMicView.f122155t == -2301) {
            playTogetherVoiceRoomLinkMicView.t();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02a4  */
    @Override // mn0.a, com.tencent.rtmp.ITXLivePlayListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPlayEvent(int r29, android.os.Bundle r30) {
        /*
            Method dump skipped, instructions count: 1107
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gr2.z.onPlayEvent(int, android.os.Bundle):void");
    }
}
