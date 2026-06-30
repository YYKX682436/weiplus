package t93;

/* loaded from: classes.dex */
public class h extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f143443f.a("data is null");
            return;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("action", "openFinderFeed");
            jSONObject3.put("feedID", jSONObject.optString("feedId"));
            jSONObject3.put("nonceID", jSONObject.optString("nonceId"));
            jSONObject3.put("notGetReleatedList", jSONObject.optInt("notGetReleatedList"));
            jSONObject3.put("shareScene", jSONObject.optInt("shareScene"));
            jSONObject3.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, jSONObject.optString(""));
            jSONObject3.put("requestScene", jSONObject.optInt("requestScene", 3));
            jSONObject3.put("reportExtraInfo", jSONObject.optString("reportExtraInfo"));
            jSONObject3.put("commentScene", jSONObject.optInt("commentScene"));
            jSONObject3.put("userName", jSONObject.optString("finderUserName"));
            jSONObject2.put("extInfo", jSONObject3);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1.f460472a.F(com.tencent.mm.sdk.platformtools.x2.f193071a, jSONObject2.toString(), null, null);
            this.f143443f.d(false);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("LiteAppJsApiOpenChannelsActivity", e17, "", new java.lang.Object[0]);
            this.f143443f.a("fail");
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
