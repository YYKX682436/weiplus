package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class f2 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "openGameLifeChatroom";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenGameLifeChatroom", "invokeInMM");
        org.json.JSONObject e17 = com.tencent.mm.plugin.webview.luggage.util.g.e(str);
        if (e17 == null) {
            q5Var.a("invalid_params", null);
            return;
        }
        java.lang.String optString = e17.optString("chatroom_name");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            q5Var.a("invalid_params", null);
            return;
        }
        java.lang.String optString2 = e17.optString("chatroom_icon");
        boolean optBoolean = e17.optBoolean("is_auto_join", false);
        long optLong = e17.optLong("sourceid", 0L);
        long optLong2 = e17.optLong(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SSID, 0L);
        boolean optBoolean2 = e17.optBoolean("backToRoomList", false);
        int optInt = e17.optInt("targetChannelId", -1);
        long optLong3 = e17.optLong("targetSeq", -1L);
        boolean optBoolean3 = e17.optBoolean("is_real_time", false);
        java.lang.String optString3 = e17.optString("extInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenGameLifeChatroom", "chatRoomName:%s, iconUrl:%s, isAutoJoin:%b, sourceId:%d, ssid:%d, backToRoomList:%b, targetChannelId:%s, targetSeq:%s", optString, optString2, java.lang.Boolean.valueOf(optBoolean), java.lang.Long.valueOf(optLong), java.lang.Long.valueOf(optLong2), java.lang.Boolean.valueOf(optBoolean2), java.lang.Integer.valueOf(optInt), java.lang.Long.valueOf(optLong3));
        ((com.tencent.mm.ui.MMActivity) context).mmSetOnActivityResultCallback(new com.tencent.mm.plugin.game.luggage.jsapi.e2(this, context, q5Var));
        t33.e eVar = new t33.e(optString, optString2, optLong2, optLong, optBoolean, null);
        eVar.f415414j = 3345;
        eVar.f415410f = optBoolean2;
        eVar.f415413i = optLong3;
        eVar.f415412h = optInt;
        eVar.f415415k = optBoolean3;
        eVar.f415416l = optString3;
        ((s33.j0) ((t33.f) i95.n0.c(t33.f.class))).getClass();
        s33.n.f402530b = true;
        if (com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.b7(context, eVar, null, null, true)) {
            return;
        }
        q5Var.a(null, null);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
