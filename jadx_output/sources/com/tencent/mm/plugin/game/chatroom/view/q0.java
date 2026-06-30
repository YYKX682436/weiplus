package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes15.dex */
public class q0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.autogen.chatroom.Notification f139268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.ChatRoomStateView f139269e;

    public q0(com.tencent.mm.plugin.game.chatroom.view.ChatRoomStateView chatRoomStateView, com.tencent.mm.plugin.game.autogen.chatroom.Notification notification) {
        this.f139269e = chatRoomStateView;
        this.f139268d = notification;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/ChatRoomStateView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.chatroom.view.ChatRoomStateView chatRoomStateView = this.f139269e;
        if (!s33.y.e(chatRoomStateView.f138933o).f402490a) {
            com.tencent.mm.plugin.game.autogen.chatroom.Notification notification = this.f139268d;
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo = notification.jump_info;
            if (jumpInfo.jump_type != 3 || jumpInfo.chatroom_seq == null) {
                s33.y.h(chatRoomStateView.f138925d, jumpInfo);
            } else {
                com.tencent.mm.autogen.events.ChatRoomLocateInfoEvent chatRoomLocateInfoEvent = new com.tencent.mm.autogen.events.ChatRoomLocateInfoEvent();
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomSeq chatroomSeq = notification.jump_info.chatroom_seq;
                int i17 = chatroomSeq.channel_id;
                am.d2 d2Var = chatRoomLocateInfoEvent.f54039g;
                d2Var.f6428a = i17;
                d2Var.f6429b = chatroomSeq.seq;
                d2Var.f6430c = true;
                chatRoomLocateInfoEvent.e();
            }
            if (notification.click_after_close) {
                chatRoomStateView.f138938t.c(0L, 0L);
                gm0.j1.d().g(new v33.x(chatRoomStateView.f138933o, 2, notification.f138699id));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomStateView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
