package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes.dex */
public class w2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f139332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.GameChatListView f139333e;

    public w2(com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView, int i17) {
        this.f139333e = gameChatListView;
        this.f139332d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView = this.f139333e;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = gameChatListView.A2;
        int i17 = this.f139332d;
        android.view.View findViewByPosition = linearLayoutManager.findViewByPosition(i17);
        if (findViewByPosition != null) {
            int measuredHeight = gameChatListView.getMeasuredHeight() - findViewByPosition.getMeasuredHeight();
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager2 = gameChatListView.A2;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(measuredHeight));
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(linearLayoutManager2, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$7", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager2.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(linearLayoutManager2, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$7", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
    }
}
