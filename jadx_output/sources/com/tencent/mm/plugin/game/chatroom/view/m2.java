package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes5.dex */
public class m2 implements com.tencent.mm.pluginsdk.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter f139237a;

    public m2(com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter) {
        this.f139237a = gameChatCommentFooter;
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void a(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter = this.f139237a;
        sb6.append(gameChatCommentFooter.f138944n.getText().toString());
        sb6.append(str);
        if (com.tencent.mm.ui.tools.v4.e(sb6.toString(), com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2) <= 1000) {
            gameChatCommentFooter.f138944n.n(str);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void b() {
        com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter = this.f139237a;
        com.tencent.mm.ui.widget.MMEditText mMEditText = gameChatCommentFooter.f138944n;
        if (mMEditText == null || mMEditText.getInputConnection() == null) {
            return;
        }
        gameChatCommentFooter.f138944n.getInputConnection().sendKeyEvent(new android.view.KeyEvent(0, 67));
        gameChatCommentFooter.f138944n.getInputConnection().sendKeyEvent(new android.view.KeyEvent(1, 67));
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void c(boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void d() {
    }
}
