package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes.dex */
public class s2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.GameChatListView f139281d;

    public s2(com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView) {
        this.f139281d = gameChatListView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView = this.f139281d;
        if (gameChatListView.f138976v2.getTag() != null) {
            android.view.View view = gameChatListView.f138976v2;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            gameChatListView.f138976v2.setTag(null);
        }
    }
}
