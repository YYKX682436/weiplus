package com.tencent.mm.plugin.finder.member.preview;

/* loaded from: classes2.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderRefreshLayout f121226d;

    public h(com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout) {
        this.f121226d = finderRefreshLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f121226d.c();
    }
}
