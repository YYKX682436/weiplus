package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class h implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.ChatRoomTabUI f141273d;

    public h(com.tencent.mm.plugin.game.ui.chat_tab.ChatRoomTabUI chatRoomTabUI) {
        this.f141273d = chatRoomTabUI;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle != null) {
            this.f141273d.f141103s = bundle.getInt("msg_unread_count");
            this.f141273d.f141104t = bundle.getInt("notify_unread_count");
            this.f141273d.f141105u = bundle.getInt("game_life_unread_count");
            this.f141273d.f141106v = bundle.getBoolean("has_chat_room_unread_msg");
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.game.ui.chat_tab.g(this));
        }
    }
}
