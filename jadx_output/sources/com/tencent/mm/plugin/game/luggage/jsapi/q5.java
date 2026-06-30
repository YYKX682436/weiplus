package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class q5 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "switchToGameTab";
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
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSwitchToGameTab", "invokeInOwn");
        org.json.JSONObject jSONObject = bVar.f406597b.f344506c;
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSwitchToGameTab", "data is null");
            bVar.c("null_data", null);
            return;
        }
        sd.d dVar = bVar.f406596a;
        android.content.Context context = ((com.tencent.mm.plugin.game.luggage.page.x0) dVar).f406610d;
        com.tencent.mm.plugin.game.luggage.page.l lVar = ((com.tencent.mm.plugin.game.luggage.page.x0) dVar).V1;
        java.lang.String optString = jSONObject.optString("tabKey");
        if (lVar == null) {
            if (!android.text.TextUtils.equals(optString, "chat")) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSwitchToGameTab", "is not tab page");
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("game_msg_center_tab_type", jSONObject.optInt("chatVcSelectTab"));
            j45.l.j(context, "game", ".ui.chat_tab.ChatRoomTabUI", intent, null);
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("chatVcSelectTab", jSONObject.optInt("chatVcSelectTab"));
        bundle.putString("game_msg_ui_from_msgid", jSONObject.optString("interactMsgid"));
        if (jSONObject.optInt("chatVcSelectTab") != 0) {
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.game.luggage.jsapi.p5.class, new com.tencent.mm.plugin.game.luggage.jsapi.o5(this, optString, lVar, bVar));
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            lVar.d0(optString);
        }
        bVar.a();
    }
}
