package z43;

/* loaded from: classes.dex */
public class z extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f143443f.a("invalid_params");
            return;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (com.tencent.mm.plugin.game.luggage.p.b(context)) {
            this.f143443f.a("exist_tab");
            return;
        }
        java.lang.String optString = jSONObject.optString("tabKey");
        com.tencent.mars.xlog.Log.i("LiteAppJsApiOpenGameTabHome", "tabKey:[%s]", optString);
        long optLong = jSONObject.optLong("sourceid", 0L);
        long optLong2 = jSONObject.optLong(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SSID, 0L);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("from_find_more_friend", false);
        intent.putExtra("game_report_from_scene", 5);
        intent.putExtra("start_time", java.lang.System.currentTimeMillis());
        intent.putExtra("has_game_life_chat_msg", false);
        intent.putExtra("default_game_tab_key", optString);
        intent.putExtra("disable_game_page_swipe", true);
        intent.putExtra("game_report_sourceid", optLong);
        intent.putExtra("game_report_ssid", optLong2);
        j45.l.j(context, "game", ".ui.GameCenterUI", intent, null);
        this.f143443f.d(false);
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
