package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes15.dex */
public class u2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.GameChatListView f139305d;

    public u2(com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView) {
        this.f139305d = gameChatListView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/GameChatListView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("GameChatRoom.GameChatListView", "click new msg tag, cache list size:%d", java.lang.Integer.valueOf(this.f139305d.F2.size()));
        android.view.View view2 = this.f139305d.f138976v2;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$5", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$5", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f139305d.f138976v2.getTag() != null) {
            java.lang.String str = this.f139305d.f138976v2.getTag() instanceof java.lang.String ? (java.lang.String) this.f139305d.f138976v2.getTag() : "";
            this.f139305d.f138976v2.setTag(null);
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.plugin.game.chatroom.view.t2 t2Var = new com.tencent.mm.plugin.game.chatroom.view.t2(this, str);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(t2Var, 200L, false);
        } else {
            com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView = this.f139305d;
            if (!(gameChatListView.f138967m2 == 0)) {
                com.tencent.mm.autogen.events.ChatRoomLocateInfoEvent chatRoomLocateInfoEvent = new com.tencent.mm.autogen.events.ChatRoomLocateInfoEvent();
                chatRoomLocateInfoEvent.f54039g.f6428a = 0;
                chatRoomLocateInfoEvent.e();
                com.tencent.mm.game.report.f fVar = com.tencent.mm.game.report.g.f68195a;
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView2 = this.f139305d;
                fVar.g(14L, 2L, gameChatListView2.f138963i2, gameChatListView2.f138962h2, 0L, "", 0L, gameChatListView2.f138967m2);
            } else if (gameChatListView.F2.size() > 0) {
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView3 = this.f139305d;
                gameChatListView3.o1(gameChatListView3.F2, 7, null);
            } else {
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView4 = this.f139305d;
                int itemCount = gameChatListView4.f138960f2.getItemCount() - 1;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(java.lang.Integer.valueOf(itemCount));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(gameChatListView4, arrayList3.toArray(), "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$5", "onClick", "(Landroid/view/View;)V", "Undefined", "scrollToPosition", "(I)V");
                gameChatListView4.a1(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(gameChatListView4, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$5", "onClick", "(Landroid/view/View;)V", "Undefined", "scrollToPosition", "(I)V");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
