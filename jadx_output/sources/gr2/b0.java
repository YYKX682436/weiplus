package gr2;

/* loaded from: classes10.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.ui.special.view.PlayTogetherVoiceRoomLinkMicView f274753d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.tencent.mm.plugin.finder.nearby.ui.special.view.PlayTogetherVoiceRoomLinkMicView playTogetherVoiceRoomLinkMicView) {
        super(1);
        this.f274753d = playTogetherVoiceRoomLinkMicView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.finder.nearby.ui.special.view.PlayTogetherVoiceRoomLinkMicView playTogetherVoiceRoomLinkMicView = this.f274753d;
        playTogetherVoiceRoomLinkMicView.f122149n = intValue;
        java.util.Iterator it = playTogetherVoiceRoomLinkMicView.f122146h.entrySet().iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView = (com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView) ((android.view.View) ((java.util.Map.Entry) it.next()).getValue()).findViewById(com.tencent.mm.R.id.rtz);
            if (ripperAnimateView != null) {
                ripperAnimateView.setColor(playTogetherVoiceRoomLinkMicView.f122149n);
            }
        }
        return jz5.f0.f302826a;
    }
}
