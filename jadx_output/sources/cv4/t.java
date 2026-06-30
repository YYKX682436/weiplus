package cv4;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcv4/t;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "plugin-websearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class t extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String jSONObject2 = jSONObject != null ? jSONObject.toString() : null;
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiReportSearchRealTimeStatistics", jSONObject2, null);
        if (jSONObject != null) {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                r45.lq5 lq5Var = new r45.lq5();
                lq5Var.f379756t = jSONObject.optString("logString", "");
                gm0.j1.d().g(new su4.a2(lq5Var));
                jSONObject3.put("ret", 0);
            } catch (java.lang.Exception unused) {
                jSONObject3.put("ret", -1);
            }
            this.f143443f.c(jSONObject3, false);
        }
    }
}
