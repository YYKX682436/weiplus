package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public final class d extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "addWebViewReportExtInfo";
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
        if (bVar == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("addWebViewReportExtInfo", "invoke");
        org.json.JSONObject jSONObject = bVar.f406597b.f344506c;
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("addWebViewReportExtInfo", "data is null");
            bVar.c("null_data", null);
            return;
        }
        java.lang.String optString = jSONObject.optString("webviewReportExtInfoDict");
        if (optString == null || optString.length() == 0) {
            bVar.c("webviewReportExtInfoDict is null", null);
            return;
        }
        sd.a aVar = (sd.a) bVar.f406596a;
        if (!(aVar instanceof com.tencent.mm.plugin.webview.luggage.e0)) {
            bVar.c("page is not LuggageMMWebPage", null);
            return;
        }
        java.lang.String u17 = ((com.tencent.mm.plugin.webview.luggage.e0) aVar).u();
        kotlin.jvm.internal.o.f(u17, "getUrl(...)");
        kotlin.jvm.internal.o.d(optString);
        e53.e eVar = e53.e.f249632a;
        e53.e.f249635d.put(u17, optString);
        bVar.a();
    }
}
