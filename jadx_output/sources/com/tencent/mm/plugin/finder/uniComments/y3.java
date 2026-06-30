package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class y3 implements com.tencent.mm.pluginsdk.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.UniCommentFooter f130463a;

    public y3(com.tencent.mm.plugin.finder.uniComments.UniCommentFooter uniCommentFooter) {
        this.f130463a = uniCommentFooter;
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void a(java.lang.String str) {
        this.f130463a.getEditText().n(str);
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void b() {
        com.tencent.mm.plugin.finder.uniComments.UniCommentFooter uniCommentFooter = this.f130463a;
        if (uniCommentFooter.getEditText().getInputConnection() != null) {
            uniCommentFooter.getEditText().getInputConnection().sendKeyEvent(new android.view.KeyEvent(0, 67));
            uniCommentFooter.getEditText().getInputConnection().sendKeyEvent(new android.view.KeyEvent(1, 67));
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void c(boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void d() {
    }
}
