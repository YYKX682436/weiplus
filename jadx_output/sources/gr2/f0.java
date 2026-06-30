package gr2;

/* loaded from: classes10.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.ui.special.view.PlayTogetherVoiceRoomLinkMicView f274766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f274767e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f274768f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.tencent.mm.plugin.finder.nearby.ui.special.view.PlayTogetherVoiceRoomLinkMicView playTogetherVoiceRoomLinkMicView, java.lang.String str, int i17) {
        super(0);
        this.f274766d = playTogetherVoiceRoomLinkMicView;
        this.f274767e = str;
        this.f274768f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.nearby.ui.special.view.PlayTogetherVoiceRoomLinkMicView playTogetherVoiceRoomLinkMicView = this.f274766d;
        java.util.LinkedHashMap linkedHashMap = playTogetherVoiceRoomLinkMicView.f122144f;
        java.lang.String str = this.f274767e;
        km2.q qVar = (km2.q) linkedHashMap.get(str);
        if (qVar != null) {
            int i17 = qVar.f309191v;
            int i18 = this.f274768f;
            if (i17 != i18) {
                qVar.f309191v = i18;
                playTogetherVoiceRoomLinkMicView.w();
                com.tencent.mm.plugin.finder.nearby.ui.special.view.PlayTogetherVoiceRoomLinkMicView.l(playTogetherVoiceRoomLinkMicView, str, i18);
            }
        }
        return jz5.f0.f302826a;
    }
}
