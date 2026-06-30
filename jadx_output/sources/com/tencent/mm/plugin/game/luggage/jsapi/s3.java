package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class s3 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "reportGamePageTime";
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
        java.lang.String optString = jSONObject.optString("reportId");
        boolean z17 = jSONObject.optInt("reportInstantly", 0) == 1;
        boolean z18 = jSONObject.optInt("reportTimeBegin", 0) == 1;
        java.lang.String optString2 = jSONObject.optString("reportFormatData");
        java.lang.String optString3 = jSONObject.optString("reportTabsFormatData");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiReportGamePageTime", "reportId is null or nil");
            bVar.c("invalid_reportId", null);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString2) && com.tencent.mm.sdk.platformtools.t8.K0(optString3)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiReportGamePageTime", "reportFormatData && reportTabsFormatData is null or nil");
            bVar.c("invalid_reportFormatData_reportTabsFormatData", null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiReportGamePageTime", "reportGamePageTime, reportId:%s, reportInstantly:%b, reportTimeBegin:%b, reportFormatData:(%s), reportTabsFormatData(%s)", optString, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), optString2, optString3);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("game_page_report_id", optString);
        bundle.putBoolean("game_page_report_instantly", z17);
        bundle.putBoolean("game_page_report_time_begin", z18);
        bundle.putString("game_page_report_format_data", optString2);
        bundle.putString("game_page_report_tabs_format_data", optString3);
        ((com.tencent.mm.plugin.game.luggage.page.x0) bVar.f406596a).L1.f413666f.c(bundle);
        bVar.a();
    }
}
