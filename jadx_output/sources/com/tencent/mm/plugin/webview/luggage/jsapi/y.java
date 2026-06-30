package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class y extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return com.tencent.mm.plugin.appbrand.jsapi.appdownload.x.NAME;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCancelDownloadTask", "invokeInMM");
        org.json.JSONObject e17 = com.tencent.mm.plugin.webview.luggage.util.g.e(str);
        if (e17 == null) {
            q5Var.a("fail", null);
            return;
        }
        long optLong = e17.optLong("download_id");
        if (optLong <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCancelDownloadTask", "fail, invalid downloadId = " + optLong);
            q5Var.a("invalid_downloadid", null);
            return;
        }
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        if (com.tencent.mm.plugin.downloader.model.r0.i().t(optLong) > 0) {
            q5Var.a(null, null);
        } else {
            q5Var.a("fail", null);
        }
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
