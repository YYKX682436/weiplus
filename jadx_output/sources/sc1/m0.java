package sc1;

/* loaded from: classes7.dex */
public class m0 implements com.tencent.rtmp.ITXLivePushListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f405695b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.t f405696c;

    public m0(sc1.x0 x0Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.t tVar) {
        this.f405695b = i17;
        this.f405696c = tVar;
    }

    @Override // com.tencent.rtmp.ITXLivePushListener
    public void onNetStatus(android.os.Bundle bundle) {
        sc1.v0 v0Var = new sc1.v0(null);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("livePusherId", this.f405695b);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            if (bundle != null) {
                for (java.lang.String str : bundle.keySet()) {
                    jSONObject2.put(str, bundle.get(str));
                }
            }
            jSONObject.put("info", jSONObject2);
        } catch (org.json.JSONException unused) {
        }
        v0Var.f82374f = jSONObject.toString();
        this.f405696c.i(v0Var, null);
    }

    @Override // com.tencent.rtmp.ITXLivePushListener
    public void onPushEvent(int i17, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertLivePusher", "onPushEvent errCode:%d", java.lang.Integer.valueOf(i17));
        sc1.w0 w0Var = new sc1.w0(null);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errCode", i17);
            jSONObject.put("errMsg", bundle.getString(com.tencent.rtmp.TXLiveConstants.EVT_DESCRIPTION));
            jSONObject.put("livePusherId", this.f405695b);
        } catch (org.json.JSONException unused) {
        }
        w0Var.f82374f = jSONObject.toString();
        this.f405696c.i(w0Var, null);
    }
}
