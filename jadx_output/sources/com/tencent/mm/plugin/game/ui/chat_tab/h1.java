package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class h1 implements com.tencent.mm.ipcinvoker.r {
    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle != null) {
            int i17 = bundle.getInt("msg_unread_count");
            int i18 = bundle.getInt("notify_unread_count");
            boolean z17 = bundle.getBoolean("has_chat_room_unread_msg");
            boolean z18 = bundle.getBoolean("bottom_red_dot");
            int i19 = bundle.getInt("game_life_unread_count");
            com.tencent.mm.autogen.events.GetUnreadGameMsgCountEvent getUnreadGameMsgCountEvent = new com.tencent.mm.autogen.events.GetUnreadGameMsgCountEvent();
            am.ug ugVar = getUnreadGameMsgCountEvent.f54419g;
            ugVar.f8080a = i17;
            ugVar.f8081b = i18;
            ugVar.f8082c = i19;
            ugVar.f8083d = z17;
            ugVar.f8084e = z18;
            getUnreadGameMsgCountEvent.e();
        }
    }
}
