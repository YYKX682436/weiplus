package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class g7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentFooter f132148d;

    public g7(com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter) {
        this.f132148d = finderCommentFooter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter = this.f132148d;
        finderCommentFooter.setFrozen(false);
        com.tencent.mars.xlog.Log.i("Finder.FinderCommentFooter", "onSelectImage footerMode " + finderCommentFooter.getFooterMode());
        if (finderCommentFooter.getFooterMode() == 1) {
            com.tencent.mm.plugin.finder.view.FinderCommentFooter.c(finderCommentFooter, false);
        } else {
            finderCommentFooter.D(true);
        }
    }
}
