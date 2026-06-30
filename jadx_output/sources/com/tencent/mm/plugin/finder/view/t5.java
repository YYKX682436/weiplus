package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class t5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentFooter f133089d;

    public t5(com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter) {
        this.f133089d = finderCommentFooter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter = this.f133089d;
        java.lang.String lastFromName = finderCommentFooter.getLastFromName();
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter2 = this.f133089d;
        com.tencent.mm.plugin.finder.view.FinderCommentFooter.h(finderCommentFooter, lastFromName, finderCommentFooter2.getLastActionStrID(), finderCommentFooter2.getLastToName(), finderCommentFooter2.getLastTag(), false, false, false, false, 224, null);
    }
}
