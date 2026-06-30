package gr2;

/* loaded from: classes10.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.ui.special.view.PlayTogetherVoiceRoomLinkMicView f274780d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.tencent.mm.plugin.finder.nearby.ui.special.view.PlayTogetherVoiceRoomLinkMicView playTogetherVoiceRoomLinkMicView) {
        super(0);
        this.f274780d = playTogetherVoiceRoomLinkMicView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        com.tencent.mm.plugin.finder.nearby.ui.special.view.PlayTogetherVoiceRoomLinkMicView playTogetherVoiceRoomLinkMicView = this.f274780d;
        boolean z18 = playTogetherVoiceRoomLinkMicView.f122157v;
        java.util.LinkedHashMap linkedHashMap = playTogetherVoiceRoomLinkMicView.f122146h;
        if (z18) {
            java.util.Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                android.view.View findViewById = ((android.view.View) ((java.util.Map.Entry) it.next()).getValue()).findViewById(com.tencent.mm.R.id.rtz);
                com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView = findViewById instanceof com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ? (com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView) findViewById : null;
                if (ripperAnimateView != null) {
                    int i17 = com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView.f111717o;
                    ripperAnimateView.e(false);
                }
            }
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
            for (java.util.Map.Entry entry : playTogetherVoiceRoomLinkMicView.f122144f.entrySet()) {
                int i18 = ((km2.q) entry.getValue()).f309191v;
                android.view.View view = (android.view.View) linkedHashMap.get(entry.getKey());
                android.view.View findViewById2 = view != null ? view.findViewById(com.tencent.mm.R.id.rtz) : null;
                com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView2 = findViewById2 instanceof com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ? (com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView) findViewById2 : null;
                if (ripperAnimateView2 != null) {
                    z17 = true;
                    if (pm0.v.z(i18, 1)) {
                        int i19 = com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView.f111717o;
                        ripperAnimateView2.e(false);
                    } else {
                        ripperAnimateView2.setColor(playTogetherVoiceRoomLinkMicView.f122149n);
                        ripperAnimateView2.d();
                        sb6.append(((java.lang.String) entry.getKey()) + '=' + z17 + ',');
                    }
                }
                z17 = false;
                sb6.append(((java.lang.String) entry.getKey()) + '=' + z17 + ',');
            }
            sb6.append("]");
            com.tencent.mm.plugin.finder.nearby.ui.special.view.PlayTogetherVoiceRoomLinkMicView.s(playTogetherVoiceRoomLinkMicView, "updateWaveView: " + ((java.lang.Object) sb6), 0, 2, null);
        }
        return jz5.f0.f302826a;
    }
}
