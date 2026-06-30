package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes8.dex */
public class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.b0 f139020d;

    public a0(com.tencent.mm.plugin.game.chatroom.view.b0 b0Var, com.tencent.mm.plugin.game.chatroom.view.ChatRoomListCard chatRoomListCard) {
        this.f139020d = b0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo chatroomRecInfo;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/ChatRoomListCard$RoomCardVH$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.game.report.f fVar = com.tencent.mm.game.report.g.f68195a;
        com.tencent.mm.plugin.game.chatroom.view.b0 b0Var = this.f139020d;
        long j17 = b0Var.f139037h + 1;
        com.tencent.mm.plugin.game.chatroom.view.ChatRoomListCard chatRoomListCard = b0Var.f139039m;
        fVar.p(j17, 2L, 0L, chatRoomListCard.f138898h2, chatRoomListCard.f138897g2);
        com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo myChatroomInfo = b0Var.f139038i;
        if (myChatroomInfo != null && (chatroomRecInfo = myChatroomInfo.chatroom_info) != null && chatroomRecInfo.chatroom_data != null) {
            s33.n.f402530b = false;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("chat_room_title", b0Var.f139038i.chatroom_info.chatroom_data.room_name);
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData chatroomData = b0Var.f139038i.chatroom_info.chatroom_data;
            t33.e eVar = new t33.e(chatroomData.chatroom_name, chatroomData.chatroom_icon, 9999L, 0L, false, bundle);
            t33.f fVar2 = (t33.f) i95.n0.c(t33.f.class);
            android.content.Context context = chatRoomListCard.f138896f2;
            ((s33.j0) fVar2).getClass();
            s33.n.f402530b = false;
            com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI.b7(context, eVar, null, null, false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomListCard$RoomCardVH$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
