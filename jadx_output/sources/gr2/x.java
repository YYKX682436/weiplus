package gr2;

/* loaded from: classes10.dex */
public final class x implements s40.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.ui.special.view.PlayTogetherVoiceRoomLinkMicView f274834a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f274835b;

    public x(com.tencent.mm.plugin.finder.nearby.ui.special.view.PlayTogetherVoiceRoomLinkMicView playTogetherVoiceRoomLinkMicView, long j17) {
        this.f274834a = playTogetherVoiceRoomLinkMicView;
        this.f274835b = j17;
    }

    @Override // s40.t0
    public void onLiveStatusCallback(long j17, int i17, java.lang.Object obj) {
        nn0.c player;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryToNotifyLiveEnd liveStatus:");
        sb6.append(i17);
        sb6.append(", local liveId:");
        long j18 = this.f274835b;
        sb6.append(j18);
        sb6.append(" resp live id ");
        sb6.append(j17);
        sb6.append('!');
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.finder.nearby.ui.special.view.PlayTogetherVoiceRoomLinkMicView playTogetherVoiceRoomLinkMicView = this.f274834a;
        com.tencent.mm.plugin.finder.nearby.ui.special.view.PlayTogetherVoiceRoomLinkMicView.s(playTogetherVoiceRoomLinkMicView, sb7, 0, 2, null);
        if (j18 == j17 && i17 == 2) {
            player = playTogetherVoiceRoomLinkMicView.getPlayer();
            if (player != null) {
                mn0.b0.C(player, true, false, false, 6, null);
            }
            com.tencent.mm.plugin.finder.nearby.ui.special.view.PlayTogetherVoiceRoomLinkMicView.i(playTogetherVoiceRoomLinkMicView);
        }
    }
}
