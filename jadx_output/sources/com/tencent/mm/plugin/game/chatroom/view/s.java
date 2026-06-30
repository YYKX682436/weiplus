package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes15.dex */
public class s implements com.tencent.mm.plugin.game.luggage.m1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.t f139279a;

    public s(com.tencent.mm.plugin.game.chatroom.view.t tVar) {
        this.f139279a = tVar;
    }

    @Override // com.tencent.mm.plugin.game.luggage.m1
    public void a(boolean z17, boolean z18) {
        int h17;
        com.tencent.mars.xlog.Log.i("GameChatRoom.ChatMemberListView", "checkPreload,  hasPreload:[%b], result[%b]", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        com.tencent.mm.plugin.game.chatroom.view.t tVar = this.f139279a;
        if (z17) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("user_name", tVar.f139293p.username);
                com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo = tVar.f139296s.f139302e.f138879m2;
                jumpInfo.jump_url = s33.y.b(jumpInfo.jump_url, "username=" + tVar.f139293p.username);
                jSONObject.put("user_data", pm0.b0.g(tVar.f139293p).toString());
                jSONObject.put("raw_url", tVar.f139294q.jump_url);
                jSONObject.put("source_id", 1302L);
                java.lang.String str = tVar.f139296s.f139302e.f138880n2;
                if (str != null) {
                    jSONObject.put("premade_info", str);
                }
            } catch (org.json.JSONException unused) {
            }
            java.lang.String encode = java.net.URLEncoder.encode(jSONObject.toString());
            com.tencent.mm.plugin.game.chatroom.view.ChatMemberListView chatMemberListView = tVar.f139296s.f139302e;
            h17 = s33.y.i(chatMemberListView.f138872f2, chatMemberListView.f138879m2, 12, encode);
            com.tencent.mars.xlog.Log.i("GameChatRoom.ChatMemberListView", "use preload personal profile url: %s", tVar.f139296s.f139302e.f138879m2.jump_url);
        } else {
            h17 = s33.y.h(tVar.f139296s.f139302e.f138872f2, tVar.f139294q);
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo2 = tVar.f139294q;
            if (jumpInfo2 != null) {
                com.tencent.mars.xlog.Log.i("GameChatRoom.ChatMemberListView", "slot jump url: %s", jumpInfo2.jump_url);
            }
        }
        tVar.i(h17);
    }
}
