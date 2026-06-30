package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class c extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "addGameDownloadTask";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        if (com.tencent.mm.plugin.webview.luggage.util.a.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAddGameDownloadTask", "addGameDownloadTask isTeenMode and ignore");
            com.tencent.mm.plugin.webview.luggage.util.a.b(context);
            q5Var.a("cancel", null);
            return;
        }
        try {
            com.tencent.mm.plugin.downloader_app.model.a b17 = com.tencent.mm.plugin.downloader_app.model.a.b(new org.json.JSONObject(str));
            vz.a2 a2Var = (vz.a2) i95.n0.c(vz.a2.class);
            com.tencent.mm.plugin.game.luggage.jsapi.b bVar = new com.tencent.mm.plugin.game.luggage.jsapi.b(this, q5Var);
            ((uz.c2) a2Var).getClass();
            com.tencent.mm.plugin.downloader.model.j1.c(context, b17, false, bVar);
        } catch (org.json.JSONException unused) {
            q5Var.a("fail", null);
        }
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
