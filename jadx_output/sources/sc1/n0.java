package sc1;

/* loaded from: classes7.dex */
public class n0 implements com.tencent.rtmp.TXLivePusher.OnBGMNotify {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f405700b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.t f405701c;

    public n0(sc1.x0 x0Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.t tVar) {
        this.f405700b = i17;
        this.f405701c = tVar;
    }

    @Override // com.tencent.rtmp.TXLivePusher.OnBGMNotify
    public void onBGMComplete(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertLivePusher", "onBGMComplete, error:%s", java.lang.Integer.valueOf(i17));
        sc1.r0 r0Var = new sc1.r0(null);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errCode", i17);
            jSONObject.put("livePusherId", this.f405700b);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertLivePusher", "onBGMComplete fail", e17);
        }
        r0Var.f82374f = jSONObject.toString();
        this.f405701c.i(r0Var, null);
    }

    @Override // com.tencent.rtmp.TXLivePusher.OnBGMNotify
    public void onBGMProgress(long j17, long j18) {
        sc1.s0 s0Var = new sc1.s0(null);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("progress", j17);
            jSONObject.put("duration", j18);
            jSONObject.put("livePusherId", this.f405700b);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertLivePusher", "onBGMProgress fail", e17);
        }
        s0Var.f82374f = jSONObject.toString();
        this.f405701c.i(s0Var, null);
    }

    @Override // com.tencent.rtmp.TXLivePusher.OnBGMNotify
    public void onBGMStart() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertLivePusher", "onBGMStart");
        sc1.t0 t0Var = new sc1.t0(null);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("livePusherId", this.f405700b);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertLivePusher", "onBGMStart fail", e17);
        }
        t0Var.f82374f = jSONObject.toString();
        this.f405701c.i(t0Var, null);
    }
}
