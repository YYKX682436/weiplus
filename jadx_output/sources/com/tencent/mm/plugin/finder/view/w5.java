package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class w5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentFooter f133284d;

    public w5(com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter) {
        this.f133284d = finderCommentFooter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter = this.f133284d;
        finderCommentFooter.getEditText().setShowSoftInputOnFocus(true);
        finderCommentFooter.getEditText().requestFocus();
        finderCommentFooter.D(true);
    }
}
