package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes5.dex */
public class n2 implements com.tencent.mm.pluginsdk.ui.chat.v9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter f139240a;

    public n2(com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter) {
        this.f139240a = gameChatCommentFooter;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.v9
    public void a(boolean z17, int i17) {
        this.f139240a.K = z17;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.v9
    public void b(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        com.tencent.mm.plugin.game.chatroom.view.q2 q2Var = this.f139240a.D;
        if (q2Var != null) {
            q2Var.d(iEmojiInfo);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.v9
    public void c() {
    }
}
