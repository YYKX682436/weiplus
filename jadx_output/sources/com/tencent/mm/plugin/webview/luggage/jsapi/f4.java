package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class f4 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "setNavigationBarButtons";
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
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetNavigationBarButtons", "invokeInOwn");
        java.lang.String optString = bVar.f406597b.f344506c.optString("left");
        java.lang.String optString2 = bVar.f406597b.f344506c.optString("right");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString) && com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            bVar.c("fail", null);
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        if (optString != null) {
            try {
                if (!optString.isEmpty()) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(optString);
                    java.lang.String e17 = com.tencent.mm.pluginsdk.ui.tools.e9.e(jSONObject.optString("wxcolor", ""));
                    if (com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
                        e17 = jSONObject.optString("color", "");
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
                        bundle.putString("set_navigation_bar_buttons_left_text_color", e17);
                    }
                }
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiSetNavigationBarButtons", e18, "setNavigationBarButtons opt left ", new java.lang.Object[0]);
            }
        }
        if (optString2 != null) {
            try {
                if (!optString2.isEmpty()) {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject(optString2);
                    boolean optBoolean = jSONObject2.optBoolean("hidden", false);
                    java.lang.String optString3 = jSONObject2.optString(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, "");
                    java.lang.String k17 = com.tencent.mm.pluginsdk.ui.tools.e9.k(jSONObject2.optString("iconData", ""));
                    if (k17 == null) {
                        k17 = "";
                    }
                    java.lang.String e19 = com.tencent.mm.pluginsdk.ui.tools.e9.e(jSONObject2.optString("wxcolor", ""));
                    if (com.tencent.mm.sdk.platformtools.t8.K0(e19)) {
                        e19 = jSONObject2.optString("color", "");
                    }
                    boolean optBoolean2 = jSONObject2.optBoolean("needClickEvent", false);
                    if (optBoolean) {
                        bundle.putBoolean("set_navigation_bar_buttons_hide_right_button", true);
                    } else {
                        bundle.putString("set_navigation_bar_buttons_text", optString3);
                        bundle.putString("set_navigation_bar_buttons_icon_data", k17);
                        bundle.putString("set_navigation_bar_buttons_text_color", e19);
                        bundle.putBoolean("set_navigation_bar_buttons_need_click_event", optBoolean2);
                    }
                }
            } catch (java.lang.Exception e27) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiSetNavigationBarButtons", e27, "setNavigationBarButtons opt right ", new java.lang.Object[0]);
            }
        }
        if (bundle.size() < 0) {
            bVar.c("fail", null);
            return;
        }
        com.tencent.mm.plugin.webview.luggage.y1 y1Var = ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).f182186t;
        if (y1Var == null) {
            bVar.c("fail", null);
        } else {
            y1Var.setNavigationBarButtons(bundle);
            bVar.a();
        }
    }
}
