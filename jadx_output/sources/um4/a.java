package um4;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lum4/a;", "Lcom/tencent/mm/plugin/lite/api/p;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "plugin-topstory_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public class a extends com.tencent.mm.plugin.lite.api.p implements com.tencent.mm.modelbase.u0 {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String optString;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiQueryWebCommCgi", jSONObject != null ? jSONObject.toString() : null);
        if (jSONObject != null) {
            try {
                optString = jSONObject.optString("requestId", "");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteAppJsApiQueryWebCommCgi", e17, "invoke", new java.lang.Object[0]);
                this.f143443f.a("Error");
                return;
            }
        } else {
            optString = null;
        }
        gm0.j1.d().g(new sm4.a(optString, jSONObject != null ? jSONObject.optString("commReq", "") : null));
        gm0.j1.d().a(2582, this);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("retCode", i18);
            gm0.j1.d().q(2582, this);
            if (i17 == 0 && i18 == 0) {
                kotlin.jvm.internal.o.e(m1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.topstory.api.netscene.NetSceneSearchWebComm");
                jSONObject.put("commResp", ((r45.e97) ((sm4.a) m1Var).f409923e.f70711b.f70700a).f373181d);
                jSONObject.put("requestId", ((r45.e97) ((sm4.a) m1Var).f409923e.f70711b.f70700a).f373182e);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.LiteAppJsApiQueryWebCommCgi", "NetSceneSearchWebComm response, errType:%s, errCode:%s, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
                kotlin.jvm.internal.o.e(m1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.topstory.api.netscene.NetSceneSearchWebComm");
                jSONObject.put("requestId", ((sm4.a) m1Var).f409925g);
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteAppJsApiQueryWebCommCgi", e17, "onSceneEnd", new java.lang.Object[0]);
            this.f143443f.a("Error");
        }
        this.f143443f.c(jSONObject, false);
    }
}
