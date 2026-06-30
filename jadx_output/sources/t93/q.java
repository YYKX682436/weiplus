package t93;

/* loaded from: classes.dex */
public class q extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f143443f.a("data is null");
            return;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("action", com.tencent.mm.plugin.appbrand.jsapi.finder.h0.NAME);
            jSONObject3.put("feedID", jSONObject.optString("feedID"));
            jSONObject3.put("finderUserName", jSONObject.optString(dm.i4.COL_USERNAME));
            jSONObject3.put("commentScene", jSONObject.optInt("commentScene"));
            jSONObject3.put("reportExtraInfo", jSONObject.optString("reportExtraInfo"));
            jSONObject2.put("extInfo", jSONObject3);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1.f460472a.F(com.tencent.mm.sdk.platformtools.x2.f193071a, jSONObject2.toString(), null, null);
            this.f143443f.d(false);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("LiteAppJsApiOpenFinderProfile", e17, "", new java.lang.Object[0]);
            this.f143443f.a("fail");
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
