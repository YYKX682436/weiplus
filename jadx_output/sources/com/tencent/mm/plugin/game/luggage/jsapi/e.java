package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class e extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "batchUpdateWepkg";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        org.json.JSONObject jSONObject;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiBatchUpdateWepkg", "invokeInMM");
        try {
            jSONObject = new org.json.JSONObject(str);
        } catch (org.json.JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiBatchUpdateWepkg", "data is null");
            q5Var.a("fail", null);
            return;
        }
        java.lang.String optString = jSONObject.optString("pkgIdList");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(optString);
                if (jSONArray.length() > 0) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                        arrayList.add(jSONArray.optString(i17));
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.L0(arrayList)) {
                        com.tencent.mm.autogen.events.WepkgNotifyEvent wepkgNotifyEvent = new com.tencent.mm.autogen.events.WepkgNotifyEvent();
                        am.t20 t20Var = wepkgNotifyEvent.f54992g;
                        t20Var.f7969a = 8;
                        t20Var.f7975g = 0;
                        t20Var.f7976h = arrayList;
                        wepkgNotifyEvent.e();
                        q5Var.a(null, null);
                        return;
                    }
                }
            } catch (org.json.JSONException unused2) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiBatchUpdateWepkg", "data is not json");
            }
        }
        q5Var.a("fail", null);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
