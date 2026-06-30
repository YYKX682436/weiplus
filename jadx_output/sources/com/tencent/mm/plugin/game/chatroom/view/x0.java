package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes8.dex */
public class x0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f139340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.e1 f139341e;

    public x0(com.tencent.mm.plugin.game.chatroom.view.e1 e1Var, android.view.View view) {
        this.f139341e = e1Var;
        this.f139340d = view;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo chatroomRecInfo;
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData chatroomData;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RecommendChatRoomVH$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f139340d;
        if ((view2.getTag() instanceof com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo) && (chatroomRecInfo = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo) view2.getTag()) != null && (chatroomData = chatroomRecInfo.chatroom_data) != null) {
            com.tencent.mm.plugin.game.chatroom.view.e1 e1Var = this.f139341e;
            int c17 = com.tencent.mm.plugin.game.chatroom.view.j1.c(e1Var.f139297d, 4, chatroomData, e1Var.f139088r, e1Var.f139080g, e1Var.f139094x, 0L, e1Var.f139093w ? 1102L : 1002L);
            com.tencent.mm.plugin.game.chatroom.view.e1.j(e1Var, (c17 == 1 || c17 != 2) ? 3 : 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RecommendChatRoomVH$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
