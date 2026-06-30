package sc1;

/* loaded from: classes7.dex */
public class u implements com.tencent.rtmp.TXLivePlayer.ITXAudioVolumeEvaluationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f405733a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.t f405734b;

    public u(sc1.z zVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.t tVar) {
        this.f405733a = i17;
        this.f405734b = tVar;
    }

    @Override // com.tencent.rtmp.TXLivePlayer.ITXAudioVolumeEvaluationListener
    public void onAudioVolumeEvaluationNotify(int i17) {
        sc1.v vVar = new sc1.v(null);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("livePlayerId", this.f405733a);
            jSONObject.put("volume", i17);
        } catch (org.json.JSONException unused) {
        }
        vVar.f82374f = jSONObject.toString();
        this.f405734b.i(vVar, null);
    }
}
