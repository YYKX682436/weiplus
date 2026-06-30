package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class w6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentFooter f133285d;

    public w6(com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter) {
        this.f133285d = finderCommentFooter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter = this.f133285d;
        finderCommentFooter.m(finderCommentFooter.getEditText().getText());
    }
}
