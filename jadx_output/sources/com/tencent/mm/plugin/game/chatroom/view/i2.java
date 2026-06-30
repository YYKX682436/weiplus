package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes5.dex */
public class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f139163d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter f139164e;

    public i2(com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter, boolean z17) {
        this.f139164e = gameChatCommentFooter;
        this.f139163d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f139163d) {
            int i17 = com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter.P;
            this.f139164e.k();
        }
    }
}
