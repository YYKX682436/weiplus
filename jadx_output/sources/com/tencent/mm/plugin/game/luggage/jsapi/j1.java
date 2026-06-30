package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes5.dex */
public final class j1 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "handleDeviceInfo";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        if (q5Var == null || context == null) {
            return;
        }
        org.json.JSONObject e17 = com.tencent.mm.plugin.webview.luggage.util.g.e(str);
        if (e17 == null) {
            q5Var.a("input data is invalidate", null);
            return;
        }
        java.lang.String optString = e17.optString("action");
        com.tencent.mars.xlog.Log.i("handleDeviceInfo", "handleDeviceInfo action=%s", optString);
        if (kotlin.jvm.internal.o.b(be1.x0.NAME, optString)) {
            com.tencent.mars.xlog.Log.i("handleDeviceInfo", be1.x0.NAME);
            double optDouble = e17.optDouble(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, -1.0d);
            if (optDouble < 0.0d || optDouble > 1.0d) {
                q5Var.a("volume should in 0.0-1.0", null);
            } else {
                com.tencent.mm.plugin.appbrand.utils.d5.b(new com.tencent.mm.plugin.game.luggage.jsapi.i1(context, optDouble, this, q5Var));
            }
        }
        if (kotlin.jvm.internal.o.b(be1.j0.NAME, optString)) {
            com.tencent.mm.plugin.appbrand.utils.d5.b(new com.tencent.mm.plugin.game.luggage.jsapi.h1(context, q5Var, this));
        }
        q5Var.a(null, null);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
