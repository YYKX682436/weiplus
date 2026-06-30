package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public final class b0 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "fetchGameCenterEntranceInfo";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        if (q5Var == null || context == null) {
            return;
        }
        com.tencent.mm.autogen.events.QueryGameLifeMsgEvent queryGameLifeMsgEvent = new com.tencent.mm.autogen.events.QueryGameLifeMsgEvent();
        queryGameLifeMsgEvent.e();
        m33.r0 r0Var = m33.q0.f323327a;
        m33.p0 p0Var = r0Var.f323329a;
        if (p0Var == null) {
            am.dp dpVar = queryGameLifeMsgEvent.f54636g;
            if (dpVar.f6484c == null) {
                q5Var.a("sessionid is null", null);
                return;
            } else {
                ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Ai(dpVar.f6484c, new com.tencent.mm.plugin.game.luggage.jsapi.a0(queryGameLifeMsgEvent, this, q5Var));
                return;
            }
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String str2 = p0Var.f323323a;
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put("iconUrl", str2);
        java.lang.String str3 = p0Var.f323324b;
        if (str3 == null) {
            str3 = "";
        }
        jSONObject.put("wording", str3);
        java.lang.String str4 = p0Var.f323325c;
        jSONObject.put("noticeId", str4 != null ? str4 : "");
        jSONObject.put("msgType", p0Var.f323326d);
        q5Var.a(null, jSONObject);
        com.tencent.mars.xlog.Log.i("fetchGameCenterEntranceInfo", "cacheMsg exist iconUrl = " + p0Var.f323323a + "  , wording = " + p0Var.f323324b + ", msgType= " + p0Var.f323326d);
        r0Var.f323329a = null;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
