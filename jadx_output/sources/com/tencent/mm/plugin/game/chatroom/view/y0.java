package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes8.dex */
public class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo f139355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.autogen.chatroom.Lbs f139356e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.e1 f139357f;

    public y0(com.tencent.mm.plugin.game.chatroom.view.e1 e1Var, com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo chatroomRecInfo, com.tencent.mm.plugin.game.autogen.chatroom.Lbs lbs) {
        this.f139357f = e1Var;
        this.f139355d = chatroomRecInfo;
        this.f139356e = lbs;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData chatroomData;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RecommendChatRoomVH$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo chatroomRecInfo = this.f139355d;
        if (chatroomRecInfo != null && (chatroomData = chatroomRecInfo.chatroom_data) != null) {
            com.tencent.mm.plugin.game.chatroom.view.e1 e1Var = this.f139357f;
            com.tencent.mm.plugin.game.chatroom.view.j1.c(e1Var.f139297d, 1, chatroomData, this.f139356e, e1Var.f139080g, e1Var.f139094x, 0L, e1Var.f139093w ? 1102L : 1002L);
            com.tencent.mm.plugin.game.chatroom.view.e1.j(e1Var, 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RecommendChatRoomVH$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
