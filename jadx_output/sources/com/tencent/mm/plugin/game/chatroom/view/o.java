package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes4.dex */
public class o extends androidx.recyclerview.widget.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f139246a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f139247b;

    public o(com.tencent.mm.plugin.game.chatroom.view.ChatMemberListView chatMemberListView, java.util.List list, java.util.List list2) {
        this.f139246a = list;
        this.f139247b = list2;
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean a(int i17, int i18) {
        com.tencent.mm.plugin.game.autogen.chatroom.OnlineUser onlineUser;
        com.tencent.mm.plugin.game.autogen.chatroom.Slot slot = (com.tencent.mm.plugin.game.autogen.chatroom.Slot) this.f139246a.get(i17);
        com.tencent.mm.plugin.game.autogen.chatroom.Slot slot2 = (com.tencent.mm.plugin.game.autogen.chatroom.Slot) this.f139247b.get(i18);
        com.tencent.mm.plugin.game.autogen.chatroom.OnlineUser onlineUser2 = slot.online_user_status;
        return onlineUser2 != null && (onlineUser = slot2.online_user_status) != null && slot.slot_type == slot2.slot_type && onlineUser2.status == onlineUser.status && onlineUser2.chat_user_data.size() == slot2.online_user_status.chat_user_data.size();
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean b(int i17, int i18) {
        com.tencent.mm.plugin.game.autogen.chatroom.OnlineUser onlineUser;
        com.tencent.mm.plugin.game.autogen.chatroom.Slot slot = (com.tencent.mm.plugin.game.autogen.chatroom.Slot) this.f139246a.get(i17);
        com.tencent.mm.plugin.game.autogen.chatroom.Slot slot2 = (com.tencent.mm.plugin.game.autogen.chatroom.Slot) this.f139247b.get(i18);
        com.tencent.mm.plugin.game.autogen.chatroom.OnlineUser onlineUser2 = slot.online_user_status;
        if (onlineUser2 != null && !com.tencent.mm.sdk.platformtools.t8.L0(onlineUser2.chat_user_data) && (onlineUser = slot2.online_user_status) != null && !com.tencent.mm.sdk.platformtools.t8.L0(onlineUser.chat_user_data)) {
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData chatroomUserData = slot.online_user_status.chat_user_data.get(0);
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData chatroomUserData2 = slot2.online_user_status.chat_user_data.get(0);
            java.lang.String str = chatroomUserData.username;
            if (str == null) {
                str = "";
            }
            str.equals(chatroomUserData2.username);
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.b0
    public int d() {
        return this.f139247b.size();
    }

    @Override // androidx.recyclerview.widget.b0
    public int e() {
        return this.f139246a.size();
    }
}
