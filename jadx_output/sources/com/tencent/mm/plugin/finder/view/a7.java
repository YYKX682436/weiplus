package com.tencent.mm.plugin.finder.view;

/* loaded from: classes5.dex */
public final class a7 implements com.tencent.mm.pluginsdk.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentFooter f131621a;

    public a7(com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter) {
        this.f131621a = finderCommentFooter;
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void a(java.lang.String str) {
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter = this.f131621a;
        finderCommentFooter.getEditText().getText().insert(finderCommentFooter.getEditText().getSelectionStart(), pg5.d.a(finderCommentFooter.getContext(), str));
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void b() {
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter = this.f131621a;
        if (finderCommentFooter.getEditText().getInputConnection() != null) {
            finderCommentFooter.getEditText().getInputConnection().sendKeyEvent(new android.view.KeyEvent(0, 67));
            finderCommentFooter.getEditText().getInputConnection().sendKeyEvent(new android.view.KeyEvent(1, 67));
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void c(boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void d() {
    }
}
