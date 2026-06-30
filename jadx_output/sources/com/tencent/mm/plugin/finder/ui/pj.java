package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class pj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI f129649d;

    public pj(com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI) {
        this.f129649d = finderShareFeedRelUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.feed.w8 w8Var = this.f129649d.E;
        if (w8Var != null) {
            w8Var.getRecyclerView().setItemAnimator(new uw2.k0());
        } else {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
    }
}
