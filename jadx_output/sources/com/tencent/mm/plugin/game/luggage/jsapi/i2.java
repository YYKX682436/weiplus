package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class i2 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "openGameTabHome";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenGameTabHome", "invokeInMM");
        org.json.JSONObject e17 = com.tencent.mm.plugin.webview.luggage.util.g.e(str);
        if (e17 == null) {
            q5Var.a("invalid_params", null);
            return;
        }
        if (com.tencent.mm.plugin.game.luggage.p.b(context)) {
            q5Var.a("exist_tab", null);
            return;
        }
        java.lang.String optString = e17.optString("tabKey");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenGameTabHome", "tabKey:[%s]", optString);
        long optLong = e17.optLong("sourceid", 0L);
        long optLong2 = e17.optLong(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SSID, 0L);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("from_find_more_friend", false);
        intent.putExtra("game_report_from_scene", 5);
        intent.putExtra("start_time", java.lang.System.currentTimeMillis());
        intent.putExtra("default_game_tab_key", optString);
        intent.putExtra("disable_game_page_swipe", true);
        intent.putExtra("game_report_sourceid", optLong);
        intent.putExtra("game_report_ssid", optLong2);
        j45.l.j(context, "game", ".ui.GameCenterUI", intent, null);
        q5Var.a(null, null);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
