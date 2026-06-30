package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class r1 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "imagePreview";
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
        if (jSONObject == null) {
            bVar.c("invalid_params", null);
            return;
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("urls");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiImagePreview", "fail, urls is null");
            bVar.c("invalid_url", null);
        } else {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("current", jSONObject.optString("thumbUrl"));
            com.tencent.mm.plugin.webview.modeltools.x0.c(hashMap, ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).f182180p, new com.tencent.mm.plugin.webview.luggage.jsapi.o1(this, bVar, jSONObject));
        }
    }
}
