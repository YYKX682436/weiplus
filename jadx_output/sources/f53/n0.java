package f53;

/* loaded from: classes5.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI f259679d;

    public n0(com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI postCommentDialogUI) {
        this.f259679d = postCommentDialogUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI postCommentDialogUI = this.f259679d;
        postCommentDialogUI.X6().setVisibility(8);
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = postCommentDialogUI.f140011d;
        if (chatFooterPanel == null) {
            kotlin.jvm.internal.o.o("smileyPanel");
            throw null;
        }
        chatFooterPanel.i();
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel2 = postCommentDialogUI.f140011d;
        if (chatFooterPanel2 != null) {
            chatFooterPanel2.setVisibility(0);
        } else {
            kotlin.jvm.internal.o.o("smileyPanel");
            throw null;
        }
    }
}
