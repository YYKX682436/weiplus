package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public final class q2 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "openFinderCreateAcctView";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenFinderCreateAcctView", "invokeInOwn");
        if (str == null) {
            if (q5Var != null) {
                q5Var.a("data is null", null);
                return;
            }
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE));
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("tipsWording");
                kotlin.jvm.internal.o.f(optJSONObject, "optJSONObject(...)");
                jSONObject2.put("tipsWording", optJSONObject);
                try {
                    zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
                    android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    kotlin.jvm.internal.o.f(context2, "getContext(...)");
                    ((c61.l7) b6Var).qj(context2, null, jSONObject2.toString(), false, new com.tencent.mm.plugin.webview.luggage.jsapi.p2(q5Var));
                } catch (java.lang.Exception unused) {
                    if (q5Var != null) {
                        q5Var.a("fail", null);
                    }
                }
            } catch (org.json.JSONException unused2) {
                if (q5Var != null) {
                    q5Var.a("fail", null);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenFinderCreateAcctView", "paras data error: " + e17.getMessage());
            if (q5Var != null) {
                q5Var.a("data is null", null);
            }
        }
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
