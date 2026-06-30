package z93;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz93/b;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class b extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiFetchW1wPersonalMsgReddot", "fetchW1wPersonalMsgReddot called");
        if (jSONObject == null || !jSONObject.has("fromUsernames") || jSONObject.optJSONArray("fromUsernames") == null) {
            this.f143443f.a("json data is invalid !");
            return;
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("fromUsernames");
        i95.m c17 = i95.n0.c(gr4.f.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        gr4.f fVar = (gr4.f) c17;
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        int length = optJSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.String optString = optJSONArray.optString(i17);
            fr4.g0 g0Var = (fr4.g0) fVar;
            java.lang.String Ui = g0Var.Ui(optString);
            int aj6 = g0Var.aj(optString);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(dm.i4.COL_USERNAME, optString);
            if (Ui == null || Ui.length() == 0) {
                Ui = "";
            } else {
                kotlin.jvm.internal.o.d(Ui);
            }
            jSONObject2.put("reddotId", Ui);
            jSONObject2.put("messageNum", aj6);
            jSONArray.put(jSONObject2);
        }
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        jSONObject3.put("reddotItems", jSONArray);
        this.f143443f.c(jSONObject3, false);
    }
}
