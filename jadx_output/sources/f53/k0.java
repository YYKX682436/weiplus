package f53;

/* loaded from: classes5.dex */
public final class k0 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI f259664a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.IEmojiInfo f259665b;

    public k0(com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI postCommentDialogUI, com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        this.f259664a = postCommentDialogUI;
        this.f259665b = iEmojiInfo;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI postCommentDialogUI = this.f259664a;
        java.lang.String str2 = postCommentDialogUI.f140025u;
        if (str2 == null || str2.length() == 0) {
            postCommentDialogUI.a7();
        } else {
            postCommentDialogUI.d7(this.f259665b);
        }
    }
}
