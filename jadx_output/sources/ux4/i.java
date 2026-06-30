package ux4;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lux4/i;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class i extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiUpdateSearchReddotTimeStamps", "[updateSearchReddotTimeStamps] appId = " + str + ", data = " + jSONObject);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        if (jSONObject != null) {
            try {
                long optLong = jSONObject.optLong("reddotTimeStamps", 0L);
                ((lf0.u) ((mf0.z) i95.n0.c(mf0.z.class))).getClass();
                ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().J(optLong);
                if (jSONObject2.put("ret", 0) == null) {
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteAppJsApiUpdateSearchReddotTimeStamps", e17, "updateSearchReddotTimeStamps", new java.lang.Object[0]);
                jSONObject2.put("ret", -1);
            }
            this.f143443f.c(jSONObject2, false);
        }
        jSONObject2.put("ret", -1);
        this.f143443f.c(jSONObject2, false);
    }
}
