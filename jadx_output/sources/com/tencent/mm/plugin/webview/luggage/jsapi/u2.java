package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class u2 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "openUrlWithExtraWebview";
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
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenUrlWithExtraWebview", "invokeInOwn");
        java.lang.String optString = bVar.f406597b.f344506c.optString("url");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenUrlWithExtraWebview", "url: %s", optString);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            bVar.c("fail", null);
            return;
        }
        android.net.Uri parse = android.net.Uri.parse(optString);
        java.lang.String queryParameter = parse.getQueryParameter("not_in_game_luggage");
        if (queryParameter == null) {
            queryParameter = "";
        }
        if (!queryParameter.equals("1") && (parse.getHost() == null || parse.getHost().equals(com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fxy)))) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.luggage.jsapi.t2(this, optString, bVar));
            bVar.a();
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", optString);
            j45.l.j(((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).f406610d, "webview", ".ui.tools.WebViewUI", intent, null);
            bVar.a();
        }
    }
}
