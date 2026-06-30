package com.tencent.mm.plugin.webview.modeltools;

/* loaded from: classes8.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183244d;

    public b1(com.tencent.mm.plugin.webview.modeltools.c1 c1Var, java.lang.String str) {
        this.f183244d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.Exception e17;
        java.lang.String str3;
        org.json.JSONObject jSONObject;
        java.lang.String str4 = this.f183244d;
        try {
            str3 = u46.k.e(str4.substring(1, str4.length() - 1));
            try {
                jSONObject = new org.json.JSONObject(str3);
                str = jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "");
            } catch (java.lang.Exception e18) {
                e = e18;
                str = "";
                str2 = str;
            }
        } catch (java.lang.Exception e19) {
            str = "";
            str2 = str;
            e17 = e19;
            str3 = str2;
        }
        try {
            str2 = jSONObject.optString("music_data", "");
        } catch (java.lang.Exception e27) {
            e = e27;
            str2 = "";
            e17 = e;
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewReportOnLeaveHelper", "reportOnLeave, ex = %s, %s", e17.getMessage(), str3);
            com.tencent.mm.plugin.webview.modeltools.f1.b(str);
            com.tencent.mm.plugin.webview.modeltools.f1.c(str2);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewReportOnLeaveHelper", "reportOnLeave reportData size=%d", java.lang.Integer.valueOf(str4.length()));
        }
        try {
            cy4.b bVar = cy4.b.f224859a;
            if (bVar.a()) {
                try {
                    java.lang.String optString = jSONObject.optString("native_data", "");
                    if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MPVideoPreviewDataMgr", "reportOnLeaveForMP native_data null");
                    } else {
                        bVar.c(optString);
                    }
                } catch (java.lang.Exception e28) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MPVideoPreviewDataMgr", "reportOnLeave, ex = %s", e28.getMessage());
                }
            }
        } catch (java.lang.Exception e29) {
            e17 = e29;
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewReportOnLeaveHelper", "reportOnLeave, ex = %s, %s", e17.getMessage(), str3);
            com.tencent.mm.plugin.webview.modeltools.f1.b(str);
            com.tencent.mm.plugin.webview.modeltools.f1.c(str2);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewReportOnLeaveHelper", "reportOnLeave reportData size=%d", java.lang.Integer.valueOf(str4.length()));
        }
        com.tencent.mm.plugin.webview.modeltools.f1.b(str);
        com.tencent.mm.plugin.webview.modeltools.f1.c(str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewReportOnLeaveHelper", "reportOnLeave reportData size=%d", java.lang.Integer.valueOf(str4.length()));
    }
}
