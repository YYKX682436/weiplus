package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class m0 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "disableBounceScroll";
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
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiDisableBounceScroll", "invoke");
        org.json.JSONArray optJSONArray = bVar.f406597b.f344506c.optJSONArray("place");
        if (optJSONArray == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiDisableBounceScroll", "placeArray is null");
            bVar.c("fail", null);
            return;
        }
        boolean z17 = false;
        for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
            if ("top".equalsIgnoreCase(optJSONArray.optString(i17))) {
                z17 = true;
            }
        }
        if (!z17) {
            bVar.a();
            return;
        }
        com.tencent.mm.plugin.webview.luggage.e0 e0Var = (com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a;
        e0Var.M.post(new com.tencent.mm.plugin.webview.luggage.w0(e0Var));
        bVar.a();
    }
}
