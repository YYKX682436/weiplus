package cv4;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcv4/i;", "Lcom/tencent/mm/plugin/lite/api/p;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "plugin-websearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class i extends com.tencent.mm.plugin.lite.api.p implements com.tencent.mm.modelbase.u0 {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiGetSearchSuggestionData", jSONObject != null ? jSONObject.toString() : null);
        if (jSONObject != null) {
            su4.r1 r1Var = new su4.r1();
            try {
                r1Var.f413062b = java.net.URLDecoder.decode(jSONObject.optString("query", ""), com.tencent.mapsdk.internal.rv.f51270c);
            } catch (java.lang.Exception unused) {
            }
            r1Var.f413085y = jSONObject.optString("requestId");
            r1Var.f413064d = jSONObject.optInt("type", 0);
            r1Var.f413066f = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
            r1Var.f413061a = jSONObject.optInt("isHomePage", 0);
            r1Var.f413077q = hashCode();
            r1Var.H = jSONObject.optInt("version", 0);
            java.lang.String optString = jSONObject.optString("prefixQuery", "");
            java.lang.String str2 = true ^ (optString == null || optString.length() == 0) ? optString : null;
            if (str2 != null) {
                r1Var.f413072l.add(str2);
            }
            int optInt = jSONObject.optInt("requestType", 0);
            java.lang.String optString2 = jSONObject.optString("extReqParams", "");
            kotlin.jvm.internal.o.f(optString2, "optString(...)");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
                try {
                    org.json.JSONArray jSONArray = new org.json.JSONArray(optString2);
                    int length = jSONArray.length();
                    for (int i17 = 0; i17 < length; i17++) {
                        org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i17);
                        r45.x50 x50Var = new r45.x50();
                        x50Var.f389788d = jSONObject2.optString("key", "");
                        x50Var.f389789e = jSONObject2.optInt("uintValue", 0);
                        x50Var.f389790f = jSONObject2.optString("textValue", "");
                        r1Var.f413075o.add(x50Var);
                    }
                } catch (java.lang.Exception unused2) {
                }
            }
            jSONObject.optInt("subtype", 0);
            if (optInt != 0) {
                return;
            }
            su4.o1 o1Var = new su4.o1(r1Var);
            gm0.j1.d().a(1161, this);
            gm0.j1.d().g(o1Var);
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof su4.o1) {
            su4.o1 o1Var = (su4.o1) m1Var;
            if (o1Var.f413027h.f413077q == hashCode()) {
                com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
                o1Var.getClass();
                d17.q(1161, this);
                if (i17 != 0 || i18 != 0) {
                    this.f143443f.a("netScene fail");
                    com.tencent.mars.xlog.Log.w("MicroMsg.LiteAppJsApiGetSearchSuggestionData", "NetSceneMMWebSuggest fail, " + i18 + ", " + i17 + ", " + str);
                    return;
                }
                r45.aa7 aa7Var = o1Var.f413026g;
                if (aa7Var != null) {
                    java.lang.String str2 = aa7Var.f369877f;
                    if (str2 == null) {
                        str2 = "{}";
                    }
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
                    jSONObject.put("requestID", o1Var.f413027h.f413085y);
                    org.json.JSONObject put = new org.json.JSONObject().put("json", jSONObject.toString()).put("jsonRefer", 2);
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiGetSearchSuggestionData", "callback " + put);
                    this.f143443f.c(put, false);
                }
            }
        }
    }
}
