package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public final class v extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "deleteChatRoomMemberByUserName";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        org.json.JSONObject e17 = com.tencent.mm.plugin.webview.luggage.util.g.e(str);
        if (e17 == null) {
            kotlin.jvm.internal.o.d(q5Var);
            q5Var.a("invalid_params", null);
            return;
        }
        java.lang.String optString = e17.optString("chatroomName");
        java.lang.String optString2 = e17.optString("userName");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString) || com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            kotlin.jvm.internal.o.d(q5Var);
            q5Var.a("invalid_params", null);
            return;
        }
        ((s33.j0) ((t33.f) i95.n0.c(t33.f.class))).getClass();
        com.tencent.mars.xlog.Log.i("GameChatRoom.PluginGameChatRoom", "deleteChatRoomMemberByUserName  chatroomName = %s  userName = %s", optString, optString2);
        ((y33.h) i95.n0.c(y33.h.class)).q9(optString, optString2);
        kotlin.jvm.internal.o.d(q5Var);
        q5Var.a(null, null);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
