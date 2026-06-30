package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes5.dex */
public class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter f139044d;

    public b2(com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter) {
        this.f139044d = gameChatCommentFooter;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f139044d.f138940g.showVKB();
    }
}
