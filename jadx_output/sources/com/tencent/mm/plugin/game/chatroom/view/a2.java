package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes5.dex */
public class a2 implements ck5.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter f139023d;

    public a2(com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter) {
        this.f139023d = gameChatCommentFooter;
    }

    @Override // ck5.e
    public void R5(java.lang.String str) {
        this.f139023d.f138945o.setVisibility(8);
    }

    @Override // ck5.e
    public void c1(java.lang.String str) {
        int b17 = com.tencent.mm.ui.tools.v4.b(1000, str);
        com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter = this.f139023d;
        if (b17 > 5) {
            gameChatCommentFooter.f138945o.setVisibility(8);
            return;
        }
        gameChatCommentFooter.f138945o.setText(java.lang.String.valueOf(b17));
        gameChatCommentFooter.f138945o.setTextColor(gameChatCommentFooter.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5));
        gameChatCommentFooter.f138945o.setVisibility(0);
    }

    @Override // ck5.e
    public void w0(java.lang.String str) {
        com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter = this.f139023d;
        gameChatCommentFooter.f138945o.setText(com.tencent.mm.ui.tools.v4.b(1000, str));
        gameChatCommentFooter.f138945o.setTextColor(gameChatCommentFooter.getResources().getColor(com.tencent.mm.R.color.f478532ac));
        gameChatCommentFooter.f138945o.setVisibility(0);
    }
}
