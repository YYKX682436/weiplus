package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class o4 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "sendMessageToLiteApp";
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
        java.lang.Long l17;
        java.lang.Long l18;
        org.json.JSONObject jSONObject = bVar.f406597b.f344506c;
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("target");
        if (optJSONObject == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSendMessageToLiteApp", "target is null");
            bVar.c("target is null", null);
            return;
        }
        java.lang.String optString = optJSONObject.optString("type");
        long j17 = 0L;
        long j18 = 0L;
        if (optString.equals(ya.b.SOURCE)) {
            android.content.Context context = ((com.tencent.mm.plugin.game.luggage.page.x0) bVar.f406596a).f406610d;
            if (!(context instanceof android.app.Activity)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSendMessageToLiteApp", "context is not Activity %s", context.getClass().getName());
                bVar.c("context is not Activity", null);
                return;
            } else {
                android.app.Activity activity = (android.app.Activity) context;
                l17 = java.lang.Long.valueOf(activity.getIntent().getLongExtra("liteAppUuid", 0L));
                l18 = java.lang.Long.valueOf(activity.getIntent().getLongExtra("liteAppPageId", 0L));
            }
        } else {
            if (!optString.equals("liteapp")) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSendMessageToLiteApp", "Invalid target type");
                bVar.c("Invalid target type", null);
                return;
            }
            java.lang.String[] split = optJSONObject.optString(dm.i4.COL_ID).split("_");
            if (split.length == 2) {
                j17 = java.lang.Long.valueOf(java.lang.Long.parseLong(split[0]));
                j18 = java.lang.Long.valueOf(java.lang.Long.parseLong(split[1]));
            }
            l17 = j17;
            l18 = j18;
        }
        if (l17.longValue() == 0 || l18.longValue() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSendMessageToLiteApp", "appUuid or pageId error");
            bVar.c("appUuid or pageId error", null);
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong("appUuid", l17.longValue());
        bundle.putLong("pageId", l18.longValue());
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("type", "gameWebview");
            sd.o0 o0Var = ((com.tencent.mm.plugin.game.luggage.page.x0) bVar.f406596a).f406655i;
            jSONObject3.put(dm.i4.COL_ID, java.lang.Integer.toString(o0Var != null ? o0Var.f406639r : 0));
            jSONObject2.put(ya.b.SOURCE, jSONObject3);
            jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject.optJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA));
            bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject2.toString());
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.game.luggage.jsapi.n4.class, new com.tencent.mm.plugin.game.luggage.jsapi.m4(this, bVar));
        } catch (org.json.JSONException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSendMessageToLiteApp", "json exception");
            bVar.c("json exception", null);
        }
    }
}
