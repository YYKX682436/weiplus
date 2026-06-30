package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes15.dex */
public class v2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.GameChatListView f139323d;

    public v2(com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView) {
        this.f139323d = gameChatListView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/GameChatListView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView = this.f139323d;
        android.view.View view2 = gameChatListView.f138979y2;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$6", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$6", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (gameChatListView.f138979y2.getTag() instanceof java.lang.Long) {
            long longValue = ((java.lang.Long) gameChatListView.f138979y2.getTag()).longValue();
            com.tencent.mm.game.report.g.f68195a.g(2L, 2L, gameChatListView.f138963i2, gameChatListView.f138962h2, longValue, "", 0L, gameChatListView.f138967m2);
            gameChatListView.r1(longValue, false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
