package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class d6 implements com.tencent.mm.pluginsdk.ui.chat.v9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentFooter f131878a;

    public d6(com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter) {
        this.f131878a = finderCommentFooter;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.v9
    public void a(boolean z17, int i17) {
        com.tencent.mars.xlog.Log.i("Finder.FinderCommentFooter", "onSearchDialogShow");
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.v9
    public void b(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter = this.f131878a;
        finderCommentFooter.getClass();
        com.tencent.mars.xlog.Log.i("Finder.FinderCommentFooter", "onSelectEmoji");
        com.tencent.mm.plugin.finder.view.FinderCommentFooter.E(finderCommentFooter, 1, iEmojiInfo, null, false, false, null, 60, null);
        finderCommentFooter.getEditText().requestFocus();
        finderCommentFooter.postDelayed(new com.tencent.mm.plugin.finder.view.f7(finderCommentFooter), 500L);
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.v9
    public void c() {
        com.tencent.mars.xlog.Log.i("Finder.FinderCommentFooter", "onHidePanel");
    }
}
