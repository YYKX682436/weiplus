package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public final class u0 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "getPageStatus";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
        if (bVar == null) {
            return;
        }
        org.json.JSONObject jSONObject = bVar.f406597b.f344506c;
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("getPageStatus", "data is null");
            bVar.c("null_data", null);
            return;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("pageShow", ((com.tencent.mm.plugin.game.luggage.page.x0) bVar.f406596a).G1);
        bVar.e(jSONObject2);
        if (jSONObject.optBoolean("needReport")) {
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("clientReportDict");
            if (optJSONObject == null) {
                com.tencent.mars.xlog.Log.e("getPageStatus", "clientReportDict is null");
                return;
            }
            int optInt = optJSONObject.optInt("logId", 27792);
            com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCInteger(optInt), com.tencent.mm.plugin.game.luggage.jsapi.t0.class);
            if (!(iPCBoolean == null ? true : iPCBoolean.f68400d)) {
                com.tencent.mars.xlog.Log.e("getPageStatus", "gamelog.jsapi, getPageStatus , logId = " + optInt + "  not exist in globalConfig FrontEndReport");
                return;
            }
            java.lang.String optString = optJSONObject.optString("reportStr", "");
            java.lang.String optString2 = optJSONObject.optString("timePlaceHolderKey", "");
            boolean optBoolean = optJSONObject.optBoolean("isTimeMillSecond", false);
            if (!(optString == null || optString.length() == 0)) {
                if (!(optString2 == null || optString2.length() == 0)) {
                    sd.d dVar = bVar.f406596a;
                    long currentTimeMillis = ((com.tencent.mm.plugin.game.luggage.page.x0) dVar).G1 ? (((com.tencent.mm.plugin.game.luggage.page.x0) dVar).O1 + java.lang.System.currentTimeMillis()) - ((com.tencent.mm.plugin.game.luggage.page.x0) bVar.f406596a).N1 : ((com.tencent.mm.plugin.game.luggage.page.x0) dVar).O1;
                    if (!optBoolean) {
                        currentTimeMillis /= 1000;
                    }
                    e53.b bVar2 = e53.b.f249612a;
                    kotlin.jvm.internal.o.d(optString2);
                    kotlin.jvm.internal.o.d(optString);
                    if (optString2.length() == 0) {
                        return;
                    }
                    if (optString.length() == 0) {
                        return;
                    }
                    java.lang.String t17 = r26.i0.t(optString, optString2, java.lang.String.valueOf(currentTimeMillis), false);
                    com.tencent.mars.xlog.Log.i("MicroMsg.GamePageTimeReport", "gamelog.report, logId = " + optInt + ", reportNow, reportDuration:" + currentTimeMillis + ", reportContent = " + t17);
                    jx3.f.INSTANCE.f(optInt, t17, true, false);
                    return;
                }
            }
            com.tencent.mars.xlog.Log.e("getPageStatus", "gamelog.jsapi, getPageStatus , reportStr or timePlaceHolderKey is null");
        }
    }
}
