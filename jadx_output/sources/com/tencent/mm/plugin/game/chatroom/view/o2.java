package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes5.dex */
public class o2 implements com.tencent.mm.pluginsdk.ui.chat.e8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter f139249a;

    public o2(com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter) {
        this.f139249a = gameChatCommentFooter;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.e8
    public void clear() {
        com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter = this.f139249a;
        com.tencent.mm.ui.widget.MMEditText mMEditText = gameChatCommentFooter.f138944n;
        if (mMEditText != null) {
            mMEditText.setText("");
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = gameChatCommentFooter.f138949s;
            if (chatFooterPanel != null) {
                chatFooterPanel.setToSendText("");
            }
        }
    }
}
