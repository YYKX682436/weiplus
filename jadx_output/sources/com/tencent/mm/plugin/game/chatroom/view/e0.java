package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes8.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView f139077d;

    public e0(com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView chatRoomListView) {
        this.f139077d = chatRoomListView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView chatRoomListView = this.f139077d;
        chatRoomListView.f138904i2 = chatRoomListView.f138903h2.getHeight();
        int height = chatRoomListView.getHeight();
        int computeVerticalScrollExtent = chatRoomListView.computeVerticalScrollExtent();
        int computeVerticalScrollRange = chatRoomListView.computeVerticalScrollRange();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatRoomListView", "mMinFooterHeight:%d, listViewHeight:%d, extentHeight:%d, rangeHeight:%d", java.lang.Integer.valueOf(chatRoomListView.f138904i2), java.lang.Integer.valueOf(height), java.lang.Integer.valueOf(computeVerticalScrollExtent), java.lang.Integer.valueOf(computeVerticalScrollRange));
        int i17 = ((computeVerticalScrollExtent - computeVerticalScrollRange) - chatRoomListView.f138904i2) / 2;
        if (i17 > 0) {
            com.tencent.mm.plugin.game.chatroom.view.ChatRoomFooterView chatRoomFooterView = chatRoomListView.f138903h2;
            android.view.View view = chatRoomFooterView.f138891n;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/view/ChatRoomFooterView", "extendEmptyLayout", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomFooterView", "extendEmptyLayout", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) chatRoomFooterView.f138891n.getLayoutParams();
            layoutParams.topMargin += i17;
            layoutParams.bottomMargin += i17;
            chatRoomFooterView.f138891n.setLayoutParams(layoutParams);
        }
    }
}
