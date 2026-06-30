package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes5.dex */
public class h2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f139144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter f139145e;

    public h2(com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter, boolean z17) {
        this.f139145e = gameChatCommentFooter;
        this.f139144d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f139144d;
        com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter = this.f139145e;
        if (!z17) {
            gameChatCommentFooter.f138949s.setVisibility(0);
        } else {
            int i17 = com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter.P;
            gameChatCommentFooter.o();
        }
    }
}
