package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public class w extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "downloadGameResource";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        if (com.tencent.mm.plugin.webview.luggage.util.a.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiDownloadGameResource", "downloadGameResource isTeenMode and ignore");
            com.tencent.mm.plugin.webview.luggage.util.a.b(context);
            q5Var.a("cancel", null);
        } else {
            try {
                java.lang.String optString = new org.json.JSONObject(str).optString("appId", "");
                ((com.tencent.mm.plugin.game.h0) m33.a1.a()).getClass();
                q43.g.f360094a.h(optString, 0, -1L);
                q5Var.a(null, null);
            } catch (org.json.JSONException unused) {
                q5Var.a("fail", null);
            }
        }
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
