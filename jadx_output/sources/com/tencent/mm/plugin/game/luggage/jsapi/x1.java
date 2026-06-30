package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class x1 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return com.tencent.mm.plugin.appbrand.jsapi.fakenative.h.NAME;
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
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenBusinessView", "invokeInOwn");
        org.json.JSONObject jSONObject = bVar.f406597b.f344506c;
        if (jSONObject == null) {
            bVar.c("request data is null", null);
            return;
        }
        java.lang.String optString = jSONObject.optString("businessType", "");
        java.lang.String optString2 = jSONObject.optString("referrerAppId", "");
        java.lang.String u17 = ((com.tencent.mm.plugin.game.luggage.page.x0) bVar.f406596a).u();
        java.util.HashMap hashMap = new java.util.HashMap();
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            hashMap.put("err_code", -4);
            bVar.b("openBusinessView:fail invalid businessType", hashMap);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            hashMap.put("err_code", -1);
            bVar.b("openBusinessView:fail invalid referrerAppId", hashMap);
            return;
        }
        java.lang.String optString3 = jSONObject.optString("envVersion", "");
        if (optString3 == null) {
            optString3 = "";
        }
        int i17 = !optString3.equals("trial") ? !optString3.equals("develop") ? 0 : 1 : 2;
        java.lang.String optString4 = jSONObject.optString("queryString", "");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("businessType", optString);
        bundle.putString("queryString", optString4);
        bundle.putString("referrerAppId", optString2);
        bundle.putString("referrerUrl", u17);
        bundle.putInt("versionType", i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenBusinessView", "doOpenBusinessView appid:%s, businessType:%s, queryString:%s, referrerUrl:%s", optString2, optString, optString4, u17);
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.game.luggage.jsapi.JsApiOpenBusinessView$OpenWxAppData(bundle), com.tencent.mm.plugin.game.luggage.jsapi.w1.class, new com.tencent.mm.plugin.game.luggage.jsapi.u1(this, hashMap, bVar));
    }
}
