package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class v extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return com.tencent.mm.plugin.appbrand.jsapi.j4.NAME;
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
        com.tencent.mars.xlog.Log.i("MicroMsg.Predownload.WebViewJsApiBatchPreloadMiniProgram", "invokeInOwn");
        org.json.JSONObject jSONObject = bVar.f406597b.f344506c;
        if (jSONObject == null) {
            return;
        }
        java.lang.String preload = ((com.tencent.mm.plugin.appbrand.preload.IAppBrandBatchPreloadController) i95.n0.c(com.tencent.mm.plugin.appbrand.preload.IAppBrandBatchPreloadController.class)).preload(jSONObject, true);
        if (com.tencent.mm.sdk.platformtools.t8.K0(preload)) {
            bVar.c("error", null);
        } else if ("ok".equalsIgnoreCase(preload)) {
            bVar.a();
        } else {
            bVar.c(preload, null);
        }
    }
}
