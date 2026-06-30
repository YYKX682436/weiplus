package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class b2 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "openGameChatVc";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenGameChatUI", "invokeInMM");
        android.content.Intent intent = new android.content.Intent();
        org.json.JSONObject e17 = com.tencent.mm.plugin.webview.luggage.util.g.e(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenGameChatUI", "data:%s", str);
        long optLong = e17.optLong("sourceid", 0L);
        long optLong2 = e17.optLong(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SSID, 0L);
        intent.putExtra("game_report_sourceid", optLong);
        intent.putExtra("game_report_ssid", optLong2);
        j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, "game", "com.tencent.mm.plugin.game.ui.chat_tab.GameChatTabUI2", intent, null);
        q5Var.a(null, null);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
