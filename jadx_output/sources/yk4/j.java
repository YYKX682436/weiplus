package yk4;

/* loaded from: classes10.dex */
public final class j implements com.tencent.mm.pluginsdk.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.comment.view.TingCommentFooter f462843a;

    public j(com.tencent.mm.plugin.ting.comment.view.TingCommentFooter tingCommentFooter) {
        this.f462843a = tingCommentFooter;
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void a(java.lang.String str) {
        this.f462843a.getEditText().n(str);
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void b() {
        com.tencent.mm.plugin.ting.comment.view.TingCommentFooter tingCommentFooter = this.f462843a;
        if (tingCommentFooter.getEditText().getInputConnection() != null) {
            tingCommentFooter.getEditText().getInputConnection().sendKeyEvent(new android.view.KeyEvent(0, 67));
            tingCommentFooter.getEditText().getInputConnection().sendKeyEvent(new android.view.KeyEvent(1, 67));
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void c(boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void d() {
    }
}
