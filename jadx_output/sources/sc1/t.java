package sc1;

/* loaded from: classes7.dex */
public class t implements com.tencent.rtmp.ITXLivePlayListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f405731d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.t f405732e;

    public t(sc1.z zVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.t tVar) {
        this.f405731d = i17;
        this.f405732e = tVar;
    }

    @Override // com.tencent.rtmp.ITXLivePlayListener
    public void onNetStatus(android.os.Bundle bundle) {
        sc1.x xVar = new sc1.x(null);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("livePlayerId", this.f405731d);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            if (bundle != null) {
                for (java.lang.String str : bundle.keySet()) {
                    jSONObject2.put(str, bundle.get(str));
                }
            }
            jSONObject.put("info", jSONObject2);
        } catch (org.json.JSONException unused) {
        }
        xVar.f82374f = jSONObject.toString();
        this.f405732e.i(xVar, null);
    }

    @Override // com.tencent.rtmp.ITXLivePlayListener
    public void onPlayEvent(int i17, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertLivePlayer", "onPlayEvent errCode:%d", java.lang.Integer.valueOf(i17));
        sc1.y yVar = new sc1.y(null);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errCode", i17);
            jSONObject.put("errMsg", bundle.getString(com.tencent.rtmp.TXLiveConstants.EVT_DESCRIPTION));
            jSONObject.put("livePlayerId", this.f405731d);
        } catch (org.json.JSONException unused) {
        }
        yVar.f82374f = jSONObject.toString();
        this.f405732e.i(yVar, null);
    }
}
