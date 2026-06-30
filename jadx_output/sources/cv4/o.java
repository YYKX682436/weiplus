package cv4;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcv4/o;", "Lcom/tencent/mm/plugin/lite/api/p;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "plugin-websearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class o extends com.tencent.mm.plugin.lite.api.p implements com.tencent.mm.modelbase.u0 {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiQuerySearchWeb", jSONObject != null ? jSONObject.toString() : null);
        su4.s1 s1Var = new su4.s1(jSONObject != null ? jSONObject.optString("requestId", "") : null, jSONObject != null ? jSONObject.optString("commReq", "") : null, hashCode());
        gm0.j1.d().a(2975, this);
        gm0.j1.d().g(s1Var);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof su4.s1) {
            su4.s1 s1Var = (su4.s1) m1Var;
            if (s1Var.f413092h == hashCode()) {
                gm0.j1.d().q(2975, this);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("retCode", i18);
                if (str == null) {
                    str = "";
                }
                jSONObject.put("errMsg", str);
                jSONObject.put("json", ((r45.e97) s1Var.f413089e.f70711b.f70700a).f373181d);
                jSONObject.put("requestId", s1Var.f413091g);
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiQuerySearchWeb", "request : " + jSONObject);
                this.f143443f.c(jSONObject, false);
            }
        }
    }
}
