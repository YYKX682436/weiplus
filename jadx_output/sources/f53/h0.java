package f53;

/* loaded from: classes5.dex */
public final class h0 implements com.tencent.mm.pluginsdk.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.ChatFooterPanel f259655a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI f259656b;

    public h0(com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel, com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI postCommentDialogUI) {
        this.f259655a = chatFooterPanel;
        this.f259656b = postCommentDialogUI;
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void a(java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("emoticonID", text);
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f259655a;
        android.content.Context context = chatFooterPanel.getContext();
        int i17 = com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI.G;
        com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI postCommentDialogUI = this.f259656b;
        postCommentDialogUI.getClass();
        com.tencent.mm.game.report.l.c(context, 90, 9002, 1, 2, 0, com.tencent.mm.game.report.l.b(hashMap));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.ui.widget.MMEditText mMEditText = postCommentDialogUI.f140012e;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("gameCommentInputTxt");
            throw null;
        }
        sb6.append((java.lang.Object) mMEditText.getText());
        sb6.append(text);
        if (com.tencent.mm.ui.tools.v4.e(sb6.toString(), com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2) <= postCommentDialogUI.F) {
            postCommentDialogUI.Z6(text);
        } else {
            db5.t7.g(chatFooterPanel.getContext(), postCommentDialogUI.getString(com.tencent.mm.R.string.fq8));
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void b() {
        com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI postCommentDialogUI = this.f259656b;
        com.tencent.mm.ui.widget.MMEditText mMEditText = postCommentDialogUI.f140012e;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("gameCommentInputTxt");
            throw null;
        }
        if (mMEditText.getInputConnection() == null) {
            return;
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = postCommentDialogUI.f140012e;
        if (mMEditText2 == null) {
            kotlin.jvm.internal.o.o("gameCommentInputTxt");
            throw null;
        }
        mMEditText2.getInputConnection().sendKeyEvent(new android.view.KeyEvent(0, 67));
        com.tencent.mm.ui.widget.MMEditText mMEditText3 = postCommentDialogUI.f140012e;
        if (mMEditText3 != null) {
            mMEditText3.getInputConnection().sendKeyEvent(new android.view.KeyEvent(1, 67));
        } else {
            kotlin.jvm.internal.o.o("gameCommentInputTxt");
            throw null;
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void c(boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void d() {
    }
}
