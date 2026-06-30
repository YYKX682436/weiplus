package sc1;

/* loaded from: classes7.dex */
public class p0 implements com.tencent.rtmp.TXLivePusher.ITXAudioVolumeEvaluationListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f405709b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.t f405710c;

    public p0(sc1.x0 x0Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.t tVar) {
        this.f405709b = i17;
        this.f405710c = tVar;
    }

    @Override // com.tencent.rtmp.TXLivePusher.ITXAudioVolumeEvaluationListener
    public void onAudioVolumeEvaluationNotify(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertLivePusher", "onAudioVolumeEvaluationNotify, volume:%s", java.lang.Integer.valueOf(i17));
        sc1.q0 q0Var = new sc1.q0(null);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("volume", i17);
            jSONObject.put("livePusherId", this.f405709b);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertLivePusher", "onAudioVolumeEvaluationNotify fail", e17);
        }
        q0Var.f82374f = jSONObject.toString();
        this.f405710c.i(q0Var, null);
    }
}
