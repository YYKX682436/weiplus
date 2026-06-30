package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes15.dex */
public class x2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.GameChatListView f139343d;

    public x2(com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView) {
        this.f139343d = gameChatListView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.chatroom.view.k3 k3Var;
        com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView = this.f139343d;
        if (gameChatListView.H2.size() == 0) {
            return;
        }
        java.util.Iterator it = gameChatListView.H2.iterator();
        while (true) {
            if (!it.hasNext()) {
                k3Var = null;
                break;
            } else {
                k3Var = (com.tencent.mm.plugin.game.chatroom.view.k3) it.next();
                if (!k3Var.f139203b) {
                    break;
                }
            }
        }
        if (k3Var != null) {
            gameChatListView.setNoticeTag(k3Var);
        }
    }
}
