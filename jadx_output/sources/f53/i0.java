package f53;

/* loaded from: classes5.dex */
public final class i0 implements com.tencent.mm.pluginsdk.ui.chat.v9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI f259658a;

    public i0(com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI postCommentDialogUI) {
        this.f259658a = postCommentDialogUI;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.v9
    public void a(boolean z17, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PostCommentDialogUI", "onSearchDialogShow isShow = " + z17);
        com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI postCommentDialogUI = this.f259658a;
        if (z17) {
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = postCommentDialogUI.f140011d;
            if (chatFooterPanel != null) {
                chatFooterPanel.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.o.o("smileyPanel");
                throw null;
            }
        }
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel2 = postCommentDialogUI.f140011d;
        if (chatFooterPanel2 != null) {
            chatFooterPanel2.setVisibility(0);
        } else {
            kotlin.jvm.internal.o.o("smileyPanel");
            throw null;
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.v9
    public void b(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSendCustomEmoji emoji = ");
        sb6.append(iEmojiInfo != null ? iEmojiInfo.j() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.PostCommentDialogUI", sb6.toString());
        if (iEmojiInfo != null) {
            com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI postCommentDialogUI = this.f259658a;
            java.lang.String str = postCommentDialogUI.f140025u;
            if (str == null || str.length() == 0) {
                postCommentDialogUI.d7(iEmojiInfo);
            } else {
                postCommentDialogUI.c7(iEmojiInfo);
            }
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.v9
    public void c() {
    }
}
