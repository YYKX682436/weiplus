package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class q0 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {

    /* renamed from: e, reason: collision with root package name */
    public android.app.ProgressDialog f182441e = null;

    @Override // sd.c
    public java.lang.String b() {
        return "downloadImage";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        org.json.JSONObject e17 = com.tencent.mm.plugin.webview.luggage.util.g.e(str);
        if (e17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiDownLoadImage", "data is null");
            q5Var.a("invalid_data", null);
            return;
        }
        java.lang.String optString = e17.optString("preVerifyAppId");
        java.lang.String optString2 = e17.optString("serverId");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.P(e17.optString("isShowProgressTips", "0"), 0) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiDownLoadImage", "doDownLoadImage, appid is : %s, media id is : %s", optString, optString2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString) || com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            q5Var.a("missing arguments", null);
            return;
        }
        com.tencent.mm.plugin.webview.luggage.jsapi.o0 o0Var = new com.tencent.mm.plugin.webview.luggage.jsapi.o0(this, optString2, q5Var);
        com.tencent.mm.plugin.webview.modeltools.z.bj().a(optString, optString2, o0Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiDownLoadImage", "doDownLoadImage, add cdn download task result : %b", java.lang.Boolean.TRUE);
        if (z17) {
            this.f182441e = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), context.getString(com.tencent.mm.R.string.laq), true, true, new com.tencent.mm.plugin.webview.luggage.jsapi.p0(this, o0Var, optString2, q5Var));
        }
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
