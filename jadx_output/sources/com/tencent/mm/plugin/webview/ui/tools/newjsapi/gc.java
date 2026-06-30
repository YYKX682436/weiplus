package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class gc extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.gc f186206d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gc();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.String str = (java.lang.String) msg.f340790a.get("left");
        java.lang.String str2 = (java.lang.String) msg.f340790a.get("right");
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        nw4.g gVar = env.f340863d;
        if (K0 && com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            gVar.e(msg.f341013c, "setNavigationBarButtons:fail", null);
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            if (str != null) {
                try {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetNavigationBarButtons", "parsing left");
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                    java.lang.String e17 = com.tencent.mm.pluginsdk.ui.tools.e9.e(jSONObject.optString("wxcolor", ""));
                    if (com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
                        e17 = jSONObject.optString("color", "");
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
                        bundle.putString("set_navigation_bar_buttons_left_text_color", e17);
                    }
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiSetNavigationBarButtons", e18, "setNavigationBarButtons opt left ", new java.lang.Object[0]);
                }
            }
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetNavigationBarButtons", "parsing right");
                java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(str2);
                boolean optBoolean = jSONObject2.optBoolean("hidden", false);
                boolean optBoolean2 = jSONObject2.optBoolean("forceHiddenSearchIcon", false);
                java.lang.String optString = jSONObject2.optString(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, "");
                java.lang.String k17 = com.tencent.mm.pluginsdk.ui.tools.e9.k(jSONObject2.optString("iconData", ""));
                if (k17 == null) {
                    k17 = "";
                }
                java.lang.String e19 = com.tencent.mm.pluginsdk.ui.tools.e9.e(jSONObject2.optString("wxcolor", ""));
                if (com.tencent.mm.sdk.platformtools.t8.K0(e19)) {
                    e19 = jSONObject2.optString("color", "");
                }
                boolean optBoolean3 = jSONObject2.optBoolean("needClickEvent", false);
                if (optBoolean) {
                    bundle.putBoolean("set_navigation_bar_buttons_hide_right_button", true);
                } else {
                    bundle.putString("set_navigation_bar_buttons_text", optString);
                    bundle.putString("set_navigation_bar_buttons_icon_data", k17);
                    bundle.putString("set_navigation_bar_buttons_text_color", e19);
                    bundle.putBoolean("set_navigation_bar_buttons_need_click_event", optBoolean3);
                }
                bundle.putBoolean("set_navigation_bar_buttons_force_hide_right_search_icon", optBoolean2);
                bundle.putBoolean("set_navigation_bar_right_style", true);
            } catch (java.lang.Exception e27) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiSetNavigationBarButtons", e27, "setNavigationBarButtons opt right ", new java.lang.Object[0]);
            }
            if (bundle.size() < 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetNavigationBarButtons", "params size = 0");
                gVar.e(msg.f341013c, "setNavigationBarButtons:fail_invalid_params", null);
            } else {
                try {
                    com.tencent.mm.plugin.webview.stub.z0 b17 = env.b();
                    if (b17 != null) {
                        b17.i(44, bundle);
                    }
                    gVar.e(msg.f341013c, "setNavigationBarButtons:ok", null);
                } catch (java.lang.Exception e28) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiSetNavigationBarButtons", e28, "setNavigationBarButtons invoke ", new java.lang.Object[0]);
                    gVar.e(msg.f341013c, "setNavigationBarButtons:fail_invoke", null);
                }
            }
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 195;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "setNavigationBarButtons";
    }
}
