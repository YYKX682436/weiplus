package um4;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lum4/e;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "plugin-topstory_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public class e extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiGetSearchDisplayNameList", jSONObject != null ? jSONObject.toString() : null);
        if (jSONObject != null) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA));
                org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                int length = jSONArray.length();
                for (int i17 = 0; i17 < length; i17++) {
                    org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i17);
                    java.lang.String str2 = "";
                    java.lang.String string = jSONObject2.has(dm.i4.COL_ID) ? jSONObject2.getString(dm.i4.COL_ID) : "";
                    if (jSONObject2.has("userName")) {
                        str2 = jSONObject2.getString("userName");
                    }
                    ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                    java.lang.String e17 = c01.a2.e(str2);
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    jSONObject3.put(dm.i4.COL_ID, string);
                    jSONObject3.put("userName", str2);
                    jSONObject3.put("displayName", e17);
                    jSONArray2.put(jSONObject3);
                }
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                jSONObject4.put("retCode", 0);
                jSONObject4.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONArray2.toString());
                this.f143443f.c(jSONObject4, false);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteAppJsApiGetSearchDisplayNameList", e18, "getSearchDisplayNameList", new java.lang.Object[0]);
                this.f143443f.a("Error");
            }
        }
    }
}
