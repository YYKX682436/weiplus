package sm1;

/* loaded from: classes10.dex */
public final class j implements com.tencent.mm.pluginsdk.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.audio.comment.view.BizCommentFooter f409324a;

    public j(com.tencent.mm.plugin.audio.comment.view.BizCommentFooter bizCommentFooter) {
        this.f409324a = bizCommentFooter;
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void a(java.lang.String str) {
        this.f409324a.getEditText().n(str);
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void b() {
        com.tencent.mm.plugin.audio.comment.view.BizCommentFooter bizCommentFooter = this.f409324a;
        if (bizCommentFooter.getEditText().getInputConnection() != null) {
            bizCommentFooter.getEditText().getInputConnection().sendKeyEvent(new android.view.KeyEvent(0, 67));
            bizCommentFooter.getEditText().getInputConnection().sendKeyEvent(new android.view.KeyEvent(1, 67));
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void c(boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void d() {
    }
}
