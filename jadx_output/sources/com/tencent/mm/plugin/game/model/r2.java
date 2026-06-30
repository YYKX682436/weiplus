package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class r2 {
    public void a(android.content.Context context, org.json.JSONObject jSONObject) {
        if (context instanceof com.tencent.mm.plugin.game.ui.LiteAppGameTabUI) {
            if (jSONObject.has("isShowTab")) {
                int optInt = jSONObject.optInt("isShowTab", -1);
                com.tencent.mars.xlog.Log.i("LiteGameHomeTabService", "isShowTab:%d", java.lang.Integer.valueOf(optInt));
                if (optInt == 0) {
                    ((com.tencent.mm.plugin.game.ui.LiteAppGameTabUI) context).runOnUiThread(new com.tencent.mm.plugin.game.model.k2(this, context));
                } else if (optInt == 1) {
                    ((com.tencent.mm.plugin.game.ui.LiteAppGameTabUI) context).runOnUiThread(new com.tencent.mm.plugin.game.model.l2(this, context));
                }
            }
            if (jSONObject.has("isSwitchEnable")) {
                int optInt2 = jSONObject.optInt("isSwitchEnable", -1);
                com.tencent.mars.xlog.Log.i("LiteGameHomeTabService", "isSwitchEnable:%d", java.lang.Integer.valueOf(optInt2));
                ((com.tencent.mm.plugin.game.ui.LiteAppGameTabUI) context).runOnUiThread(new com.tencent.mm.plugin.game.model.m2(this, optInt2, context));
            }
        }
    }

    public void b(android.content.Context context, org.json.JSONObject jSONObject) {
        java.lang.String optString = jSONObject.optString("left");
        java.lang.String optString2 = jSONObject.optString("right");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString) && com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(optString);
            java.lang.String e17 = com.tencent.mm.pluginsdk.ui.tools.e9.e(jSONObject2.optString("wxcolor", ""));
            if (com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
                e17 = jSONObject2.optString("color", "");
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
                bundle.putString("set_navigation_bar_buttons_left_text_color", e17);
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("LiteGameHomeTabService", e18, "setNavigationBarButtons opt left ", new java.lang.Object[0]);
        }
        try {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject(optString2);
            boolean optBoolean = jSONObject3.optBoolean("hidden", false);
            java.lang.String optString3 = jSONObject3.optString(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, "");
            java.lang.String k17 = com.tencent.mm.pluginsdk.ui.tools.e9.k(jSONObject3.optString("iconData", ""));
            if (k17 == null) {
                k17 = "";
            }
            java.lang.String e19 = com.tencent.mm.pluginsdk.ui.tools.e9.e(jSONObject3.optString("wxcolor", ""));
            if (com.tencent.mm.sdk.platformtools.t8.K0(e19)) {
                e19 = jSONObject3.optString("color", "");
            }
            boolean optBoolean2 = jSONObject3.optBoolean("needClickEvent", false);
            if (optBoolean) {
                bundle.putBoolean("set_navigation_bar_buttons_hide_right_button", true);
            } else {
                bundle.putString("set_navigation_bar_buttons_text", optString3);
                bundle.putString("set_navigation_bar_buttons_icon_data", k17);
                bundle.putString("set_navigation_bar_buttons_text_color", e19);
                bundle.putBoolean("set_navigation_bar_buttons_need_click_event", optBoolean2);
            }
        } catch (java.lang.Exception e27) {
            com.tencent.mars.xlog.Log.printErrStackTrace("LiteGameHomeTabService", e27, "setNavigationBarButtons opt right ", new java.lang.Object[0]);
        }
        if (bundle.size() >= 0 && (context instanceof com.tencent.mm.plugin.game.ui.LiteAppGameTabUI)) {
            ((com.tencent.mm.plugin.game.ui.LiteAppGameTabUI) context).runOnUiThread(new com.tencent.mm.plugin.game.model.q2(this, context, bundle));
        }
    }

    public void c(android.content.Context context, org.json.JSONObject jSONObject) {
        java.lang.String str;
        float f17;
        try {
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("wxcolor");
            str = optJSONObject != null ? com.tencent.mm.ui.bk.C() ? optJSONObject.optString("dark") : optJSONObject.optString("light") : jSONObject.optString("color");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("LiteGameHomeTabService", e17.getMessage());
            str = "";
        }
        java.lang.String str2 = str;
        try {
            f17 = (float) jSONObject.optDouble("alpha", -1.0d);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("LiteGameHomeTabService", e18.getMessage());
            f17 = -1.0f;
        }
        float f18 = f17;
        int optInt = jSONObject.optInt("iconDark", -1);
        if (context instanceof com.tencent.mm.plugin.game.ui.LiteAppGameTabUI) {
            ((com.tencent.mm.plugin.game.ui.LiteAppGameTabUI) context).runOnUiThread(new com.tencent.mm.plugin.game.model.n2(this, context, str2, f18, optInt));
        }
    }

    public void d(android.content.Context context, org.json.JSONObject jSONObject) {
        if (context instanceof com.tencent.mm.plugin.game.ui.LiteAppGameTabUI) {
            java.lang.String optString = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            if (com.tencent.mm.sdk.platformtools.t8.K0(jSONObject.optString("color"))) {
                ((com.tencent.mm.plugin.game.ui.LiteAppGameTabUI) context).runOnUiThread(new com.tencent.mm.plugin.game.model.p2(this, context, optString));
            } else {
                ((com.tencent.mm.plugin.game.ui.LiteAppGameTabUI) context).runOnUiThread(new com.tencent.mm.plugin.game.model.o2(this, context, optString, com.tencent.mm.plugin.webview.ui.tools.a1.c(jSONObject.optString("color"), context.getResources().getColor(com.tencent.mm.R.color.f478587bl))));
            }
        }
    }
}
