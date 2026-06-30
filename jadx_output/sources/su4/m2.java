package su4;

/* loaded from: classes8.dex */
public class m2 implements com.tencent.mm.modelbase.u0 {
    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        su4.n2 n2Var;
        su4.n2 n2Var2 = su4.n2.Valid;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchConfigLogic", "errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (m1Var instanceof su4.y1) {
            gm0.j1.d().q(1948, su4.o2.f413033f);
            com.tencent.mm.autogen.events.WebSearchConfigEvent webSearchConfigEvent = new com.tencent.mm.autogen.events.WebSearchConfigEvent();
            am.h20 h20Var = webSearchConfigEvent.f54980g;
            if (i17 == 0 && i18 == 0) {
                su4.y1 y1Var = (su4.y1) m1Var;
                r45.x97 x97Var = y1Var.f413144g;
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchConfigLogic", "getWebSearchConfig onSceneEnd %s", x97Var.f389903d);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(x97Var.f389903d)) {
                    java.lang.String str2 = y1Var.f413143f.f388994f;
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(x97Var.f389903d);
                        jSONObject.put(dm.i4.COL_UPDATETIME, java.lang.System.currentTimeMillis());
                        java.lang.String jSONObject2 = jSONObject.toString();
                        gm0.j1.u().c().x(su4.o2.b(str2), jSONObject2);
                        try {
                            ((java.util.HashMap) su4.o2.f413029b).put(jSONObject2, new org.json.JSONObject(jSONObject2));
                        } catch (org.json.JSONException e17) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchConfigLogic", e17, "", new java.lang.Object[0]);
                        }
                        n2Var = n2Var2;
                    } catch (org.json.JSONException unused) {
                        n2Var = su4.n2.Invalid;
                    }
                    if (n2Var == n2Var2) {
                        h20Var.getClass();
                    }
                }
                h20Var.getClass();
            } else {
                h20Var.getClass();
            }
            webSearchConfigEvent.e();
        }
    }
}
