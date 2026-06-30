package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class b4 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "setCloseWindowConfirmDialogInfo";
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
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetCloseWindowConfirmDialogInfo", "invoke");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(bVar.f406597b.f344506c.optBoolean(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH));
        java.lang.String optString = bVar.f406597b.f344506c.optString("title_cn");
        java.lang.String optString2 = bVar.f406597b.f344506c.optString("title_eng");
        java.lang.String optString3 = bVar.f406597b.f344506c.optString("ok_cn");
        java.lang.String optString4 = bVar.f406597b.f344506c.optString("ok_eng");
        java.lang.String optString5 = bVar.f406597b.f344506c.optString("cancel_cn");
        java.lang.String optString6 = bVar.f406597b.f344506c.optString("cancel_eng");
        com.tencent.mm.plugin.webview.luggage.y1 y1Var = ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).f182186t;
        if (y1Var == null) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("close_window_confirm_dialog_switch", valueOf.booleanValue());
        bundle.putString("close_window_confirm_dialog_title_cn", optString);
        bundle.putString("close_window_confirm_dialog_title_eng", optString2);
        bundle.putString("close_window_confirm_dialog_ok_cn", optString3);
        bundle.putString("close_window_confirm_dialog_ok_eng", optString4);
        bundle.putString("close_window_confirm_dialog_cancel_cn", optString5);
        bundle.putString("close_window_confirm_dialog_cancel_eng", optString6);
        y1Var.setCloseWindowConfirmInfo(bundle);
        bVar.a();
    }
}
