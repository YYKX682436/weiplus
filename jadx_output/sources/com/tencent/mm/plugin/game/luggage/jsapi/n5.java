package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class n5 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "startGameLifeConversation";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameLife.JsApiStartGameLifeConversation", "invokeInMM");
        org.json.JSONObject e17 = com.tencent.mm.plugin.webview.luggage.util.g.e(str);
        if (e17 == null) {
            q5Var.a("invalid_params", null);
            return;
        }
        java.lang.String optString = e17.optString("fromUserName");
        java.lang.String optString2 = e17.optString("toUserName");
        int optInt = e17.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        java.lang.String optString3 = e17.optString("ext_info");
        com.tencent.mars.xlog.Log.i("MicroMsg.GameLife.JsApiStartGameLifeConversation", "fromUserName:[%s] toUserName:[%s], scene:[%d], extInfo:[%s]", optString, optString2, java.lang.Integer.valueOf(optInt), optString3);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString) || com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            q5Var.a("null_data", null);
        } else {
            ((t53.m0) i95.n0.c(t53.m0.class)).Bi(context, optString, optString2, optInt, com.tencent.mm.sdk.platformtools.t8.K0(optString3) ? null : new com.tencent.mm.protobuf.g(optString3.getBytes()), e17.optString("reportInfo"));
            q5Var.a(null, null);
        }
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
