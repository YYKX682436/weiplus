package cv4;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcv4/c;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "plugin-websearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class c extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        org.json.JSONArray optJSONArray;
        java.lang.String optString;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("invoke, reqData: ");
        sb6.append(jSONObject != null ? jSONObject.toString() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiDisposeUniformReddot", sb6.toString());
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (jSONObject != null && (optString = jSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH)) != null) {
                arrayList.add(optString);
            }
            if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("paths")) != null) {
                org.json.JSONArray jSONArray = optJSONArray.length() > 0 ? optJSONArray : null;
                if (jSONArray != null) {
                    int length = jSONArray.length();
                    for (int i17 = 0; i17 < length; i17++) {
                        java.lang.String optString2 = jSONArray.optString(i17);
                        if (optString2 != null) {
                            arrayList.add(optString2);
                        }
                    }
                }
            }
            zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                nk6.N((java.lang.String) it.next());
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.putOpt("retCode", 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiDisposeUniformReddot", "invoke, disposeAllPaths: " + arrayList);
            this.f143443f.c(jSONObject2, false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteAppJsApiDisposeUniformReddot", e17, "invoke", new java.lang.Object[0]);
            this.f143443f.a("Error");
        }
    }
}
