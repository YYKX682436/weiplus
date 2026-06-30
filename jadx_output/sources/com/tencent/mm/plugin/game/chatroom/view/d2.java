package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes5.dex */
public class d2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f139068d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f139069e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter f139070f;

    public d2(com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter, int i17, boolean z17) {
        this.f139070f = gameChatCommentFooter;
        this.f139068d = i17;
        this.f139069e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f139068d;
        com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter = this.f139070f;
        gameChatCommentFooter.setFooterVisibilityImpl(i17);
        com.tencent.mm.plugin.game.chatroom.view.q2 q2Var = gameChatCommentFooter.D;
        if (q2Var != null) {
            q2Var.c(this.f139069e);
        }
    }
}
