package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes15.dex */
public class r2 implements com.tencent.mm.plugin.game.chatroom.view.j3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.GameChatListView f139277a;

    public r2(com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView) {
        this.f139277a = gameChatListView;
    }

    public void a(com.tencent.mm.plugin.game.chatroom.view.i3 i3Var) {
        com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView = this.f139277a;
        gameChatListView.C2 = false;
        long j17 = i3Var.f139166e.size() > 0 ? ((com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack) i3Var.f139166e.get(0)).seq : 0L;
        com.tencent.mars.xlog.Log.i("GameChatRoom.GameChatListView", "onTopLoadMore topSeq:%d", java.lang.Long.valueOf(j17));
        gm0.j1.d().g(new v33.e(gameChatListView.f138966l2, 0L, j17, 1, 0L, gameChatListView.f138967m2));
    }
}
