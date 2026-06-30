package u93;

/* loaded from: classes.dex */
public class f extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f143443f.a("missing arguments");
            return;
        }
        long j17 = c01.z1.j();
        if (!jSONObject.optBoolean("autoJump")) {
            ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).aj(j17);
            com.tencent.mars.xlog.Log.i("LiteAppJsApiOpenGameCenterEntrance", "autoJump is false");
            jd.c cVar = this.f143442e;
            cVar.getClass();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("msg", "autoJump is false");
            cVar.e(hashMap);
            return;
        }
        java.lang.String optString = jSONObject.optString("query");
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if ((optString == null ? "" : optString).isEmpty()) {
            com.tencent.mars.xlog.Log.i("LiteAppJsApiOpenGameCenterEntrance", "query is empty");
            this.f143442e.b("query is empty");
            return;
        }
        if (!((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).Ai(c(), j17)) {
            this.f143442e.b("game entrance is not closed");
            return;
        }
        com.tencent.mars.xlog.Log.i("LiteAppJsApiOpenGameCenterEntrance", "openGameCenterEntrance with extra query:" + optString);
        m33.l1 l1Var = (m33.l1) i95.n0.c(m33.l1.class);
        android.content.Context c17 = c();
        ((com.tencent.mm.plugin.game.p0) l1Var).aj(j17);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("from_find_more_friend", false);
        intent.putExtra("game_report_from_scene", 5);
        intent.putExtra("start_time", java.lang.System.currentTimeMillis());
        intent.putExtra("has_game_life_chat_msg", false);
        intent.putExtra("game_life_msg_count", 0);
        intent.putExtra("back_to_find_page", true);
        intent.putExtra("game_entrance_query", optString);
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_game_find_entrance_liteapp, false)) {
            j45.l.j(c17, "game", ".ui.GameCenterUI", intent, null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameExternalService", "openGameCenterEntranceWithParams start liteapp directly");
        intent.putExtra("open_find_game_liteapp", true);
        r53.f.D(c17, intent);
    }
}
