package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class n0 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 implements com.tencent.mm.ipcinvoker.j {

    @mk0.a
    /* loaded from: classes.dex */
    public static class a implements com.tencent.mm.ipcinvoker.j {
        private a() {
        }

        @Override // com.tencent.mm.ipcinvoker.j
        public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(((android.os.Bundle) obj).getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA));
                tw4.d.a(jSONObject.optString("eventName"), jSONObject.optJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA));
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("JsApiDispatchEvent", e17, "", new java.lang.Object[0]);
            }
        }
    }

    @Override // sd.c
    public java.lang.String b() {
        return "dispatchEvent";
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
        org.json.JSONObject jSONObject = bVar.f406597b.f344506c;
        if (jSONObject == null || jSONObject.length() == 0) {
            com.tencent.mars.xlog.Log.e("JsApiDispatchEvent", "dispatch liteapp  process data: empty");
            bVar.c("fail: dispatch liteapp  process data: empty", null);
            return;
        }
        if (jSONObject.has("liteAppInfo")) {
            com.tencent.mars.xlog.Log.i("JsApiDispatchEvent", "dispatch liteapp  process data:%s", jSONObject.toString());
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject.toString());
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, getClass(), null);
            bVar.a();
            return;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String str = com.tencent.mm.sdk.platformtools.w9.f193055c;
        if (com.tencent.mm.sdk.platformtools.t8.R0(context, str)) {
            if (!com.tencent.mm.sdk.platformtools.x2.n() || jSONObject.optLong("liteCallbackId", 0L) == 0) {
                tw4.d.a(jSONObject.optString("eventName"), jSONObject.optJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA));
                bVar.a();
            } else {
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject.toString());
                com.tencent.mm.ipcinvoker.d0.d(str, bundle2, com.tencent.mm.plugin.webview.luggage.jsapi.n0.a.class, null);
                bVar.a();
            }
        }
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(bundle.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA));
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("liteAppInfo");
            java.lang.String optString = jSONObject.optString("eventName");
            if (optJSONObject != null && ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Ij()) {
                com.tencent.mm.plugin.lite.LiteAppCenter.dispatchStore(optJSONObject.optString("appId"), optString, (java.lang.Object) bundle.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA));
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("JsApiDispatchEvent", e17, "", new java.lang.Object[0]);
        }
    }
}
