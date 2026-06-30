package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes15.dex */
public class z2 extends androidx.recyclerview.widget.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f139369a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f139370b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f139371c;

    public z2(com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView, java.util.List list, java.util.List list2, java.util.List list3) {
        java.util.HashSet hashSet = new java.util.HashSet();
        this.f139371c = hashSet;
        this.f139369a = list;
        this.f139370b = list2;
        if (list3 != null) {
            hashSet.addAll(list3);
        }
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean a(int i17, int i18) {
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack) this.f139369a.get(i17);
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack2 = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack) this.f139370b.get(i18);
        com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions msgOptions = chatroomMsgPack.msg_options;
        if (!((msgOptions == null || msgOptions.cli_local_data == null) ? false : true)) {
            com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions msgOptions2 = chatroomMsgPack2.msg_options;
            if (!((msgOptions2 == null || msgOptions2.cli_local_data == null) ? false : true)) {
                java.util.Set set = this.f139371c;
                if (!((java.util.HashSet) set).contains(java.lang.Long.valueOf(chatroomMsgPack.seq))) {
                    if (!((java.util.HashSet) set).contains(java.lang.Long.valueOf(chatroomMsgPack2.seq))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean b(int i17, int i18) {
        return ((com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack) this.f139369a.get(i17)).seq == ((com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack) this.f139370b.get(i18)).seq;
    }

    @Override // androidx.recyclerview.widget.b0
    public int d() {
        return this.f139370b.size();
    }

    @Override // androidx.recyclerview.widget.b0
    public int e() {
        return this.f139369a.size();
    }
}
