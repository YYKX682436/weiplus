package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public class p3 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "quitGameLifeChatroom";
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
        org.json.JSONObject jSONObject = bVar.f406597b.f344506c;
        if (jSONObject == null) {
            bVar.c("invalid_params", null);
            return;
        }
        java.lang.String optString = jSONObject.optString("chatroom_name");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            bVar.c("invalid_params", null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiQuitGameLifeChatroom", "chatRoomName:%s", optString);
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("com.tencent.mm.game.ACTION_QUIT_CHAT_ROOM");
        intent.putExtra("chatroom_name", optString);
        intent.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
        com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent, com.tencent.mm.plugin.game.g0.f139448a);
        bVar.a();
        ((com.tencent.mm.plugin.game.luggage.page.x0) bVar.f406596a).p(true);
    }
}
