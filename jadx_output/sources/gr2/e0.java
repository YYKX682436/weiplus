package gr2;

/* loaded from: classes10.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.ui.special.view.PlayTogetherVoiceRoomLinkMicView f274759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f274760e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f274761f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f274762g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f274763h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f274764i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.plugin.finder.nearby.ui.special.view.PlayTogetherVoiceRoomLinkMicView playTogetherVoiceRoomLinkMicView, java.lang.String str, int i17, org.json.JSONObject jSONObject, int i18, float f17) {
        super(0);
        this.f274759d = playTogetherVoiceRoomLinkMicView;
        this.f274760e = str;
        this.f274761f = i17;
        this.f274762g = jSONObject;
        this.f274763h = i18;
        this.f274764i = f17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.nw1 liveInfo;
        r45.ma4 ma4Var;
        com.tencent.mm.plugin.finder.nearby.ui.special.view.PlayTogetherVoiceRoomLinkMicView playTogetherVoiceRoomLinkMicView = this.f274759d;
        km2.q qVar = (km2.q) playTogetherVoiceRoomLinkMicView.f122144f.get(this.f274760e);
        if (qVar != null) {
            qVar.f309191v = this.f274761f;
        }
        fj2.r rVar = fj2.r.f263182a;
        java.util.LinkedHashMap linkedHashMap = playTogetherVoiceRoomLinkMicView.f122144f;
        vp2.i0 i0Var = playTogetherVoiceRoomLinkMicView.f122147i;
        if (i0Var == null || (feedObject = i0Var.getFeedObject()) == null || (liveInfo = feedObject.getLiveInfo()) == null || (ma4Var = (r45.ma4) liveInfo.getCustom(23)) == null || (str = ma4Var.f380301n) == null) {
            str = "";
        }
        java.util.LinkedList h17 = rVar.h(this.f274762g, (km2.q) linkedHashMap.get(str), new gr2.d0(playTogetherVoiceRoomLinkMicView));
        playTogetherVoiceRoomLinkMicView.w();
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            java.lang.String str2 = ((km2.q) entry.getValue()).f309170a;
            if (str2 == null) {
                str2 = "";
            }
            com.tencent.mm.plugin.finder.nearby.ui.special.view.PlayTogetherVoiceRoomLinkMicView.l(playTogetherVoiceRoomLinkMicView, str2, ((km2.q) entry.getValue()).f309191v);
        }
        playTogetherVoiceRoomLinkMicView.f122153r = new xh2.d(h17, this.f274763h, this.f274764i);
        return jz5.f0.f302826a;
    }
}
