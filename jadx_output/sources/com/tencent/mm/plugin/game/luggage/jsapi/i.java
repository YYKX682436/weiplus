package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes5.dex */
public final class i extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "searchChatRoomMemberByName";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        if (q5Var == null) {
            return;
        }
        org.json.JSONObject e17 = com.tencent.mm.plugin.webview.luggage.util.g.e(str);
        if (e17 == null) {
            q5Var.a("invalid_params", null);
            return;
        }
        java.lang.String optString = e17.optString("chatroomName");
        java.lang.String optString2 = e17.optString("searchText");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString) || com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            q5Var.a("invalid_params", null);
            return;
        }
        ((s33.j0) ((t33.f) i95.n0.c(t33.f.class))).getClass();
        java.util.List<y33.g> Wd = ((y33.h) i95.n0.c(y33.h.class)).Wd(optString2, optString);
        java.lang.String str2 = "";
        if (com.tencent.mm.sdk.platformtools.t8.L0(Wd)) {
            com.tencent.mars.xlog.Log.i("GameChatRoom.PluginGameChatRoom", "searchChatRoomMemberByName  chatroomName = %s  keywords = %s   result null", optString, optString2);
        } else {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (y33.g gVar : Wd) {
                if (gVar.field_role != 1) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put("userName", gVar.field_userName);
                        jSONObject.put("nickName", gVar.field_nickName);
                        jSONObject.put("avatar", gVar.field_avatarURL);
                    } catch (org.json.JSONException e18) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("GameChatRoom.PluginGameChatRoom", e18, "", new java.lang.Object[0]);
                    }
                    jSONArray.put(jSONObject);
                }
            }
            str2 = jSONArray.toString();
            com.tencent.mars.xlog.Log.i("GameChatRoom.PluginGameChatRoom", "searchChatRoomMemberByName  chatroomName = %s  keywords = %s   jsonArrayResultStr = %s", optString, optString2, str2);
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("searchResult", new org.json.JSONArray(str2));
        } catch (org.json.JSONException unused) {
            jSONObject2.put("searchResult", "[]");
        }
        q5Var.a(null, jSONObject2);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
