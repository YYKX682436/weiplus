package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class u1 implements com.tencent.mm.ipcinvoker.r {
    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle != null) {
            int i17 = bundle.getInt("msg_unread_count");
            int i18 = bundle.getInt("notify_unread_count");
            boolean z17 = bundle.getBoolean("has_chat_room_unread_msg");
            com.tencent.mm.autogen.events.GetUnreadGameMsgCountEvent getUnreadGameMsgCountEvent = new com.tencent.mm.autogen.events.GetUnreadGameMsgCountEvent();
            am.ug ugVar = getUnreadGameMsgCountEvent.f54419g;
            ugVar.f8080a = i17;
            ugVar.f8081b = i18;
            ugVar.f8083d = z17;
            getUnreadGameMsgCountEvent.e();
        }
    }
}
