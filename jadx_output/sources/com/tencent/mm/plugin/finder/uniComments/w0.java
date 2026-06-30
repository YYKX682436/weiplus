package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes5.dex */
public final class w0 implements com.tencent.mm.pluginsdk.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter f130440a;

    public w0(com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter textStatusCommentFooter) {
        this.f130440a = textStatusCommentFooter;
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void a(java.lang.String str) {
        this.f130440a.getEditText().n(str);
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void b() {
        com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter textStatusCommentFooter = this.f130440a;
        if (textStatusCommentFooter.getEditText().getInputConnection() != null) {
            textStatusCommentFooter.getEditText().getInputConnection().sendKeyEvent(new android.view.KeyEvent(0, 67));
            textStatusCommentFooter.getEditText().getInputConnection().sendKeyEvent(new android.view.KeyEvent(1, 67));
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void c(boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void d() {
    }
}
