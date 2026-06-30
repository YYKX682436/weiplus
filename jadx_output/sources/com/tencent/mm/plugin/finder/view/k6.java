package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class k6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentFooter f132480d;

    public k6(com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter) {
        this.f132480d = finderCommentFooter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f132480d.setFrozen(false);
    }
}
